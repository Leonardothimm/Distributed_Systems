package ds.project.smarthealth;




import java.util.Iterator;


import ds.project.smarthealth.SmarthAppGrpc.SmarthAppBlockingStub;
import ds.project.smarthealth.SmarthAppGrpc.SmarthAppStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class SmartHealthClient {
	
	private static SmarthAppBlockingStub blockingStub;
	private static SmarthAppStub asyncStub;
	//private static SmarthAppStub asyncStub;
	

	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50051)
				.usePlaintext()
				.build();
		
		blockingStub = SmarthAppGrpc.newBlockingStub(channel);
		asyncStub = SmarthAppGrpc.newStub(channel);
		
		//calculateMBI();
		generateMedicine();

	    //asyncStub = SmarthAppGrpc.newStub(channel);
	}

	    
	   public static void calculateMBI() {
		   
	     double weight = 68.0;
	     double height = 1.65;
	    // double result = weight/height;
	     
	     //for(int i=0; i<5; i++ ) {
				BMIRequest req = BMIRequest.newBuilder()
						.setWeight(weight)
						.setHeight(height)
						//.setOperationValue(i)
						.build();
		
				BMIResponse response = blockingStub.sayBMI(req);
				
				System.out.println("Response: "+ response.getMessage());
		
			//	System.out.println("res: " + response.getAnswer());
			//}
	     
	     
	   }
	   
		//blocking server-streaming
		public static void generateMedicine() {
			ValueRequest request = ValueRequest.newBuilder()
					.setMedicine("allergy").setNumber(4).build();
					//.setNumbers(5).setMin(0).setMax(100).build();

			try {
				Iterator<ValueResponse> response = blockingStub.sendValuesBack(request);

				while(response.hasNext()) {
					ValueResponse temp = response.next();
				 	System.out.println(temp.getMessage());				
				}

			} catch (StatusRuntimeException e) {
				e.printStackTrace();
			}

		}







}
	    
		/* public static void calculateAsync() {
		     float weight = 55;
		     float height = 174;
		     float result = weight/height;
					
			for(int i=0; i<5; i++ ) {
				CalculateRequest req = CalculateRequest.newBuilder()
						.setNumber1(weight)
						.setNumber2(height)
						.setOperationValue(i)
						.build();
		
				StreamObserver<BMIRequest> observer= new StreamObserver<BMIResponse>() {

					@Override
					public void onNext(BMIResponse response) {
						// TODO Auto-generated method stub

						System.out.println("res: " + response.getAnswer());
				
					}

					@Override
					public void onError(Throwable t) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void onCompleted() {
						// TODO Auto-generated method stub
						
					}
					
				};
				
				asyncStub.calculate(req, observer);
						
				
			}
			
			
			//wait before terminate
			try {
				Thread.currentThread().sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		*/
	
		/*
		 * 
		public static void calculateBlocking() {
		int num1 = 10;
		int num2 = 20;
		int operation = Operation.ADDITION_VALUE;
				
		for(int i=0; i<5; i++ ) {
			CalculateRequest req = CalculateRequest.newBuilder()
					.setNumber1(num1)
					.setNumber2(num2)
					.setOperationValue(i)
					.build();
	
			CalculateResponse response = blockingStub.calculate(req);
	
			System.out.println("res: " + response.getResult() + " mes: " + response.getMessage());
		}
	}
		 * */


