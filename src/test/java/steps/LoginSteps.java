package steps;

import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;
import pages.HomePage;

public class LoginSteps extends BaseSteps{

    private AppiumDriver getDriver(){
        return getDriverInstanceFor("foodie");
    }

    @And("^I tap on account button and then tap on login$")
    public void iClickOnAccountButton(){
        new HomePage(getDriver()).clickOnAccount();
        new HomePage(getDriver()).clickOnLoginLogoutButton();
    }


}
