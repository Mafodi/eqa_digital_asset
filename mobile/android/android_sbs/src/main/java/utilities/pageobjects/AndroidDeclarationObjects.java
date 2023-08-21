package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

public class AndroidDeclarationObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidDeclarationObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/cb_multi_terms")
    private AndroidElement dclrTermsAndConditionsChk;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/esBtnAction")
    private AndroidElement dclrNextBtn;

    public AndroidElement getDclrTermsAndConditionsChk() {
        return dclrTermsAndConditionsChk;
    }

    public AndroidElement getDclrNextBtn() {
        return dclrNextBtn;
    }

    public void clickTermsAndConditionsChk() throws TestException {
        appiumAction.waitAndClickElement(getDclrTermsAndConditionsChk());
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getDclrNextBtn());
    }
}
