package crm.mhc.pages.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObject extends LoginPageObject {

	public HomePageObject(WebDriver driver) 
	{
		super(driver);
		
	}
	
	//---create lead
     @FindBy(className="icon-link")
	 public static WebElement clk_leadpanesaleswidget ;
     
     @FindBy(xpath="//*[@id=\"QuickLinksDiv\"]/ul/li[4]/a")
	 public static WebElement clk_leadpanesalesjourney ;
     
   
     @FindBy(xpath="//span[text()='Loan Journey']")
	 public static WebElement clk_leadpaneLoanJourney ;
     
     
     @FindBy(className="icon-sales")
     public static WebElement clk_salesObject;
     
     @FindBy(css="span[title='Leads']")
     public static WebElement clk_leadobject;
     
     



     
     
     

     @FindBy(name="ProfileImage_header")
     public static WebElement Clk_CheckRole ;
     
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
     
     //case--
     
     
     @FindBy(xpath="//*[@id=\"QuickLinksDiv\"]/ul/li[5]/a")
  	 public static WebElement clk_leadpaneCasejourney ;
       
     
    }
