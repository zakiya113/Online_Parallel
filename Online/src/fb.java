import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class fb {

 @Test
 public void testCase1() {
  System.out.println("This is the Test Case 1");
  
  System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	   
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anam123khan@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123anam");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.ENTER);
	
 }

 
}