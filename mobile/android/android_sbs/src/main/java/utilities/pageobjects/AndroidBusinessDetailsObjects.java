package utilities.pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import za.co.nedbank.exception.TestException;
import za.co.nedbank.ui.appium.AppiumAction;

import java.util.List;

public class AndroidBusinessDetailsObjects {

    static WebDriverWait wait;
    static AppiumAction appiumAction;

    public AndroidBusinessDetailsObjects(AndroidDriver androidDriver) {
        wait = new WebDriverWait(androidDriver,60);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
        appiumAction = new AppiumAction(androidDriver);
    }

    @AndroidFindBy(id= "za.co.nedbank.qa:id/esTxvInfo")
    private AndroidElement bsdtSubHeaderLbl;

    @AndroidFindBy(xpath= "(//android.widget.EditText)[1]")
    private AndroidElement bsdtBusinessNameTxt;

    @AndroidFindBy(id= "(//android.widget.EditText)[2]")
    private AndroidElement bsdtBusinessTypeOrLegalEntityTxt;

    @AndroidFindBy(id= "(//android.widget.EditText)[3]")
    private AndroidElement bsdtBusinessEmailAddressTxt;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/pickerFinacialYear")
    private AndroidElement bsdtFinancialYearEndDrp;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/txvIncomeSource")
    private List<AndroidElement> bsdtFinancialYearEndMonthsLbl;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/pickerEconomicSector")
    private AndroidElement bsdtEconomicSectorsDrp;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/txvIncomeSource")
    private List<AndroidElement> bsdtEconomicSectorsLbl;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/switch_field_positive_button")
    private AndroidElement bsdtBusinessFinancialInstitutionYesRd;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/switch_field_negative_button")
    private AndroidElement bsdtBusinessFinancialInstitutionNoRd;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/pickerBusinessturnover")
    private AndroidElement bsdtBusinessTurnoverDrp;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/txvIncomeSource")
    private AndroidElement bsdtBusinessTurnoverAmountLbl;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/pickerBusinessIncome")
    private AndroidElement bsdtBusinessIncomeDrp;

    @AndroidFindBy(id= "es_edtInput")
    private AndroidElement bsdtSearchSch;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/apply_country_cb")
    private AndroidElement bsdtBusinessIncomeChk;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/pickerAdministrationType")
    private AndroidElement bsdtAdministrationTypeDrp;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/pickerCountriesOperation")
    private AndroidElement bsdtCountriesOfOperationDrp;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/apply_country_cb")
    private AndroidElement bsdtCountryOfOperationChk;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/switch_field_positive_button")
    private AndroidElement bsdtEffectiveManagementOutsideSouthAfricaYesRd;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/switch_field_negative_button")
    private AndroidElement bsdtEffectiveManagementOutsideSouthAfricaNoRd;

    @AndroidFindBy(xpath= "(//android.widget.EditText)[4]")
    private AndroidElement bsdtDescribeOtherIncomeTxt;

