package za.co.eqa;


import org.junit.Test;
import utilities.base.OBBaseExecution;
import utilities.pageobjects.OBLoginObjects;

public class OBPreConditions extends OBBaseExecution {
    @Test
    public void loginTest1() {
        OBLoginObjects lo = new OBLoginObjects(wdriver);
        lo.covidBannerClose();
        lo.captureUsernameAndPassword("abcd", "xyz");
        lo.clickLoginBtn();
    }
}
