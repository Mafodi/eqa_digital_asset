package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidDedicatedRelationshipBankerObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidDedicatedRelationshipBankerObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/switch_field_positive_button")
    private AndroidElement ddrlAssignMeABankerRd;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/switch_field_negative_button")
    private AndroidElement ddrlIknowABankerRd;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esEdtInput")
    private AndroidElement ddrlSearchBankerTxt;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/txtSelectCloseBranch")
    private AndroidElement ddrlBranchInfoTipLbl;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/tv_compliance_option_name")
    private AndroidElement ddrlBankerResultItemLbl;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esBtnAction")
    private AndroidElement ddrlNextBtn;

    public AndroidElement getDdrlAssignMeABankerRd() {
        return ddrlAssignMeABankerRd;
    }

    public AndroidElement getDdrlIknowABankerRd() {
        return ddrlIknowABankerRd;
    }

    public AndroidElement getDdrlSearchBankerTxt() {
        return ddrlSearchBankerTxt;
    }

    public AndroidElement getDdrlBranchInfoTipLbl() {
        return ddrlBranchInfoTipLbl;
    }

    public AndroidElement getDdrlBankerResultItemLbl() {
        return ddrlBankerResultItemLbl;
    }

    public AndroidElement getDdrlNextBtn() {
        return ddrlNextBtn;
    }

    public void clickAssignMeABankerRd() throws TestException {
        appiumAction.waitAndClickElement(getDdrlAssignMeABankerRd());
    }

    public void clickIKnowABankerRd() throws TestException {
        appiumAction.waitAndClickElement(getDdrlIknowABankerRd());
    }

    public void clickSearchBankerTxt() throws TestException {
        appiumAction.waitAndClickElement(getDdrlSearchBankerTxt());
    }

    public void captureSearchBankerTxt(String banker) throws TestException {
        getDdrlSearchBankerTxt().sendKeys(banker);
    }

    public void clickBankerResultItemLbl() throws TestException {
        appiumAction.waitAndClickElement(getDdrlBankerResultItemLbl());
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getDdrlNextBtn());
    }
}
