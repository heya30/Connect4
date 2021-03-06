package enumerations;

public class CommonReturnType {

    public static final int SUCCESS = 200;
    public static final int FAIL = 500;

    private int status;
    private String message;

    public CommonReturnType(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
