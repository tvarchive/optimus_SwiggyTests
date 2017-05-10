package steps;

import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;
import pages.*;

public class FilterSelectSteps extends BaseSteps {

    public AppiumDriver getDriver(){
        return getDriverInstanceFor("foodie");
    }

    @And("^I apply filters and select a restaurant of my choice$")
    public void iSelectARestaurantOfMyChoiceWithFiltersApplied(){
        new HomePage(getDriver()).tapOnRestaurantButton();
        new HomePage(getDriver()).tapOnFilter();
        new FiltersPage(getDriver()).sortByRating();
        new FiltersPage(getDriver()).setCostLevel();
        new FiltersPage(getDriver()).tapOnApplyFilterButton();
        new BasePage(getDriver()).denyPermission();
        new HomePage(getDriver()).chooseARestaurant();
        new HomePage(getDriver()).tapOnRestaurant();
    }
}
