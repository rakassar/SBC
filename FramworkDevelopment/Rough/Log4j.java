package Rough;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
 

public class Log4j {
	
	private static final Logger log = LogManager.getLogger(Rough.Log4j.class);
	
  public static void main(String[] args) {
	  
	  
    log.info("Initializing ExampleLog4j application");
   
    log.error("Did it again!");
    
    log.trace("Exiting application.");
    
    log.debug("Sample debug message");  
    log.info("Sample info message");  
    log.warn("Sample warn message");  
    log.error("Sample error message");  
    log.fatal("Sample fatal message");  
    
  }	
  

}