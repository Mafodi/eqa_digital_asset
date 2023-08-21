package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidOpenAccountAsSoleProprietorObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidOpenAccountAsSoleProprietorObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id= "za.co.nedbank.qa:id/sole_prop_subtitle")
    private AndroidElement opacSubHeaderLbl;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/switch_field_positive_button")
    private AndroidElement opacTradingNameYesRd;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/switch_field_negative_button")
    private AndroidElement opacTradingNameNoRd;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/esEdtInput")
    private AndroidElement opacTradingNameTxt;

    @AndroidFindBy(xpath= "//android.widget.Button[@text=\"Check availability\"]")
    private AndroidElement opacCheckAvailabilityBtn;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/tv_trading_name_info")
    private AndroidElement opacTradingNameInfoLbl;

    @AndroidFindBy(xpath= "//android.widget.Button[@text=\"Next\"]")
    private AndroidElement opacNextBtn;

    @AndroidFindBy(xpath= "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private AndroidElement opacBackArrow;

    public AndroidElement getOpacSubHeaderLbl() {
        return opacSubHeaderLbl;
    }

    public AndroidElement getOpacTradingNameYesRd() {
        return opacTradingNameYesRd;
    }

    public AndroidElement getOpacTradingNameNoRd() {
        return opacTradingNameNoRd;
    }

    public AndroidElement getOpacTradingNameTxt() {
        return opacTradingNameTxt;
    }

    public AndroidElement getOpacCheckAvailabilityBtn() {
        return opacCheckAvailabilityBtn;
    }

    public AndroidElement getOpacTradingNameInfoLbl() {
        return opacTradingNameInfoLbl;
    }

    public AndroidElement getOpacNextBtn() {
        return opacNextBtn;
    }

    public AndroidElement getOpacBackArrow() {
        return opacBackArrow;
    }

    public void clickTradingNameYesRd() throws TestException {
        appiumAction.waitAndClickElement(getOpacTradingNameYesRd());
    }

    public void clickTradingNameNoRd() throws TestException {
        appiumAction.waitAndClickElement(getOpacTradingNameNoRd());
    }

    public void captureTradingNameTxt(String tradingName) throws TestException {
        getOpacTradingNameTxt().sendKeys(tradingName);
    }

    public void clickCheckAvailabilityBtn() throws TestException {
        appiumAction.waitAndClickElement(getOpacCheckAvailabilityBtn());
    }

    public void clickBackArrow() throws TestException {
        appiumAction.waitAndClickElement(getOpacBackArrow());
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getOpacNextBtn());
    }


}
