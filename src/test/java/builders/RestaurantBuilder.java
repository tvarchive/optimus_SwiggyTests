package builders;

import entities.Restaurant;

public class RestaurantBuilder {

    private Restaurant restaurant;

    public RestaurantBuilder() {
        restaurant = new Restaurant();
        restaurant.setName("Leon Grill");
        restaurant.setRating("3.9");
        restaurant.setRestaurantCuisines("North Indian, Fast Food, Arabian");
        restaurant.setDeliveryTime("54 mins");
    }

    public RestaurantBuilder withName(String name) {
        restaurant.setName(name);
        return this;
    }

    public RestaurantBuilder withRating(String rating) {
        restaurant.setRating(rating);
        return this;
    }

    public RestaurantBuilder withRestaurantCuisines(String cuisines) {
        restaurant.setRestaurantCuisines(cuisines);
        return this;
    }

    public RestaurantBuilder withDeliveryTime(String deliveryTime) {
        restaurant.setDeliveryTime(deliveryTime);
        return this;
    }

    public Restaurant build(){
        return restaurant;
    }
}
