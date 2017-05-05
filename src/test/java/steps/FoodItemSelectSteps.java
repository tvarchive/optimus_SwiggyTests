package steps;

import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;
import pages.RestaurantPage;

public class FoodItemSelectSteps extends BaseSteps {

    public AppiumDriver getDriver() {
        return getDriverInstanceFor("foodie");
    }

    @And("^I choose a food item and click on checkout$")
    public void iChooseAFoodItemAndClickOnCheckout(){
        new RestaurantPage(getDriver()).chooseAnItem();
        new RestaurantPage(getDriver()).clickOnCheckoutButton();
    }
}
