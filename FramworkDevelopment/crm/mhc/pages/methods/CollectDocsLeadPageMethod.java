package crm.mhc.pages.methods;

import java.text.DecimalFormat;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import crm.mhc.pages.objects.CRRSCLeadPageObject;
import crm.mhc.pages.objects.CollectDocsLeadPageObject;

public class CollectDocsLeadPageMethod extends HomePageMethod{

	String SDmobilenumber;
	public static String leadid;
	public static String Employeetype;
	
//************************Fill the Info for new lead process*****************************-------------//
	
	
	public void CreatedNewLeadEdit()
	{

		CollectDocsLeadPageObject.clk_ldNewLeadEdit.click();
	
		
	}
		
	
	public void selectstatuscode()
	{

		CollectDocsLeadPageObject.clk_statuscodedocs.click();
	
	}
	

	
	public void Enteremail()
	{
		   
        Random r = new Random();
		 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		    final int N = 6;
		    StringBuilder sb = new StringBuilder();
		    for (int i = 0; i < N; i++) {
		        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
		    }
		    
		    
		    String lastname = sb.toString();
		    
		    final int M = 3;
		    StringBuilder sb1 = new StringBuilder();
		    for (int i = 0; i < M; i++) {
		        sb1.append(alphabet.charAt(r.nextInt(alphabet.length())));
		    }
		    
		    String lastname1 = sb1.toString();
		    
		    String email=lastname+"@"+lastname1+".com";
		    
		    CollectDocsLeadPageObject.ent_ldemail.sendKeys(email);
	}
	
		    
	public void dob(String mm,String dd,String yyyy)
    
    {
    	Select sel1=new Select(CollectDocsLeadPageObject.sel_dobmm);
    	//sel.selectByValue(Product);
    	sel1.selectByVisibleText(mm);
    	
    	Select sel2=new Select(CollectDocsLeadPageObject.sel_dobdd);
    	//sel.selectByValue(Product);
    	sel2.selectByVisibleText(dd);
    	
    	Select sel3=new Select(CollectDocsLeadPageObject.sel_dobyyyy);
    	//sel.selectByValue(Product);
    	sel3.selectByVisibleText(yyyy);
    	
    }
	
		    public void PlcaeOfBirth()
			{
				   
		    	Random r = new Random();
				 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

				    final int N = 6;
				    StringBuilder sb = new StringBuilder();
				    for (int i = 0; i < N; i++) {
				        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
				    }
				    String firstname = sb.toString();
				
				    
				    CollectDocsLeadPageObject.ent_ldplaceofbirth.sendKeys(firstname);
}
		    
		    
		    public void MaidanName()
			{
				   
		    	Random r = new Random();
				 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

				    final int N = 6;
				    StringBuilder sb = new StringBuilder();
				    for (int i = 0; i < N; i++) {
				        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
				    }
				    String firstname = sb.toString();
				
				    
				    CollectDocsLeadPageObject.ent_ldmaidanname.sendKeys(firstname);
				    }
              
		    public void Gender(String gender)
		    {
		    	Select sel=new Select(CollectDocsLeadPageObject.sel_ldgender);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(gender);
		    }
		    
		    
		    public void CustomerType(String CustomerType)
		    {
		    	Select sel=new Select(CollectDocsLeadPageObject.sel_ldcustomertype);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(CustomerType);
		    }
		    
		    public void CustomerContact(String customercontact)
		    {
		    	Select sel=new Select(CollectDocsLeadPageObject.sel_ldCustomerContact);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(customercontact);
		    }
		    
		    
		    public void CivilStatus(String cvlsts)
		    {
		    	Select sel=new Select(CollectDocsLeadPageObject.sel_ldCivilStaus);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(cvlsts);
		    }
		    
		    public void BusinnesSegment(String BussSegment)
		    {
		    	Select sel=new Select(CollectDocsLeadPageObject.sel_ldBusinessSegmentType);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(BussSegment);
		    }
		    public void ClientSegment(String clntsegment) throws InterruptedException
		    {
		    	WebElement clients= CollectDocsLeadPageObject.pic_ldclientsegment;
		    	clients.sendKeys(clntsegment);
				Thread.sleep(1000);
				clients.sendKeys(Keys.ARROW_DOWN);
				clients.sendKeys(Keys.ENTER);
		    
		    }
		    
		    public void SoleOwner(String soleowner)
		    
