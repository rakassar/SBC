package crm.mhc.pages.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualSalesJourneyPageObject extends LoginPageObject{
	
public IndividualSalesJourneyPageObject (WebDriver driver)

{
	super(driver);
	
}


//***********End*************Fill the Info for  Indivdual process*****************************-------------//




@FindBy(name="SALUTATION")
public static WebElement sel_ldSalutation;
@FindBy(name="FIRSTNAME")
public static WebElement ent_ldfirstname;
@FindBy(name="LASTNAME")
public static WebElement ent_ldlastname;
@FindBy(name="MIDDLENAME")
public static WebElement ent_ldmiddlename;


@FindBy(name="LE_TERRITORY")
public static WebElement ent_ldBranch;


@FindBy(name="cust_1134")
public static WebElement sel_ldPitchMProduct;

@FindBy(name="LE_MOBILE")
public static WebElement ent_ldmobile;

@FindBy(xpath="//*[@id=\"object-action-button\"]/div/a")
public static WebElement clk_NTBONBourneynext1;
@FindBy(id="LEA_EX3_41month")
public static WebElement sel_lddobmonth;
@FindBy(id="LEA_EX3_41day")
public static WebElement sel_lddobday;
@FindBy(id="LEA_EX3_41year")
public static WebElement sel_lddobyear;
@FindBy(name="LE_PRODUCTCATEGORY")
public static WebElement sel_ldProductCategory;
@FindBy(name="LE_PRODUCT")
public static WebElement sel_ldProduct;

//Gold5.5
/*
 * @FindBy(xpath="=//*[contains(@class,'icon icon-next')][1]") public static
 * WebElement clk_NTBONBourneynext2;
 */


//Gold7
@FindBy(xpath="//span[normalize-space()='Next']")
public static WebElement clk_NTBONBourneynext2;


@FindBy(xpath="//select[@name='LE_LEADRATING']")
public static WebElement sel_LeadRating;
@FindBy(xpath="//button[contains(@class,'button')][1]")
public static WebElement clk_ignoreandcreate;
@FindBy(xpath="//button[@type = 'button'][1]")
public static WebElement clk_casededupeonlead;





















//***********Start*************no use Fill the Info for COL process*****************************-------------//
@FindBy(id="Email")
public static WebElement ent_SDemail;
@FindBy(id="Fax")
public static WebElement ent_SDFax;
@FindBy(id="Phone")
public static WebElement ent_SDPhone;
@FindBy(id="Lea_ex1_7")
public static WebElement ent_SDEmployer;
@FindBy(name="LE_TERRITORY")
public static WebElement ser_SDBranch ;
@FindBy(id="OfficePhone")
public static WebElement ent_SDOfficePhone;
@FindBy(id="Lea_ex2_13")
public static WebElement ent_SDMonthlySalary;
@FindBy(id="Lea_ex2_15")
public static WebElement ent_SDOtherSalary;
@FindBy(id="Lea_ex1_20")
public static WebElement ent_SDNetAnnualIncome;
@FindBy(id="Lea_ex2_17")
public static WebElement ent_SDDeductions;
@FindBy(id="LEA_EX2_46")
public static WebElement ent_SDCommitments;
@FindBy(id="Lea_ex2_16")
public static WebElement ent_SDOriginalAmount;
@FindBy(id="Lea_ex2_18")
public static WebElement ent_SDAverageMonthlyExpenses;
@FindBy(id="LEA_EX3_2")
public static WebElement ent_SDPermanentAddress1;
@FindBy(id="LEA_EX3_3")
public static WebElement ent_SDPermanentAddress2;
@FindBy(id="Address")
public static WebElement ent_SDPermanentAddress3;
@FindBy(id="LEA_EX2_55")
public static WebElement ent_NID;
//Fill the all listtype info//


@FindBy(id="Lea_ex1_72")
public static WebElement sel_SDApplicantType;
@FindBy(id="Lea_ex1_2")
public static WebElement sel_SDGender;
@FindBy(id="Lea_ex1_62")
public static WebElement sel_SDNationality;
@FindBy(id="LEA_EX3_82")
public static WebElement sel_SDCustomerCategory;
@FindBy(id="LEA_EX3_84")
public static WebElement sel_SDOccupation;
@FindBy(id="Lea_ex1_3")
public static WebElement sel_SDMaritalStatus ;
@FindBy(id="LEA_EX3_75")
public static WebElement sel_SDCountry ;


/*picker search list*/

@FindBy(id="TerritoryName")
public static WebElement ser_SDTerritoryName ;

@FindBy(id="LEA_EX3_77")
public static WebElement ser_SDLocation ;

@FindBy(id="LEA_EX3_76")
public static WebElement ser_SDdistrict ;

@FindBy(id="ZipCode")
public static WebElement ser_SDZipCode ;


@FindBy(id="CampaignNameimgpick")
public static WebElement picser_SDCampaign ;


@FindBy(id="TxtSearch")
public static WebElement picsertext_SDCampaign ;


@FindBy(xpath=".//div[contains(@class,'serch-input-container')]/ul/li[3]/a/i")
public static WebElement picinser_SDCampaign ;

@FindBy(xpath=".//div[contains(@id,'row0')]/div[1][contains(@class,'jqx-grid-cell')]/div[1]/a[contains(@id,'iv_0')]")
public static WebElement picserselect_SDCampaign ;
	
	//Fill the all textbox type info//
@FindBy(id="Email")
public static WebElement ent_COLEmail;
@FindBy(id="LEA_EX2_54")
public static WebElement ent_COLCompanyMobileNo;
@FindBy(id="LEA_EX2_78")
public static WebElement ent_COLObjectsofCompany;
@FindBy(id="LEA_EX3_2")
public static WebElement ent_COLRegisteredAddressLine1;
@FindBy(id="Lea_ex1_71")
public static WebElement ent_COLCompanyRegistrationNumber;
@FindBy(id="LEA_EX3_3")
public static WebElement ent_COLRegisteredAddressLine2;
@FindBy(id="Address")
public static WebElement ent_COLRegisteredAddressLine3;
@FindBy(id="LEA_EX3_16")
public static WebElement ent_COLBusinessRegistrationAddressLine1;
@FindBy(id="LEA_EX3_44")
public static WebElement ent_COLBusinessRegistrationAddressLine2;
@FindBy(id="LEA_EX3_74")
public static WebElement ent_COLBusinessRegistrationAddressLine3;
@FindBy(id="LEA_EX2_88")
public static WebElement ent_COLShareholderName1;
@FindBy(id="LEA_EX2_89")
public static WebElement ent_COLShareholderName2;
@FindBy(id="LEA_EX2_90")
public static WebElement ent_COLShareholderName3;
@FindBy(id="LEA_EX2_91")
public static WebElement ent_COLShareholderName4;
@FindBy(id="LEA_EX2_92")
public static WebElement ent_COLShareholderName5;
@FindBy(id="LEA_EX2_93")
public static WebElement ent_COLOwnedbyShareholderAssociate1;
@FindBy(id="LEA_EX2_94")
public static WebElement ent_COLOwnedbyShareholderAssociate2;
@FindBy(id="LEA_EX2_95")
public static WebElement ent_COLOwnedbyShareholderAssociate3;
@FindBy(id="LEA_EX2_96")
public static WebElement ent_COLOwnedbyShareholderAssociate4;
@FindBy(id="LEA_EX2_97")
public static WebElement ent_COLOwnedbyShareholderAssociate5;

@FindBy(id="LEA_EX2_87")
public static WebElement ent_COLAverageMonthlyBankDepositBalance;
@FindBy(id="LEA_EX2_84")
public static WebElement ent_COLPastProjectDetail;
@FindBy(id="Lea_ex1_40")
public static WebElement ent_COLDirectorName;
@FindBy(id="LEA_EX2_66")
public static WebElement ent_COLDirectorAge;
@FindBy(id="LEA_EX2_3")
public static WebElement ent_COLDirectorMonthlyIncome;
@FindBy(id="LEA_EX2_82")
public static WebElement ent_COLMandatairesName;
@FindBy(id="LEA_EX3_20")
public static WebElement ent_COLPersontoSign;


//Fill the all listtype info//


@FindBy(id="RatingID")
public static WebElement sel_COLRatingID ;

@FindBy(id="ProductID")
public static WebElement sel_COLProductID ;

@FindBy(id="LEA_EX2_81")
public static WebElement sel_COLCorporateType ;

@FindBy(id="Lea_ex1_72")
public static WebElement sel_COLApplicantType ;

@FindBy(id="LEA_EX3_75")
public static WebElement sel_COLRegisteredCountry;


/*search picker list*/
@FindBy(id="CompanyName")
public static WebElement picser_COLCompany ;
@FindBy(id="TerritoryName")
public static WebElement picser_COLTerritoryName ;
@FindBy(id="LEA_EX3_77")
public static WebElement picser_COLRegisteredlocation ;
@FindBy(id="LEA_EX3_76")
public static WebElement picser_COLRegisteredDistrict ;
@FindBy(id="LEA_EX3_80")
public static WebElement picser_COLBusinessRegistrationLocation ;


@FindBy(id="CampaignNameimgpick")
public static WebElement picser_COLCampaign ;
@FindBy(id="TxtSearch")
public static WebElement picsertext_COLCampaign ;
@FindBy(xpath=".//div[contains(@class,'serch-input-container')]/ul/li[3]/a/i")
public static WebElement picinser_COLCampaign ;
@FindBy(xpath=".//div[contains(@id,'row0')]/div[1][contains(@class,'jqx-grid-cell')]/div[1]/a[contains(@id,'iv_0')]")
public static WebElement picserselect_COLCampaign ;


//***********End*************Fill the Info for COL process*****************************-------------//
//checkbox for pitches
@FindBy(xpath="//label[@for = 'chk_4']")
public static WebElement chk_ldSaving;
@FindBy(xpath="//label[@for = 'chk_5']")
public static WebElement chk_ldChecking;
@FindBy(xpath="//label[@for = 'chk_6']")
public static WebElement chk_ldDeal;
@FindBy(xpath="//label[@for = 'chk_7']")
public static WebElement chk_ldPersonalLoan;
@FindBy(xpath="//label[@for = 'chk_8']")
public static WebElement chk_ldAutoLoan;
@FindBy(xpath="//label[@for = 'chk_9']")
public static WebElement chk_ldHomeLoan;
@FindBy(xpath="//label[@for = 'chk_10']")
public static WebElement chk_ldCreditCard;
@FindBy(xpath="//label[@for = 'chk_11']")
public static WebElement chk_ldOtherLoan;
@FindBy(xpath="//label[@for = 'chk_12']")
public static WebElement chk_ldTrust;
@FindBy(xpath="//label[@for = 'chk_13']")
public static WebElement chk_ldUITF;
@FindBy(xpath="//label[@for = 'chk_14']")
public static WebElement chk_ldBanca;
@FindBy(xpath="//label[@for = 'chk_15']")
public static WebElement chk_ldTreasury;



//Non individual
@FindBy(name="cust_494")
public static WebElement ent_ldCompanyName;

@FindBy(name="cust_1261")
public static WebElement sel_ldInterestedIn;



}


