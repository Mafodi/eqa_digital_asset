package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidKeepInTouchObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidKeepInTouchObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/keep_in_touch_yes_radio_btn")
    private AndroidElement kitcKeepInTouchYesRd;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/keep_in_touch_no_radio_btn")
    private AndroidElement kitcKeepInTouchNoRd;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esLnrField")
    private AndroidElement kitcPreferredContactMethodDrp;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/esBtnAction")
    private AndroidElement kitcNextBtn;

    public AndroidElement getKitcKeepInTouchYesRd() {
        return kitcKeepInTouchYesRd;
    }

    public AndroidElement getKitcKeepInTouchNoRd() {
        return kitcKeepInTouchNoRd;
    }

    public AndroidElement getKitcPreferredContactMethodDrp() {
        return kitcPreferredContactMethodDrp;
    }

    public AndroidElement getKitcNextBtn() {
        return kitcNextBtn;
    }

    public void clickKeepInTouchYesRd() throws TestException {
        appiumAction.waitAndClickElement(getKitcKeepInTouchYesRd());
    }

    public void clickKeepInTouchNoRd() throws TestException {
        appiumAction.waitAndClickElement(getKitcKeepInTouchNoRd());
    }

    public void clickPreferredContactMethodDrp() throws TestException {
        appiumAction.waitAndClickElement(getKitcPreferredContactMethodDrp());
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getKitcNextBtn());
    }
}
