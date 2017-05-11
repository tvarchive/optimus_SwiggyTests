package steps;

import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import pages.HomePage;
import pages.ReviewOrderPage;

public class LoginSteps extends BaseSteps{

    private AppiumDriver getDriver(){
        return getDriverInstanceFor("foodie");
    }

    @When("^I login as a valid registered user with phone number as ([^\"]*) and password as ([^\"]*)")
    public void iLoginFirstAsAValidRegisteredUserWithPhoneNumberAndPasswordAs(String phoneNumber,String password){
        new HomePage(getDriver()).tapOnAccount();
        new HomePage(getDriver()).tapOnLoginLogoutButton();
        new ReviewOrderPage(getDriver()).enterPhoneNumber(phoneNumber);
        new ReviewOrderPage(getDriver()).enterPassword(password);
        new ReviewOrderPage(getDriver()).signIn();
    }
}
