package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidProfileSettingsObjects {

    public AndroidDriver androidDriver;
    public WebDriverWait wait;
    private AppiumAction appiumAction;

    /**
     * Default Constructor within class <AndroidCommonObjects>
     */
    public AndroidProfileSettingsObjects(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
        wait = new WebDriverWait(androidDriver, 60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/txvProfileDetails")
    private AndroidElement prstProfileDetailsBtn;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/txvProfileLimits")
    private AndroidElement prstProfileLimitsBtn;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/txvDelinkProfile")
    private AndroidElement prstDelinkProfileLnk;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/txvManageUsers")
    private AndroidElement prstManageUsersBtn;

    public AndroidElement getPrstProfileDetailsBtn() {
        return prstProfileDetailsBtn;
    }

    public AndroidElement getPrstProfileLimitsBtn() {
        return prstProfileLimitsBtn;
    }

    public AndroidElement getPrstDelinkProfileLnk() {
        return prstDelinkProfileLnk;
    }

    public AndroidElement getPrstManageUsersBtn() {
        return prstManageUsersBtn;
    }

    public void clickProfileDetailsBtn() throws TestException {
        appiumAction.waitAndClickElement(getPrstProfileDetailsBtn());
    }

    public void clickProfileLimitsBtn() throws TestException {
        appiumAction.waitAndClickElement(getPrstProfileLimitsBtn());
    }

    public void clickDelinkProfileLnk() throws TestException {
        appiumAction.waitAndClickElement(getPrstDelinkProfileLnk());
    }

    public void clickManageUsersBtn() throws TestException {
        appiumAction.waitAndClickElement(getPrstManageUsersBtn());
    }

}
