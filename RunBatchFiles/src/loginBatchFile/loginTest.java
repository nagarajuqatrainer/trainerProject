package loginBatchFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTest {
  
	public WebDriver driver;
	
	@Test
  public void verifyLogins() throws Exception {
		
		//How to run batch files using jenkins
		
		//selenium jar files
		//If i want to create batch file
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String acturl = driver.getCurrentUrl();
		String expurl = "https://www.mycontactform.com/";
		if(acturl.equals(expurl)) {
			System.out.println("url verified");
		}
		else
		{
			System.out.println("Does not verified");
		}
		
		driver.findElement(By.name("user")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("tester1");
		driver.findElement(By.name("btnSubmit")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
  }
}