		    {
		    	Select sel=new Select(CollectDocsLeadPageObject.sel_ldSoleOwner);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(soleowner);
		    }
		    
            public void CustomerRelationship(String Relationship)
		    
		    {
		    	Select sel=new Select(CollectDocsLeadPageObject.sel_ldrelationshiptype);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(Relationship);
		    }
            public void OnlyBBNRequired(String Relationship)
		    
		    {
		    	Select sel=new Select(CollectDocsLeadPageObject.sel_ldOnlyBBNrequired);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(Relationship);
		    }
		    
		    public void Employeetype(String empytype)
		    {
		    	Select sel=new Select(CollectDocsLeadPageObject.sel_ldEmployeType);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(empytype);
		    }
		    
		    public void CheckEmployeetype()
		    {
		    	 Employeetype=CollectDocsLeadPageObject.sel_ldEmployeTypedetail.getText();

		    	System.out.println(Employeetype);
		    
		    	}
		    
		    
		    public void IncomeRange(String incomrange)
		    {
		    	Select sel=new Select(CollectDocsLeadPageObject.sel_ldIncomeRange);
		    	//sel.selectByValue(Product);
		    	sel.selectByVisibleText(incomrange);
		    }
		    
		    
		    public void Industry_Classification(String IndClsn) throws InterruptedException
		    {
		    	WebElement Industry_Classification = CollectDocsLeadPageObject.sel_ldIndustrialClassification;
				Industry_Classification.sendKeys(IndClsn);
				Thread.sleep(1000);
				Industry_Classification.sendKeys(Keys.DOWN);
				Thread.sleep(500);
				Industry_Classification.sendKeys(Keys.ENTER);
				Thread.sleep(500);
		    }
		    
		    public void NatureOfWork(String NTWORK) throws InterruptedException
		    {
		    	
		    	WebElement Nature_work  = CollectDocsLeadPageObject.sel_ldNatureWork;
		    	Thread.sleep(300);
		    	Nature_work .sendKeys(NTWORK);
		    	Thread.sleep(2000);
		    	Nature_work .sendKeys(Keys.DOWN);
		    	Thread.sleep(2000);
		    	Nature_work .sendKeys(Keys.ENTER);
		    	Thread.sleep(1000);
		    }
		    
		    public void NatureOfWorkNEW(String NTWORK) throws InterruptedException
		    {
		    	
		    	WebElement Nature_work  = CollectDocsLeadPageObject.sel_ldNatureWorkNEW;
		    	Thread.sleep(300);
		    	Nature_work .sendKeys(NTWORK);
		    	Thread.sleep(2000);
		    	Nature_work .sendKeys(Keys.DOWN);
		    	Thread.sleep(2000);
		    	Nature_work .sendKeys(Keys.ENTER);
		    	Thread.sleep(1000);
		    }
		    
		    public void occupation (String Occupation)
		    {
		    	Select sel = new Select(CollectDocsLeadPageObject.sel_ldOccupation);
		    	sel.selectByVisibleText(Occupation);
		
		    }
		    
		    public void forEmployment (String foremployment)
		    {
		    	Select sel = new Select(CollectDocsLeadPageObject.sel_ldForEmployment);
		    	sel.selectByVisibleText(foremployment);
		
		    }
		    
		    public void workingsince (String month,String year)
		    {
		    	Select sel1 = new Select(CollectDocsLeadPageObject.sel_ldWorkingSinceMonth);
		    	sel1.selectByVisibleText(month);
		    	Select sel2 = new Select(CollectDocsLeadPageObject.sel_ldWorkingSinceYear);
		    	sel2.selectByVisibleText(year);
		
		    }
	     

		    public void Sourceoffunds (String source)
		    {
		    	Select sel1 = new Select(CollectDocsLeadPageObject.sel_ldSourceForEmployment);
		    	sel1.selectByVisibleText(source);
		
		    }
		    
		    public void Tin(String tin)
		    {
		    	
	Random rand = new Random();
    int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
    int num2 = rand.nextInt(743);
    int num3 = rand.nextInt(10000);

    DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
    DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

    String mnumbername = df3.format(num1) + df3.format(num2)  + df4.format(num3);
    SDmobilenumber=mnumbername;
    CollectDocsLeadPageObject.ent_ldTin.sendKeys(mnumbername);
		
		    }
		    
