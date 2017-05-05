package steps;

import cucumber.api.java.en.And;
import io.appium.java_client.AppiumDriver;
import pages.FiltersPage;
import pages.HomePage;

public class FilterSelectSteps extends BaseSteps {

    public AppiumDriver getDriver(){
        return getDriverInstanceFor("foodie");
    }

    @And("^I tap on filters,select relevant filters and then click on apply filters$")
    public void iTapOnFiltersAndSelectRelevantFilters(){
        new HomePage(getDriver()).clickOnFilter();
        new FiltersPage(getDriver()).sortByRating();
        new FiltersPage(getDriver()).setCostLevel();
        new FiltersPage(getDriver()).selectCuisine();
        new FiltersPage(getDriver()).clickOnApplyFilterButton();
    }
}
