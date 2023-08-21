package za.co.eqa;

import org.junit.Test;
import utilities.pageobjects.AndroidCommonObjects;
import utilities.pageobjects.AndroidIDVLEnrolmentObjects;
import utilities.pageobjects.AndroidNavBarObjects;
import utilities.pageobjects.AndroidOverviewObjects;
import za.co.nedbank.exception.TestException;

public class IDVLEnrolTests extends PreConditions {
    AndroidIDVLEnrolmentObjects androidIDVLEnrolmentObjects = new AndroidIDVLEnrolmentObjects(androidDriver);
    AndroidNavBarObjects androidNavBarObjects = new AndroidNavBarObjects(androidDriver);

    AndroidCommonObjects androidCommonObjects = new AndroidCommonObjects(androidDriver);
    AndroidOverviewObjects androidOverviewObjects = new AndroidOverviewObjects(androidDriver);

    @Test
    public void enrolWithNedIDPw() throws TestException, InterruptedException {
        androidIDVLEnrolmentObjects.idvEnrolNidPw("9501240810083", "Password100@", "13579", true);

    }

}