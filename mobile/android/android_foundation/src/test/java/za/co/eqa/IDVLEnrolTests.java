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
        androidIDVLEnrolmentObjects.idvEnrolNidPw("9502126574089", "0987544674", "Password100@", "12345", false, true);

        //idvEnrolNidPw("9502126574089","");

//        AndroidIDVLEnrolmentObjects androidIDVLEnrolmentObjects = new AndroidIDVLEnrolmentObjects(androidDriver);
//        androidIDVLEnrolmentObjects.idvEnrolCardPin("9501240810083","0999999999","113454","98675","09876",false,true);

    }

}