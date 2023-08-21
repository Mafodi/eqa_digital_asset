package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidApproveItObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidApproveItObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }


    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Reject\"]")
    private AndroidElement aprvRejectApproveItBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Accept\"]")
    private AndroidElement aprvAcceptApproveItBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Done\"]")
    private AndroidElement aprvDoneBtn;

    public AndroidElement getAprvRejectApproveItBtn() {
        return aprvRejectApproveItBtn;
    }

    public AndroidElement getAprvAcceptApproveItBtn() {
        return aprvAcceptApproveItBtn;
    }

    public AndroidElement getAprvDoneBtn() {
        return aprvDoneBtn;
    }

    public void clickRejectApproveItBtn() throws TestException {
        appiumAction.waitAndClickElement(getAprvRejectApproveItBtn());
    }

    public void clickAcceptApproveItBtn() throws TestException {
        appiumAction.waitAndClickElement(getAprvAcceptApproveItBtn());
    }

    public void clickDoneBtn() throws TestException {
        appiumAction.waitAndClickElement(getAprvDoneBtn());
    }


}
