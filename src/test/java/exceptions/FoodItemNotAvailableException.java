package exceptions;


public class FoodItemNotAvailableException extends RuntimeException {

    public FoodItemNotAvailableException() {
        super();
    }

    public FoodItemNotAvailableException(String message) {
        super(message);
    }
}
