package Week7.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public ChromeDriver driver;
	  @Parameters({"url","username","password"})
		@BeforeMethod
	   public void PreCondtion(String url,String uname, String pwd){
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement eleUserName = driver .findElement(By.id("username"));
		eleUserName.sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();		
}

@AfterMethod
 public void PostCondition() {
   driver.close();
 }
}