package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import pages.ReviewOrderPage;

public class ReviewOrderSteps extends BaseSteps {

    public AppiumDriver getDriver() {
        return getDriverInstanceFor("foodie");
    }

    @When("^I login as a valid registered user with phone number as ([^\"]*) and password as ([^\"]*)")
    public void iLoginAsAValidRegisteredUserWithPhoneNumberAndPasswordAs(String phoneNumber,String password){
        new ReviewOrderPage(getDriver()).tapOnDeliveryFeeOkButton();
        new ReviewOrderPage(getDriver()).tapOnLoginButton();
        new ReviewOrderPage(getDriver()).enterPhoneNumber(phoneNumber);
        new ReviewOrderPage(getDriver()).enterPassword(password);
        new ReviewOrderPage(getDriver()).signIn();
    }

    @Then("^I should be able to see my saved delivery location and proceed to payment$")
    public void iShouldBeAbleToSeeMySavedDeliveryLocationAndProceedToPayment(){
        new ReviewOrderPage(getDriver()).selectAddress();
        new ReviewOrderPage(getDriver()).proceedToPayment();
    }

    @Then("^I should be able to select my address and proceed to payment$")
    public void iSelectMyDeliveryLocationAndProceedToPayment(){
        new ReviewOrderPage(getDriver()).tapOnDeliveryFeeOkButton();
        new ReviewOrderPage(getDriver()).selectAddress();
        new ReviewOrderPage(getDriver()).proceedToPayment();
    }
}
