

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Real_estate {

    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new ChromeDriver();
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
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
				
				//Approve
				driver.findElement(By.xpath("//tbody//tr[5]//td[5]//a[1]//img[1]")).click();
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
				
				
    }
}
			    