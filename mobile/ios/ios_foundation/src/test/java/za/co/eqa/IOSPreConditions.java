package za.co.eqa;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import utilities.base.FoundationBase;
import za.co.nedbank.exception.TestException;

public class IOSPreConditions extends FoundationBase {


    @BeforeClass
    public static void startup() throws TestException {
        if (iosDriver == null) {
            executionBlock();
            System.out.println("Driver has been started successfully");
        } else
            throw new TestException("There is an existing driver!");
    }

    @AfterClass
    public static void teardown() throws TestException {
        if (iosDriver != null) {
            quitDriver();
        } else {
            throw new TestException("Driver has not been started " + '\n');
        }
    }

}
