package ds.project.smarthealth;
import ds.project.smarthealth.SmarthAppGrpc.SmarthAppBlockingStub;
import ds.project.smarthealth.SmarthAppGrpc.SmarthAppStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class SmartHealthClient {
	
	private static SmarthAppBlockingStub blockingStub;
	//private static SmarthAppStub asyncStub;

	

	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50051)
				.usePlaintext()
				.build();
		
		blockingStub = SmarthAppGrpc.newBlockingStub(channel);
		//asyncStub = SmarthAppGrpc.newStub(channel);
		
		calculateMBI();
		//generateDoctorRoom();

	  
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
	   
	  /* public static void generateDoctorRoom() {
		   
		   String profile = "Cardiologist";
		   
		   ValueRequest request = ValueRequest.newBuilder()
				   .setSpeciality(profile)
				   .build();
		   
		   StreamObserver<ValueResponse> reponseObserver = new StreamObserver<ValueResponse>() {
		
		   //int count = 0;

		@Override
		public void onNext(ValueResponse value) {
			System.out.println(profile+" are working on the Rooms: " + value.getNumber());
			//count += 1;
			
		}

		@Override
		public void onError(Throwable t) {
			 t.printStackTrace();
			
		}

		@Override
		public void onCompleted() {
		System.out.println("Stream has been completed");
		
				}

		   };
		   asyncStub.sendValuesBack(request, reponseObserver);
		   
		  // asyncStub.sendValuesBack(request, reponseObserver);
		   
		  // asyncStub.sendValuesBack(request, reponseObserver);
			
		  

		   
	   }*/


} //last one
