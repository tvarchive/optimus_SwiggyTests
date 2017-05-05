package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import pages.ReviewOrderPage;

public class ReviewOrderSteps extends BaseSteps {

    public AppiumDriver getDriver() {
        return getDriverInstanceFor("foodie");
    }

    @And("^I accept delivery fee and then click on login button$")
    public void iClickOnLoginButton() {
        new ReviewOrderPage(getDriver()).clickOnDeliveryFeeOkButton();
        new ReviewOrderPage(getDriver()).clickOnLoginButton();
    }

    @And("^I enter my phone number as ([^\"]*) and password as ([^\"]*) and sign in")
    public void iEnterMyPhoneNumberAndPasswordAs(String phoneNumber,String password){
        new ReviewOrderPage(getDriver()).enterPhoneNumber(phoneNumber);
        new ReviewOrderPage(getDriver()).enterPassword(password);
        new ReviewOrderPage(getDriver()).signIn();
    }

    @Then("^I select my delivery location and proceed to payment$")
    public void iSelectMyDeliveryLocationAndProceedToPayment(){
        new ReviewOrderPage(getDriver()).selectAddress();
        new ReviewOrderPage(getDriver()).proceedToPayment();
    }

}
