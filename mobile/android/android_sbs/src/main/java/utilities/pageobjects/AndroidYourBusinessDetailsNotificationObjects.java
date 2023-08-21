package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidYourBusinessDetailsNotificationObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidYourBusinessDetailsNotificationObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(className = "android.widget.ImageView")
    public AndroidElement ybdnIconImg;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esTxvHeader")
    public AndroidElement ybdnHeaderLbl;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[2]")
    public AndroidElement ybdnSubHeaderLbl;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esBtnAction")
    public AndroidElement ybdnNextBtn;

    public AndroidElement getYbdnIconImg() {
        return ybdnIconImg;
    }

    public AndroidElement getYbdnHeaderLbl() {
        return ybdnHeaderLbl;
    }

    public AndroidElement getYbdnSubHeaderLbl() {
        return ybdnSubHeaderLbl;
    }

    public AndroidElement getYbdnNextBtn() {
        return ybdnNextBtn;
    }

    public void waitForYourBusinessDetailsNotificationScreen() throws TestException {
        appiumAction.waitForElementToBeVisible(getYbdnIconImg());
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getYbdnNextBtn());
    }




}
