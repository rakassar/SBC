package crm.mhc.common;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

public class Screenshot extends BrowserStart {
	
	  		
	    public void ScreenshotMethod(String process) 					
	    {		
	 
	    
	    File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    

      Date d = new Date();
      String FileName = process+d.toString().replace(":", "_").replace(" ", "_");
      
  
	    try {
	    	//FileUtils.copyFile(screenshotFile, new File("D:\\Rizwan\\Automation\\lib\\Pots\\"+Result.getName()+System.currentTimeMillis()+FileName+".png"));
			
	    	FileUtils.copyFile(screenshotFile, new File("D:\\Rizwan\\Automation\\lib\\Pots\\"+FileName+".png"));
		} 
	    
	    catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}