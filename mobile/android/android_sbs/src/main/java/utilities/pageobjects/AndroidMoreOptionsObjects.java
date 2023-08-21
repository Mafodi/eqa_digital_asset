package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidMoreOptionsObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidMoreOptionsObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Apply']")
    public AndroidElement mropApplyBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
    public AndroidElement mropSettingsBtn;

    public AndroidElement getMropApplyBtn() {
        return mropApplyBtn;
    }

    public AndroidElement getMropSettingsBtn() {
        return mropSettingsBtn;
    }

    public void clickApplyBtn() throws TestException {
        appiumAction.waitAndClickElement(getMropApplyBtn());
    }

    public void clickSettingsBtn() throws TestException {
        appiumAction.waitAndClickElement(getMropSettingsBtn());
    }

}
