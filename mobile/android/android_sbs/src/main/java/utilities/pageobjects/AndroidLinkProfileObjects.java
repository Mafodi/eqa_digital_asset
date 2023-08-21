package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

import java.util.List;

public class AndroidLinkProfileObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidLinkProfileObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver, 60);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/chkTnC")
    private AndroidElement lkprTermsAndConditionsChk;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esBtnAction")
    private AndroidElement lkprNextBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Profile details\"]")
    private AndroidElement lkprProfileDetailsTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Card & ATM PIN\"]")
    private AndroidElement lkprCardAndAtmPINTab;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esEdtInput")
    private List<AndroidElement> lkprTextFields;

    @AndroidFindBy(className = "android.widget.TextView")
    private AndroidElement lkprRetryError;

    public AndroidElement getLkprTermsAndConditionsChk() {
        return lkprTermsAndConditionsChk;
    }

    public AndroidElement getLkprNextBtn() {
        return lkprNextBtn;
    }

    public AndroidElement getLkprProfileDetailsTab() {
        return lkprProfileDetailsTab;
    }

    public AndroidElement getLkprCardAndAtmPINTab() {
        return lkprCardAndAtmPINTab;
    }

    public List<AndroidElement> getLkprTextFields() {
        return lkprTextFields;
    }

    public AndroidElement getLkprRetryError() {
        return lkprRetryError;
    }

    public void clickTermsAndConditionsChk() throws TestException {
        appiumAction.waitAndClickElement(getLkprTermsAndConditionsChk());
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getLkprNextBtn());
    }

    public void clickProfileDetailsTab() throws TestException {
        if(getLkprProfileDetailsTab().getAttribute("selected").contains("false")) {
            appiumAction.waitAndClickElement(getLkprProfileDetailsTab());
        }
    }

    public void clickCardAndAtmPINTab() throws TestException {
        if(getLkprProfileDetailsTab().getAttribute("selected").contains("false")) {
            appiumAction.waitAndClickElement(getLkprCardAndAtmPINTab());
        }
    }

    public void captureProfileNumber(String profileNumber) throws TestException {
        getLkprTextFields().get(0).sendKeys(profileNumber);
    }

    public void captureProfilePin(String profilePin) throws TestException {
        lkprTextFields.get(1).sendKeys(profilePin);
    }

    public void captureProfilePassword(String profilePassword) throws TestException {
        lkprTextFields.get(2).sendKeys(profilePassword);
    }

}
