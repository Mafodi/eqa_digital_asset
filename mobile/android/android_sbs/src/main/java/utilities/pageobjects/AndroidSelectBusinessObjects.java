package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidSelectBusinessObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidSelectBusinessObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver, 60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/rel_applyfornewbusiness")
    private AndroidElement slbsApplyForNewBusinessLnk;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/businessNameProfile")
    private AndroidElement slbsApplyForExistingBusinessLnk;

    public AndroidElement getSlbsApplyForNewBusinessLnk() {
        return slbsApplyForNewBusinessLnk;
    }

    public AndroidElement getSlbsApplyForExistingBusinessLnk() {
        return slbsApplyForExistingBusinessLnk;
    }

    public void clickApplyForNewBusinessLnk() throws TestException {
        appiumAction.waitAndClickElement(getSlbsApplyForNewBusinessLnk());
    }

    public void clickApplyForExistingBusinessLnk() throws TestException {
        appiumAction.waitAndClickElement(getSlbsApplyForExistingBusinessLnk());
    }


}
