package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidBusinessAccountTypesObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidBusinessAccountTypesObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver, 60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Startup Bundle']")
    private AndroidElement bsaccStartupBundleLnk;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Business Pay-As-You-Use']")
    private AndroidElement bsaccBusinessPayAsYouUseLnk;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Business Bundle 35']")
    private AndroidElement bsaccBusinessBundle35Lnk;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Business Bundle 60']")
    private AndroidElement bsaccBusinessBundle60Lnk;

    public AndroidElement getBsaccStartupBundleLnk() {
        return bsaccStartupBundleLnk;
    }

    public AndroidElement getBsaccBusinessPayAsYouUseLnk() {
        return bsaccBusinessPayAsYouUseLnk;
    }

    public AndroidElement getBsaccBusinessBundle35Lnk() {
        return bsaccBusinessBundle35Lnk;
    }

    public AndroidElement getBsaccBusinessBundle60Lnk() {
        return bsaccBusinessBundle60Lnk;
    }

    public void clickStartupBundleLnk() throws TestException {
        appiumAction.waitAndClickElement(getBsaccStartupBundleLnk());
    }

    public void clickBusinessPayAsYouUseLnk() throws TestException {
        appiumAction.waitAndClickElement(getBsaccBusinessPayAsYouUseLnk());
    }

    public void clickBusinessBundle35Lnk() throws TestException {
        appiumAction.waitAndClickElement(getBsaccBusinessBundle35Lnk());
    }

    public void clickBusinessBundle60Lnk() throws TestException {
        appiumAction.waitAndClickElement(getBsaccBusinessBundle60Lnk());
    }


}
