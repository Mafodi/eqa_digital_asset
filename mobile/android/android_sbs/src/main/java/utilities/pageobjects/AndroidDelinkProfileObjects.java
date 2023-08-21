package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidDelinkProfileObjects {

    public AndroidDriver androidDriver;
    public WebDriverWait wait;
    private AppiumAction appiumAction;

    /**
     * Default Constructor within class <AndroidCommonObjects>
     */
    public AndroidDelinkProfileObjects(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
        wait = new WebDriverWait(androidDriver, 60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esBtnAction")
    private AndroidElement dlprDelinkProfileBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Next\"]")
    private AndroidElement dlprNextBtn;

    public AndroidElement getDlprDelinkProfileBtn() {
        return dlprDelinkProfileBtn;
    }

    public AndroidElement getDlprNextBtn() {
        return dlprNextBtn;
    }

    public void clickDelinkProfileBtn() throws TestException {
        appiumAction.waitAndClickElement(getDlprDelinkProfileBtn());
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getDlprNextBtn());
    }

}
