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

public class AndroidCallMeBackObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidCallMeBackObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Sorry, your application can’t be processed online\"]")
    private AndroidElement cmbHeaderTextLbl;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Call me back\"]")
    private AndroidElement cmbCallMeBackBtn;


    @AndroidFindBy(xpath = "//android.widget.ImageButton")
    private AndroidElement cmbBackArrowBtn;

    public AndroidElement getCmbHeaderTextLbl() {
        return cmbHeaderTextLbl;
    }

    public AndroidElement getCmbCallMeBackBtn() {
        return cmbCallMeBackBtn;
    }

    public AndroidElement getCmbBackArrowBtn() {
        return cmbCallMeBackBtn;
    }

    public void clickCallMeBackBtn() throws TestException {
        appiumAction.waitAndClickElement(getCmbCallMeBackBtn());
    }

    public void clickBackArrowBtn() throws TestException {
        appiumAction.waitAndClickElement(getCmbBackArrowBtn());
    }


}
