package aug27.Selenium.legalEntities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC005_DeleteLegalEntity {
	/*Test Steps:
		1. Login to https://login.salesforce.com
		2. Click on the toggle menu button from the left corner
		3. Click View All and click Legal Entities from App Launcher
		4. Click on the legal Entities tab 
		5. Search the Legal Entity 'Salesforce Automation by *Your Name*'
		6. Click on the Dropdown icon and Select Delete
		7.Click on the Delete option in the displayed popup window.
		8. Verify Whether Legal Entity is Deleted using Legal Entity Name
	 */
	public static void main(String[] args) throws InterruptedException {
		//disable-notifications
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");

		//Launch Browser
		ChromeDriver driver=new ChromeDriver(options);

		//Maximize windows
		driver.manage().window().maximize();

		//timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		//load URL
		driver.get("https://login.salesforce.com/");

		//SendKeys-username
		driver.findElement(By.id("username")).sendKeys("sahanabaasha@tcs.com");

		//Sendkeys password
		driver.findElement(By.id("password")).sendKeys("Sahana@123");

		//1.Click login
		driver.findElement(By.id("Login")).click();

		//2. Click on the toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		//3. Click View All 
		driver.findElement(By.xpath("//button[text()='View All']")).click();

		//and click Legal Entities from App Launcher
		JavascriptExecutor js = (JavascriptExecutor)driver;		

		WebElement legalEntity = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		js.executeScript("arguments[0].click();",legalEntity);

		Thread.sleep(3000);

		// Search the Legal Entity 'Salesforce Automation by *Your Name*'
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("Salesforce Automation by Sahana1",Keys.ENTER);

		//Click on the Dropdown icon and Select Delete
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Show Actions']/parent::span")).click();
		driver.findElement(By.xpath("//div[text()='Delete']/parent::a")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		//verify
		String text = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		if(text.indexOf("Legal Entity\"Sahana1\"was deleted.")<0)
		{

			System.out.println("Legal Entities Sahana1 was deleted ");  
		}
		else
		{
			System.out.println("Legal Entities not deleted");
		}

		driver.close();	
		}
	}

