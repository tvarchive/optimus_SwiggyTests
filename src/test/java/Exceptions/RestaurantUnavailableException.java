package Exceptions;


public class RestaurantUnavailableException extends RuntimeException {

    public RestaurantUnavailableException() {
        super();
    }

    public RestaurantUnavailableException(String message) {
        super(message);
    }
}
