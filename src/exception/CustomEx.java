package exception;

public class CustomEx extends Exception {
    String errcode;

    String mess;

    public CustomEx() {
    }

    public CustomEx(String errcode, String mess) {
        this.errcode = errcode;
        this.mess = mess;
    }

    public CustomEx(String message, String errcode, String mess) {
        super(message);
        this.errcode = errcode;
        this.mess = mess;
    }

    public CustomEx(String message, Throwable cause, String errcode, String mess) {
        super(message, cause);
        this.errcode = errcode;
        this.mess = mess;
    }

    public CustomEx(Throwable cause, String errcode, String mess) {
        super(cause);
        this.errcode = errcode;
        this.mess = mess;
    }

//    public CustomEx(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errcode, String mess) {
//        super(message, cause, enableSuppression, writableStackTrace);
//        this.errcode = errcode;
//        this.mess = mess;
//    }
}
