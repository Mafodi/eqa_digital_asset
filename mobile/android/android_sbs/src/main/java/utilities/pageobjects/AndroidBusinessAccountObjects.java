package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidBusinessAccountObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidBusinessAccountObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/chkProductComparable")
    public AndroidElement bsaccProductsComparableChk;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/chkTnC")
    public AndroidElement bsaccTermsAndConditionsChk;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esBtnAction")
    public AndroidElement bsaccApplyNowBtn;

    public AndroidElement getBsaccProductsComparableChk() {
        return bsaccProductsComparableChk;
    }

    public AndroidElement getBsaccTermsAndConditionsChk() {
        return bsaccTermsAndConditionsChk;
    }

    public AndroidElement getBsaccApplyNowBtn() {
        return bsaccApplyNowBtn;
    }

    public void clickProductsComparableChk() throws TestException {
        appiumAction.waitAndClickElement(getBsaccProductsComparableChk());
    }

    public void clickTermsAndConditionsChk() throws TestException {
        appiumAction.waitAndClickElement(getBsaccTermsAndConditionsChk());
    }

    public void clickApplyNowBtn() throws TestException {
        appiumAction.waitAndClickElement(getBsaccApplyNowBtn());
    }

}
