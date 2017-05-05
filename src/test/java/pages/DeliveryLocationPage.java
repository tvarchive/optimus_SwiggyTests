package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryLocationPage extends BasePage {

    private AppiumDriver driver;

    @FindBy(id = "in.swiggy.android:id/useManualSelectionBtnNewFlow")
    private WebElement enterLocation;

    @FindBy(id = "in.swiggy.android:id/search_src_text")
    private WebElement deliveryLocation;

    @FindBy(xpath = "//android.widget.LinearLayout[@index=1]")
    private WebElement appropriateLocation;

    private String deliveryType;

    public DeliveryLocationPage() {

    }

    public DeliveryLocationPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void selectManualLocation() {
        waitForElementToBeClickable(enterLocation);
        enterLocation.click();
    }

    public void enterDeliveryLocation(String location){
        waitForElementToBeVisible(deliveryLocation);
        deliveryLocation.sendKeys(location);
    }

    public void selectAppropriateLocation(){
        waitForElementToBeClickable(appropriateLocation);
        appropriateLocation.click();
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }
}
