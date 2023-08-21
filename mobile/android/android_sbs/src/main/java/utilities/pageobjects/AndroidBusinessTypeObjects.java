package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidBusinessTypeObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidBusinessTypeObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver, 60);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/txvFullName")
    private AndroidElement bstpApplyForNewBusinessLink;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/businessNameProfile")
    private AndroidElement bstpApplyForExistingBusinessLink;

    public AndroidElement getBstpApplyForNewBusinessLink() {
        return bstpApplyForNewBusinessLink;
    }

    public AndroidElement getBstpApplyForExistingBusinessLink() {
        return bstpApplyForExistingBusinessLink;
    }

    public void clickApplyForNewBusinessLink() throws TestException {
        appiumAction.waitAndClickElement(getBstpApplyForNewBusinessLink());
    }

    public void clickApplyForExistingBusinessLink() throws TestException {
        appiumAction.waitAndClickElement(getBstpApplyForExistingBusinessLink());
    }
}
