package entities;


public class Restaurant {
    private String name;
    private String rating;
    private String deliverTime;
    private String restaurantCuisines;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDeliveryTime() {
        return deliverTime;
    }

    public void setDeliveryTime(String deliverTime) {
        this.deliverTime = deliverTime;
    }

    public String getRestaurantCuisines() {
        return restaurantCuisines;
    }

    public void setRestaurantCuisines(String restaurantCuisines) {
        this.restaurantCuisines = restaurantCuisines;
    }
}
