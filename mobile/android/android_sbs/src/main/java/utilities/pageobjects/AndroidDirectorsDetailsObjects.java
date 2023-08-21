package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidDirectorsDetailsObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidDirectorsDetailsObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver, 60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id= "za.co.nedbank.qa:id/esEdtInput")
    public AndroidElement drdtEmailTxt;

    @AndroidFindBy(xpath= "(//android.widget.TextView)[1]")
    public AndroidElement drdtCountryOfBirthDrp;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/esBtnAction")
    private AndroidElement drdtNextBtn;

    public AndroidElement getDrdtEmailTxt() {
        return drdtEmailTxt;
    }

    public AndroidElement getDrdtCountryOfBirthDrp() {
        return drdtCountryOfBirthDrp;
    }

    public AndroidElement getDrdtNextBtn() {
        return drdtNextBtn;
    }

    public void waitForDirectorsDetailsScreen() throws TestException {
        appiumAction.waitForElementToBeVisible(getDrdtEmailTxt());
    }

    public void captureEmail(String email) {
        getDrdtEmailTxt().clear();
        getDrdtEmailTxt().sendKeys(email);
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getDrdtNextBtn());
    }

}
