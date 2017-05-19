package steps;

import cucumber.api.java.en.Given;
import io.appium.java_client.AppiumDriver;
import pages.DeliveryLocationPage;

public class DeliveryLocationSteps extends BaseSteps {

    private AppiumDriver getDriver() {
        return getDriverInstanceFor("foodie");
    }

    @Given("^I have chosen to order some food online and I provide my location for delivery as ([^\"]*)")
    public void iHaveChosenToOrderSomeFoodOnlineAndIProvideMyLocationForDeliveryAs(String deliveryLocation){
        DeliveryLocationPage deliveryLocationPage =  new DeliveryLocationPage(getDriver());
        pageBank.getPage(deliveryLocationPage).denyPermission();
        pageBank.getPage(deliveryLocationPage).selectManualLocation();
        pageBank.getPage(deliveryLocationPage).enterDeliveryLocation(deliveryLocation);
        pageBank.getPage(deliveryLocationPage).selectAppropriateLocation();
        pageBank.getPage(deliveryLocationPage).denyPermission();
    }
}
