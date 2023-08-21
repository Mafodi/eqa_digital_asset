package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidNewUserDetailsObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidNewUserDetailsObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }


    @AndroidFindBy(id = "za.co.nedbank.qa:id/esEdtInput")
    public AndroidElement nwsdIdNumberTxt;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/cbUserConsent")
    public AndroidElement nwsdAcceptNedbankIDChck;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esBtnAction")
    public AndroidElement nwsdNextBtn;

    public AndroidElement getNwsdIdNumberTxt() {
        return nwsdIdNumberTxt;
    }

    public AndroidElement getNwsdAcceptNedbankIDChck() {
        return nwsdAcceptNedbankIDChck;
    }

    public AndroidElement getNwsdNextBtn() {
        return nwsdNextBtn;
    }

    public void sendIdNumberTxt(String idNumber) throws TestException {
        getNwsdIdNumberTxt().sendKeys(idNumber);
    }

    public void clickAcceptNedbankIDChck() throws TestException {
        appiumAction.waitAndClickElement(getNwsdAcceptNedbankIDChck());
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getNwsdNextBtn());
    }
}
