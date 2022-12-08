package crm.mhc.pages.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


	public class CRRSCLeadPageObject extends LoginPageObject{
		
		public CRRSCLeadPageObject(WebDriver driver)
		
		{
			super(driver);
			// TODO Auto-generated constructor stub
		}

	
        
		//Customer Customer Profile Section
		@FindBy(name="cust_1699")
		public static WebElement sel_AmlcUnJmf;
		@FindBy(name="cust_1700")
		public static WebElement sel_BankInternalChecklist;
		@FindBy(name="cust_1701")
		public static WebElement sel_AllegedPerdsonf;
		@FindBy(name="cust_1702")
		public static WebElement sel_HPIOrJoint;
		@FindBy(name="cust_1703")
		public static WebElement sel_BenifOFW;
		@FindBy(name="cust_2427")
		public static WebElement sel_ForeignNational;
		@FindBy(name="cust_1706")
		public static WebElement sel_NumberAccount;
		
		
		
		//Customer Details
		@FindBy(name="cust_1169")
		public static WebElement sel_EmploymentTypeCRRSC;

		@FindBy(name="cust_2444")
		public static WebElement sel_IndustryCRRSC;

		@FindBy(name="cust_2443")
		public static WebElement sel_EconmicactivityeCRRSC;

		@FindBy(name="cust_1708")
		public static WebElement sel_managerialCRRSC;

		@FindBy(name="cust_1709")
		public static WebElement sel_DirectDealingCRRSC;

		
		//Geographical risk

		@FindBy(name="cust_1520")
		public static WebElement sel_CityCRRSC;
		@FindBy(name="cust_1519")
		public static WebElement sel_ProvinceCRRSC;
		@FindBy(name="cust_1716")
		public static WebElement sel_RiskCRRSC;
		@FindBy(name="cust_1717")
		public static WebElement sel_vicinityRRSC;
		 
		//Special KYC Question
		@FindBy(name="cust_1720")
		public static WebElement sel_intialdepositeRRSC;
		@FindBy(name="cust_1721")
		public static WebElement sel_InwprdOutwordRRSC;

		@FindBy(name="cust_2032")
		public static WebElement sel_CCustomerDeclaredCRRSC;
		@FindBy(name="cust_1722")
		public static WebElement sel_ComfortableInformationRRSC;
		@FindBy(name="cust_1723")
		public static WebElement sel_ComfortableDocumentsRRSC;
		@FindBy(name="2032")
		public static WebElement sel_customersdeclaredsRRSC;
		
		
		//Remarks
		@FindBy(name="cust_2430")
		public static WebElement ent_RemarksRRSC;
		
		//finish		
		@FindBy(xpath="//span[normalize-space()='Finish']")
		public static WebElement clk_Finish;
		
				
		
	}
