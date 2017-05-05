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

    @FindBy(id = "in.swiggy.android:id/fragment_create_address_pick_map_position_button")
    private WebElement pickLocation;

    @FindBy(id = "in.swiggy.android:id/fragment_create_address_flat_no_et")
    private WebElement address;

    @FindBy(id = "in.swiggy.android:id/fragment_create_address_submit_button")
    private WebElement submitAddressButton;

    @FindBy(id = "in.swiggy.android:id/neutralLayout")
    private WebElement deliveryFeeOkButton;

    @FindBy(id = "in.swiggy.android:id/item_address_card_container")
    private WebElement addressConfirm;

    @FindBy(id = "in.swiggy.android:id/activity_review_cart_proceed_button")
    private WebElement reviewCartProceedBtn;

    private AppiumDriver driver;

    public ReviewOrderPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickOnLoginButton() {
        scrollDownTo(By.id("in.swiggy.android:id/error_container_action_button"));
        waitForElementToBeClickable(loginButton);
        loginButton.click();
    }

    public void clickOnDeliveryFeeOkButton(){
        try {
            waitForElementToBeClickable(deliveryFeeOkButton);
            deliveryFeeOkButton.click();
        }
        catch (Exception e){

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

    public void signIn(){
        waitForElementToBeClickable(passwordSignIn);
        passwordSignIn.click();
    }

    public void selectAddress(){
        scrollDownTo(By.id("in.swiggy.android:id/activity_review_cart_proceed_button"));
        waitForElementToBeVisible(reviewCartProceedBtn);
        addressConfirm.click();
    }

    public void proceedToPayment(){
        scrollDownTo(By.id("in.swiggy.android:id/activity_review_cart_proceed_button"));
        waitForElementToBeClickable(reviewCartProceedBtn);
        reviewCartProceedBtn.click();
    }

    public void selectLocation(){
        waitForElementToBeClickable(pickLocation);
        pickLocation.click();
    }

    public void enterBuildingAddress(String add){
        waitForElementToBeVisible(address);
        address.sendKeys(add);
    }

    public void clickOnSave(){
        waitForElementToBeClickable(submitAddressButton);
        submitAddressButton.click();
    }

}
