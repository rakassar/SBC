package crm.mhc.pages.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExecutiveAssistantSalesObjects_ea_sales extends LoginPageObject {

	public ExecutiveAssistantSalesObjects_ea_sales(WebDriver driver) 
	{
		super(driver);
	}

		//***********Start*************Fill the Info for SD process*****************************-------------//
			
		@FindBy(id="LEA_EX2_47")
		public static WebElement sel_SDdocuments;
		
		@FindBy(xpath=".//*[@id='collap-on1_2']/div[14]/div[2]/div/div/a[1]/i")
		public static WebElement Clk_SDProofOfAddress;
		
		@FindBy(id="StorageIdConfigId")
		public static WebElement Sel_SDStorageIdConfigId;
		@FindBy(id="10060819_pickPhoto")
		//@FindBy(xpath=".//*[@id='10060819_pickPhoto']/i")
		public static WebElement Clk_SDImageUpload;
		
		
		
		@FindBy(xpath="//div[contains(@id,'10060819_thumbnaillist')]/div/img")
		public static WebElement Clk_SDImageUploadLoc;
		@FindBy(id="LEA_EX2_47")
		public static WebElement Clk_SDProofOfIdenity;
		
		@FindBy(id="LEA_EX2_47")
		public static WebElement Clk_SDBirthCertifcate;
	
		
}
