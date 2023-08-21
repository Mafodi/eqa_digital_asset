package za.co.eqa;

import org.junit.Assert;
import org.junit.Test;
import utilities.enablers.AndroidEnablers;
import utilities.pageobjects.*;
import za.co.nedbank.exception.TestException;

//import static utilities.base.AndroidBaseExecution.androidDriver;


public class SingleDirectorUnitTests extends PreConditions {

    AndroidEnablers androidEnablers = new AndroidEnablers();

    AndroidMoreObjects androidMoreObjects = new AndroidMoreObjects(androidDriver);
    AndroidProductOfferingObjects androidProductOfferingObjects = new AndroidProductOfferingObjects(androidDriver);
    AndroidBankAccountsObjects androidBankAccountsObjects = new AndroidBankAccountsObjects(androidDriver);
    AndroidDirectorTypeObjects androidDirectorTypeObjects = new AndroidDirectorTypeObjects(androidDriver);
    AndroidBusinessTypeObjects androidBusinessTypeObjects = new AndroidBusinessTypeObjects(androidDriver);
    AndroidBusinessAccountTypesObjects androidBusinessAccountTypesObjects = new AndroidBusinessAccountTypesObjects(androidDriver);
    AndroidBusinessAccountObjects androidBusinessAccountObjects = new AndroidBusinessAccountObjects(androidDriver);
    AndroidValueAddedServicesObjects androidValueAddedServicesObjects = new AndroidValueAddedServicesObjects(androidDriver);
    AndroidTaxObligationObjects androidTaxObligationObjects = new AndroidTaxObligationObjects(androidDriver);
    AndroidDirectorsDetailsObjects androidDirectorsDetailsObjects = new AndroidDirectorsDetailsObjects(androidDriver);
    AndroidYourBusinessDetailsNotificationObjects androidYourBusinessDetailsNotificationObjects = new AndroidYourBusinessDetailsNotificationObjects(androidDriver);
    AndroidYourBusinessDetailsObjects androidYourBusinessDetailsObjects = new AndroidYourBusinessDetailsObjects(androidDriver);
    AndroidSearchForMyBusinessManuallyObjects androidSearchForMyBusinessManuallyObjects = new AndroidSearchForMyBusinessManuallyObjects(androidDriver);
    AndroidOpenAccountAsSoleProprietorObjects androidOpenAccountAsSoleProprietorObjects = new AndroidOpenAccountAsSoleProprietorObjects(androidDriver);
    AndroidBusinessDetailsObjects androidBusinessDetailsObjects = new AndroidBusinessDetailsObjects(androidDriver);
    AndroidBusinessAddressDetailsObjects androidBusinessAddressDetailsObjects = new AndroidBusinessAddressDetailsObjects(androidDriver);
    AndroidDedicatedRelationshipBankerObjects androidDedicatedRelationshipBankerObjects = new AndroidDedicatedRelationshipBankerObjects(androidDriver);
    AndroidDeclarationObjects androidDeclarationObjects = new AndroidDeclarationObjects(androidDriver);
    AndroidKeepInTouchObjects androidKeepInTouchObjects = new AndroidKeepInTouchObjects(androidDriver);
    AndroidSuccessObjects androidSuccessObjects = new AndroidSuccessObjects(androidDriver);
    AndroidRelationshipBankerObjects androidRelationshipBankerObjects = new AndroidRelationshipBankerObjects(androidDriver);
    AndroidIDVLEnrolmentObjects androidIDVLEnrolmentObjects = new AndroidIDVLEnrolmentObjects(androidDriver);
    @Test
    public void applyForNewBusiness() throws TestException, InterruptedException {

       // androidIDVLEnrolmentObjects.idvEnrolNidPw("9501240810083", "Password100@", "13579", true);

//        AndroidIDVLEnrolmentObjects androidIDVLEnrolmentObjects = new AndroidIDVLEnrolmentObjects(androidDriver);
//        androidIDVLEnrolmentObjects.idvEnrolCardPin("9501240810083","0999999999","113454","98675","09876",false,true);


        androidMoreObjects.clickNotification();
        androidMoreObjects.clickApply();
        androidProductOfferingObjects.clickOpenBankAccount();
        androidBankAccountsObjects.clickForMyBusinessArrow();
        androidDirectorTypeObjects.clickSingleDirectorLink();
        androidBusinessTypeObjects.clickApplyForNewBusinessLink();
        androidBusinessAccountTypesObjects.clickStartupBundleLnk();
        androidBusinessAccountObjects.clickProductsComparableChk();
        androidBusinessAccountObjects.clickTermsAndConditionsChk();
        androidBusinessAccountObjects.clickApplyNowBtn();

        //androidEnablers.androidScrollDown(2,androidDriver);
        androidValueAddedServicesObjects.clickApplyValueChk();
        androidValueAddedServicesObjects.clickNextBtn();
        androidTaxObligationObjects.clickNextBtn();

        // Director's details screen
        androidDirectorsDetailsObjects.waitForDirectorsDetailsScreen();
        androidDirectorsDetailsObjects.captureEmail("mafodip@nedbank.co.za");
        //androidEnablers.androidScrollDown(2,androidDriver);
        androidDirectorsDetailsObjects.clickNextBtn();

        // Your business details notification screen
        androidYourBusinessDetailsNotificationObjects.waitForYourBusinessDetailsNotificationScreen();
        androidYourBusinessDetailsNotificationObjects.clickNextBtn();

        // Your business details screen
        androidYourBusinessDetailsObjects.waitForYourBusinessDetailsScreen();
        androidYourBusinessDetailsObjects.clickSearchBusinessManuallyLnk();
        androidSearchForMyBusinessManuallyObjects.captureBusinessRegistrationNumberTxt("2009/138453/07");
        androidSearchForMyBusinessManuallyObjects.clickBackArrow();

        androidYourBusinessDetailsObjects.clickOpenAccountSoleProprietorLnk();
        androidOpenAccountAsSoleProprietorObjects.clickTradingNameNoRd();
        androidOpenAccountAsSoleProprietorObjects.clickTradingNameYesRd();
        androidOpenAccountAsSoleProprietorObjects.captureTradingNameTxt("Nedbank");
        androidOpenAccountAsSoleProprietorObjects.clickCheckAvailabilityBtn();
        Assert.assertTrue(androidOpenAccountAsSoleProprietorObjects.getOpacTradingNameInfoLbl().isDisplayed());
        androidOpenAccountAsSoleProprietorObjects.getOpacTradingNameTxt().clear();
        androidOpenAccountAsSoleProprietorObjects.captureTradingNameTxt("AAA Corp");
        //androidEnablers.androidScrollDown(2,androidDriver);
//        androidEnablers.scrollToElementUsingText(androidOpenAccountAsSoleProprietorObjects.getCheckAvailabilityBtn().getText(), androidDriver);
        androidOpenAccountAsSoleProprietorObjects.clickCheckAvailabilityBtn();
        Assert.assertFalse(androidOpenAccountAsSoleProprietorObjects.getOpacTradingNameInfoLbl().isDisplayed());
        androidOpenAccountAsSoleProprietorObjects.clickNextBtn();

        // Business detail screen
        androidBusinessDetailsObjects.captureBusinessEmailAddressTxt("mafodip@nedbank.co.za");
        androidBusinessDetailsObjects.clickFinancialYearEndDrp();
        androidBusinessDetailsObjects.clickFinancialYearEndMonthLbl(2);
        //androidEnablers.androidScrollDown(2,androidDriver);
        androidBusinessDetailsObjects.clickEconomicSectorDrp();
        androidBusinessDetailsObjects.clickEconomicSectorLbl(3);
        androidBusinessDetailsObjects.clickBusinessTurnoverDrp();
        androidBusinessDetailsObjects.clickBusinessTurnoverAmountLbl();
        androidBusinessDetailsObjects.clickBusinessIncomeDrp();
        androidBusinessDetailsObjects.clickBusinessIncomeChk();
        androidBusinessDetailsObjects.clickSaveBtn();
        androidBusinessDetailsObjects.captureBusinessDescriptionTxt("Test business description");
        androidBusinessDetailsObjects.clickAdministrationTypeDrp();
        androidBusinessDetailsObjects.clickAdministrationTypeLNoneOfTheAboveLbl();
        androidBusinessDetailsObjects.clickNextBtn();

        //Business address details screen
        androidBusinessAddressDetailsObjects.clickTradingAddressSameAsPersonalNoRd();
        androidBusinessAddressDetailsObjects.clickTradingAddressSameAsPersonalYesRd();
        androidBusinessAddressDetailsObjects.clickBusinessPostalSameAsBusinessNoRd();
        androidBusinessAddressDetailsObjects.clickBusinessPostalSameAsBusinessYesRd();
        androidBusinessAddressDetailsObjects.clickNextBtn();

        // Dedicated relationship banker screen
        androidDedicatedRelationshipBankerObjects.clickIKnowABankerRd();
        androidDedicatedRelationshipBankerObjects.clickAssignMeABankerRd();
        androidDedicatedRelationshipBankerObjects.clickSearchBankerTxt();
        androidDedicatedRelationshipBankerObjects.captureSearchBankerTxt("Sandton");
        androidDedicatedRelationshipBankerObjects.clickBankerResultItemLbl();
        androidDedicatedRelationshipBankerObjects.clickNextBtn();

        // Declaration screen
        androidDeclarationObjects.clickTermsAndConditionsChk();
        androidDeclarationObjects.clickNextBtn();

        // Keep in touch screen
        androidKeepInTouchObjects.clickKeepInTouchNoRd();
        androidKeepInTouchObjects.clickKeepInTouchYesRd();
        androidKeepInTouchObjects.clickNextBtn();

        // Keep in touch screen
        androidSuccessObjects.waitForHeaderCopyLbl();
        String headerText = androidSuccessObjects.getScssHeaderCopyLbl().getText();
        String accountNumber = headerText.substring(13, 17);
        Assert.assertEquals(accountNumber, 1371);
        androidSuccessObjects.clickNextBtn();
    }

