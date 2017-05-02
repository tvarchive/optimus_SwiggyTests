package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.appium.java_client.AppiumDriver;
import pages.DeliveryLocationPage;

public class DeliveryLocationSteps extends BaseSteps {

    private AppiumDriver getDriver() {
        return getDriverInstanceFor("foodie");
    }

    @Given("^I have swiggy application in my phone$")
    public void iHaveSwiggyApplicationInMyPhone(){
        getDriver();
    }

    @And("^I want to enter my location manually$")
    public void iWantToEnterMyLocationManually(){
        new DeliveryLocationPage(getDriver()).selectManualLocation();
    }

    @And("^I enter my location as ([^\"]*) in the input box and select the appropriate location$")
    public void iEnterMyLocationAsTextInTheInputBox(String location){
        new DeliveryLocationPage(getDriver()).enterDeliveryLocation(location);
        new DeliveryLocationPage(getDriver()).selectAppropriateLocation();
    }
}
