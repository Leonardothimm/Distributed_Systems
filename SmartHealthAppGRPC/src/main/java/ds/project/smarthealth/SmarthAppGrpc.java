package ds.project.smarthealth;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: serviceOne.proto")
public final class SmarthAppGrpc {

  private SmarthAppGrpc() {}

  public static final String SERVICE_NAME = "smarthealth.SmarthApp";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.project.smarthealth.BMIRequest,
      ds.project.smarthealth.BMIResponse> getSayBMIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayBMI",
      requestType = ds.project.smarthealth.BMIRequest.class,
      responseType = ds.project.smarthealth.BMIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.project.smarthealth.BMIRequest,
      ds.project.smarthealth.BMIResponse> getSayBMIMethod() {
    io.grpc.MethodDescriptor<ds.project.smarthealth.BMIRequest, ds.project.smarthealth.BMIResponse> getSayBMIMethod;
    if ((getSayBMIMethod = SmarthAppGrpc.getSayBMIMethod) == null) {
      synchronized (SmarthAppGrpc.class) {
        if ((getSayBMIMethod = SmarthAppGrpc.getSayBMIMethod) == null) {
          SmarthAppGrpc.getSayBMIMethod = getSayBMIMethod = 
              io.grpc.MethodDescriptor.<ds.project.smarthealth.BMIRequest, ds.project.smarthealth.BMIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "smarthealth.SmarthApp", "sayBMI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.smarthealth.BMIRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.smarthealth.BMIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmarthAppMethodDescriptorSupplier("sayBMI"))
                  .build();
          }
        }
     }
     return getSayBMIMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmarthAppStub newStub(io.grpc.Channel channel) {
    return new SmarthAppStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmarthAppBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmarthAppBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmarthAppFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmarthAppFutureStub(channel);
  }

  /**
   */
  public static abstract class SmarthAppImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public void sayBMI(ds.project.smarthealth.BMIRequest request,
        io.grpc.stub.StreamObserver<ds.project.smarthealth.BMIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSayBMIMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayBMIMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.project.smarthealth.BMIRequest,
                ds.project.smarthealth.BMIResponse>(
                  this, METHODID_SAY_BMI)))
          .build();
    }
  }

  /**
   */
  public static final class SmarthAppStub extends io.grpc.stub.AbstractStub<SmarthAppStub> {
    private SmarthAppStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmarthAppStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmarthAppStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmarthAppStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public void sayBMI(ds.project.smarthealth.BMIRequest request,
        io.grpc.stub.StreamObserver<ds.project.smarthealth.BMIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayBMIMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmarthAppBlockingStub extends io.grpc.stub.AbstractStub<SmarthAppBlockingStub> {
    private SmarthAppBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmarthAppBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmarthAppBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmarthAppBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public ds.project.smarthealth.BMIResponse sayBMI(ds.project.smarthealth.BMIRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayBMIMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmarthAppFutureStub extends io.grpc.stub.AbstractStub<SmarthAppFutureStub> {
    private SmarthAppFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmarthAppFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmarthAppFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmarthAppFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.project.smarthealth.BMIResponse> sayBMI(
        ds.project.smarthealth.BMIRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayBMIMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_BMI = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmarthAppImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmarthAppImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_BMI:
          serviceImpl.sayBMI((ds.project.smarthealth.BMIRequest) request,
              (io.grpc.stub.StreamObserver<ds.project.smarthealth.BMIResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmarthAppBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmarthAppBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.project.smarthealth.SmartHealthImp.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmarthApp");
    }
  }

  private static final class SmarthAppFileDescriptorSupplier
      extends SmarthAppBaseDescriptorSupplier {
    SmarthAppFileDescriptorSupplier() {}
  }

  private static final class SmarthAppMethodDescriptorSupplier
      extends SmarthAppBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmarthAppMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SmarthAppGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmarthAppFileDescriptorSupplier())
              .addMethod(getSayBMIMethod())
              .build();
        }
      }
    }
    return result;
  }
}
