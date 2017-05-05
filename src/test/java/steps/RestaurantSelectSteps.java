package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import pages.HomePage;


public class RestaurantSelectSteps extends BaseSteps {

    public AppiumDriver getDriver() {
        return getDriverInstanceFor("foodie");
    }

    @When("^I choose a restaurant of my choice and click on it$")
    public void iChooseARestaurantOfMyChoiceAndClickOnIt() throws InterruptedException {
        new HomePage(getDriver()).chooseARestaurant();
        new HomePage(getDriver()).clickOnRestaurant();
    }

    @And("^I am logged in and I tap on restaurant$")
    public void iAmLoggedInAndItapOnRestaurant(){
        new HomePage(getDriver()).clickOnRestaurantButton();
    }
}
