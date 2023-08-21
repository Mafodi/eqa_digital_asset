package za.co.eqa;

import org.junit.Assert;
import org.junit.Test;
import utilities.enablers.AndroidEnablers;
import utilities.pageobjects.*;
import za.co.nedbank.exception.TestException;

public class CallMeBackTests extends PreConditions {

    AndroidEnablers androidEnablers = new AndroidEnablers();

    AndroidMoreObjects androidMoreObjects = new AndroidMoreObjects(androidDriver);
    AndroidProductOfferingObjects androidProductOfferingObjects = new AndroidProductOfferingObjects(androidDriver);
    AndroidBankAccountsObjects androidBankAccountsObjects = new AndroidBankAccountsObjects(androidDriver);
    AndroidDirectorTypeObjects androidDirectorTypeObjects = new AndroidDirectorTypeObjects(androidDriver);
    AndroidBusinessTypeObjects androidBusinessTypeObjects = new AndroidBusinessTypeObjects(androidDriver);
    AndroidBusinessAccountTypesObjects androidBusinessAccountTypesObjects = new AndroidBusinessAccountTypesObjects(androidDriver);
    AndroidBusinessAccountObjects androidBusinessAccountObjects = new AndroidBusinessAccountObjects(androidDriver);
    AndroidYourApplicationsObjects androidYourApplicationsObjects = new AndroidYourApplicationsObjects(androidDriver);

    AndroidValueAddedServicesObjects androidValueAddedServicesObjects = new AndroidValueAddedServicesObjects(androidDriver);
    AndroidTaxObligationObjects androidTaxObligationObjects = new AndroidTaxObligationObjects(androidDriver);
    AndroidCallMeBackObjects androidCallMeBackObjects = new AndroidCallMeBackObjects(androidDriver);
    AndroidCallMeBackFormObjects androidCallMeBackFormObjects = new AndroidCallMeBackFormObjects(androidDriver);
    AndroidThankYouObjects androidThankYouObjects = new AndroidThankYouObjects(androidDriver);

    AndroidDirectorsDetailsObjects androidDirectorsDetailsObjects = new AndroidDirectorsDetailsObjects(androidDriver);
    AndroidYourBusinessDetailsNotificationObjects androidYourBusinessDetailsNotificationObjects = new AndroidYourBusinessDetailsNotificationObjects(androidDriver);
    AndroidYourBusinessDetailsObjects androidYourBusinessDetailsObjects = new AndroidYourBusinessDetailsObjects(androidDriver);
    AndroidSearchForMyBusinessManuallyObjects androidSearchForMyBusinessManuallyObjects = new AndroidSearchForMyBusinessManuallyObjects(androidDriver);
    AndroidBusinessDetailsObjects androidBusinessDetailsObjects = new AndroidBusinessDetailsObjects(androidDriver);

