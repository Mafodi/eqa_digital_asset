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

public class AndroidThankYouObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidThankYouObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver, 60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id= "za.co.nedbank.qa:id/ivThankYou")
    private AndroidElement thkImageImg;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Thank you\"]")
    private AndroidElement thkHeaderLbl;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/vThankSubYouTitle")
    private AndroidElement thkSubHeaderLbl;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esBtnAction")
    private AndroidElement thkDoneBtn;

    public AndroidElement getThkImageImg() {
        return thkImageImg;
    }

    public AndroidElement getThkHeaderLbl() {
        return thkHeaderLbl;
    }

    public AndroidElement getThkSubHeaderLbl() {
        return thkSubHeaderLbl;
    }

    public AndroidElement getThkDoneBtn() {
        return thkDoneBtn;
    }

    public void clickDoneBtn() throws TestException {
        appiumAction.waitAndClickElement(getThkDoneBtn());
    }

}
