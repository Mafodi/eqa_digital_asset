package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidProductOfferingObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidProductOfferingObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver, 60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/cta_bank")
    private AndroidElement profOpenBankAccountBtn;

    public AndroidElement getOpenBankAccountBTN() {
        return profOpenBankAccountBtn;
    }

    public void clickOpenBankAccount() throws TestException {
        appiumAction.waitAndClickElement(getOpenBankAccountBTN());
    }

}
