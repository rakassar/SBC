/**
 * 
 */
package Rough;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

//import graphql.language.Argument;

/**
 * @author Ashish Singh
 *
 */
public class Ashish_EtbJourney 
{

	
	@Test
	public void individualEtbJourney() throws InterruptedException
	{
		
		String baseUrl="https://sbcdev.crmnext.com/accg7/app/login/login";
		String driverPath="D:\\Rizwan\\Automation\\lib\\chromedriver.exe";	
		String uname="100082";
		String pwd="acid_qa";
		String expectedTitle="CRMnext - Smart.Easy.Complete";
		String actualLeadUrl="https://sbcdev.crmnext.biz/sn/app/CRMNextObject/Home/Lead";
		String bbn="46300000798";
		String bbnXpath="//*[@id=\"objectWrapper\"]/div/div[1]/div/div/div[3]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div/input";
		String bbnSearchNextButton="//*[@id=\"object-action-button\"]/div/a[1]";
		String clickBBNlink="//*[@id=\"newobject\"]/div[2]/div/div/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div/div/div/div[1]/div/div/span/a/span";
		String startETBjourneybutton="//*[@id=\"newobject\"]/div[3]/div/div";
		String startyourjourneybutton="//*[@id=\"newobject\"]/div[3]/div[2]/div[2]/div/a[1]/i";
		String leadRatingxpath="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div/div/div[2]/div[5]/div[1]/div/div/div/div/div/select";
		String etbleadCreationPageOneNextButton="//*[@id=\"object-action-button\"]/div/a";
		String productCategoryXpath="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div[7]/div[1]/div/div/div/div/div/select";
		String productXpath="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div[7]/div[2]/div/div/div/div/div/select";
		String etbleadCreationPageTwoNextButton="//*[@id=\"object-action-button\"]/div/a[2]";
		String ActualleadDetailPageTitle="Individual Onboarding";
		String IgnoreandCrearebtn="/html/body/div[3]/div/div/div[2]/button[1]";
		String clickCustomActionButtonOnLeadDeailPage="//*[@id=\"newobject\"]/div[3]/div/div";
		String editLeadDetailPage="//*[@id=\"newobject\"]/div[3]/div[2]/div[2]/div/a[1]";
		String appointmentRibbon="//*[@id=\"1\"]";
		String appointmentCalender="//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div[3]/div[2]/div/div/div/div[1]/div/div/a[1]";
	//	String appointmentSelectTime2="//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div[3]/div[2]/div/div/div/div[2]/div/div/div/div/div/ul/li[7]";
		String saveAndProceedButtonOnLead="//*[@id=\"object-action-button\"]/div/a[2]/span";
		String appointmentSelectTime1= "//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div[3]/div[2]/div/div/div/div[2]/div/div/div/input";
		String appointmentSelectTime2="//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div[3]/div[2]/div/div/div/div[2]/div/div/div/input";
		String documentCollectionRibbon="//*[@id=\"2\"]";
		String IssoleOwner="//select[@name='cust_162']";
		String businessPath="//input[@name='cust_494']";
		String TIN="//input[@name='cust_86']";
		String primaryIDField="//body[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]";
		String searchPrimaryID="//input[@name='Grid_SearchTextBox']";
		String searchprimaryIDbutton="//a[contains(@class,'filterGroup__button')]//i[contains(@class,'icon icon-arrow-right2')]";
		String selectSearchedPrimaryID="//div[@value=\"Driver's License\"]";
		String driveringLicense="//input[contains(@name,'cust_90')]";
		String editCRRSC="//div[@class='overlay-button-list']//i[@class='icon icon icon-screenflow']";
		String IsCustomerIncludedinBenefactor="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/select";
		String IsCustomerIncludedinBackWatchlistOne="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div/div/select";
		String IsCustomerIncludedinBackWatchlistTwo="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[2]/div/div[2]/div[3]/div[1]/div/div/div/div/div/select";
		String IsCustomerBenefactorHPI="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[2]/div/div[2]/div[4]/div[1]/div/div/div/div/div/select";
		String IsCustomerBenefactorOFW="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[2]/div/div[2]/div[5]/div[1]/div/div/div/div/div/select";
		String isCustomerForeignNational="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[3]/div/div/div/div[1]/div/div/div/div/div/select";
		String isCustomerOpenNumberedAccount="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[4]/div/div/div/div[1]/div/div/div/div/div/select";
		String employmentTypeCRRSC="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[5]/div/div[2]/div/div[1]/div/div/div/div/div/select";
		String searchIndustryCRRSC="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[6]/div/div/div[1]/div[1]/div/div/div/div/a";
		String searchIndustrybyenteringTextCRRSC="/html/body/div[3]/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/input";
		String searchInductrybuttonCRRSC="/html/body/div[3]/div/div/div/div/div/div/div/div[1]/div/div[1]/div/a/i";
		String selectIndustryCRRSCfromlist="/html/body/div[3]/div/div/div/div/div/div/div/div[3]/div[1]/div/div/div[2]/div/div/div/div/div/div[1]/div/div/span/div";
		String riskAssociatedafterIndustrySelection="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[6]/div/div/div[2]/div[1]/div/div/div/div/div/select";
		String isSheOwnerinManager="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[6]/div/div/div[3]/div[1]/div/div/div/div/div/select";
		String isSheDirectDealingwithClient="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[6]/div/div/div[4]/div[1]/div/div/div/div/div/select";
		String searchCityResidence="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[7]/div/div[2]/div[1]/div[1]/div/div/div/div/a";
		String searchCityOfResidenceElement="/html/body/div[3]/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/input";		
		String searchCityResidenceButton="/html/body/div[3]/div/div/div/div/div/div/div/div[1]/div/div[1]/div/a";
		String searchedCityResidence="/html/body/div[3]/div/div/div/div/div/div/div/div[3]/div[1]/div/div/div[2]/div/div/div/div/div/div[1]/div/div/span/div";
		String isCustomerResidingInsameVicinity="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[7]/div/div[2]/div[3]/div[1]/div/div/div/div/div/select";
		String isInitialDepositCRRSC="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[8]/div/div[2]/div[1]/div[1]/div/div/div/div/div/select";
		String areThereExpectedInward="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[8]/div/div[2]/div[2]/div[1]/div/div/div/div/div/select";		
		String isItAlignedWithCustomerDecision="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[8]/div/div[2]/div[3]/div[1]/div/div/div/div/div/select";
		String areYouComfortableWithCustomerInfo="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[8]/div/div[2]/div[4]/div[1]/div/div/div/div/div/select";
		String areYouComfortableWithCustomerDoc="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[8]/div/div[2]/div[5]/div[1]/div/div/div/div/div/select";
		String CRRSCRemarks="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[9]/div/div[2]/div/div/div/div/div[1]/textarea";
		String crrscFinishButton="//*[@id=\"object-action-button\"]/div/a";
		String fillAccountInfoButton="//*[@id=\"newobject\"]/div[3]/div[2]/div[2]/div/a[1]/i";
		String requestType="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div[6]/div[1]/div/div/div/div/div/select";
		String pureposeOfAccountOpening="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div[9]/div[1]/div/div/div/div/div/select";
		String adbRequired="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[2]/div/div[2]/div[3]/div[1]/div/div/div/input";
		String productPromoEmail="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[4]/div/div[2]/div[1]/div[1]/div/div/div/div/div/select";
		String productPromoSms="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[4]/div/div[2]/div[1]/div[2]/div/div/div/div/div/select";
		String transactionalEmail="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[4]/div/div[2]/div[2]/div[1]/div/div/div/div/div/select";
		String transactionalSms="//*[@id=\"newobject\"]/div/div[2]/div/div/div[3]/div/div[4]/div/div[2]/div[2]/div[2]/div/div/div/div/div/select";
		String finishAccountInfo="//*[@id=\"object-action-button\"]/div/a";
		String processApplication="//*[@id=\"newobject\"]/div[3]/div[2]/div[2]/div/a[2]/i";
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();

	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//System.out.println("Browser launch successfully and App is also launched");
		Reporter.log("Browser launch successfully and App is also launched");
		driver.findElement(By.xpath("//input[@id='TxtName']")).sendKeys(uname);
		driver.findElement(By.xpath("//*[@id=\"TxtPassword\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"registration\"]/input")).click();
		Thread.sleep(5000);
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title is:" +actualTitle);
		Thread.sleep(2000);
		//Assert.assertEquals(actualTitle, expectedTitle);
		if((actualTitle).equalsIgnoreCase(expectedTitle))
		{
			Thread.sleep(2000);
			System.out.println("Login Successfully");
			
		}
		else
			
		{
		System.out.println("Unable to login into the application");	
		}		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"js-vnav\"]/li[2]/div/div/a/i"));
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		
		WebElement ele2=driver.findElement(By.xpath("//*[@id=\"js-vnav\"]/li[2]/div/div/div/ul/li[1]"));
		action.moveToElement(ele2).perform();
		ele2.click();
		Thread.sleep(2000);
		String expectedLeadUrl=driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println("Lead Current Url is: "+expectedLeadUrl);
		Thread.sleep(2000);
		if((expectedLeadUrl).equalsIgnoreCase(actualLeadUrl))
				{
			System.out.println("successfully redirected to Lead Home Page");
				}
		else
		{
			System.out.println("Unable to Open Lead Home Page");
		}
		String mainjourneyWindow=driver.getWindowHandle();
		 System.out.println("Main Window:" +mainjourneyWindow);
		driver.findElement(By.xpath("//div[@class='fixed-stack-button']")).click();
	Thread.sleep(2000);
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='overlay-button-list']//i[@title='Sales Journey']")).click();
	Thread.sleep(2000);
       
        Set <String> allwindows=driver.getWindowHandles();
        Iterator<String> i=allwindows.iterator();
        
        while(i.hasNext())
        {
        	String childWindow=i.next();
        	if(!(childWindow).equalsIgnoreCase(mainjourneyWindow))
        	{
        		driver.switchTo().window(childWindow);
        		System.out.println("Successfully switch to:" +childWindow);
        		WebElement childwin=driver.findElement(By.xpath("/html/body/div/div[3]/div/div[1]"));
        		childwin.click();
        				Thread.sleep(2000);
        			//	driver.switchTo().parentFrame();
        	}
        	
        }
        driver.switchTo().window(mainjourneyWindow);
        Thread.sleep(5000);
       WebElement el2= driver.findElement(By.xpath(bbnXpath));
       el2.click();
       el2.sendKeys(bbn);
        driver.findElement(By.xpath(bbnSearchNextButton)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(clickBBNlink)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(startETBjourneybutton)).click();
        Thread.sleep(2000);
        String secondMainWindow=driver.getWindowHandle();
        System.out.println("Second Main Window:" +secondMainWindow);
       
        driver.findElement(By.xpath(startyourjourneybutton)).click();
        Thread.sleep(2000);
        Set<String> multiplewindows=driver.getWindowHandles();
        Iterator<String> anotherchildwindow=multiplewindows.iterator();
        
        while(anotherchildwindow.hasNext())
        {
        	String childsec=anotherchildwindow.next();
        	if(!(secondMainWindow).equalsIgnoreCase(childsec))
        			{
        		driver.switchTo().window(childsec);
        		WebElement startETblead=driver.findElement(By.xpath("//*[@id=\"1\"]"));
        				startETblead.click();
        				//Thread.sleep(2000);
        			}
        }
        driver.switchTo().window(secondMainWindow);
        Thread.sleep(2000);
        Select leadRating=new Select(driver.findElement(By.xpath(leadRatingxpath)));
        		leadRating.selectByVisibleText("Hot");
        		Thread.sleep(5000);
        		
        		driver.findElement(By.xpath(etbleadCreationPageOneNextButton)).click();
        		Thread.sleep(2000);
        		
        Select productCategory=new Select(driver.findElement(By.xpath(productCategoryXpath)));
        productCategory.selectByVisibleText("Savings");
        
        Select product=new Select(driver.findElement(By.xpath(productXpath)));
        product.selectByIndex(2);
        
        WebElement pg2nxtbutton=driver.findElement(By.xpath(etbleadCreationPageTwoNextButton));
        pg2nxtbutton.click();
        
   /*  String thirdmainwindow=driver.getWindowHandle();
        System.out.println("Third Window is:" +thirdmainwindow);
        Set<String> againfinalwin=driver.getWindowHandles();
        Iterator<String> onceagainchildwindow=againfinalwin.iterator();
        
        while(onceagainchildwindow.hasNext())
        {
        	String childthird=onceagainchildwindow.next();
        	if(!(thirdmainwindow).equalsIgnoreCase(childthird))
        			{
        		driver.switchTo().window(childthird);
        		WebElement IgnoreandCreateButton=driver.findElement(By.xpath(IgnoreandCrearebtn));
        		IgnoreandCreateButton.click();
        		
        				//Thread.sleep(2000);
        			}
        }
        driver.switchTo().window(thirdmainwindow);*/
       
        WebElement IgnoreandCreateButton=driver.findElement(By.xpath(IgnoreandCrearebtn));
		IgnoreandCreateButton.click();
        Thread.sleep(2000);
        String expectedLeadDetailPageTitle=driver.getTitle();
        System.out.println("Expected Title:"+expectedLeadDetailPageTitle);
        if((ActualleadDetailPageTitle).equalsIgnoreCase(expectedLeadDetailPageTitle))
        {
        	System.out.println("Lead Created Successfully");
        	/*WebElement getLeadID=driver.findElement(By.xpath("//*[@id=\"objectWrapper\"]/div/div[3]/div[1]/div/div/div/span"));
        	String leadID=getLeadID.getText();
        	System.out.println("Lead ID is:"+leadID);*/
        }
        
        WebElement getLeadID=driver.findElement(By.xpath("//*[@id=\"objectWrapper\"]/div/div[3]/div[1]/div/div/div/span"));
    	String leadID=getLeadID.getText();
    	System.out.println("Lead ID is:"+leadID);
        Thread.sleep(2000);
        driver.findElement(By.xpath(clickCustomActionButtonOnLeadDeailPage)).click();
        driver.findElement(By.xpath(editLeadDetailPage)).click();
        driver.findElement(By.xpath(appointmentRibbon)).click();
        driver.findElement(By.xpath(appointmentCalender)).click();
       // Select selectTime= new Select(driver.findElement(By.xpath(appointmentSelectTime)));
        //selectTime.selectByValue("20");
        driver.findElement(By.xpath(appointmentSelectTime1)).click();
        Thread.sleep(2000);
       /* JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement appointmentTimeScroller=driver.findElement(By.xpath("//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div[3]/div[2]/div/div/div/div[2]/div/div/div/div/div"));
        js.executeScript("arguments[0].scrollIntoView();", appointmentTimeScroller);
        Thread.sleep(2000);*/
       WebElement selectTimeWebelement= driver.findElement(By.xpath(appointmentSelectTime2));
      selectTimeWebelement.sendKeys("11:50 PM");
      // selectTimeWebelement.click();
        driver.findElement(By.xpath(saveAndProceedButtonOnLead)).click();        
        driver.findElement(By.xpath(clickCustomActionButtonOnLeadDeailPage)).click();
        driver.findElement(By.xpath(editLeadDetailPage)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(documentCollectionRibbon)).click();
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
       // WebElement appointmentTimeScroller=driver.findElement(By.xpath("//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div[3]/div[2]/div/div/div/div[2]/div/div/div/div/div"));
        js.executeScript("window.scrollBy(0,1000)","");
        Thread.sleep(2000);
        Select isSoleOwnwer= new Select( driver.findElement(By.xpath(IssoleOwner)));
      //  driver.findElement(By.xpath(IssoleOwner)).click();
        
        isSoleOwnwer.selectByVisibleText("Yes");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)","");
        WebElement businessName=driver.findElement(By.xpath(businessPath));
        businessName.sendKeys("CRMNEXT");
        
        Select isemployment= new Select(driver.findElement(By.name("cust_2353")));
        isemployment.selectByIndex(2);
        Thread.sleep(2000);
        //boolean tinPresentNow=driver.findElement(By.)
        
        driver.findElement(By.xpath(TIN)).sendKeys("73667286286");
        
        driver.findElement(By.xpath(primaryIDField)).click();
        driver.findElement(By.xpath(searchPrimaryID)).sendKeys("Driver");
        driver.findElement(By.xpath(searchprimaryIDbutton)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(selectSearchedPrimaryID)).click();
        driver.findElement(By.xpath(driveringLicense)).sendKeys("76757664765");
        driver.findElement(By.xpath(saveAndProceedButtonOnLead)).click();  
        driver.findElement(By.xpath(clickCustomActionButtonOnLeadDeailPage)).click();
        driver.findElement(By.xpath(editCRRSC)).click();
        
        Select isCustomerBenefactorInOFAC = new Select(driver.findElement(By.xpath(IsCustomerIncludedinBenefactor)));
        isCustomerBenefactorInOFAC.selectByVisibleText("No");
        
        Select isCustomerinBankWatchlistOne = new Select(driver.findElement(By.xpath(IsCustomerIncludedinBackWatchlistOne)));
        isCustomerinBankWatchlistOne.selectByVisibleText("No");
        
        Select isCustomerinBankWatchlistTwo = new Select(driver.findElement(By.xpath(IsCustomerIncludedinBackWatchlistTwo)));
        isCustomerinBankWatchlistTwo.selectByVisibleText("No");
        js.executeScript("window.scrollBy(0,510)","");
        
        Select isCustomerBenefatcorHPI = new Select(driver.findElement(By.xpath(IsCustomerBenefactorHPI)));
        isCustomerBenefatcorHPI.selectByVisibleText("No");
        
        Select isCustomerBenefatcorOFW = new Select(driver.findElement(By.xpath(IsCustomerBenefactorOFW)));
        isCustomerBenefatcorOFW.selectByVisibleText("No");
        
        Select isCustomerForeignNationals = new Select(driver.findElement(By.xpath(isCustomerForeignNational)));
        isCustomerForeignNationals.selectByVisibleText("No");
        
        Select isCustomerNumberAcc = new Select(driver.findElement(By.xpath(isCustomerOpenNumberedAccount)));
        isCustomerNumberAcc.selectByVisibleText("No");
        
        Select isEmploeymetType = new Select(driver.findElement(By.xpath(employmentTypeCRRSC)));
        isEmploeymetType.selectByVisibleText("Employed");
        
        js.executeScript("window.scrollBy(0,500)",""); 
        
        driver.findElement(By.xpath(searchIndustryCRRSC)).click();
       WebElement searchIndustryElement= driver.findElement(By.xpath(searchIndustrybyenteringTextCRRSC));
       searchIndustryElement.sendKeys("INTELLECTUAL PROPERTY RESEARCH AND DOCUMENTATION ACTIVITIES");
       
       driver.findElement(By.xpath(searchInductrybuttonCRRSC)).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath(selectIndustryCRRSCfromlist)).click();
       
       WebElement riskassociated=driver.findElement(By.xpath(riskAssociatedafterIndustrySelection));
       //riskassociated.getText();
       System.out.println("Risk After Industry Selection Was:"+riskassociated.getText());
       
       Select isSHEMangerial = new Select(driver.findElement(By.xpath(isSheOwnerinManager)));
       isSHEMangerial.selectByVisibleText("No");
       
       Select isSHEDirectDealwithClient = new Select(driver.findElement(By.xpath(isSheDirectDealingwithClient)));
       isSHEDirectDealwithClient.selectByVisibleText("No");
      
       js.executeScript("window.scrollBy(0,300)",""); 
	//driver.quit();
        
       driver.findElement(By.xpath(searchCityResidence)).click();
       WebElement searchCityOfResidenceElement1= driver.findElement(By.xpath(searchCityOfResidenceElement));
       searchCityOfResidenceElement1.sendKeys("Aborlan");
       
       driver.findElement(By.xpath(searchCityResidenceButton)).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath(searchedCityResidence)).click();
      

       Select isCustomerResidingInsameVicinitySelect = new Select(driver.findElement(By.xpath(isCustomerResidingInsameVicinity)));
       isCustomerResidingInsameVicinitySelect.selectByVisibleText("Yes");
      
       js.executeScript("window.scrollBy(0,300)","");
       
       Select isInitialDepositCRRSCSelect = new Select(driver.findElement(By.xpath(isInitialDepositCRRSC)));
       isInitialDepositCRRSCSelect.selectByVisibleText("Yes");
       
       Select areThereExpectedInwardSelect = new Select(driver.findElement(By.xpath(areThereExpectedInward)));
       areThereExpectedInwardSelect.selectByVisibleText("Yes");
       
       Thread.sleep(2000);
       
       Select isItAlignedWithCustomerDecisionSelect = new Select(driver.findElement(By.xpath(isItAlignedWithCustomerDecision)));
       isItAlignedWithCustomerDecisionSelect.selectByVisibleText("Yes");
       
       Select areYouComfortableWithCustomerInfoSelect = new Select(driver.findElement(By.xpath(areYouComfortableWithCustomerInfo)));
       areYouComfortableWithCustomerInfoSelect.selectByVisibleText("Yes");
       
       Select areYouComfortableWithCustomerDocSelect = new Select(driver.findElement(By.xpath(areYouComfortableWithCustomerDoc)));
       areYouComfortableWithCustomerDocSelect.selectByVisibleText("Yes");
       
      WebElement crrscRemark= driver.findElement(By.xpath(CRRSCRemarks));
      crrscRemark.sendKeys("Test Automated CRRSC Remarks");
      
       driver.findElement(By.xpath(crrscFinishButton)).click();
       System.out.println("CRRSC Done");
       
    driver.findElement(By.xpath(clickCustomActionButtonOnLeadDeailPage)).click();
       driver.findElement(By.xpath(editLeadDetailPage)).click();
       
       js.executeScript("window.scrollBy(0,300)","");
       
       
       driver.findElement(By.xpath(saveAndProceedButtonOnLead)).click(); 
       driver.findElement(By.xpath(clickCustomActionButtonOnLeadDeailPage)).click();
       driver.findElement(By.xpath(fillAccountInfoButton)).click();
       
       Select requestTypeSelect = new Select(driver.findElement(By.xpath(requestType)));
       requestTypeSelect.selectByVisibleText("EVERYDAY MASTERCARD DEBIT/ATM CARD");
       
       Select pureposeOfAccountOpeningSelect = new Select(driver.findElement(By.xpath(pureposeOfAccountOpening)));
       pureposeOfAccountOpeningSelect.selectByVisibleText("Business Transactions");
       
       js.executeScript("window.scrollBy(0,500)","");
       
       WebElement adbRequiredElement=driver.findElement(By.xpath(adbRequired));
       adbRequiredElement.sendKeys("1000");
       
       js.executeScript("window.scrollBy(0,500)","");
       
       Select productPromoEmailSelect = new Select(driver.findElement(By.xpath(productPromoEmail)));
       productPromoEmailSelect.selectByVisibleText("Yes");
       
       Select productPromoSmsSelect = new Select(driver.findElement(By.xpath(productPromoSms)));
       productPromoSmsSelect.selectByVisibleText("Yes");
       
       Select transactionalSmsSelect = new Select(driver.findElement(By.xpath(transactionalSms)));
       transactionalSmsSelect.selectByVisibleText("Yes"); 
       
       Select transactionalEmailSelect = new Select(driver.findElement(By.xpath(transactionalEmail)));
       transactionalEmailSelect.selectByVisibleText("Yes"); 
       
       
       driver.findElement(By.xpath(finishAccountInfo)).click();
       
       driver.findElement(By.xpath(clickCustomActionButtonOnLeadDeailPage)).click();
       driver.findElement(By.xpath(processApplication)).click();  
       
	}
}