    @Test
    public void applyForExistingBusiness() throws TestException, InterruptedException {
        AndroidIDVLEnrolmentObjects androidIDVLEnrolmentObjects = new AndroidIDVLEnrolmentObjects(androidDriver);
        //androidIDVLEnrolmentObjects.idvEnrolNidPw("9502126574089", "Password100@", "12345", true);

        //idvEnrolNidPw("9502126574089", "0987544674", "Password100@", "12345", false, true);

        //androidIDVLEnrolmentObjects.idvEnrolCardPin("9501240810083","0999999999","113454","98675","09876",false,true);

        androidMoreObjects.clickNotification();
        androidMoreObjects.clickApply();
        androidProductOfferingObjects.clickOpenBankAccount();
        androidBankAccountsObjects.clickForMyBusinessArrow();
        androidDirectorTypeObjects.clickSingleDirectorLink();
        androidBusinessTypeObjects.clickApplyForExistingBusinessLink();

        androidBusinessAccountTypesObjects.clickBusinessPayAsYouUseLnk();

        androidBusinessAccountObjects.clickProductsComparableChk();
        androidBusinessAccountObjects.clickTermsAndConditionsChk();
        androidBusinessAccountObjects.clickApplyNowBtn();

        // value added services screen
        //androidEnablers.androidScrollDown(2,androidDriver);
        androidValueAddedServicesObjects.clickApplyValueChk();
        androidValueAddedServicesObjects.clickNextBtn();

        // tax obligation screens
        androidTaxObligationObjects.clickNoRd(0);
        androidTaxObligationObjects.clickYesRd(0);
        androidTaxObligationObjects.clickNextBtn();

        // Director's details screen
        androidDirectorsDetailsObjects.waitForDirectorsDetailsScreen();
        androidDirectorsDetailsObjects.captureEmail("mafodip@nedbank.co.za");
        //androidEnablers.androidScrollDown(2,androidDriver);
        androidDirectorsDetailsObjects.clickNextBtn();

        // Tell us about your business screen
        androidBusinessDetailsObjects.captureBusinessEmailAddressTxt("mafodip@nedbank.co.za");
        //androidEnablers.androidScrollDown(2,androidDriver);
        androidBusinessDetailsObjects.clickNextBtn();

        // Relationship banker screen
        androidRelationshipBankerObjects.clickAssignMeABankerRd();
        androidRelationshipBankerObjects.clickSearchBankerTxt();
        androidRelationshipBankerObjects.captureBankerTxt("Menlyn");
        androidRelationshipBankerObjects.clickBankerSearchResultsLbl();
        androidRelationshipBankerObjects.clickNextBtn();

        // Declaration screen
        //androidEnablers.androidScrollDown(2,androidDriver);
        androidDeclarationObjects.clickTermsAndConditionsChk();
        androidDeclarationObjects.clickNextBtn();

        // Keep in touch screen
        androidKeepInTouchObjects.clickKeepInTouchNoRd();
        androidKeepInTouchObjects.clickNextBtn();

        // Keep in touch screen
        androidSuccessObjects.waitForHeaderCopyLbl();
        String headerText = androidSuccessObjects.getScssHeaderCopyLbl().getText();
        String accountNumber = headerText.substring(13, 17);
        Assert.assertEquals(accountNumber, 1371);
        androidSuccessObjects.clickNextBtn();
    }

}
