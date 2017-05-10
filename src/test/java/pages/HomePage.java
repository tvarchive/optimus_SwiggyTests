package pages;

import Exceptions.RestaurantUnavailableException;
import entities.Restaurant;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {

    private AppiumDriver driver;
    private Restaurant restaurant;

    @FindBy(id = "custom_toolbar_title_container")
    private WebElement customToolbar;

    @FindBy(id = "bottom_bar_option_account")
    private WebElement accountButton;

    @FindBy(id = "bottom_bar_option_restaurants")
    private WebElement restaurantButton;

    @FindBy(id = "logout_login_button")
    private WebElement login_logout_button;

    @FindBy(id = "activity_restaurant_filter_layout")
    private WebElement filter;

    public HomePage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void chooseARestaurant() {
        try {
            scrollDownAndFindARestaurant();
        } catch (Exception e) {
            scrollDownAndFindARestaurant();
        }
    }

    private void scrollDownAndFindARestaurant() {
        System.out.println("Choosing a restaurant");
        scrollDown();
//        restaurant = findARestaurant(0);
//        System.out.println("Found a restaurant -- " + restaurant.getName());
//        System.out.println("With rating -- " + restaurant.getRating());
//        System.out.println("With cuisines -- " + restaurant.getRestaurantCuisines());
//        System.out.println("With delivery time -- " + restaurant.getDeliveryTime());
    }

    public void tapOnRestaurant() throws RestaurantUnavailableException{
        try {
            waitForElementToBeVisible(By.id("in.swiggy.android:id/restaurant_layout"));
            driver.findElement(By.id("in.swiggy.android:id/restaurant_layout")).click();
//            findElement(getRestaurantElement(0), Bys.restaurantName).click();
        } catch (Exception e) {
            driver.findElement(By.id("in.swiggy.android:id/restaurant_chains_found")).click();
            driver.findElement(By.id("in.swiggy.android:id/chain_layout")).click();
//            findElement(getRestaurantElement(0), Bys.restaurantChainsFound).click();
//            findElement(getRestaurantElement(0), Bys.restaurantChainOption).click();
        }
    }

    public void tapOnAccount() {
        waitForElementToBeClickable(accountButton);
        accountButton.click();
    }

    public void tapOnLoginLogoutButton() {
        waitForElementToBeClickable(login_logout_button);
        login_logout_button.click();
    }

    public void tapOnRestaurantButton() {
        waitForElementToBeClickable(restaurantButton);
        restaurantButton.click();
    }

    public void tapOnFilter() {
        waitForElementToBeClickable(filter);
        filter.click();
    }

}