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
	
	/*
	 * 
	 * 					SERVICE TWO IMPLEMENTATION
	 * 
	 * */
	
	/*public void generateRoomsNumbers(ValueRequest request, 
			StreamObserver<ValueResponse> responseObserver) {
		
		
		//Receive the name of speciality:
		//System.out.printf("Receiving the Speciality.....", request.getSpeciality());
		
		String word = request.getSpeciality();
		
		//Generate Random Numbers:
		Random myNumbers = new Random();
		
		//For Loop
		
		for(int i=0; i<=8; i++) {
		
			int finalNumber = myNumbers.nextInt();
			
			//Build the Reply
			ValueResponse reply = ValueResponse.newBuilder().setNumber(finalNumber).build();
			
			responseObserver.onNext(reply);
			
			try {
				//wait for a second
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	  }
		
		responseObserver.onCompleted();
	}*/
	
	
	
} // last one