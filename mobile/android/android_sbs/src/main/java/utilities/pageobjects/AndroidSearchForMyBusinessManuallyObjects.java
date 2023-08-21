package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidSearchForMyBusinessManuallyObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidSearchForMyBusinessManuallyObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id= "za.co.nedbank.qa:id/esEdtInput")
    private AndroidElement scbsBusinessRegistrationNumberTxt;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/esBtnAction")
    private AndroidElement scbsNextBtn;

    @AndroidFindBy(xpath= "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private AndroidElement scbsBackArrowBtn;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/switch_field_positive_button")
    private AndroidElement scbsTradingNameYes;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/switch_field_negative_button")
    private AndroidElement scbsTradingNameNo;

    public AndroidElement getScbsBusinessRegistrationNumberTxt() {
        return scbsBusinessRegistrationNumberTxt;
    }

    public AndroidElement getScbsNextBtn() {
        return scbsNextBtn;
    }

    public AndroidElement getScbsBackArrowBtn() {
        return scbsBackArrowBtn;
    }

    public static WebDriverWait getWait() {
        return wait;
    }

    public AndroidElement getScbsTradingNameYes() {
        return scbsTradingNameYes;
    }

    public AndroidElement getScbsTradingNameNo() {
        return scbsTradingNameNo;
    }

    public void captureBusinessRegistrationNumberTxt(String registrationNumber) throws TestException {
        getScbsBusinessRegistrationNumberTxt().sendKeys(registrationNumber);
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getScbsNextBtn());
    }

    public void clickBackArrow() throws TestException {
        appiumAction.waitAndClickElement(getScbsBackArrowBtn());
    }

    public void clickTradingNameYes() throws TestException {
        appiumAction.waitAndClickElement(getScbsTradingNameYes());
    }

    public void clickTradingNameNo() throws TestException {
        appiumAction.waitAndClickElement(getScbsTradingNameNo());
    }

}
