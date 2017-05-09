package steps;

import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;
import pages.HomePage;
import pages.ReviewOrderPage;

public class LoginSteps extends BaseSteps{

    private AppiumDriver getDriver(){
        return getDriverInstanceFor("foodie");
    }

    @And("^I login first as a valid registered user with phone number as ([^\"]*) and password as ([^\"]*)")
    public void iLoginFirstAsAValidRegisteredUserWithPhoneNumberAndPasswordAs(String phoneNumber,String password){
        new HomePage(getDriver()).tapOnAccount();
        new HomePage(getDriver()).tapOnLoginLogoutButton();
        new ReviewOrderPage(getDriver()).enterPhoneNumber(phoneNumber);
        new ReviewOrderPage(getDriver()).enterPassword(password);
        new ReviewOrderPage(getDriver()).signIn();
    }
}
