package aug27.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC002_EditAccounts {
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
	
	//6. Search for the Account using Unique account  name created by you
	
	WebElement arrow = driver.findElement(By.xpath("//input[@name='Account-search-input']"));
	js.executeScript("arguments[0].click();",arrow);
			//.sendKeys("Aameena sahana",Keys.ENTER);
	
	
	//Click on Account dropdown and select edit
	driver.findElement(By.xpath("//span[text()='Show Actions']/preceding-sibling::span")).click();
	//Edit
	WebElement edit = driver.findElement(By.xpath("//a[@title='Edit']"));
	js.executeScript("arguments[0].click();",edit);
	
	}

}
