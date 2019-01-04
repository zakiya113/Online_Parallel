import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Edge {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
    	System.setProperty("webdriver.edge.driver", "‪C:\\MicrosoftWebDriver.exe");
		
    	driver.manage().window().maximize();
		
		driver.get("https://fb.com");
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("Anam");
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Khan");
		driver.findElement(By.xpath(".//*[@id='u_0_o']")).sendKeys("anam123khan@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_r']")).sendKeys("anam123khan@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_v']")).sendKeys("123anam");
		driver.findElement(By.xpath(".//*[@id='day']")).click();
		driver.findElement(By.xpath(".//*[@id='day']/option[13]")).click();
		driver.findElement(By.xpath(".//*[@id='month']")).click();
		driver.findElement(By.xpath(".//*[@id='month']/option[7]")).click();
		driver.findElement(By.xpath(".//*[@id='year']")).click();
		driver.findElement(By.xpath(".//*[@id='year']/option[29]")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_z']/span[1]/label")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_11']")).click();
		
		
		
		driver.close();
	}
}
	
	



