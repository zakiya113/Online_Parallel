import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class css {

    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new ChromeDriver();
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver.manage().window().maximize();
	
		driver.get("http://real-estate.itechscripts.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			    

	//Agent 
		driver.findElement(By.cssSelector(".sf-with-ul")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		
		// Enter Agent E-mail Address
		driver.findElement(By.xpath("//input[@id='login_email']")).clear();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("agentdemo@yourmail.com");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		//Password
			driver.findElement(By.xpath("//input[@id='login_password']")).clear();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("userdemo");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		
		//button
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		Thread.sleep(5000);
				
	//Mouse hover
		//Post Property free
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Post Property Free')]")).click();
		Thread.sleep(3000);

		//scroll down
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(300,500)");
		System.out.println("scrolled Down");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
 
		//Property info
		//Property For
		driver.findElement(By.xpath("//*[@id='post_prprty']/div[1]/div/button")).click();
		Thread.sleep(3000);
		//Rent
		driver.findElement(By.xpath("html/body/div[2]/div/ul/li[3]/a")).click();
		Thread.sleep(3000);
		
		//Select Property Type
		driver.findElement(By.xpath("//*[@id='property_type_div']/div/button")).click();
		Thread.sleep(3000);
		//Residential House
		driver.findElement(By.xpath("html/body/div[3]/div/ul/li[2]/a/span")).click();
		Thread.sleep(3000);
		
		//Select Country
		driver.findElement(By.xpath("//*[@id='post_prprty']/div[3]/div/button")).click();
		Thread.sleep(3000);
		//India
		driver.findElement(By.xpath("html/body/div[4]/div/ul/li[2]/a/span")).click();
		Thread.sleep(3000);
		
		//Select City
		driver.findElement(By.xpath("//*[@id='city']")).click();
		Thread.sleep(3000);
		//Mumbai
		driver.findElement(By.xpath("//*[@id='city']/option[2]")).click();
		Thread.sleep(3000);
		
		//Locality
		driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Worli");
		Thread.sleep(3000);
		
		//About
		driver.findElement(By.xpath("//*[@id='about']")).sendKeys("This is a Residential House located in Mumbai");
		Thread.sleep(3000);
		
				
	//Property Features
	//Select Bedrooms
	Select dropdown = new Select(driver.findElement(By.xpath("//*[@name='bedroom']")));
	dropdown.selectByIndex(2);
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
	
	//Select Bathrooms
	Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id='bathroom']")));
	dropdown1.selectByIndex(2);
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	//Select Balconies
	Select dropdown11 = new Select(driver.findElement(By.xpath(".//*[@id='belconies']")));
	dropdown11.selectByIndex(1);
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);	
	
	//Select Furnish Status
	Select dropdown111 = new Select(driver.findElement(By.xpath("//*[@id='furns_stat']")));
	dropdown111.selectByIndex(2);
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	//Total Floor
	Select dropdown1111 = new Select(driver.findElement(By.xpath("//*[@id='totl_floor']")));
	dropdown1111.selectByIndex(6);
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	//Floor no.
	Select dropdown11111 = new Select(driver.findElement(By.xpath("//*[@id='floor_no']")));
	dropdown11111.selectByIndex(6);
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
	
		//Area
		//Coverd Area
		driver.findElement(By.xpath("//*[@placeholder='Covered Area']")).sendKeys("1200");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		//Select Unit
		driver.findElement(By.xpath("//*[@id='covered_area_unt']")).click();
		driver.findElement(By.xpath("//*[@id='covered_area_unt']/option[2]")).click();  
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
	
		//Plot Area
		driver.findElement(By.xpath("//*[@id='plot_area']")).sendKeys("1000");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		//Select Unit
		driver.findElement(By.xpath("//*[@id='plot_area_unt']")).click();
		driver.findElement(By.xpath("//*[@id='plot_area_unt']/option[2]")).click();  
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
	
	
		//Carpet Area
		driver.findElement(By.xpath("//*[@id='carpet_area']")).sendKeys("800");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		//Select Unit
		driver.findElement(By.xpath("//*[@id='carpet_area_unt']")).click();
		driver.findElement(By.xpath("//*[@id='carpet_area_unt']/option[2]")).click();  
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
	
		//Property Availability
		//Month and Year
		driver.findElement(By.xpath("//*[@id='availability']")).sendKeys("November,2018");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		//Age of Construction
		driver.findElement(By.xpath("//*[@id='constrctn_age']")).click();
		driver.findElement(By.xpath("//*[@id='constrctn_age']/option[7]")).click();  
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		
//Rent Details
//Monthly Rent
		driver.findElement(By.xpath("//*[@id='mnthly_rent']")).sendKeys("25000");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Security Amount
		driver.findElement(By.xpath("//*[@id='securty_amnt']")).sendKeys("2000");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Maintenance Charge per month
		driver.findElement(By.xpath("//*[@id='maintnc_chrg']")).sendKeys("2000");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
    
			//Add Photos and Videos
			//Upload
		WebElement upload=driver.findElement(By.xpath("//*[@id='app_photo']"));
		upload.sendKeys("E:\\House_image.jpg");
		driver.findElement(By.xpath(".//*[@id='ajax_frm']/input")).click();
		
	
		//Alert
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
	
	
    }
    
}
