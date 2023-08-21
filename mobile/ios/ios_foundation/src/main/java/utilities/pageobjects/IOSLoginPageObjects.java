package utilities.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.ui.appium.AppiumAction;

public class IOSLoginPageObjects {
    //NOTE
//***This sample class to write the page objets***

    IOSDriver driver;
    WebDriverWait wait;
    private AppiumAction appiumAction;

    public IOSLoginPageObjects(IOSDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60L);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.appiumAction = new AppiumAction(driver);
    }

    @iOSFindBy(
            id = "Landing_Login_Button"
    )
    private MobileElement Landing_Login_Button;

    public MobileElement getLanding_Login_Button() {
        return this.Landing_Login_Button;
    }
}
