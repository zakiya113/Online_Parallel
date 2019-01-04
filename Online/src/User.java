import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class User {

    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new ChromeDriver();
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver.manage().window().maximize();
	
		driver.get("http://real-estate.itechscripts.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		// Login
				driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div[1]/ul/li[1]/a")).click();
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
			//Enter User E-mail Address	
				driver.findElement(By.xpath("//*[@id='login_username']")).clear();
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
				driver.findElement(By.xpath("//*[@id='login_username']")).sendKeys("userdemo@yourmail.com");
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;	
		//Password
				driver.findElement(By.xpath("//*[@id='login_password']")).clear();
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
				driver.findElement(By.xpath("//*[@id='login_password']")).sendKeys("userdemo");
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
		//button
				driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[2]/form/button")).click();
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
				
		//Alert
				Thread.sleep(5000);
				driver.switchTo().alert().dismiss();
				
				//Contract
				//Drop down
				 driver.findElement(By.xpath("//button[@title='Contract']")).click();
				 driver.findElement(By.xpath("html/body/div[2]/div/ul/li[3]/a")).click();
				 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
				 //Type
				//Drop down
				 driver.findElement(By.xpath("//button[@title='Type']")).click();
				 driver.findElement(By.xpath("html/body/div[3]/div/ul/li[2]/a/span")).click();
				 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
				 //Any Country
				//Drop down
				 driver.findElement(By.xpath("//button[@title='Any Country']")).click();
				 driver.findElement(By.xpath("html/body/div[4]/div/ul/li[2]/a")).click();
				 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
				 //Any City
				//Drop down
				 driver.findElement(By.xpath("//button[@title='Any City']")).click();
				 driver.findElement(By.xpath(".//*[@id='city']/option[2]")).click();
				 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
				 //Advance Search
				 driver.findElement(By.xpath("//*[@id='ads-trigger']")).click();
				 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
				//Min Price
				driver.findElement(By.xpath("//*[@id='min_price']")).clear();
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
				driver.findElement(By.xpath("//*[@id='min_price']")).sendKeys("1");
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
				
				//Max Price
				driver.findElement(By.xpath("//*[@id='max_price']")).clear();
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
				driver.findElement(By.xpath("//*[@id='max_price']")).sendKeys("25000");
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
				
				//Search
				driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div/div/form/div/div[1]/div[5]/button")).click();
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
				
				//Worli
				driver.findElement(By.xpath("//a[contains(text(),'Worli')]")).click();
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
				//scroll down
				JavascriptExecutor js1=(JavascriptExecutor)driver;
				js1.executeScript("window.scrollBy(300,500)");
				System.out.println("scrolled Down");
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
				
				//Contact Agent
				driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right btn-sm']")).click();
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
				//Demo Agent
				//scroll down
				JavascriptExecutor js11=(JavascriptExecutor)driver;
				js11.executeScript("window.scrollBy(200,500)");
				System.out.println("scrolled Down");
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
				
				//submit		
				driver.findElement(By.xpath(".//*[@id='content']/div/div/div[1]/div[1]/div[2]/div[2]/div/form/button")).click();
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
				//Scroll up
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,2500)");
				System.out.println("scrolled Down");
				Thread.sleep(5000);
				
				js.executeScript("window.scrollBy(2500,-2500)");
				System.out.println("scrolled up");

				//Logout
				//Drop down
				driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div[1]/ul/li/a")).click();
				driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div[1]/ul/li/ul/li[3]/a")).click();
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
				
				
    }
}