package cn.xjosiah.ssm.exception;

public class AppointException extends RuntimeException {
    public AppointException(String message){
        super(message);
    }

    public AppointException(String message,Throwable cause){
        super(message,cause);
    }
}
