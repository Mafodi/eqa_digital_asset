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

public class AndroidTaxObligationObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidTaxObligationObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver, 60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id= "za.co.nedbank.qa:id/switch_field_positive_button")
    private List<AndroidElement> tobYesRd;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/switch_field_negative_button")
    private List<AndroidElement> tobNoRd;

    @AndroidFindBy(id = "za.co.nedbank.qa:id/esBtnAction")
    private AndroidElement txobNextBtn;

    public List<AndroidElement> getTobYesRd() {
        return tobYesRd;
    }

    public List<AndroidElement> getTobNoRd() {
        return tobNoRd;
    }

    public AndroidElement getTxobNextBtn() {
        return txobNextBtn;
    }

    public void clickYesRd(int index) throws TestException {
        appiumAction.waitAndClickElement(getTobYesRd().get(index));
    }

    public void clickNoRd(int index) throws TestException {
        appiumAction.waitAndClickElement(getTobNoRd().get(index));
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getTxobNextBtn());
    }

}
