package crm.mhc.pages.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CaseStagePageObject extends LoginPageObject{
	
public CaseStagePageObject (WebDriver driver)

{
	super(driver);
	
}


//***********End*************Fill the Info Stage1 process case Journey*****************************-------------//



@FindBy(name="cust_878")
public static WebElement fill_DetailsInConcern;


@FindBy(name="cust_1896")
public static WebElement ComputationRequest;

@FindBy(name="cust_471")
public static WebElement fill_Remarks;

@FindBy(name="cust_996")
public static WebElement sel_SpecialCondition;


@FindBy(name="cust_870")
public static WebElement ent_ReasonforTagging;

@FindBy(name="cust_1649")
public static WebElement sel_action;


@FindBy(xpath="//a[@data-autoid='FlowNext']") 
public static WebElement clk_NextOnCasePage;

@FindBy(xpath="//div[contains(@id,'newobject')]//div/span[contains(@data-autoid,'CASE_NUMBER_ctrl')]")
public static WebElement caseIDCreated;




@FindBy(className="icon-service")
public static WebElement clk_Casequicklink;

//@FindBy(xpath="/html/body/div[2]/div[1]/div/ul/li[4]/div/div[2]/ul/li[1]/a/span")

@FindBy(css="span[title='Cases']")
public static WebElement clk_Caseobject;

@FindBy(name="QueryCategoryId")
public static WebElement clk_caseobject3;

/*
 * @FindBy(xpath="//*[@id=\\\"js-vnav\\\"]/li[2]/div/div[1]/a[1]") 
 * public static WebElement clk_caseobject4;
 */

//@FindBy(name="QueryViewId") 

@FindBy(css="select[name='QueryViewId']") 

//@FindBy(xpath="//select[@name='QueryViewId']") 
public static WebElement clk_selectview;

@FindBy(xpath="//option[@value='55']")
public static WebElement clk_selectrecord ;

@FindBy(xpath="//a[@class='filterGroup__button acid-btn acid-btn--outline-brand']")
public static WebElement clk_arrorw ;

@FindBy(xpath="//div[contains(@data-autoid,'CAS_EX1_147')]")
public static List<WebElement> clk_caseID ;

@FindBy(css=".react-grid-Cell.react-grid-Cell--frozen.rdg-last--frozen")
public static WebElement Slk_caseID ;

@FindBy(xpath="//label[@for='checkbox0']")
public static WebElement clk_selectcase ;

@FindBy(xpath="//i[@title='Self Assign Cases']")
public static WebElement clk_selfassigncase ;

@FindBy(xpath="//button[normalize-space()='Ok']")
public static WebElement clk_okbutton ;

@FindBy(xpath="//option[@value='56']")
public static WebElement clk_selectmycaseview_56 ;



@FindBy(xpath="//option[@value='220']")
public static WebElement clk_selectmycaseview_220 ;

@FindBy(css="[data-autoid='CaseID_0']")
 public static WebElement clk_selectthecase ;

@FindBy(xpath="//i[@class='icon icon-edit']")
public static WebElement clk_editthecase ;

@FindBy(xpath="//select[@name='cust_512']")
public static WebElement clk_dropdownacceptvalue ;

@FindBy(xpath="//select[@name='cust_513']")
public static WebElement clk_RRdropdownacceptvalue ;

@FindBy(xpath="//select[@name='cust_513']")
public static WebElement clk_dropdownreversevalue ;


@FindBy(xpath="//textarea[@placeholder='Please post your comments here']")
public static WebElement clk_RemarksbyProcessor ;




@FindBy(name="cust_2794")
public static WebElement sel_ReportedSystem;
@FindBy(name="cust_2804")
public static WebElement txt_EmployeeInvolved ;
@FindBy(name="cust_2805")
public static WebElement txt_UnitGroup ;
@FindBy(name="cust_2806")
public static WebElement txt_Employeeoutsource ;
@FindBy(name="cust_2807")
public static WebElement txt_Position ;
@FindBy(name="cust_2808")
public static WebElement txt_ActionTaken ;
@FindBy(name="cust_2809")
public static WebElement txt_OtherAction;


@FindBy(name="cust_1576")
public static WebElement txt_SourceAccountNumber;

@FindBy(name="cust_1577")
public static WebElement txt_DestinatuionAccountNumber;

@FindBy(name="cust_2801")
public static WebElement Sel_ValidityTagging;

@FindBy(name="cust_2059")
public static WebElement Sel_TaxExemptionStatus;

@FindBy(name="cust_2713")
public static WebElement Sel_UpdateCRRSC;

@FindBy(name="cust_1673")
public static WebElement sel_ContactInformationactipntype;


@FindBy(name="cust_723")
public static WebElement sel_CustomerType;
@FindBy(name="cust_1817")
public static WebElement pic_Country;
@FindBy(name="cust_1674")
public static WebElement ent_HouseNumber;
@FindBy(name="cust_1675")
public static WebElement ent_Street;
@FindBy(name="cust_1687")
public static WebElement ent_Mobile;
@FindBy(name="cust_2371")
public static WebElement sel_forEmployment;

@FindBy(name="cust_670")
public static WebElement sel_TypeofRequest
;





}


