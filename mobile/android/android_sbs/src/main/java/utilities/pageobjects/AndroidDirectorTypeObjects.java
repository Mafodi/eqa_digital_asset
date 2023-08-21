package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidDirectorTypeObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidDirectorTypeObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver, 60);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/tvSingleSelect")
    private AndroidElement drtpSingleDirectorLnk;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/tvMultipleSelect")
    private AndroidElement drtpMultiDirectorLnk;

    public AndroidElement getDrtpSingleDirectorLnk() {
        return drtpSingleDirectorLnk;
    }

    public AndroidElement getDrtpMultiDirectorLnk() {
        return drtpMultiDirectorLnk;
    }

    public void clickSingleDirectorLink() throws TestException {
        appiumAction.waitAndClickElement(getDrtpSingleDirectorLnk());
    }

    public void clickSMultiDirectorLink() throws TestException {
        appiumAction.waitAndClickElement(getDrtpMultiDirectorLnk());
    }

}
