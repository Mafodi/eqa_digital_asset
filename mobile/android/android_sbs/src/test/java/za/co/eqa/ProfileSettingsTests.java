/*package za.co.eqa;

import jline.internal.Log;
import org.junit.Assert;
import org.junit.Test;
import utilities.enablers.AndroidEnablers;
import utilities.pageobjects.*;
import za.co.nedbank.exception.TestException;

import static utilities.base.FoundationBase.androidDriver;

public class ProfileSettingsTests extends Preconditions {

    AndroidEnablers androidEnablers = new AndroidEnablers();
    AndroidApproveItObjects androidApproveItObjects = new AndroidApproveItObjects(androidDriver);
    AndroidOverviewObjects androidOverviewObjects = new AndroidOverviewObjects(androidDriver);
    AndroidCommonObjects androidCommonObjects = new AndroidCommonObjects(androidDriver);

    AndroidMoreObjects androidMoreObjects = new AndroidMoreObjects(androidDriver);
    AndroidSettingsObjects androidSettingsObjects = new AndroidSettingsObjects(androidDriver);
    AndroidLinkProfileObjects androidLinkProfileObjects = new AndroidLinkProfileObjects(androidDriver);
    AndroidProfileSettingsObjects androidProfileSettingsObjects = new AndroidProfileSettingsObjects(androidDriver);
    AndroidLinkedProfilesObjects androidLinkedProfilesObjects = new AndroidLinkedProfilesObjects(androidDriver);
    AndroidSelectProfileObjects androidSelectProfileObjects = new AndroidSelectProfileObjects(androidDriver);
    AndroidDelinkProfileObjects androidDelinkProfileObjects = new AndroidDelinkProfileObjects(androidDriver);
    AndroidOverviewObjects overviewObjects = new AndroidOverviewObjects(androidDriver);
    AndroidManageUsersObjects androidManageUsersObjects = new AndroidManageUsersObjects(androidDriver);
    AndroidAddUserObjects androidAddUserObjects = new AndroidAddUserObjects(androidDriver);
    AndroidNewUserDetailsObjects androidNewUserDetailsObjects = new AndroidNewUserDetailsObjects(androidDriver);
    AndroidUserAccessObjects androidUserAccessObjects = new AndroidUserAccessObjects(androidDriver);
    AndroidRemoveUserObjects androidRemoveUserObjects = new AndroidRemoveUserObjects(androidDriver);


    @Test
    public void contextSwitch() throws TestException, InterruptedException {

        AndroidIDVLEnrolmentObjects androidIDVLEnrolmentObjects = new AndroidIDVLEnrolmentObjects(androidDriver);
        Thread.sleep(20000);
        androidIDVLEnrolmentObjects.idvEnrolNidPw("9501240810083","0999999999","Password100@", "24680", false, true);
        //idvEnrolCardPin("9501240810083","0999999999","113454","98675","09876",false,true);

//        androidOverviewObjects.clickMore(); // element to be added to founddation's overview objects

        androidMoreObjects.clickNotification();
        androidMoreObjects.switchAccount(1);

        boolean isDashboardDisplayed = androidOverviewObjects.getOvrwChatIcon().isDisplayed();
        Assert.assertTrue(isDashboardDisplayed);

    }

    @Test
    public void linkProfile() throws TestException, InterruptedException {

        AndroidIDVLEnrolmentObjects androidIDVLEnrolmentObjects = new AndroidIDVLEnrolmentObjects(androidDriver);
        androidIDVLEnrolmentObjects.idvEnrolCardPin("9501240810083","0999999999","113454","98675","09876",false,true);

//        androidOverviewObjects.clickMore();

//        androidEnablers.swipeElementAndroid(androidMoreObjects.getLinkProfile(), Direction.LEFT , androidDriver);
        androidMoreObjects.clickLinkProfile();

        androidLinkProfileObjects.clickTermsAndConditionsChk();
        androidLinkProfileObjects.clickNextBtn();

        if(!androidLinkProfileObjects.getLkprProfileDetailsTab().isSelected()) {
            androidLinkProfileObjects.clickProfileDetailsTab();
        }
        androidLinkProfileObjects.captureProfileNumber("3097956931");
        androidLinkProfileObjects.captureProfilePin("2022");
        androidLinkProfileObjects.captureProfilePassword("Context2");
        androidLinkProfileObjects.clickNextBtn();

        // write code to wait for approveit

        if(androidLinkProfileObjects.getLkprRetryError().getAttribute("text").equalsIgnoreCase("Retry")) {
            return;
        }

        if(!androidSelectProfileObjects.getSlprSelectProfileToViewLbl().isEmpty()) {
            int profilesCountSize = androidSelectProfileObjects.getSlprSelectProfileToViewLbl().size();
            for(int i = 0;i <= profilesCountSize; i++ ) {
                String profileNumberTextAttr = androidSelectProfileObjects.getSlprSelectProfileToViewLbl().get(i).getAttribute("text");
                if(profileNumberTextAttr.contains("3097956931")) {
                    androidSelectProfileObjects.getSlprSelectProfileToViewLbl().get(i).click();
                }
            }
        }
        boolean isDashboardDisplayed = androidOverviewObjects.getOvrwChatIcon().isDisplayed();
        Assert.assertTrue(isDashboardDisplayed);

    }

    @Test
    public void delinkProfile() throws TestException, InterruptedException {

        AndroidIDVLEnrolmentObjects androidIDVLEnrolmentObjects = new AndroidIDVLEnrolmentObjects(androidDriver);
        androidIDVLEnrolmentObjects.idvEnrolCardPin("7004235916082","0999999999","113454","98675","09876",false,true);

//        androidOverviewObjects.clickMore();

        int profilesCarouselCountSize = androidMoreObjects.getMorProfilesCarousel().size();
        for(int i = 0; i < profilesCarouselCountSize; i++) {
            String profileNumberTextAttr = androidMoreObjects.getMorProfilesNumbersCarousel().get(i).getAttribute("text");
            if(!profileNumberTextAttr.contains("3097960509")) {
                androidMoreObjects.getMorProfilesCarousel().get(i).click();
//                androidOverviewObjects.clickMore();
            }
            break;
        }

        // androidOverviewObjects.clickMore();
        androidMoreObjects.clickSettings();
        androidSettingsObjects.clickProfileSettingsBtn();
        androidProfileSettingsObjects.clickDelinkProfileLnk();

        if(!androidLinkedProfilesObjects.getLkprLinkedProfilesRd().isEmpty() ) {
            androidLinkedProfilesObjects.clickLinkedProfileRd(0);
            androidDelinkProfileObjects.clickNextBtn();
        } else {
            androidDelinkProfileObjects.clickDelinkProfileBtn();
        }

        if(!androidSelectProfileObjects.getSlprSelectProfileToViewLbl().isEmpty()) {
            androidSelectProfileObjects.clickSelectProfileRd(0);
        }

        boolean isDashboardNotDisplayed = overviewObjects.getAccountBalanceOne().isEmpty();
        Assert.assertTrue("Fail - Profile de-linking failed.", !isDashboardNotDisplayed);
    }

    @Test
    public void addSecondaryUserLimitedAccess() throws TestException, InterruptedException {

        AndroidIDVLEnrolmentObjects androidIDVLEnrolmentObjects = new AndroidIDVLEnrolmentObjects(androidDriver);
        androidIDVLEnrolmentObjects.idvEnrolCardPin("9501240810083","0999999999","113454","98675","09876",false,true);

//        androidOverviewObjects.clickMore();


        int profilesCarouselCountSize = androidMoreObjects.getMorProfilesCarousel().size();
        for(int i = 0; i < profilesCarouselCountSize; i++) {
            String profileNumberTextAttr = androidMoreObjects.getMorProfilesNumbersCarousel().get(i).getAttribute("text");
            if (!profileNumberTextAttr.contains("3097984831")) {
                androidMoreObjects.getMorProfilesNumbersCarousel().get(i).click();
//                androidOverviewObjects.clickMore();
            }
            break;
        }

        try {
            androidMoreObjects.clickSettings();
            androidSettingsObjects.clickProfileSettingsBtn();
            androidProfileSettingsObjects.clickManageUsersBtn();
            androidManageUsersObjects.clickAddUserBtn();
            androidAddUserObjects.clickTermsAndConditionsChk();
            androidAddUserObjects.clickNextBtn();
            androidNewUserDetailsObjects.sendIdNumberTxt("9808025505089");
            androidNewUserDetailsObjects.clickAcceptNedbankIDChck();
            androidNewUserDetailsObjects.clickNextBtn();
            androidApproveItObjects.clickAcceptApproveItBtn();
            androidApproveItObjects.clickDoneBtn();
            androidManageUsersObjects.clickSecondaryUserLbl(0);
            Assert.assertTrue(androidUserAccessObjects.getUsaLimitedTransactionalAccessRd().isSelected());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void removeSecondaryUser() throws TestException, InterruptedException {

        AndroidIDVLEnrolmentObjects androidIDVLEnrolmentObjects = new AndroidIDVLEnrolmentObjects(androidDriver);
        androidIDVLEnrolmentObjects.idvEnrolCardPin("9501240810083","0999999999","113454","98675","09876",false,true);

//        androidOverviewObjects.clickMore();

        int profilesCarouselCountSize = androidMoreObjects.getMorProfilesCarousel().size();
        for(int i = 0; i < profilesCarouselCountSize; i++) {
            String profileNumberTextAttr = androidMoreObjects.getMorProfilesCarousel().get(i).getAttribute("text");
            if(!profileNumberTextAttr.contains("3097984831")) {
                androidMoreObjects.getMorProfilesCarousel().get(i).click();
//                androidOverviewObjects.clickMore();
            }
            break;
        }

        try {
            androidMoreObjects.clickSettings();
            androidSettingsObjects.clickProfileSettingsBtn();
            androidProfileSettingsObjects.clickManageUsersBtn();

            if(androidManageUsersObjects.getMnusSecondaryUsersLbl().size() > 0) {
                androidManageUsersObjects.clickSecondaryUserLbl(0);
            } else {
                throw new Exception("No secondary user was found to be removed. Secondary user must be added to primary user profile for this test to be executed.");
            }
            androidUserAccessObjects.clickRemoveUserBtn();
            androidRemoveUserObjects.clickRemoveUserBtn();
        } catch(Exception e) {
            e.printStackTrace();
        }
        //boolean isSecondaryUserDisplayed = androidManageUsersObjects.getAddUserBtn().isDisplayed();
        int secondaryUserSize = androidManageUsersObjects.getMnusSecondaryUsersLbl().size();
        boolean isSecondaryUserDisplayed = secondaryUserSize > 0;
        Assert.assertFalse(isSecondaryUserDisplayed);
        Log.info("Secondary user was not removed.");
    }


    @Test
    public void addSecondaryUserFullAccess() throws TestException, InterruptedException {

        AndroidIDVLEnrolmentObjects androidIDVLEnrolmentObjects = new AndroidIDVLEnrolmentObjects(androidDriver);
        androidIDVLEnrolmentObjects.idvEnrolCardPin("9501240810083","0999999999","113454","98675","09876",false,true);

//        androidOverviewObjects.clickMore();

        int profilesCarouselCountSize = androidMoreObjects.getMorProfilesCarousel().size();
        for(int i = 0; i < profilesCarouselCountSize; i++) {
            String profileNumberTextAttr = androidMoreObjects.getMorProfilesNumbersCarousel().get(i).getAttribute("text");
            if (!profileNumberTextAttr.contains("3097984831")) {
                androidMoreObjects.getMorProfilesCarousel().get(i).click();
//                androidOverviewObjects.clickMore();
            }
            break;
        }

        try {
            androidMoreObjects.clickSettings();
            androidSettingsObjects.clickProfileSettingsBtn();
            androidProfileSettingsObjects.clickManageUsersBtn();
            androidManageUsersObjects.clickAddUserBtn();
            androidAddUserObjects.clickTermsAndConditionsChk();
            androidAddUserObjects.clickNextBtn();
            androidNewUserDetailsObjects.sendIdNumberTxt("9808025505089");
            androidNewUserDetailsObjects.clickAcceptNedbankIDChck();
            androidNewUserDetailsObjects.clickNextBtn();
            androidApproveItObjects.clickAcceptApproveItBtn();
            androidApproveItObjects.clickDoneBtn();
            androidManageUsersObjects.clickSecondaryUserLbl(0);
            Assert.assertTrue(androidUserAccessObjects.getUsaFullTransactionalAccessRd().isSelected());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void updateSecondaryUserAccessFromLimitedToFull() throws TestException, InterruptedException {

        AndroidIDVLEnrolmentObjects androidIDVLEnrolmentObjects = new AndroidIDVLEnrolmentObjects(androidDriver);
        androidIDVLEnrolmentObjects.idvEnrolCardPin("6704220153085","0999999999","113454","98675","09876",false,true);

//        androidOverviewObjects.clickMore();
        int profilesCarouselCountSize = androidMoreObjects.getMorProfilesCarousel().size();
        for(int i = 0; i < profilesCarouselCountSize; i++) {
            String profileNumberTextAttr = androidMoreObjects.getMorProfilesNumbersCarousel().get(i).getAttribute("text");
            if (!profileNumberTextAttr.contains("3097956931")) {
                androidMoreObjects.getMorProfilesCarousel().get(i).click();
//                androidOverviewObjects.clickMore();
            }
            break;
        }

        try {
            androidMoreObjects.clickSettings();
            androidSettingsObjects.clickProfileSettingsBtn();
            androidProfileSettingsObjects.clickManageUsersBtn();

            if(androidManageUsersObjects.getMnusSecondaryUsersLbl().size() > 0) {
                androidManageUsersObjects.clickSecondaryUserLbl(0);
                if(androidUserAccessObjects.getUsaLimitedTransactionalAccessRd().isSelected()) {
                    androidUserAccessObjects.clickFullTransactionalAccessRd();
                } else {
                    //update access level to limited
                    androidUserAccessObjects.clickLimitedTransactionalAccessRd();
                    androidUserAccessObjects.clickUpdateAccessBtn();
                    androidManageUsersObjects.clickSecondaryUserLbl(0);
                    androidUserAccessObjects.clickFullTransactionalAccessRd();
                }
            } else {
                Assert.fail("No secondary user found be to updated.");
            }

            androidUserAccessObjects.clickUpdateAccessBtn();
            androidApproveItObjects.clickAcceptApproveItBtn();
            androidApproveItObjects.clickDoneBtn();

            // assert success toast message after updating user access
            String toastMessage = androidManageUsersObjects.getMnusToastMessage();
            Assert.assertEquals(toastMessage, "Success User access successfully updated.");

            androidManageUsersObjects.clickSecondaryUserLbl(0);
            boolean isFullTransactionalAccessSelected = androidUserAccessObjects.getUsaFullTransactionalAccessRd().isSelected();
            Assert.assertTrue(isFullTransactionalAccessSelected);

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}*/