		    public void employername()
		    {
		    	
		    	Random r = new Random();
				 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

				    final int N = 6;
				    StringBuilder sb = new StringBuilder();
				    for (int i = 0; i < N; i++) {
				        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
				    }
				    String firstname = sb.toString();
				
			    CollectDocsLeadPageObject.ent_ldemployerName.sendKeys(firstname);

		    }
		    
		    public void businessname()
		    {
		    	
		    	Random r = new Random();
				 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

				    final int N = 6;
				    StringBuilder sb = new StringBuilder();
				    for (int i = 0; i < N; i++) {
				        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
				    }
				    String firstname = sb.toString();
				
			    
			    CollectDocsLeadPageObject.ent_ldBusinessName.sendKeys(firstname);

		    }

		    public void IDPrrof (String IDPrrof) throws InterruptedException
		    {
		    	Thread.sleep(500);
		    	WebElement ID = CollectDocsLeadPageObject.pic_ldIdProof;
				ID.sendKeys(IDPrrof);
				Thread.sleep(2000);
				ID.sendKeys(Keys.DOWN);
				Thread.sleep(1000);
				ID.sendKeys(Keys.ENTER);
				Thread.sleep(1000);
		    	
		
		    }
		    public void IDNumner ()
		    {
		    		    	
		    	Random rand = new Random();
		        int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
		        int num2 = rand.nextInt(743);
		        int num3 = rand.nextInt(10000);

		        DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
		        DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

		        String mnumbername = df3.format(num1) + df3.format(num2)  + df4.format(num3);
		        SDmobilenumber=mnumbername;
		        CollectDocsLeadPageObject.ent_ldIDNo.sendKeys(mnumbername);
		
		    }
		    
		    public void AoCode(String aocode)
		    {
		    	Select sel1 = new Select(CollectDocsLeadPageObject.sel_ldAoCode);
		    	sel1.selectByVisibleText(aocode);
		
		    }
		
		
		    
		    public void ClickOnAddress()
		    {
		    	CollectDocsLeadPageObject.clk_ldAddressTab.click();
		
		    }
		    
		    public void streetfied()
		    {
		    	Random r = new Random();
				 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

				    final int N = 6;
				    StringBuilder sb = new StringBuilder();
				    for (int i = 0; i < N; i++) {
				        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
				    }
				    String lastname = sb.toString();
				    CollectDocsLeadPageObject.ent_ldStreet.sendKeys(lastname);

		    }
		    
		    
		    

		    public void PermanentAddresssameasPresentAddress(String padassameprad) throws InterruptedException
		    {
		    	Select sel1 = new Select(CollectDocsLeadPageObject.sel_ldperaddaspreadd);
		    	sel1.selectByVisibleText(padassameprad);
				
				
		    }
		    
		    
		    public void Zipcode(String Zipcode) throws InterruptedException
		    {
		    	WebElement zip = CollectDocsLeadPageObject.pic_ldZipCode;
				zip.sendKeys(Zipcode);
				Thread.sleep(1000);
				zip.sendKeys(Keys.DOWN);
				Thread.sleep(1000);
				zip.sendKeys(Keys.ENTER);
				
		    }
		    
		    
		    public void EconomicActivity(String economic) throws InterruptedException
		    {
		    	WebElement eco = CollectDocsLeadPageObject.pic_ldeconomicActivity;
		    	eco.sendKeys(economic);
		    	Thread.sleep(1000);
				eco.sendKeys(Keys.DOWN);
				Thread.sleep(700);
		    	eco.sendKeys(Keys.ENTER);
		    	Thread.sleep(1000);
		    	
				
		    }
		    
		    public void mailingaddress(String mailingaddress)
		    {
		    	Select sel1 = new Select(CollectDocsLeadPageObject.sel_ldMailingAddress);
		    	sel1.selectByVisibleText(mailingaddress);
		
		    }
		    
		    
		    
		    public void leadredbutton()
		    {
		    	CollectDocsLeadPageObject.btn_leadredbutton.click();
		    
		
		    }
		    
		    public void clickCRRSCButton()
			
			
		    {   
				/*
				 * JavascriptExecutor js = (JavascriptExecutor) driver;
				 * js.executeScript("window.scrollBy(0,250)", "");
				 *///driver.switchTo( ).alert( ).dismiss();
		    	CollectDocsLeadPageObject.clk_CRRSCBtn.click();
		    	
		    }
		    
