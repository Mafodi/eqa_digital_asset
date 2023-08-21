package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidOutsideLoginObjects {

    public AndroidDriver driver;
    public WebDriverWait wait;
    private AppiumAction appiumAction;

    public AndroidOutsideLoginObjects(AndroidDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        appiumAction = new AppiumAction(driver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/app_rooted_continue")
    private AndroidElement otlgLoginNextBtn;

    public AndroidElement getOtlgLoginNextBtn() {
        return this.otlgLoginNextBtn;
    }

    public void clickNextButton() throws TestException {
        this.appiumAction.waitForElementToBeVisible(this.getOtlgLoginNextBtn());
    }
}
