package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidBusinessAddressDetailsObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidBusinessAddressDetailsObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(xpath= "(//android.widget.RadioButton[@text=\"Yes\"])[1]")
    private AndroidElement bsaddTradingAddressSameAsPersonalYesRd;

    @AndroidFindBy(xpath= "(//android.widget.RadioButton[@text=\"No\"])[1]")
    private AndroidElement bsaddTradingAddressSameAsPersonalNoRd;

    @AndroidFindBy(xpath= "(//android.widget.RadioButton[@text=\"Yes\"])[2]")
    private AndroidElement bsaddBusinessPostalSameAsBusinessYesRd;

    @AndroidFindBy(xpath= "(//android.widget.RadioButton[@text=\"No\"])[2]")
    private AndroidElement bsaddBusinessPostalSameAsBusinessNoRd;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/esBtnAction")
    private AndroidElement bsaddNextBtn;

    public AndroidElement getBsaddTradingAddressSameAsPersonalYesRd() {
        return bsaddTradingAddressSameAsPersonalYesRd;
    }

    public AndroidElement getBsaddTradingAddressSameAsPersonalNoRd() {
        return bsaddTradingAddressSameAsPersonalNoRd;
    }

    public AndroidElement getBsaddBusinessPostalSameAsBusinessYesRd() {
        return bsaddBusinessPostalSameAsBusinessYesRd;
    }

    public AndroidElement getBsaddBusinessPostalSameAsBusinessNoRd() {
        return bsaddBusinessPostalSameAsBusinessNoRd;
    }

    public AndroidElement getBsaddNextBtn() {
        return bsaddNextBtn;
    }

    public void clickTradingAddressSameAsPersonalYesRd() throws TestException {
        appiumAction.waitAndClickElement(getBsaddTradingAddressSameAsPersonalYesRd());
    }

    public void clickTradingAddressSameAsPersonalNoRd() throws TestException {
        appiumAction.waitAndClickElement(getBsaddTradingAddressSameAsPersonalNoRd());
    }

    public void clickBusinessPostalSameAsBusinessYesRd() throws TestException {
        appiumAction.waitAndClickElement(getBsaddBusinessPostalSameAsBusinessYesRd());
    }

    public void clickBusinessPostalSameAsBusinessNoRd() throws TestException {
        appiumAction.waitAndClickElement(getBsaddBusinessPostalSameAsBusinessNoRd());
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getBsaddNextBtn());
    }

}
