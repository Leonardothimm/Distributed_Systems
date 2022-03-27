package ds.project.two.smarthealthtwo;

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
    comments = "Source: serviceTwo.proto")
public final class SmarthHealthTwoGrpc {

  private SmarthHealthTwoGrpc() {}

  public static final String SERVICE_NAME = "smarthealthtwo.SmarthHealthTwo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.project.two.smarthealthtwo.ValueRequest,
      ds.project.two.smarthealthtwo.ValueResponse> getSendValuesBackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendValuesBack",
      requestType = ds.project.two.smarthealthtwo.ValueRequest.class,
      responseType = ds.project.two.smarthealthtwo.ValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ds.project.two.smarthealthtwo.ValueRequest,
      ds.project.two.smarthealthtwo.ValueResponse> getSendValuesBackMethod() {
    io.grpc.MethodDescriptor<ds.project.two.smarthealthtwo.ValueRequest, ds.project.two.smarthealthtwo.ValueResponse> getSendValuesBackMethod;
    if ((getSendValuesBackMethod = SmarthHealthTwoGrpc.getSendValuesBackMethod) == null) {
      synchronized (SmarthHealthTwoGrpc.class) {
        if ((getSendValuesBackMethod = SmarthHealthTwoGrpc.getSendValuesBackMethod) == null) {
          SmarthHealthTwoGrpc.getSendValuesBackMethod = getSendValuesBackMethod = 
              io.grpc.MethodDescriptor.<ds.project.two.smarthealthtwo.ValueRequest, ds.project.two.smarthealthtwo.ValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smarthealthtwo.SmarthHealthTwo", "sendValuesBack"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.two.smarthealthtwo.ValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.two.smarthealthtwo.ValueResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmarthHealthTwoMethodDescriptorSupplier("sendValuesBack"))
                  .build();
          }
        }
     }
     return getSendValuesBackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ds.project.two.smarthealthtwo.FatRequest,
      ds.project.two.smarthealthtwo.FatResponse> getCalculateFATMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculateFAT",
      requestType = ds.project.two.smarthealthtwo.FatRequest.class,
      responseType = ds.project.two.smarthealthtwo.FatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ds.project.two.smarthealthtwo.FatRequest,
      ds.project.two.smarthealthtwo.FatResponse> getCalculateFATMethod() {
    io.grpc.MethodDescriptor<ds.project.two.smarthealthtwo.FatRequest, ds.project.two.smarthealthtwo.FatResponse> getCalculateFATMethod;
    if ((getCalculateFATMethod = SmarthHealthTwoGrpc.getCalculateFATMethod) == null) {
      synchronized (SmarthHealthTwoGrpc.class) {
        if ((getCalculateFATMethod = SmarthHealthTwoGrpc.getCalculateFATMethod) == null) {
          SmarthHealthTwoGrpc.getCalculateFATMethod = getCalculateFATMethod = 
              io.grpc.MethodDescriptor.<ds.project.two.smarthealthtwo.FatRequest, ds.project.two.smarthealthtwo.FatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "smarthealthtwo.SmarthHealthTwo", "calculateFAT"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.two.smarthealthtwo.FatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.project.two.smarthealthtwo.FatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmarthHealthTwoMethodDescriptorSupplier("calculateFAT"))
                  .build();
          }
        }
     }
     return getCalculateFATMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmarthHealthTwoStub newStub(io.grpc.Channel channel) {
    return new SmarthHealthTwoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmarthHealthTwoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmarthHealthTwoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmarthHealthTwoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmarthHealthTwoFutureStub(channel);
  }

  /**
   */
  public static abstract class SmarthHealthTwoImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Server Streaming
     * </pre>
     */
    public void sendValuesBack(ds.project.two.smarthealthtwo.ValueRequest request,
        io.grpc.stub.StreamObserver<ds.project.two.smarthealthtwo.ValueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendValuesBackMethod(), responseObserver);
    }

    /**
     * <pre>
     *Client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.project.two.smarthealthtwo.FatRequest> calculateFAT(
        io.grpc.stub.StreamObserver<ds.project.two.smarthealthtwo.FatResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCalculateFATMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendValuesBackMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ds.project.two.smarthealthtwo.ValueRequest,
                ds.project.two.smarthealthtwo.ValueResponse>(
                  this, METHODID_SEND_VALUES_BACK)))
          .addMethod(
            getCalculateFATMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ds.project.two.smarthealthtwo.FatRequest,
                ds.project.two.smarthealthtwo.FatResponse>(
                  this, METHODID_CALCULATE_FAT)))
          .build();
    }
  }

  /**
   */
  public static final class SmarthHealthTwoStub extends io.grpc.stub.AbstractStub<SmarthHealthTwoStub> {
    private SmarthHealthTwoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmarthHealthTwoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmarthHealthTwoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmarthHealthTwoStub(channel, callOptions);
    }

    /**
     * <pre>
     *Server Streaming
     * </pre>
     */
    public void sendValuesBack(ds.project.two.smarthealthtwo.ValueRequest request,
        io.grpc.stub.StreamObserver<ds.project.two.smarthealthtwo.ValueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSendValuesBackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ds.project.two.smarthealthtwo.FatRequest> calculateFAT(
        io.grpc.stub.StreamObserver<ds.project.two.smarthealthtwo.FatResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCalculateFATMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SmarthHealthTwoBlockingStub extends io.grpc.stub.AbstractStub<SmarthHealthTwoBlockingStub> {
    private SmarthHealthTwoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmarthHealthTwoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmarthHealthTwoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmarthHealthTwoBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Server Streaming
     * </pre>
     */
    public java.util.Iterator<ds.project.two.smarthealthtwo.ValueResponse> sendValuesBack(
        ds.project.two.smarthealthtwo.ValueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSendValuesBackMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmarthHealthTwoFutureStub extends io.grpc.stub.AbstractStub<SmarthHealthTwoFutureStub> {
    private SmarthHealthTwoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmarthHealthTwoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmarthHealthTwoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmarthHealthTwoFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_VALUES_BACK = 0;
  private static final int METHODID_CALCULATE_FAT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmarthHealthTwoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmarthHealthTwoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_VALUES_BACK:
          serviceImpl.sendValuesBack((ds.project.two.smarthealthtwo.ValueRequest) request,
              (io.grpc.stub.StreamObserver<ds.project.two.smarthealthtwo.ValueResponse>) responseObserver);
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
        case METHODID_CALCULATE_FAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.calculateFAT(
              (io.grpc.stub.StreamObserver<ds.project.two.smarthealthtwo.FatResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmarthHealthTwoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmarthHealthTwoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.project.two.smarthealthtwo.SmartHealthTwoImp.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmarthHealthTwo");
    }
  }

  private static final class SmarthHealthTwoFileDescriptorSupplier
      extends SmarthHealthTwoBaseDescriptorSupplier {
    SmarthHealthTwoFileDescriptorSupplier() {}
  }

  private static final class SmarthHealthTwoMethodDescriptorSupplier
      extends SmarthHealthTwoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmarthHealthTwoMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmarthHealthTwoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmarthHealthTwoFileDescriptorSupplier())
              .addMethod(getSendValuesBackMethod())
              .addMethod(getCalculateFATMethod())
              .build();
        }
      }
    }
    return result;
  }
}