    @Test
    public void taxObligations() throws TestException, InterruptedException {

        AndroidIDVLEnrolmentObjects androidIDVLEnrolmentObjects = new AndroidIDVLEnrolmentObjects(androidDriver);
        androidIDVLEnrolmentObjects.idvEnrolCardPin("9307220910087","0999999999","113454","98675","09876",false,true);

        try {
            androidMoreObjects.clickNotification();
            androidMoreObjects.clickApply();
            androidProductOfferingObjects.clickOpenBankAccount();
            androidBankAccountsObjects.clickForMyBusinessArrow();
            androidDirectorTypeObjects.clickSingleDirectorLink();
            androidBusinessTypeObjects.clickApplyForNewBusinessLink();

            if(androidYourApplicationsObjects.getYappSingleDirectorApplicationsLbl().size() > 0) {
                androidYourApplicationsObjects.clickStartANewBusinessLbl();
            }

            androidBusinessAccountTypesObjects.clickStartupBundleLnk();

            androidBusinessAccountObjects.clickProductsComparableChk();
            androidBusinessAccountObjects.clickTermsAndConditionsChk();
            androidBusinessAccountObjects.clickApplyNowBtn();

            androidEnablers.androidScrollDown(2,androidDriver);
            androidValueAddedServicesObjects.clickApplyValueChk();
            androidValueAddedServicesObjects.clickNextBtn();

            androidTaxObligationObjects.clickYesRd(0);
            androidTaxObligationObjects.clickNextBtn();

            boolean isCallMeBackScreenDisplayed = androidCallMeBackObjects.getCmbHeaderTextLbl().isDisplayed();
            Assert.assertTrue(isCallMeBackScreenDisplayed);

            System.out.println("Call me back screen succesfully displayed for US citizen radio button option.");

            androidCallMeBackObjects.clickBackArrowBtn();
            androidTaxObligationObjects.clickNoRd(0);

            androidTaxObligationObjects.clickYesRd(1);
            androidTaxObligationObjects.clickNextBtn();
            Assert.assertTrue(isCallMeBackScreenDisplayed);

            System.out.println("Call me back screen succesfully displayed for tax outside SA button option.");

            androidCallMeBackObjects.clickBackArrowBtn();
            androidTaxObligationObjects.clickYesRd(0);
            androidTaxObligationObjects.clickYesRd(0);
            androidTaxObligationObjects.clickNextBtn();

            androidCallMeBackObjects.clickCallMeBackBtn();

            androidCallMeBackFormObjects.waitForCallMeBackFormToBeVisible();
            androidEnablers.androidScrollDown(2,androidDriver);

            androidCallMeBackFormObjects.captureField(3, "mafodip@nedbank.co.za");
            androidCallMeBackFormObjects.captureField(4, "BBG");

            androidCallMeBackFormObjects.clickBusinessTypePck();
            androidCallMeBackFormObjects.selectSoleProprietorLnk();

            Assert.assertTrue(androidThankYouObjects.getThkHeaderLbl().isDisplayed());

            androidCallMeBackFormObjects.clickNextBtn();

        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }

    @Test
    public void highRiskCountries() throws TestException, InterruptedException {

        AndroidIDVLEnrolmentObjects androidIDVLEnrolmentObjects = new AndroidIDVLEnrolmentObjects(androidDriver);
        androidIDVLEnrolmentObjects.idvEnrolCardPin("9307220910087","0999999999","113454","98675","09876",false,true);

        try {
            androidMoreObjects.clickNotification();
            androidMoreObjects.clickApply();
            androidProductOfferingObjects.clickOpenBankAccount();
            androidBankAccountsObjects.clickForMyBusinessArrow();
            androidDirectorTypeObjects.clickSingleDirectorLink();
            androidBusinessTypeObjects.clickApplyForNewBusinessLink();

            if(androidYourApplicationsObjects.getYappSingleDirectorApplicationsLbl().size() > 0) {
                androidEnablers.androidScrollDown(2,androidDriver);
                androidYourApplicationsObjects.clickStartANewBusinessLbl();
            } else {
                androidYourApplicationsObjects.clickStartANewBusinessLbl();
            }

            androidBusinessAccountTypesObjects.clickStartupBundleLnk();

            androidBusinessAccountObjects.clickProductsComparableChk();
            androidBusinessAccountObjects.clickTermsAndConditionsChk();
            androidBusinessAccountObjects.clickApplyNowBtn();

            androidEnablers.androidScrollDown(2,androidDriver);
            androidValueAddedServicesObjects.clickApplyValueChk();
            androidValueAddedServicesObjects.clickNextBtn();

            androidTaxObligationObjects.clickNextBtn();

            androidDirectorsDetailsObjects.waitForDirectorsDetailsScreen();
            androidDirectorsDetailsObjects.captureEmail("mafodip@nedbank.co.za");
            androidEnablers.androidScrollDown(2,androidDriver);
            androidDirectorsDetailsObjects.clickNextBtn();

            androidYourBusinessDetailsNotificationObjects.clickNextBtn();
            androidYourBusinessDetailsObjects.clickOpenAccountSoleProprietorLnk();

            androidSearchForMyBusinessManuallyObjects.clickTradingNameNo();
            androidSearchForMyBusinessManuallyObjects.clickNextBtn();

            androidBusinessDetailsObjects.captureBusinessEmailAddressTxt("mafodip@nedbank.co.za");
            androidBusinessDetailsObjects.clickFinancialYearEndDrp();
            androidBusinessDetailsObjects.clickFinancialYearEndMonthLbl(2);
            androidBusinessDetailsObjects.clickEconomicSectorDrp();
            androidBusinessDetailsObjects.clickEconomicSectorLbl(3);
            androidEnablers.androidScrollDown(1,androidDriver);

            if(!androidBusinessDetailsObjects.getBsdtBusinessFinancialInstitutionNoRd().isSelected()) {
                androidBusinessDetailsObjects.clickBusinessFinancialInstitutionNoRd();
            }

            androidBusinessDetailsObjects.clickBusinessTurnoverDrp();
            androidBusinessDetailsObjects.clickBusinessTurnoverAmountLbl();
            androidBusinessDetailsObjects.clickBusinessIncomeDrp();
            androidBusinessDetailsObjects.searchSch("Interest");
            androidBusinessDetailsObjects.clickBusinessIncomeChk();
            androidBusinessDetailsObjects.clickSaveBtn();

            androidBusinessDetailsObjects.captureBusinessDescriptionTxt("Test business description");
            androidBusinessDetailsObjects.clickAdministrationTypeDrp();
            androidBusinessDetailsObjects.clickAdministrationTypeLNoneOfTheAboveLbl();

            androidBusinessDetailsObjects.clickCountriesOfOperationDrp();
            androidBusinessDetailsObjects.searchSch("Iraq");
            androidBusinessDetailsObjects.selectCountryOfOperationChk();
            androidBusinessDetailsObjects.clickSaveBtn();

            if(!androidBusinessDetailsObjects.getBsdtEffectiveManagementOutsideSouthAfricaNoRd().isSelected()) {
                androidBusinessDetailsObjects.clickEffectiveManagementOutsideSouthAfricaNoRd();
            }

            androidBusinessDetailsObjects.clickNextBtn();

            boolean isCallMeBackDisplayed = androidCallMeBackObjects.getCmbHeaderTextLbl().isDisplayed();
            Assert.assertTrue("High risk countries call me back failed.", isCallMeBackDisplayed);

            androidCallMeBackObjects.clickCallMeBackBtn();
            androidThankYouObjects.clickDoneBtn();

        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }

    @Test
    public void businessUnderAdministration() throws TestException, InterruptedException {

        AndroidIDVLEnrolmentObjects androidIDVLEnrolmentObjects = new AndroidIDVLEnrolmentObjects(androidDriver);
        androidIDVLEnrolmentObjects.idvEnrolCardPin("9307220910087","0999999999","113454","98675","09876",false,true);

        try {
            androidMoreObjects.clickNotification();
            androidMoreObjects.clickApply();
            androidProductOfferingObjects.clickOpenBankAccount();
            androidBankAccountsObjects.clickForMyBusinessArrow();
            androidDirectorTypeObjects.clickSingleDirectorLink();
            androidBusinessTypeObjects.clickApplyForNewBusinessLink();

            if(androidYourApplicationsObjects.getYappSingleDirectorApplicationsLbl().size() > 0) {
                androidEnablers.androidScrollDown(2,androidDriver);
                androidYourApplicationsObjects.clickStartANewBusinessLbl();
            } else {
                androidYourApplicationsObjects.clickStartANewBusinessLbl();
            }

            androidBusinessAccountTypesObjects.clickStartupBundleLnk();

            androidBusinessAccountObjects.clickProductsComparableChk();
            androidBusinessAccountObjects.clickTermsAndConditionsChk();
            androidBusinessAccountObjects.clickApplyNowBtn();

            androidEnablers.androidScrollDown(2,androidDriver);
            androidValueAddedServicesObjects.clickApplyValueChk();
            androidValueAddedServicesObjects.clickNextBtn();

            androidTaxObligationObjects.clickNextBtn();

            androidDirectorsDetailsObjects.waitForDirectorsDetailsScreen();
            androidDirectorsDetailsObjects.captureEmail("mafodip@nedbank.co.za");
            androidEnablers.androidScrollDown(2,androidDriver);
            androidDirectorsDetailsObjects.clickNextBtn();

            androidYourBusinessDetailsNotificationObjects.clickNextBtn();
            androidYourBusinessDetailsObjects.clickOpenAccountSoleProprietorLnk();

            androidSearchForMyBusinessManuallyObjects.clickTradingNameNo();
            androidSearchForMyBusinessManuallyObjects.clickNextBtn();

            androidBusinessDetailsObjects.captureBusinessEmailAddressTxt("mafodip@nedbank.co.za");
            androidBusinessDetailsObjects.clickFinancialYearEndDrp();
            androidBusinessDetailsObjects.clickFinancialYearEndMonthLbl(2);
            androidBusinessDetailsObjects.clickEconomicSectorDrp();
            androidBusinessDetailsObjects.clickEconomicSectorLbl(3);
            androidEnablers.androidScrollDown(1,androidDriver);

            if(!androidBusinessDetailsObjects.getBsdtBusinessFinancialInstitutionNoRd().isSelected()) {
                androidBusinessDetailsObjects.clickBusinessFinancialInstitutionNoRd();
            }

            androidBusinessDetailsObjects.clickBusinessTurnoverDrp();
            androidBusinessDetailsObjects.clickBusinessTurnoverAmountLbl();
            androidBusinessDetailsObjects.clickBusinessIncomeDrp();
            androidBusinessDetailsObjects.searchSch("Interest");
            androidBusinessDetailsObjects.clickBusinessIncomeChk();
            androidBusinessDetailsObjects.clickSaveBtn();

            androidBusinessDetailsObjects.captureBusinessDescriptionTxt("Test business description");
            androidBusinessDetailsObjects.clickAdministrationTypeDrp();

            androidBusinessDetailsObjects.clickAdministrationTypeLiquidationLbl();

            if(!androidBusinessDetailsObjects.getBsdtEffectiveManagementOutsideSouthAfricaNoRd().isSelected()) {
                androidBusinessDetailsObjects.clickEffectiveManagementOutsideSouthAfricaNoRd();
            }

            androidBusinessDetailsObjects.clickNextBtn();

            boolean isCallMeBackDisplayed = androidCallMeBackObjects.getCmbHeaderTextLbl().isDisplayed();
            Assert.assertTrue("High risk countries call me back failed.", isCallMeBackDisplayed);

            androidCallMeBackObjects.clickCallMeBackBtn();
            androidThankYouObjects.clickDoneBtn();

        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }


}
