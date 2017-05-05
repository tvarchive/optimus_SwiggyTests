package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FiltersPage extends BasePage {

    private AppiumDriver driver;

    @FindBy(id = "in.swiggy.android:id/ratings_button")
    private WebElement ratingsButton;

    @FindBy(id = "in.swiggy.android:id/delivery_button")
    private WebElement deliveryButton;

    @FindBy(id = "in.swiggy.android:id/oneDollarButton")
    private WebElement affordable;

    @FindBy(id = "in.swiggy.android:id/twoDollarButton")
    private WebElement average;

    @FindBy(id = "in.swiggy.android:id/threeDollarButton")
    private WebElement costly;

    @FindBy(id = "in.swiggy.android:id/fourDollarButton")
    private WebElement premium;

    @FindBy(id = "//android.widget.ListView/android.widget.RelativeLayout[@index=2]")
    private WebElement andhraCuisine;

    @FindBy(id = "in.swiggy.android:id/filter_apply_button")
    private WebElement applyFilterButton;

    public FiltersPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void sortByRating(){
        waitForElementToBeClickable(ratingsButton);
        ratingsButton.click();
    }

    public void setCostLevel(){
        waitForElementToBeClickable(costly);
        costly.click();
        waitForElementToBeClickable(average);
        average.click();
    }

    public void selectCuisine(){
        scrollDownTo(By.xpath("//android.widget.ListView/android.widget.RelativeLayout[@index=2]"));
        waitForElementToBeVisible(andhraCuisine);
        andhraCuisine.click();
    }

    public void clickOnApplyFilterButton(){
        waitForElementToBeClickable(applyFilterButton);
        applyFilterButton.click();
    }

}
