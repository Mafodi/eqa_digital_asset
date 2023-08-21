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

public class AndroidLinkedProfilesObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidLinkedProfilesObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/chkProductComparable")
    public List<AndroidElement> lkprLinkedProfilesRd;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esBtnAction")
    public AndroidElement lkprNextBtn;

    public List<AndroidElement> getLkprLinkedProfilesRd() {
        return lkprLinkedProfilesRd;
    }

    public AndroidElement getLkprNextBtn() {
        return lkprNextBtn;
    }

    public void clickLinkedProfileRd(int index) throws TestException {
        appiumAction.waitAndClickElement(getLkprLinkedProfilesRd().get(index));
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getLkprNextBtn());
    }

}
