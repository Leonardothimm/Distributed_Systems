package ds.project.smarthealth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


import ds.project.smarthealth.BMIRequest.Operation;
import ds.project.smarthealth.SmarthAppGrpc.SmarthAppImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class SmartHealthServer extends SmarthAppImplBase {

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
	
	
	public void sayBMI(BMIRequest request, StreamObserver<BMIResponse> responseObserver) {
 
		double value = 0;
		double calculation = 0;
		String message = "";
		
		System.out.println("Receiving BMI values: Height is "+request.getHeight()+" and Weight is "+request.getWeight());
		
		if(request.getOperation()==Operation.DIVISION) {
			
			 value = request.getHeight() * request.getHeight();
			 calculation = request.getWeight() / value;
			 
			 double finalNumber = Math.ceil(calculation);
			 
			//System.out.println("calculation value is: "+finalNumber);
			 
			 if(finalNumber <= 18.5) {
				 message = "According to your BMI, you are: Underweight";
			 }
			 else if(finalNumber >= 18.5 && finalNumber <= 24.9) {
				 message = "According to your BMI, you are: Normal Weight";
			 }
			 else if(finalNumber >= 25 && finalNumber <= 29.9) {
				 message = "According to your BMI, you are: Over-Weight";
			 }
			 else {
				 message = "According to your BMI, you are: Obese";
			 }
			 
		}
		else {
			
		
			 message = "Implementation not supported";
			
		}
		
		//float value = request.getHeight() + request.getWeight();
		
		
		BMIResponse myReply = BMIResponse.newBuilder().setMessage(message).build();
		
		//BMIResponse reply = CalculateResponse.newBuilder().setResult(value).setMessage(msg).build();
		//Return the object message
		responseObserver.onNext(myReply);
		
		//Notify Completion
		responseObserver.onCompleted();
		
		
		//super.sayBMI(request, responseObserver);
	
	}
}

	
	    //Stream Server
		/*public void sendValuesBack(ValueRequest request,
				
				StreamObserver<ValueResponse> responseObserver) {

                String reply = request.getMedicine();
                int number = request.getNumber();
                
                
                
               // HashMap<String, String> medicine1 = new HashMap<String, String>();
               // HashMap<String, String> medicine2 = new HashMap<String, String>();
                
               // for(int i=0; i<=number; i++) {
                	if(reply == "allergy" || reply == "Allergy" || reply == "ALLERGY") {
                		//medicine1.put("Cetirizine", "Desloratadina");
                		//medicine2.put("Levocitirizine", "Loratadine");
                		
                		try {
                			
                		
                		ValueResponse myResponse = ValueResponse.newBuilder().setMessage("Desloratadina").build();
                		responseObserver.onNext(myResponse);
                		
                	
        					//wait for a second
        					Thread.sleep(1000);
        				} catch (InterruptedException e) {
        					// TODO Auto-generated catch block
        					e.printStackTrace();
        				}
        			


        			responseObserver.onCompleted();
                		
                	}
                	else{
                		System.out.println("This is not a medicine category");
                	}
                	
                //}
			//System.out.printf("receiving generateRandom method num: %d from: %d to: %d \n",
					//request.getNumbers(), request.getMin(), request.getMax()  );

		/*	Random rand = new Random();

			for(int i=0; i<request.getNumbers(); i++) {

				int random_value = rand.nextInt(request.getMax() - request.getMin() + 1) + request.getMin() ;

				NumberResponse reply = NumberResponse.newBuilder().setNumber(random_value).build();

				responseObserver.onNext(reply);

				try {
					//wait for a second
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}


			responseObserver.onCompleted();*/


		

	
	
	/*
	public StreamObserver<ValueResponse> averageValues(
			StreamObserver<ValueRequest> responseObserver) {


		return new StreamObserver<ValueResponse>() {

			ArrayList<Double> list = new ArrayList();

			@Override
			public void onNext(ValueResponse request) {

				System.out.println("receiving averageValues method num: "+ request.getNumber()  );

				list.add(request.getNumber());		           

			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stubal

			}

			@Override
			public void onCompleted() {
				System.out.printf("receiving averageValues method complete \n" );

				// System.out.println("mean "+ list.size());

				double temp = 0;	
				for(double v:  list) {
					temp = temp + v;
				}
				double mean = (double) (temp/list.size());

				CalculateResponse reply = CalculateResponse.newBuilder().setResult(mean).build();

				// System.out.println("mean "+ mean);
				responseObserver.onNext(reply);

				responseObserver.onCompleted();

			}

		};

	}*/

	
	


