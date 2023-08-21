package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

import java.util.List;

public class AndroidYourApplicationsObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidYourApplicationsObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"I'm opening this account for another business.\"]")
    private AndroidElement yappStartANewBusinessLbl;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/txtProductName")
    private List<AndroidElement> yappSingleDirectorApplicationsLbl;

    public AndroidElement getYappStartANewBusinessLbl() {
        return yappStartANewBusinessLbl;
    }

    public List<AndroidElement> getYappSingleDirectorApplicationsLbl() {
        return yappSingleDirectorApplicationsLbl;
    }

    public void clickStartANewBusinessLbl() throws TestException {
        appiumAction.waitAndClickElement(getYappStartANewBusinessLbl());
    }

    public void clickSingleDirectorApplicationsLbl(int index) throws TestException {
        appiumAction.waitAndClickElement(getYappSingleDirectorApplicationsLbl().get(index));
    }


}
