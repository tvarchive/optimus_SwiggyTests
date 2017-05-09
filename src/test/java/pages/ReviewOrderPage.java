package pages;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewOrderPage extends BasePage {


    @FindBy(id = "in.swiggy.android:id/error_container_action_button")
    private WebElement loginButton;

    @FindBy(id = "in.swiggy.android:id/fragment_sign_in_layout_sign_in_button")
    private WebElement phoneNumberProceedButton;

    @FindBy(id = "in.swiggy.android:id/fragment_new_password_sign_in_button_1")
    private WebElement passwordSignIn;

    @FindBy(id = "in.swiggy.android:id/fragment_sign_in_layout_sign_in_phone_number")
    private WebElement phoneNumberTextBox;

    @FindBy(id = "in.swiggy.android:id/fragment_new_password_edit_text_1")
    private WebElement passwordTextBox;

    @FindBy(id = "in.swiggy.android:id/error_container_action_button")
    private WebElement addNewAddress;

    @FindBy(id = "fragment_create_address_landmark")
    private WebElement landmark;

    @FindBy(id = "in.swiggy.android:id/fragment_create_address_flat_no_et")
    private WebElement address;

    @FindBy(id = "in.swiggy.android:id/fragment_create_address_submit_button")
    private WebElement submitAddressButton;

    @FindBy(id = "in.swiggy.android:id/neutralLayout")
    private WebElement deliveryFeeOkButton;

    @FindBy(id = "in.swiggy.android:id/address_select_checkbox")
    private WebElement addressSelect;

    @FindBy(id = "in.swiggy.android:id/proceed_button")
    private WebElement reviewCartProceedBtn;

    @FindBy(id = "in.swiggy.android:id/fragment_create_address_pick_map_position_button")
    private WebElement pickLocation;

    private AppiumDriver driver;

    public ReviewOrderPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void tapOnLoginButton() {
        scrollDownTo(By.id("in.swiggy.android:id/error_container_action_button"));
        waitForElementToBeClickable(loginButton);
        loginButton.click();
    }

    public void tapOnDeliveryFeeOkButton() {
        try {
            waitForElementToBeClickable(deliveryFeeOkButton);
            deliveryFeeOkButton.click();
        } catch (Exception e) {

        }
    }

    public void enterPhoneNumber(String number) {
        waitForElementToBeVisible(phoneNumberTextBox);
        phoneNumberTextBox.sendKeys(number);
        waitForElementToBeClickable(phoneNumberProceedButton);
        phoneNumberProceedButton.click();
    }

    public void enterPassword(String password) {
        waitForElementToBeVisible(passwordTextBox);
        passwordTextBox.sendKeys(password);
    }

    public void signIn() {
        waitForElementToBeClickable(passwordSignIn);
        passwordSignIn.click();
    }

    public void selectAddress() {
        waitForElementToBeVisible(addressSelect);
        addressSelect.click();
    }

    public void proceedToPayment() {
        scrollDownTo(By.id("in.swiggy.android:id/proceed_button"));
        waitForElementToBeClickable(reviewCartProceedBtn);
        reviewCartProceedBtn.click();
    }

    public void selectLocation() {
        waitForElementToBeClickable(pickLocation);
        pickLocation.click();
    }

    public void enterBuildingAddress(String buildingAddress) {
        waitForElementToBeVisible(address);
        address.sendKeys(buildingAddress);
    }

    public void tapOnSave() {
        waitForElementToBeClickable(submitAddressButton);
        submitAddressButton.click();
    }

    public void tapOnAddNewAddress() {
        waitForElementToBeClickable(addNewAddress);
        addNewAddress.click();
    }

    public void tapOnPickLocation() {
        waitForElementToBeClickable(pickLocation);
        pickLocation.click();
    }

    public void enterLandmark(String landmark) {
        waitForElementToBeVisible(this.landmark);
        this.landmark.sendKeys(landmark);
    }
}
