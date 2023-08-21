package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidRelationshipBankerObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidRelationshipBankerObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver, 60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Your dedicated relationship banker\"")
    public AndroidElement rlbkScreenTitleLbl;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/switch_field_positive_button")
    public AndroidElement rlbkAssignMeABankerRd;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/switch_field_negative_button")
    public AndroidElement rlbkIknowABankerRd;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/esEdtInput")
    public AndroidElement rlbkSearchBankerTxt;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/tv_compliance_option_name")
    public AndroidElement rlbkBankerSearchResultsLbl;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/txtSelectCloseBranch")
    public AndroidElement rlbkInfoTipLbl;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/txtBranchAddress")
    public AndroidElement rlbkBranchAddressLbl;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/txtBranchAddressValue")
    public AndroidElement rlbkBranchAddressInfoLbl;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/esBtnAction")
    public AndroidElement rlbkNextBtn;

    public AndroidElement getRlbkScreenTitleLbl() {
        return rlbkScreenTitleLbl;
    }

    public AndroidElement getRlbkAssignMeABankerRd() {
        return rlbkAssignMeABankerRd;
    }

    public AndroidElement getIKnowABankerRd() {
        return rlbkIknowABankerRd;
    }

    public AndroidElement getRlbkSearchBankerTxt() {
        return rlbkSearchBankerTxt;
    }

    public AndroidElement getRlbkBankerSearchResultsLbl() {
        return rlbkBankerSearchResultsLbl;
    }

    public AndroidElement getRlbkInfoTipLbl() {
        return rlbkInfoTipLbl;
    }

    public AndroidElement getRlbkBranchAddressLbl() {
        return rlbkBranchAddressLbl;
    }

    public AndroidElement getRlbkBranchAddressInfoLbl() {
        return rlbkBranchAddressInfoLbl;
    }

    public AndroidElement getRlbkNextBtn() {
        return rlbkNextBtn;
    }

    public void clickAssignMeABankerRd() throws TestException {
        appiumAction.waitAndClickElement(getRlbkAssignMeABankerRd());
    }

    public void clickIKnowABankerRd() throws TestException {
        appiumAction.waitAndClickElement(getIKnowABankerRd());
    }

    public void clickSearchBankerTxt() throws TestException {
        appiumAction.waitAndClickElement(getRlbkSearchBankerTxt());
    }

    public void captureBankerTxt(String banker) throws TestException {
        getRlbkSearchBankerTxt().sendKeys("Menlyn");
    }

    public void clickBankerSearchResultsLbl() throws TestException {
        appiumAction.waitAndClickElement(getRlbkBankerSearchResultsLbl());
    }

    public void GetInfoTipTextLbl()throws TestException {
        appiumAction.getElementText(getRlbkInfoTipLbl(), true);
    }

    public void GetBranchAddressTextLbl()throws TestException {
        appiumAction.getElementText(getRlbkBranchAddressLbl(), true);
    }

    public void GetBranchAddressInfoTextLbl()throws TestException {
        appiumAction.getElementText(getRlbkBranchAddressInfoLbl(), true);
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getRlbkNextBtn());
    }

}
