package ds.project.two.smarthealthtwo;
import java.util.Iterator;


import ds.project.two.smarthealthtwo.SmarthHealthTwoGrpc.SmarthHealthTwoBlockingStub;
import ds.project.two.smarthealthtwo.SmarthHealthTwoGrpc.SmarthHealthTwoStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;


public class SmartHealthClient {
	
	private static SmarthHealthTwoBlockingStub blockingStub;
	private static SmarthHealthTwoStub asyncStub;

	

	public static void main(String[] args) {

		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50051)
				.usePlaintext()
				.build();
		
		blockingStub = SmarthHealthTwoGrpc.newBlockingStub(channel);
		asyncStub = SmarthHealthTwoGrpc.newStub(channel);
		
		//calculateMBI();
		generateDoctorRoom();

	  
	}
	   
	public static void generateDoctorRoom() {

	
	   ValueRequest request = ValueRequest.newBuilder()
					.setSpeciality("cardiologist").build();

			try {
				
				Iterator<ValueResponse> responces = blockingStub.sendValuesBack(request);

				while(responces.hasNext()) {
					ValueResponse temp = responces.next();
					System.out.println(temp.getNumber());				
				}

			} catch (StatusRuntimeException e) {
				e.printStackTrace();
			}
	   }
	   
	   
	   
			public static void generateDoctorRoomAsyn() {

				ValueRequest request = ValueRequest.newBuilder()
							.setSpeciality("cardio").build();


				StreamObserver<ValueResponse> responseObserver = new StreamObserver<ValueResponse>() {



					@Override
					public void onNext(ValueResponse value) {
						System.out.println(request.getSpeciality()+" is on the following room: " + value.getNumber());
					
					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();

					}

					@Override
					public void onCompleted() {
						//System.out.println("stream is completed ... received "+ count+ " rand numbers");
					}

				};

				asyncStub.sendValuesBack(request, responseObserver);

				try {
					Thread.sleep(15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			
      /*
       * 
       * 
       * 		Service 3 = Calculate Body Fat Percentage
       * 
       * 
       * */

 public static void calculateFat() {
	  StreamObserver<FatResponse> responseObserver = new StreamObserver<FatResponse>() {

		@Override
		public void onNext(FatResponse value) {
			System.out.println("Your Body Fat is:  " + value.getPercentage() );
			
		}

		@Override
		public void onError(Throwable t) {
			t.printStackTrace();
			
		}

		@Override
		public void onCompleted() {
			System.out.println("Streaming has been completed successfully");
			
		}
	  };
		StreamObserver<FatRequest> requestObserver = asyncStub.calculateFAT(responseObserver);
		try {
			requestObserver.onNext(FatRequest.newBuilder().setAge(25).build());
			Thread.sleep(500);

			requestObserver.onNext(FatRequest.newBuilder().setBmi(15).build());
			Thread.sleep(500);

			//Twice
			requestObserver.onNext(FatRequest.newBuilder().setAge(19).build());
			Thread.sleep(500);

			requestObserver.onNext(FatRequest.newBuilder().setBmi(20).build());
			Thread.sleep(500);

			//Three times
			requestObserver.onNext(FatRequest.newBuilder().setAge(60).build());
			Thread.sleep(500);

			requestObserver.onNext(FatRequest.newBuilder().setBmi(30).build());
			Thread.sleep(500);


			// Mark the end of requests
			requestObserver.onCompleted();

			
			Thread.sleep(5000);
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	  
 	}
 }	
		   /**
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
			  
		   
	**/   
			




