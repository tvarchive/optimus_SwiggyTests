package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import pages.HomePage;
import pages.RestaurantPage;


public class RestaurantSelectSteps extends BaseSteps {

    public AppiumDriver getDriver() {
        return getDriverInstanceFor("foodie");
    }

    @And("^I choose a restaurant$")
    public void iChooseARestaurant(){
        new HomePage(getDriver()).chooseARestaurant();
        new HomePage(getDriver()).tapOnRestaurant();
    }

    @And("^I buy some items and proceed to checkout$")
    public void iBuySomeItemsAndProceedToCheckout(){
        new RestaurantPage(getDriver()).chooseAnItem();
        new RestaurantPage(getDriver()).tapOnCheckoutButton();
    }
}
