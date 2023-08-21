package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

import java.util.List;

public class AndroidMoreObjects {

    public AndroidDriver driver;
    public WebDriverWait wait;
    private AppiumAction appiumAction;

    /**
     * Default Constructor within class <AndroidMoreObjects>
     */
    public AndroidMoreObjects(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        appiumAction = new AppiumAction(driver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/lnrRootProfile")
    private List<AndroidElement> morProfilesCarousel;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/txvProfileId")
    private List<AndroidElement> morProfilesNumbersCarousel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text\"Link a Profile\"]")
    private AndroidElement morLinkProfile;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/notifications_row")
    private AndroidElement morNotifications;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/apply_row")
    private AndroidElement morApply;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/statements_and_documents_row")
    private AndroidElement morStatementsAndDocuments;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/get_in_touch_row")
    private AndroidElement morGetInTouch;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/login_and_security_row")
    private AndroidElement morLoginAndSecurity;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/settings_row")
    private AndroidElement morSettings;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/share_money_app_row")
    private AndroidElement morShareMoneyApp;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/rate_the_app_row")
    private AndroidElement morRateTheApp;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/terms_and_conditions_row")
    private AndroidElement morTermsAndConditions;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/log_out_row")
    private AndroidElement morLogOut;

    public List<AndroidElement> getMorProfilesCarousel() {
        return morProfilesCarousel;
    }

    public List<AndroidElement> getMorProfilesNumbersCarousel() {
        return morProfilesNumbersCarousel;
    }

    public AndroidElement getMorLinkProfile() {
        return morLinkProfile;
    }

    public AndroidElement getMorNotifications() {
        return morNotifications;
    }

    public AndroidElement getMorApply() {
        return morApply;
    }

    public AndroidElement getMorStatementsAndDocuments() {
        return morStatementsAndDocuments;
    }

    public AndroidElement getMorGetInTouch() {
        return morGetInTouch;
    }

    public AndroidElement getMorLoginAndSecurity() {
        return morLoginAndSecurity;
    }

    public AndroidElement getSettings() {
        return morSettings;
    }

    public AndroidElement getMorShareMoneyApp() {
        return morShareMoneyApp;
    }

    public AndroidElement getMorRateTheApp() {
        return morRateTheApp;
    }

    public AndroidElement getMorTermsAndConditions() {
        return morTermsAndConditions;
    }

    public AndroidElement getMorLogOut() {
        return morLogOut;
    }


    public void switchAccount(int accountIndex) {
        getMorProfilesCarousel().get(accountIndex).click();
//        appiumAction.waitForElementToBeVisible(getAccounts().get(accountIndex));
    }

    public void clickLinkProfile() throws TestException {
        appiumAction.waitForElementToBeVisible(getMorLinkProfile());
    }

    public void clickProfileNumbersCarousel(int index) throws TestException {
        appiumAction.waitForElementToBeVisible(getMorProfilesNumbersCarousel().get(index));
    }

    public void clickNotification() throws TestException {
        appiumAction.waitForElementToBeVisible(getMorNotifications());
    }

    public void clickApply() throws TestException {
        appiumAction.waitForElementToBeVisible(getMorApply());
    }

    public void clickStatementsAndDocuments() throws TestException {
        appiumAction.waitForElementToBeVisible(getMorStatementsAndDocuments());
    }

    public void clickGetInTouch() throws TestException {
        appiumAction.waitForElementToBeVisible(getMorGetInTouch());
    }

    public void clickLoginAndSecurity() throws TestException {
        appiumAction.waitForElementToBeVisible(getMorLoginAndSecurity());
    }

    public void clickSettings() throws TestException {
        appiumAction.waitForElementToBeVisible(getSettings());
    }

    public void clickShareMoneyApp() throws TestException {
        appiumAction.waitForElementToBeVisible(getMorShareMoneyApp());
    }

    public void clickRateTheApp() throws TestException {
        appiumAction.waitForElementToBeVisible(getMorRateTheApp());
    }

    public void clickTermsAndConditions() throws TestException {
        appiumAction.waitForElementToBeVisible(getMorTermsAndConditions());
    }

    public void clickLogOut() throws TestException {
        appiumAction.waitForElementToBeVisible(getMorLogOut());
    }



}
