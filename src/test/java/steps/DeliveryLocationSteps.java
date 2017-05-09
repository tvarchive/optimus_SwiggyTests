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
        pageBank.addPage(deliveryLocationPage);
        deliveryLocationPage.selectManualLocation();
        pageBank.getPage(DeliveryLocationPage.class).enterDeliveryLocation(deliveryLocation);
        pageBank.getPage(DeliveryLocationPage.class).selectAppropriateLocation();
    }
}
