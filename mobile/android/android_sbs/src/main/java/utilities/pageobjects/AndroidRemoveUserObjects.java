package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidRemoveUserObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidRemoveUserObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }


    @AndroidFindBy(id = "za.co.nedbank.qa:id/esBtnAction")
    private AndroidElement rmusRemoveUserBtn;

    public AndroidElement getRmusRemoveUserBtn() {
        return rmusRemoveUserBtn;
    }

    public void clickRemoveUserBtn() throws TestException {
        appiumAction.waitAndClickElement(getRmusRemoveUserBtn());
    }


}
