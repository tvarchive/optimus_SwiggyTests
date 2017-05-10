package pages;

import Exceptions.FoodItemNotAvailableException;
import entities.FoodItem;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RestaurantPage extends BasePage {

    private AppiumDriver driver;

    @FindBy(id = "fragment_restaurant_menu_layout_menu_items_recycler_view")
    private List<WebElement> menu;

    @FindBy(id = "recommended_menu_item_layout_item_name")
    private WebElement itemName;

    @FindBy(id = "recommended_menu_item_layout_item_price")
    private WebElement price;

    @FindBy(id = "count_text")
    private WebElement quantity;

    @FindBy(id = "decrement_button")
    private WebElement decrementButton;

    @FindBy(id = "increment_button")
    private WebElement incrementButton;

    @FindBy(id = "expanded_restaurant_name")
    private WebElement restaurantName;

    @FindBy(id = "expanded_restaurant_rating")
    private WebElement restaurantRating;

    @FindBy(id = "expanded_restaurant_delivery_time")
    private WebElement restaurantDeliveryTime;

    @FindBy(id = "revealLayout")
    private WebElement checkoutButton;

    private FoodItem foodItem;

    public RestaurantPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void chooseAnItem() throws FoodItemNotAvailableException {
        waitForElementToBeVisible(restaurantName);
        scrollDown();
        if (!driver.findElements(By.id("in.swiggy.android:id/recommended_menu_item_layout_item_out_of_stock_badge")).isEmpty()) {
            scrollDown();
        }
        System.out.println("Choosing a food item from menu");
        foodItem = selectAnItem(0);
        System.out.println("Found a food item -- " + foodItem.getItemName());
        System.out.println("With price -- " + foodItem.getPrice());
        System.out.println("With quantity -- " + foodItem.getQuantity());
    }

    public void tapOnCheckoutButton(){
        waitForElementToBeVisible(checkoutButton);
        checkoutButton.click();
    }
}
