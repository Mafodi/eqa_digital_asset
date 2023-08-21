package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidSuccessObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidSuccessObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esTxvHeader")
    private AndroidElement scssHeaderCopyLbl;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/tvCardDelivery")
    private AndroidElement scssCardDeliveryCopyLbl;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/esBtnAction")
    private AndroidElement scssDoneBtn;

    public AndroidElement getScssHeaderCopyLbl() {
        return scssHeaderCopyLbl;
    }

    public AndroidElement getScssCardDeliveryCopyLbl() {
        return scssCardDeliveryCopyLbl;
    }

    public AndroidElement getScssDoneBtn() {
        return scssDoneBtn;
    }

    public void waitForHeaderCopyLbl() throws TestException {
        appiumAction.waitForElementToBeVisible(getScssHeaderCopyLbl());
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getScssDoneBtn());
    }
}
