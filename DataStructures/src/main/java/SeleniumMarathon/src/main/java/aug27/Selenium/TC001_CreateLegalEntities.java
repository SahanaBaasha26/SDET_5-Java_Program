package aug27.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC001_CreateLegalEntities {
	public static void main(String[] args) {


		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");

		// open my browser
		ChromeDriver driver=new ChromeDriver(options);

		// Window max
		driver.manage().window().maximize();

		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//load URL
		driver.get("https://login.salesforce.com/");
		//SendKeys-username
		driver.findElement(By.id("username")).sendKeys("sahanabaasha@tcs.com");

		//Sendkeys password
		driver.findElement(By.id("password")).sendKeys("Sahana@123");

		//Click login
		driver.findElement(By.id("Login")).click();
		//Click on toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		//Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();

		//Click on Accounts tab 
		JavascriptExecutor js = (JavascriptExecutor)driver;		

		WebElement account = driver.findElement(By.xpath("//span[text()='Accounts']"));

		js.executeScript("arguments[0].click();",account);
		// driver.findElement(By.xpath("//span[text()='Accounts']")).click();

		//Click on New button
		driver.findElement(By.xpath("//div[text()='New']")).click();

		//Enter 'your name' as account name  
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Aameena Sahana");

		WebElement dropdown =driver.findElement(By.xpath("(//span[text()='--None--'])[3]"));
		js.executeScript("arguments[0].click();",dropdown);
		
		driver.findElement(By.xpath("//span[text()='Public']"));
		
		// Click save
		driver.findElement(By.xpath("//button[text()='Save']")).click();


	}

}
