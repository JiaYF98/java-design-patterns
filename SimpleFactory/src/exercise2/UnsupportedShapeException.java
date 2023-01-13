package exercise2;

public class UnsupportedShapeException extends Exception {
    static final long serialVersionUID = 781837582890155L;

    public UnsupportedShapeException() {
    }

    public UnsupportedShapeException(String message) {
        super(message);
    }
}

