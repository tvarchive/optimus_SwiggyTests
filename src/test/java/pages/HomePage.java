package pages;

import entities.Restaurant;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    private AppiumDriver driver;
    private Restaurant restaurant;

    @FindBy(id = "in.swiggy.android:id/custom_toolbar_title_container")
    private WebElement customToolbar;

    @FindBy(id = "in.swiggy.android:id/bottom_bar_option_account")
    private WebElement accountButton;

    @FindBy(id = "in.swiggy.android:id/bottom_bar_option_restaurants")
    private WebElement restaurantButton;

    @FindBy(id = "in.swiggy.android:id/logout_login_button")
    private WebElement login_logout_button;

    @FindBy(id = "in.swiggy.android:id/activity_restaurant_filter_layout")
    private WebElement filter;

    public HomePage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void chooseARestaurant(){
        try {
            waitForElementToBeVisible(customToolbar);
            scrollDownAndFindARestaurant();
        } catch (Exception e) {
            scrollDownAndFindARestaurant();
        }
    }

    private void scrollDownAndFindARestaurant() {
        scrollDown();
        System.out.println("Choosing a restaurant");
        restaurant = findARestaurant(0);
        System.out.println("Found a restaurant -- " + restaurant.getName());
        System.out.println("With rating -- " + restaurant.getRating());
        System.out.println("With cuisines -- " + restaurant.getRestaurantCuisines());
        System.out.println("With delivery time -- " + restaurant.getDeliveryTime());
    }

    public void tapOnRestaurant() {
        try {
            if (findElement(getRestaurantElement(0), Bys.restaurantChainsFound).isEnabled()) {
                findElement(getRestaurantElement(0), Bys.restaurantChainsFound).click();
                findElement(getRestaurantElement(0), Bys.restaurantChainOption).click();
            }
            else{
                findElement(getRestaurantElement(0), Bys.restaurantName).click();
            }
        } catch (Exception e) {
            findElement(getRestaurantElement(0), Bys.restaurantName).click();
        }
    }

    public void tapOnAccount(){
        waitForElementToBeClickable(accountButton);
        accountButton.click();
    }

    public void tapOnLoginLogoutButton(){
        waitForElementToBeClickable(login_logout_button);
        login_logout_button.click();
    }

    public void tapOnRestaurantButton(){
        waitForElementToBeClickable(restaurantButton);
        restaurantButton.click();
    }

    public void tapOnFilter(){
        waitForElementToBeClickable(filter);
        filter.click();
    }

}