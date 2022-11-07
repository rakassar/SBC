package crm.mhc.pages.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


	public class FillAccountInformationPageObject extends LoginPageObject{
		
		public FillAccountInformationPageObject(WebDriver driver)
		
		{
			super(driver);
			// TODO Auto-generated constructor stub
		}

	
		@FindBy(xpath="//span[normalize-space()='Fill Account Information']")
		public static WebElement clk_FillAccountInformation;
		
		//Customer Customer Profile Section
		@FindBy(name="cust_1318")
		public static WebElement sel_RequestTypef;
		@FindBy(name="cust_497")
		public static WebElement sel_Purposeofaccountopening;
		@FindBy(css="input[type='tel']")
		public static WebElement ent_ADBRequired;
		
		@FindBy(name="cust_1185")
		public static WebElement sel_PromsEmail;
		@FindBy(name="cust_74")
		public static WebElement sel_PromsSMS;
		@FindBy(name="cust_85")
		public static WebElement sel_TransactionalEmail ;
		@FindBy(name="cust_107")
		public static WebElement sel_TransactionalSMS;
		
		
		
		
		

		
	}
