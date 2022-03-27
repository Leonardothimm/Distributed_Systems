package ds.project.two.smarthealthtwo;

import java.io.IOException;
import java.util.Random;
import ds.project.two.smarthealthtwo.SmarthHealthTwoGrpc.SmarthHealthTwoImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class SmartHealthServer extends SmarthHealthTwoImplBase {

	public static void main(String[] args) {
		
		SmartHealthServer smarthealthserver = new SmartHealthServer();
		
		int port = 50051;
		
		try {
			
		
		Server server = ServerBuilder.forPort(port)
				.addService(smarthealthserver)
				.build()
				.start();
		
		System.out.println("SmartHealthServer has started, listening on "+port);
		
		server.awaitTermination(); 
		
		} catch(IOException e) {
		
			e.printStackTrace();
			
		} catch(InterruptedException e) {
			
			e.printStackTrace();
			
		}
	}
	
	
	/*
	 * 
	 * 					SERVICE TWO IMPLEMENTATION
	 * 
	 * */
	
	public void generateRoomsNumbers(ValueRequest request, 
			StreamObserver<ValueResponse> responseObserver) {
		
		
		//Receive the name of speciality:
		//System.out.printf("Receiving the Speciality.....", request.getSpeciality());
		
		String word = request.getSpeciality();
		
		
		
		//Generate Random Numbers:
		Random roomNumbers = new Random();
		
		/*
		 * 
		 * 
		 * 		1- Logic is: Generate numbers and if higher than 10,
		 * 		generate again. 
		 * 
		 * 		2- Suppose hospital has only 10 rooms available for "Speciality"
		 * 
		 * */
		
		
		if(roomNumbers.nextInt() > 10) {
			
			roomNumbers = new Random();
			
		}
		else {
		
			//For Loop
			
			for(int i=0; i<=8; i++) {
			
				int finalNumber = roomNumbers.nextInt();
				
				//Build the Reply
				ValueResponse reply = ValueResponse.newBuilder().setNumber(finalNumber).build();
				
				//System.out.print("The "+word+" is working on the following rooms: ");
				
				responseObserver.onNext(reply);
				
				try {
					//wait for a second
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
			
				}
		
		}
		//System.out.print("Random Number: "+myNumbers);
		
		responseObserver.onCompleted();
	}
	
	/*
	 * 
	 * 					SERVICE THREE IMPLEMENTATION
	 * 
	 * */
	
	public StreamObserver<FatRequest>calculateFAT(StreamObserver<FatResponse> responseObserver){
		
		return new StreamObserver<FatRequest>() {
			
			

			@Override
			public void onNext(FatRequest value) {
				float age =  value.getAge();
				System.out.println("Receiving BMI "+ value.getBmi());
				
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
				
			}

			@Override
			public void onCompleted() {
				
				
				double fatPercentageMale;
				double fatPercentageFemale;
				int age = 15;
				float bmi = 16;
				
				/*
				 * 		Constants: wont change!
				 * */
				double VALUE1MALEADULT = 1.20;
				double VALUE2FEMALEADULT = 0.23;
				double VALUE3MALE = 16.2;
				double VALUE3FEMALE = 5.4;
					
				//MALE FAT PERCENTAGE
				fatPercentageMale = VALUE1MALEADULT * bmi + VALUE2FEMALEADULT * age - VALUE3MALE;
				
				//FEMALE FAT PERCENTAGE
				fatPercentageFemale = VALUE1MALEADULT * bmi + VALUE2FEMALEADULT * age - VALUE3FEMALE;
				
				
				FatResponse reply = FatResponse.newBuilder().setPercentage(fatPercentageMale).build();
			
				responseObserver.onNext(reply);
				
				responseObserver.onCompleted();
			
			}

		};
	}
	
	
} // last one