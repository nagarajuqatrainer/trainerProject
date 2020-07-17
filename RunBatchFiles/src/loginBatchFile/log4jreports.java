package loginBatchFile;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class log4jreports {
  private static final Logger logger = Logger.getLogger(log4jreports.class);
 
	
	
 @Test
  public void reports() {
 
	 PropertyConfigurator.configure("./myFiles/log4j.properties");
	 logger.info("Selenium Training");
	 logger.info("Java Training");
	 logger.info("QTP Training");
	  
	  
  }
 
 
 
 
 
 
}
