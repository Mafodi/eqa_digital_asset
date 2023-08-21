//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package utilities.pageobjects;

import com.sun.javafx.scene.traversal.Direction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.enablers.AndroidEnablers;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidCommonObjects {
    public AndroidDriver androidDriver;
    public WebDriverWait wait;
    private AppiumAction appiumAction;
    AndroidEnablers androidEnablers = new AndroidEnablers();
    @AndroidFindBy(
            id = "iv_date_picker"
    )
    private AndroidElement datePicker;
    @AndroidFindBy(
            xpath = "//android.widget.Button[@text=\"OK\"]"
    )
    private AndroidElement datePickerOk;
    @AndroidFindBy(
            xpath = "//android.widget.Button[@text=\"CANCEL\"]"
    )
    private AndroidElement datePickerCancel;
    @AndroidFindBy(
            xpath = "//android.widget.Button[@text=\"Create app PIN\"]"
    )
    private AndroidElement createAppPinBtn;
    @AndroidFindBy(
            id = "android:id/next"
    )
    private WebElement clndNextMonth;
    @AndroidFindBy(
            xpath = "//android.view.View[@text='1']"
    )
    private WebElement clndFirstDate;
    @AndroidFindBy(
            id = "esBtnAction"
    )
    private AndroidElement nextBtn;
    @AndroidFindBy(
            id = "app_rooted_continue"
    )
    private AndroidElement initialLoginBtn;
    @AndroidFindBy(
            id = "permission_deny_button"
    )
    private AndroidElement cameraDenyPermission;
    @AndroidFindBy(
            id = "overview_page_fca_layout"
    )
    private AndroidElement ovrwFCALayout;
    @AndroidFindBy(
            id = "esEdtInput"
    )
    private AndroidElement inputFieldTxt;
    @AndroidFindBy(
            xpath = "(//android.widget.EditText)[1]"
    )
    private AndroidElement genericCredOneTxt;
    @AndroidFindBy(
            xpath = "(//android.widget.EditText)[2]"
    )
    private AndroidElement genericCredTwoTxt;
    @AndroidFindBy(
            xpath = "(//android.widget.EditText)[3]"
    )
    private AndroidElement genericCredThreeTxt;

    public AndroidCommonObjects(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
        this.wait = new WebDriverWait(androidDriver, 60L);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        this.appiumAction = new AppiumAction(androidDriver);
    }

    public AndroidElement getInitialLoginBtn() {
        return this.initialLoginBtn;
    }

    public AndroidElement getNextBtn() {
        return this.nextBtn;
    }

    public WebElement getClndNextMonth() {
        return this.clndNextMonth;
    }

    public WebElement getClndFirstDate() {
        return this.clndFirstDate;
    }

    public AndroidElement getDatePicker() {
        return this.datePicker;
    }

    public AndroidElement getDatePickerOk() {
        return this.datePickerOk;
    }

    public AndroidElement getDatePickerCancel() {
        return this.datePickerCancel;
    }

    public AndroidElement getCameraDenyPermission() {
        return this.cameraDenyPermission;
    }

    public AndroidElement getCreateAppPinBtn() {
        return this.createAppPinBtn;
    }

    public void selectDatePicker() {
        this.getDatePicker().click();
    }

    public void clickCancelDatePicker() {
        this.getDatePickerCancel().click();
    }

    public void selectFutureDate() {
        this.getClndNextMonth().click();
        this.getClndFirstDate().click();
    }

    public void clickOkayDatePicker() {
        this.getDatePickerOk().click();
    }

    public void clickNextButton() throws TestException, InterruptedException {
        //this.androidEnablers.androidScrollDown(2, this.androidDriver);
        this.appiumAction.waitAndClickElement(this.getNextBtn());
    }

    public void clickCreateAppPinBtn() throws TestException, InterruptedException {
        this.appiumAction.waitAndClickElement(this.getCreateAppPinBtn());
    }

    public void clickSwipeDownNextButton(Boolean isSwipe) throws TestException, InterruptedException {
        if (isSwipe) {
            //this.androidEnablers.androidScrollDown(2, this.androidDriver);
        }

        Thread.sleep(3000L);
        this.appiumAction.waitAndClickElement(this.getNextBtn());
    }

    public void clickNextButtonNoSwipe() throws TestException {
        this.appiumAction.waitAndClickElement(this.getNextBtn());
    }

    public void clickCameraDenyPermissionBtn() throws TestException {
        this.appiumAction.waitAndClickElement(this.getCameraDenyPermission());
    }

    public void isChangePwBtnDisabled() {
        assert !this.appiumAction.isElementEnabled(this.getNextBtn());

    }

    public AndroidElement getOvrwFCALayout() {
        return this.ovrwFCALayout;
    }

    public void swipeToOverview() {
        this.androidEnablers.swipeElementAndroid(this.getOvrwFCALayout(), Direction.LEFT, this.androidDriver);
    }

    public AndroidElement getInputFieldTxt() {
        return this.inputFieldTxt;
    }

    public void captureSingleInputField(String inputText) throws TestException {
        this.appiumAction.waitForElementToBeVisible(this.getInputFieldTxt());
        this.appiumAction.typeText(this.getInputFieldTxt(), inputText);
    }

    public AndroidElement getGenericCredOneTxt() {
        return this.genericCredOneTxt;
    }

    public AndroidElement getGenericCredTwoTxt() {
        return this.genericCredTwoTxt;
    }

    public AndroidElement getGenericCredThreeTxt() {
        return this.genericCredThreeTxt;
    }

    public void captureThreeGenericFields(String valueOne, String valueTwo, String valueThree) throws TestException {
        this.appiumAction.waitForElementToBeVisible(this.getGenericCredOneTxt());
        this.appiumAction.typeText(this.getGenericCredOneTxt(), valueOne);
        this.appiumAction.typeText(this.getGenericCredTwoTxt(), valueTwo);
        this.appiumAction.typeText(this.getGenericCredThreeTxt(), valueThree);
    }

    public void captureTwoGenericFields(String val1, String val2) throws TestException {
        this.appiumAction.waitForElementToBeVisible(this.getGenericCredOneTxt());
        this.appiumAction.typeText(this.getGenericCredOneTxt(), val1);
        this.appiumAction.typeText(this.getGenericCredTwoTxt(), val2);
    }

    public void clickInitialLoginButton() throws TestException {
        this.appiumAction.waitAndClickElement(this.getInitialLoginBtn());
    }
}
