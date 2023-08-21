package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidYourBusinessDetailsObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidYourBusinessDetailsObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/tv_registered_business_title")
    public AndroidElement yrbdHeaderLbl;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/tv_registered_business_subtitle")
    public AndroidElement yrbdSubHeaderLbl;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/tv_registered_business_search")
    public AndroidElement yrbdSearchBusinessManuallyLnk;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/tv_registered_business_sole")
    public AndroidElement yrbdOpenAccountSoleProprietorLnk;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esBtnAction")
    public AndroidElement yrbdNextBtn;

    public AndroidElement getYrbdHeaderLbl() {
        return yrbdHeaderLbl;
    }

    public AndroidElement getYrbdSubHeaderLbl() {
        return yrbdSubHeaderLbl;
    }

    public AndroidElement getYrbdSearchBusinessManuallyLnk() {
        return yrbdSearchBusinessManuallyLnk;
    }

    public AndroidElement getYrbdOpenAccountSoleProprietorLnk() {
        return yrbdOpenAccountSoleProprietorLnk;
    }

    public AndroidElement getYrbdNextBtn() {
        return yrbdNextBtn;
    }

    public void waitForYourBusinessDetailsScreen() throws TestException {
        appiumAction.waitForElementToBeVisible(getYrbdHeaderLbl());
    }

    public void clickSearchBusinessManuallyLnk() throws TestException {
        appiumAction.waitAndClickElement(getYrbdSearchBusinessManuallyLnk());
    }

    public void clickOpenAccountSoleProprietorLnk() throws TestException {
        appiumAction.waitAndClickElement(getYrbdOpenAccountSoleProprietorLnk());
    }




}
