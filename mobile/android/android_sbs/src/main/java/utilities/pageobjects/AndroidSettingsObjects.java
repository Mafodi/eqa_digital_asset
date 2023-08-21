package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidSettingsObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidSettingsObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Profile settings']")
    public AndroidElement stngProfileSettingsBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Account settings']")
    public AndroidElement stngAccountSettingsBtn;

    public AndroidElement getStngProfileSettingsBtn() {
        return stngProfileSettingsBtn;
    }

    public AndroidElement getStngAccountSettingsBtn() {
        return stngAccountSettingsBtn;
    }

    public void clickProfileSettingsBtn() throws TestException {
        appiumAction.waitAndClickElement(getStngProfileSettingsBtn());
    }

    public void clickAccountSettingsBtn() throws TestException {
        appiumAction.waitAndClickElement(getStngAccountSettingsBtn());
    }

}
