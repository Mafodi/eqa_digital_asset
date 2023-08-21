package utilities.pageobjects;

//import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.base.OBBaseExecution;

public class OBCommonObjects extends OBBaseExecution {

    public OBCommonObjects(WebDriver wdriver) {
        super(wdriver);
    }

    // This is sample class to write page objects
    @FindBy(id = "next")
    private WebElement comnNextBtn;
    @FindBy(id = "back")
    private WebElement comnBackBtn;
    @FindBy(id = "cancel")
    private WebElement comnCancelBtn;


    /**
     * Description: The below getters are used to return the objects that are used to identify the web elements
     *
     * @return comnNextBtn, comnBackBtn, comnCancelBtn,lowLOCText
     */

    public WebElement getComnNextBtn() {
        return comnNextBtn;
    }

    public WebElement getComnBackBtn() {
        return comnBackBtn;
    }

    public WebElement getComnCancelBtn() {
        return comnCancelBtn;
    }

    /**
     * Description: This method is to is used click on next button
     */
    public void clickNextButton() {
        webEnablers.waitForElementToBeVisible(getComnNextBtn());
        ;
        webEnablers.clickAndTryMultiple(getComnNextBtn(), 3);
    }

    /**
     * Description: This method is used click on back button
     */
    public void clickBackButton() {
        webEnablers.waitForElementToBeVisible(getComnBackBtn());
        webEnablers.scrollToElement(getComnBackBtn());
        webEnablers.clickElement(getComnBackBtn());
    }

    /**
     * Description: This method is used click on cancel button
     */
    public void clickCancelButton() {
        webEnablers.waitForElementToBeClickable(getComnCancelBtn());
        webEnablers.scrollToElement(getComnCancelBtn());
        webEnablers.clickElement(getComnCancelBtn());
    }


}