		    public void clickaddScndryLeadButton()
			
			
		    {   
				/*
				 * JavascriptExecutor js = (JavascriptExecutor) driver;
				 * js.executeScript("window.scrollBy(0,250)", "");
				 *///driver.switchTo( ).alert( ).dismiss();
		    	CollectDocsLeadPageObject.clk_addScndryLeadButton.click();
		    	
		    }
		    
		    
              public void clickClosePopup()
			
			
		    {   
				
		    	CollectDocsLeadPageObject.clk_ClosePopup.click();
		    	
		    }
              
              
              
              public void clickEditOFAC(String ofac)
			
			
		    {   
				
            	Select sel1 = new Select(CollectDocsLeadPageObject.sel_Ofac);
  		    	sel1.selectByVisibleText(ofac);
  		
		    	
		    }
              
              //// Non individual fields
              public void CustomerCategory(String CustomerType)
  		    {
  		    	Select sel=new Select(CollectDocsLeadPageObject.sel_ldcustomerCategory);
  		    	//sel.selectByValue(Product);
  		    	sel.selectByVisibleText(CustomerType);
  		    }
              public void businessExpiry(String businessExpiry)
  			
  			
  		    {   
  				
  		    	CollectDocsLeadPageObject.clk_BusinessExpiry.sendKeys(businessExpiry);;
  		    	
  		    }
              public void TypeOfCorp(String TypeOfCorp)
    		    {
    		    	Select sel=new Select(CollectDocsLeadPageObject.sel_ldTypeOfCorp);
    		    	//sel.selectByValue(Product);
    		    	sel.selectByVisibleText(TypeOfCorp);
    		    }
              
              public void EntityType(String EntityType)
  		    {
  		    	Select sel=new Select(CollectDocsLeadPageObject.sel_ldEntityType);
  		    	//sel.selectByValue(Product);
  		    	sel.selectByVisibleText(EntityType);
  		    }
              public void CorporateDocumentPickerCLK() throws InterruptedException
    			
    			
    		    {   
            	  JavascriptExecutor js = (JavascriptExecutor) driver;
          		js.executeScript("window.scrollBy(0,1700)", "");
          		Thread.sleep(1000);
    				
    		    	CollectDocsLeadPageObject.sel_ldCorporateDocumentPickerCLK.click();;
    		    	
    		    }
              
              public void CorporateDocumentPickerCheck()
    			
    			
    		    {   
    				
    		    	CollectDocsLeadPageObject.sel_ldCorporateDocumentPickerCheck.click();;
    		    	
    		    }
              public void AddressTabNonindi()
  		    {
  		    	CollectDocsLeadPageObject.clk_ldAddressTabNonindi.click();
  		
  		    }
              public void streetfiedNonIndi()
  		    {
  		    	Random r = new Random();
  				 String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  				    final int N = 6;
  				    StringBuilder sb = new StringBuilder();
  				    for (int i = 0; i < N; i++) {
  				        sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
  				    }
  				    String lastname = sb.toString();
  				    CollectDocsLeadPageObject.ent_ldStreetNonIndi.sendKeys(lastname);

  		    }
              
              public void ZipcodeNonIndi(String Zipcode) throws InterruptedException
  		    {
  		    	WebElement zip = CollectDocsLeadPageObject.pic_ldZipCodeNonIndi;
  				zip.sendKeys(Zipcode);
  				Thread.sleep(1000);
  				zip.sendKeys(Keys.DOWN);
  				Thread.sleep(1000);
  				zip.sendKeys(Keys.ENTER);
  				
  		    }
              public void clickCRRSCButtonNonIndi()
  			
  			
  		    {   
  				/*
  				 * JavascriptExecutor js = (JavascriptExecutor) driver;
  				 * js.executeScript("window.scrollBy(0,250)", "");
  				 *///driver.switchTo( ).alert( ).dismiss();
  		    	CollectDocsLeadPageObject.clk_CRRSCBtnNonIndi.click();
  		    	
  		    }
              public void PlantAddresssameasOfficeAddress(String padassameprad) throws InterruptedException
  		    {
  		    	Select sel1 = new Select(CollectDocsLeadPageObject.sel_ldperaddaspreaddNonIndi);
  		    	sel1.selectByVisibleText(padassameprad);
  				
  				
  		    }
                
              
		    
}