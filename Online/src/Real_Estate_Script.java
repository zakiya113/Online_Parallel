import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Real_Estate_Script {
	
	WebDriver driver=new EdgeDriver();


	@BeforeTest
   
	public void Agent_Login() throws InterruptedException {
    	
		System.setProperty("webdriver.edge.driver", "‪C:\\MicrosoftWebDriver.exe");
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
		
		// Submit button
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		Thread.sleep(5000);
		
	}
	
	@Test(priority=0)		
		public void Agent() throws InterruptedException, IOException {
		
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
		//Covered Area
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
   

   //Admin Enables Property
		
		@Test(priority=1)
        public void Admin() throws InterruptedException {
        	
			System.setProperty("webdriver.edge.driver", "‪C:\\MicrosoftWebDriver.exe");
    		driver.manage().window().maximize();
    	
    		driver.get("http://real-estate.itechscripts.com/admin");
    		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    		
    		// Enter Admin E-mail Address
    				driver.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");
    				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    				
    		//Password
    					
    				driver.findElement(By.xpath(".//*[@type='password']")).sendKeys("admin");
    				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    				
    		//button
    				driver.findElement(By.cssSelector(".btn.btn-bordered.btn-primary.pull-right")).click();
    				
        
    		//Properties
    				driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[5]/a")).click();
    				Thread.sleep(5000);
    			
    				
    		//Properties Listing
    				driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[5]/ul/li[1]/a")).click();
    				Thread.sleep(5000);
    				
    		//Page No
    				driver.findElement(By.xpath(".//*[@id='datatable2_paginate']/ul/li[2]/a")).click();
    				Thread.sleep(3000);
    				
    		//Enable Status
    				driver.findElement(By.xpath("//tbody//tr[5]//td[5]//a[1]//img[1]")).click();
    				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    				
    			    				
        }
    
			//User Searches Property
		
			@Test(priority=2)
            public void User() throws InterruptedException {
            
				System.setProperty("webdriver.edge.driver", "‪C:\\MicrosoftWebDriver.exe");
        		driver.manage().window().maximize();
        	
        		driver.get("http://real-estate.itechscripts.com");
        		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        		
        				// Login
        				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
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
        				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
        				
        				//Contact Agent
        				driver.findElement(By.xpath("//a[@class='btn btn-primary pull-right btn-sm']")).click();
        				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        				
        				//Demo Agent
        				//scroll down
        				JavascriptExecutor js11=(JavascriptExecutor)driver;
        				js11.executeScript("window.scrollBy(100,400)");
        				System.out.println("scrolled Down");
        				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
        				
        				//submit		
        				driver.findElement(By.xpath(".//*[@id='content']/div/div/div[1]/div[1]/div[2]/div[2]/div/form/button")).click();
        				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        				
        				//Scroll up
        				JavascriptExecutor js=(JavascriptExecutor)driver;
        				js.executeScript("window.scrollBy(200,500)");
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
			
			
			//Admin Disables Property
			
			@Test(priority=3)
	        public void Admin1() throws InterruptedException {
	        	
				System.setProperty("webdriver.edge.driver", "‪C:\\MicrosoftWebDriver.exe");
	    		driver.manage().window().maximize();
	    	
	    		driver.get("http://real-estate.itechscripts.com/admin");
	    		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	    		
	    		// Enter Admin E-mail Address
	    				driver.findElement(By.xpath("//*[@id='username']")).sendKeys("admin");
	    				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	    				
	    		//Password
	    					
	    				driver.findElement(By.xpath(".//*[@type='password']")).sendKeys("admin");
	    				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	    				
	    		//button
	    				driver.findElement(By.cssSelector(".btn.btn-bordered.btn-primary.pull-right")).click();
	    				
	        
	    				//Properties
	    				driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[5]/a")).click();
	    				Thread.sleep(5000);
	    			
	    				
	    				//Properties Listing
	    				driver.findElement(By.xpath(".//*[@id='sidebar_left']/div[1]/ul/li[5]/ul/li[1]/a")).click();
	    				Thread.sleep(5000);
	    				
	    				//Page No
	    				driver.findElement(By.xpath(".//*[@id='datatable2_paginate']/ul/li[2]/a")).click();
	    				Thread.sleep(3000);
	    				
	    				//Disable Status
	    				driver.findElement(By.xpath("//tbody//tr[5]//td[5]//a[1]//img[1]")).click();
	    				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	    				
	    			    				
	        }

			@AfterTest 
		    public void close() {
		    	driver.close();
		    	
			
			
    }
			
			
}

    			    
    
    
    
    

