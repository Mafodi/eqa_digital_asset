package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidAddUserObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidAddUserObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }


    @AndroidFindBy(id = "za.co.nedbank.qa:id/chkTnC")
    public AndroidElement adusTermsAndConditionsChk;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esBtnAction")
    public AndroidElement adusNextBtn;

    public AndroidElement getAdusTermsAndConditionsChk() {
        return adusTermsAndConditionsChk;
    }

    public AndroidElement getAdusNextBtn() {
        return adusNextBtn;
    }

    public void clickTermsAndConditionsChk() throws TestException {
        appiumAction.waitAndClickElement(getAdusTermsAndConditionsChk());
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getAdusNextBtn());
    }
}
