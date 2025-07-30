package br.com.seatecnologia.gdf.negocia.exception;

public class BusinessLogicValidationException extends Exception {
    public BusinessLogicValidationException() {
        super();
    }

    public BusinessLogicValidationException(String message) {
        super(message);
    }

    public BusinessLogicValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessLogicValidationException(Throwable cause) {
        super(cause);
    }
}
