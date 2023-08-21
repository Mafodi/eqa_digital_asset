package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidBankAccountsObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidBankAccountsObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id= "za.co.nedbank.qa:id/imgArrowForme")
    private AndroidElement bnacForMyselfArrow;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/imgArrowForBusiness")
    private AndroidElement bnacForMyBusinessArrow;

    public AndroidElement getForMyselfBusinessArrow() {
        return bnacForMyselfArrow;
    }

    public AndroidElement getBnacForMyBusinessArrow() {
        return bnacForMyBusinessArrow;
    }

    public void clickForMyselfArrow() throws TestException {
        appiumAction.waitAndClickElement(getForMyselfBusinessArrow());
    }

    public void clickForMyBusinessArrow() throws TestException {
        appiumAction.waitAndClickElement(getBnacForMyBusinessArrow());
    }

}
