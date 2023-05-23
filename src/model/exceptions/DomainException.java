package model.exceptions;

public class DomainException extends Exception{
    private static final long serialVersionUID;
    static {
        serialVersionUID = 1L;
    }

    public DomainException(String msg) {
        super(msg);
    }
}
