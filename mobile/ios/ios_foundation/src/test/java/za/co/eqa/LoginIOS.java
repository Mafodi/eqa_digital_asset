package za.co.eqa;

import io.appium.java_client.ios.IOSDriver;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.pageobjects.IOSIDVLPageObjects;
import za.co.nedbank.exception.TestException;

public class LoginIOS extends IOSPreConditions {
    @Test
    public void enrolWithNedIDPw() throws TestException, InterruptedException {
        IOSIDVLPageObjects iosidvlPageObjects = new IOSIDVLPageObjects((IOSDriver) iosDriver);
        iosidvlPageObjects.enrolmentWithNedPw("xxxxxxxxx", "xxxxxxxxx", "13579");
    }

}