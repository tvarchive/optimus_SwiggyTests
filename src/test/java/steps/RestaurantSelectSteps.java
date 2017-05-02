package steps;

import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;
import pages.HomePage;


public class RestaurantSelectSteps extends BaseSteps{

    public AppiumDriver getDriver(){
        return getDriverInstanceFor("foodie");
    }

    @And("^I choose a restaurant of my choice$")
    public void iChooseARestaurantOfMyChoice(){
        new HomePage(getDriver()).chooseARestaurant();
    }
}
