package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.ui.appium.AppiumAction;

import java.util.List;

public class AndroidProfileViewObjects {

    public AndroidDriver driver;
    public WebDriverWait wait;
    private AppiumAction appiumAction;

    public AndroidProfileViewObjects(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        appiumAction = new AppiumAction(driver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/rltRootProfile")
    private List<AndroidElement> prvwAccounts;

    private List<AndroidElement> getPrvwAccounts() {
        return prvwAccounts;
    }

    public void clickAccount(int index) {
        getPrvwAccounts().get(index).click();
    }

}
