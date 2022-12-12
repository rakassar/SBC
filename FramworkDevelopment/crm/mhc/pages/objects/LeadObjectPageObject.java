package crm.mhc.pages.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadObjectPageObject extends LoginPageObject{
	
public LeadObjectPageObject (WebDriver driver)

{
	super(driver);
	
}

//quick link and OnBaording journey option
    @FindBy(id="1")
    public static WebElement clk_salesonbaordingjourney ;
    @FindBy(css="a[data-autoid='FlowNext']")
    public static WebElement clk_saveandproceed ;
    
	//process Application		
	@FindBy(xpath="//span[normalize-space()='Process Application']")
	public static WebElement clk_ProcessApplication;
    
	//process Application		
		@FindBy(xpath="//button[normalize-space()='Ok']")
		public static WebElement clk_closeProcessApplicationPopup;
	    
		@FindBy(xpath="//span[@title = 'CRRSC']")
		 public static WebElement clk_CRRSCtab ;
		
		@FindBy(xpath="//span[@title = 'Address']")
		 public static WebElement clk_Addresstab ;

	     @FindBy(xpath="//span[@title = 'Activities']")
		 public static WebElement clk_Activitiestab ;
	     
    
	     @FindBy(name="QueryCategoryId")
	     public static WebElement sel_leadView;
	    
	     
	     @FindBy(css="select[name='QueryViewId']") 
	   public static WebElement clk_selectview;
	     
	     @FindBy(xpath="//a[@class='filterGroup__button acid-btn acid-btn--outline-brand']")
	     public static WebElement clk_arrorw ;
	     
	     @FindBy(xpath="//label[@for='checkbox0']")
	     public static WebElement clk_selectlead ;
	     
	     @FindBy(css="[data-autoid='LeadID_0']")
	     public static WebElement clk_selectthelead ;
	     
	     @FindBy(xpath="//i[@title='Self Assign']")
	     public static WebElement clk_selfassignlead ;
    
    
    @FindBy(id="BTN_NEW")
    public static WebElement clk_plussign;
    @FindBy(xpath=".//*[@id='addvividScroll']/li[3]/a")
    public static WebElement link_SavingsandDeposits;
    @FindBy(xpath=".//*[@id='addvividScroll']/li[2]/a")
    public static WebElement link_CorporateLoan;
    @FindBy(xpath="//div[contains(@class,'closeBtn clearfix')]/div/ul/li[2]/a/span")
    public static WebElement btn_SaveandProceed;
    @FindBy(xpath="//div[starts-with(@class,'summarycard')]/div[1]/span")
    public static WebElement extra_Leadid;
    @FindBy(xpath="//div[contains(@class,'object-action-btn')]/ul/li[2]/a/span")
    public static WebElement btn_SaveandProceed_edit;
    
    
   //searching  functionality for lead
    @FindBy(id="lnkadvance")
    public static WebElement btn_Advancesearched;
    @FindBy(id="MobilePhone")
    public static WebElement btn_AdvancesearchedByMobilePhone;
    @FindBy(id="LeadID")
    public static WebElement btn_AdvancesearchedByLeadIDs;
    @FindBy(id="srchBtn")
    public static WebElement btn_Clickleadsearch;
    @FindBy(id="BTN_EDIT")
    public static WebElement btn_ClickOnEditButton;
    
    @FindBy(xpath="//span[normalize-space()='Update to 360']")
    public static WebElement btn_ClickOnUpdtButton;
    
    
    @FindBy(name="cust_2739")
    public static WebElement Sel_popupdt360;
    
   //update button
    @FindBy(xpath="//span[normalize-space()='Update']")
	public static WebElement clk_update360;
    
    //BM  approve button
    @FindBy(xpath="//span[normalize-space()='Approved']")
	public static WebElement clk_BmApproveBttn;
    
  //BM  comments box button
    @FindBy(name="LE_DESCRIPTION")
	public static WebElement clk_BmComments;
    
  
    
    
    
    
    
 }