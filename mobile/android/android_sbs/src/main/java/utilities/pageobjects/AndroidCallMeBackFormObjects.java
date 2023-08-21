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

public class AndroidCallMeBackFormObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidCallMeBackFormObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Call me back\"]")
    private AndroidElement cmbCallMeBackFormHeaderLbl;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    private List<AndroidElement> cmbTextFieldsTxt;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esTxvPickerText")
    private AndroidElement cmbBusinessTypePck;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/txvSole")
    private AndroidElement cmbSoleProprietorLnk;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/txvClosedCorporation")
    private AndroidElement cmbCloseCorporationLnk;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/txvPvtCompany")
    private AndroidElement cmbPrivateCompanyPtyLtdLnk;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/txvOther")
    private AndroidElement cmbOtherLnk;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esBtnAction")
    private AndroidElement cmbNextBtn;

    public AndroidElement getCmbCallMeBackFormHeaderLbl() {
        return cmbCallMeBackFormHeaderLbl;
    }

    public List<AndroidElement> getCmbTextFieldsTxt() {
        return cmbTextFieldsTxt;
    }

    public AndroidElement getCmbBusinessTypePck() {
        return cmbBusinessTypePck;
    }

    public AndroidElement getCmbSoleProprietorLnk() {
        return cmbSoleProprietorLnk;
    }

    public AndroidElement getCmbCloseCorporationLnk() {
        return cmbCloseCorporationLnk;
    }

    public AndroidElement getCmbPrivateCompanyPtyLtdLnk() {
        return cmbPrivateCompanyPtyLtdLnk;
    }

    public AndroidElement getCmbOtherLnk() {
        return cmbOtherLnk;
    }

    public AndroidElement getCmbNextBtn() {
        return cmbNextBtn;
    }

    public void waitForCallMeBackFormToBeVisible() throws TestException {
        appiumAction.waitForElementToBeVisible(getCmbCallMeBackFormHeaderLbl());
    }

    public void captureField(int index, String text) throws TestException {
        appiumAction.waitForElementToBeVisible(getCmbTextFieldsTxt().get(index));
        getCmbTextFieldsTxt().get(index).sendKeys(text);
    }

    public void clickBusinessTypePck() throws TestException {
        appiumAction.waitAndClickElement(getCmbBusinessTypePck());
    }

    public void selectSoleProprietorLnk() throws TestException {
        appiumAction.waitAndClickElement(getCmbSoleProprietorLnk());
    }

    public void selectCloseCorporationLnk() throws TestException {
        appiumAction.waitAndClickElement(getCmbCloseCorporationLnk());
    }

    public void selectPrivateCompanyPtyLtdLnk() throws TestException {
        appiumAction.waitAndClickElement(getCmbPrivateCompanyPtyLtdLnk());
    }

    public void selectCmbOtherLnk() throws TestException {
        appiumAction.waitAndClickElement(getCmbOtherLnk());
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getCmbNextBtn());
    }


}