    @AndroidFindBy(xpath= "(//android.widget.EditText)[5]")
    private AndroidElement bsdtBusinessDescriptionTxt;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Liquidation\"]")
    private AndroidElement bsdtAdministrationTypeLiquidationLbl;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Curatorship\"]")
    private AndroidElement bsdtAdministrationTypeCuratorshipLbl;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Business Rescue\"]")
    private AndroidElement bsdtAdministrationTypeBusinessRescueLbl;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Sequestration\"]")
    private AndroidElement bsdtAdministrationTypeSequestrationLbl;

    @AndroidFindBy(xpath= "//android.widget.TextView[@text=\"Debt Administration\"]")
    private AndroidElement bsdtAdministrationTypeDebtAdministrationLbl;

    @AndroidFindBy(xpath= "//android.widget.EditText[@text\"None Of The Above\"]")
    private AndroidElement bsdtAdministrationTypeLNoneOfTheAboveLbl;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/witch_field_negative_button")
    private AndroidElement bsdtBusinessManagementOutsideSouthAfricaNoRd;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/switch_field_positive_button")
    private AndroidElement bsdtBusinessManagementOutsideSouthAfricaYesRd;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/esBtnAction")
    private AndroidElement bsdtSaveBtn;

    @AndroidFindBy(id= "za.co.nedbank.qa:id/esBtnAction")
    private AndroidElement bsdtNextBtn;

    public AndroidElement getBsdtSubHeaderLbl() {
        return bsdtSubHeaderLbl;
    }

    public AndroidElement getBsdtBusinessNameTxt() {
        return bsdtBusinessNameTxt;
    }

    public AndroidElement getBsdtBusinessTypeOrLegalEntityTxt() {
        return bsdtBusinessTypeOrLegalEntityTxt;
    }

    public AndroidElement getBsdtBusinessEmailAddressTxt() {
        return bsdtBusinessEmailAddressTxt;
    }

    public AndroidElement getBsdtFinancialYearEndDrp() {
        return bsdtFinancialYearEndDrp;
    }

    public List<AndroidElement> getBsdtFinancialYearEndMonthsLbl() {
        return bsdtFinancialYearEndMonthsLbl;
    }

    public AndroidElement getBsdtEconomicSectorsDrp() {
        return bsdtEconomicSectorsDrp;
    }

    public List<AndroidElement> getBsdtEconomicSectorsLbl() {
        return bsdtEconomicSectorsLbl;
    }

    public AndroidElement getBsdtBusinessFinancialInstitutionYesRd() {
        return bsdtBusinessFinancialInstitutionYesRd;
    }

    public AndroidElement getBsdtBusinessFinancialInstitutionNoRd() {
        return bsdtBusinessFinancialInstitutionNoRd;
    }

    public AndroidElement getBsdtBusinessTurnoverDrp() {
        return bsdtBusinessTurnoverDrp;
    }

    public AndroidElement getBsdtBusinessTurnoverAmountLbl() {
        return bsdtBusinessTurnoverAmountLbl;
    }

    public AndroidElement getBsdtBusinessManagementOutsideSouthAfricaNoRd() {
        return bsdtBusinessManagementOutsideSouthAfricaNoRd;
    }

    public AndroidElement getBsdtBusinessManagementOutsideSouthAfricaYesRd() {
        return bsdtBusinessManagementOutsideSouthAfricaYesRd;
    }

    public AndroidElement getBsdtBusinessIncomeDrp() {
        return bsdtBusinessIncomeDrp;
    }

    public AndroidElement getBsdtSearchSch() {
        return bsdtSearchSch;
    }

    public AndroidElement getBsdtBusinessIncomeChk() {
        return bsdtBusinessIncomeChk;
    }

    public AndroidElement getBsdtAdministrationTypeDrp() {
        return bsdtAdministrationTypeDrp;
    }

    public AndroidElement getBsdtAdministrationTypeLiquidationLbl() {
        return bsdtAdministrationTypeLiquidationLbl;
    }

    public AndroidElement getBsdtAdministrationTypeCuratorshipLbl() {
        return bsdtAdministrationTypeCuratorshipLbl;
    }

    public AndroidElement getBsdtAdministrationTypeBusinessRescueLbl() {
        return bsdtAdministrationTypeBusinessRescueLbl;
    }

    public AndroidElement getBsdtAdministrationTypeSequestrationLbl() {
        return bsdtAdministrationTypeSequestrationLbl;
    }

    public AndroidElement getBsdtAdministrationTypeDebtAdministrationLbl() {
        return bsdtAdministrationTypeDebtAdministrationLbl;
    }

    public AndroidElement getBsdtAdministrationTypeLNoneOfTheAboveLbl() {
        return bsdtAdministrationTypeLNoneOfTheAboveLbl;
    }

    public AndroidElement getBsdtCountriesOfOperationDrp() {
        return bsdtCountriesOfOperationDrp;
    }

    public AndroidElement getBsdtCountryOfOperationChk() {
        return bsdtCountryOfOperationChk;
    }

    public AndroidElement getBsdtEffectiveManagementOutsideSouthAfricaYesRd() {
        return bsdtEffectiveManagementOutsideSouthAfricaYesRd;
    }

    public AndroidElement getBsdtEffectiveManagementOutsideSouthAfricaNoRd() {
        return bsdtEffectiveManagementOutsideSouthAfricaNoRd;
    }

    public AndroidElement getBsdtDescribeOtherIncomeTxt() {
        return bsdtDescribeOtherIncomeTxt;
    }

    public AndroidElement getBsdtBusinessDescriptionTxt() {
        return bsdtBusinessDescriptionTxt;
    }

    public AndroidElement getBsdtSaveBtn() {
        return bsdtSaveBtn;
    }

    public AndroidElement getBsdtNextBtn() {
        return bsdtNextBtn;
    }

    public void captureBusinessEmailAddressTxt(String email) throws TestException {
        getBsdtBusinessEmailAddressTxt().clear();
        getBsdtBusinessEmailAddressTxt().sendKeys(email);
    }

    public void clickFinancialYearEndDrp() throws TestException {
        appiumAction.waitAndClickElement(getBsdtFinancialYearEndDrp());
    }


    public void clickFinancialYearEndMonthLbl(int monthIndex) throws TestException {
        appiumAction.waitAndClickElement(getBsdtFinancialYearEndMonthsLbl().get(monthIndex));
    }

    public void clickEconomicSectorDrp() throws TestException {
        appiumAction.waitAndClickElement(getBsdtEconomicSectorsDrp());
    }

    public void clickEconomicSectorLbl(int sectorIndex) throws TestException {
        appiumAction.waitAndClickElement(getBsdtEconomicSectorsLbl().get(sectorIndex));
    }

    public void clickBusinessFinancialInstitutionYesRd() throws TestException {
        appiumAction.waitAndClickElement(getBsdtBusinessFinancialInstitutionYesRd());
    }

    public void clickBusinessFinancialInstitutionNoRd() throws TestException {
        appiumAction.waitAndClickElement(getBsdtBusinessFinancialInstitutionNoRd());
    }

    public void clickBusinessTurnoverDrp() throws TestException {
        appiumAction.waitAndClickElement(getBsdtBusinessTurnoverDrp());
    }

    public void clickBusinessTurnoverAmountLbl() throws TestException {
        appiumAction.waitAndClickElement(getBsdtBusinessTurnoverAmountLbl());
    }

    public void clickBusinessIncomeDrp() throws TestException {
        appiumAction.waitAndClickElement(getBsdtBusinessIncomeDrp());
    }


    public void searchSch(String arg) throws TestException {
        appiumAction.waitForElementToBeVisible(getBsdtSearchSch());
        getBsdtSearchSch().sendKeys(arg);
    }

    public void clickBusinessIncomeChk() throws TestException {
        appiumAction.waitAndClickElement(getBsdtBusinessIncomeChk());
    }

    public void captureBusinessDescriptionTxt(String businessDescription) throws TestException {
        getBsdtBusinessDescriptionTxt().sendKeys(businessDescription);
    }

    public void clickSaveBtn() throws TestException {
        appiumAction.waitAndClickElement(getBsdtSaveBtn());
    }

    public void clickAdministrationTypeDrp() throws TestException {
        appiumAction.waitAndClickElement(getBsdtAdministrationTypeDrp());
    }

    public void clickAdministrationTypeLiquidationLbl() throws TestException {
        appiumAction.waitAndClickElement(getBsdtAdministrationTypeLiquidationLbl());
    }

    public void clickAdministrationTypeLNoneOfTheAboveLbl() throws TestException {
        appiumAction.waitAndClickElement(getBsdtAdministrationTypeLNoneOfTheAboveLbl());
    }

    public void clickCountriesOfOperationDrp() throws TestException {
        appiumAction.waitAndClickElement(getBsdtCountriesOfOperationDrp());
    }


    public void clickEffectiveManagementOutsideSouthAfricaYesRd() throws TestException {
        appiumAction.waitAndClickElement(getBsdtEffectiveManagementOutsideSouthAfricaYesRd());
    }

    public void clickEffectiveManagementOutsideSouthAfricaNoRd() throws TestException {
        appiumAction.waitAndClickElement(getBsdtEffectiveManagementOutsideSouthAfricaNoRd());
    }

    public void selectCountryOfOperationChk() throws TestException {
        appiumAction.waitAndClickElement(getBsdtCountryOfOperationChk());
    }

    public void clickNextBtn() throws TestException {
        appiumAction.waitAndClickElement(getBsdtNextBtn());
    }




}
