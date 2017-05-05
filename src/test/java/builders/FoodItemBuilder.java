package builders;

import entities.FoodItem;

public class FoodItemBuilder {

    private FoodItem foodItem;

    public FoodItemBuilder() {
        foodItem = new FoodItem();
        foodItem.setItemName("Chicken Burger");
        foodItem.setPrice("80");
        foodItem.setQuantity("2");
    }

    public FoodItemBuilder withName(String itemName) {
        foodItem.setItemName(itemName);
        return this;
    }

    public FoodItemBuilder withPrice(String price) {
        foodItem.setPrice(price);
        return this;
    }

    public FoodItemBuilder withQuantity(String quantity) {
        foodItem.setQuantity(quantity);
        return this;
    }

    public FoodItem build() {
        return foodItem;
    }
}
