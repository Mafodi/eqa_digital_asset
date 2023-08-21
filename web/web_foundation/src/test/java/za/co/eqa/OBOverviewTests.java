package za.co.eqa;

import org.junit.Test;
import utilities.pageobjects.OBOverviewObjects;


public class OBOverviewTests extends OBPreConditions {

    @Test
    public void overViewTests() {
        OBOverviewObjects overviewObjects = new OBOverviewObjects(wdriver);
        loginTest1();
    }
}