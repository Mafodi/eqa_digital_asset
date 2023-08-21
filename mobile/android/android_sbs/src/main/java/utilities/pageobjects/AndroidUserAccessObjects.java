package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidUserAccessObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidUserAccessObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/full_access_radio_btn")
    private AndroidElement usaFullTransactionalAccessRd;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/limit_access_radio_btn")
    private AndroidElement usaLimitedTransactionalAccessRd;

    @AndroidFindBy(xpath = "//android.widget.TextView[text()=\"Full transactional access\"]")
    private AndroidElement usacFullTransactionalAccessLbl;

    @AndroidFindBy(xpath = "//android.widget.TextView[text()=\"Limited transactional access\"]")
    private AndroidElement usacLimitedTransactionalAccessLbl;

    @AndroidFindBy(xpath = "//android.widget.TextView[text()=\"Update access\"]")
    private AndroidElement usacUpdateAccessBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[text()=\"Remove user\"]")
    private AndroidElement usacRemoveUserBtn;

    public AndroidElement getUsaFullTransactionalAccessRd() {
        return usaFullTransactionalAccessRd;
    }

    public AndroidElement getUsaLimitedTransactionalAccessRd() {
        return usaLimitedTransactionalAccessRd;
    }

    public AndroidElement getUsacFullTransactionalAccessLbl() {
        return usacFullTransactionalAccessLbl;
    }

    public AndroidElement getUsacLimitedTransactionalAccessLbl() {
        return usacLimitedTransactionalAccessLbl;
    }

    public AndroidElement getUsacUpdateAccessBtn() {
        return usacUpdateAccessBtn;
    }

    public AndroidElement getUsacRemoveUserBtn() {
        return usacRemoveUserBtn;
    }

    public void clickFullTransactionalAccessRd() throws TestException {
        appiumAction.waitAndClickElement(getUsaFullTransactionalAccessRd());
    }

    public void clickLimitedTransactionalAccessRd() throws TestException {
        appiumAction.waitAndClickElement(getUsaLimitedTransactionalAccessRd());
    }

    public void clickFullTransactionalAccessLbl() throws TestException {
        appiumAction.waitAndClickElement(getUsacFullTransactionalAccessLbl());
    }

    public void clickLimitedTransactionalAccessLbl() throws TestException {
        appiumAction.waitAndClickElement(getUsacLimitedTransactionalAccessLbl());
    }

    public void clickUpdateAccessBtn() throws TestException {
        appiumAction.waitAndClickElement(getUsacUpdateAccessBtn());
    }

    public void clickRemoveUserBtn() throws TestException {
        appiumAction.waitAndClickElement(getUsacRemoveUserBtn());
    }


}
