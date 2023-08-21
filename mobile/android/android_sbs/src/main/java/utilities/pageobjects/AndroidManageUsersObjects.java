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

public class AndroidManageUsersObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidManageUsersObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id = "za.co.nedbank.qa:id/txvFullName")
    private List<AndroidElement> mnusSecondaryUsersLbl;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/textShareProfile")
    private AndroidElement mnusAddUserBtn;

    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement mnusToastMessageTst;

    public List<AndroidElement> getMnusSecondaryUsersLbl() {
        return mnusSecondaryUsersLbl;
    }

    public AndroidElement getMnusAddUserBtn() {
        return mnusAddUserBtn;
    }

    public String getMnusToastMessage() {
        return mnusToastMessageTst.getAttribute("name");
    }

    public void clickSecondaryUserLbl(int index) throws TestException {
        appiumAction.waitAndClickElement(getMnusSecondaryUsersLbl().get(index));
    }

    public void clickAddUserBtn() throws TestException {
        appiumAction.waitAndClickElement(getMnusAddUserBtn());
    }
}
