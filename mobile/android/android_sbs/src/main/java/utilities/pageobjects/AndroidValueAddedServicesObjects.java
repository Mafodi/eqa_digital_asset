package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidValueAddedServicesObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidValueAddedServicesObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver, 60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(xpath="(//android.widget.CheckBox[id=\"b_value_added_services\"])[0]")
    public AndroidElement vlasBusinessChequeCardsChk;

    @AndroidFindBy(xpath="(//android.widget.CheckBox[id=\"b_value_added_services\"])[1]")
    public AndroidElement vlasBusinessCreditCardsChk;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/chkApplyvalue")
    public AndroidElement vlasApplyValueChk;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esBtnAction")
    public AndroidElement vlasNextBtn;

    public AndroidElement getVlasBusinessChequeCardsChk() {
        return vlasBusinessChequeCardsChk;
    }

    public AndroidElement getBusinessrCreditCardsChk() {
        return vlasBusinessCreditCardsChk;
    }

    public AndroidElement getVlasApplyValueChk() {
        return vlasApplyValueChk;
    }

    public AndroidElement getVlasNextBtn() {
        return vlasNextBtn;
    }

    public void clickBusinessChequeCardsChk() throws TestException {
        appiumAction.waitAndClickElement(getVlasBusinessChequeCardsChk());
    }

    public void clickBusinessCreditCardsChk() throws TestException {
        appiumAction.waitAndClickElement(getBusinessrCreditCardsChk());
    }

    public void clickApplyValueChk() throws TestException {
        appiumAction.waitAndClickElement(getVlasApplyValueChk());
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getVlasNextBtn());
    }

}
