package pages;

import entities.Restaurant;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    private AppiumDriver driver;
    private Restaurant restaurant;

    @FindBy(id = "in.swiggy.android:id/custom_toolbar_title_container")
    private WebElement customToolbar;

    public HomePage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void chooseARestaurant(){
        waitForElementToBeVisible(customToolbar);
        scrollDown();
        System.out.println("Choosing a restaurant");
        restaurant = findARestaurant(0);
        System.out.println("Found a restaurant -- "+restaurant.getName());
        System.out.println("With rating -- "+restaurant.getRating());
        System.out.println("With cuisines -- "+restaurant.getRestaurantCuisines());
        System.out.println("With delivery time -- "+restaurant.getDeliveryTime());
    }
}
