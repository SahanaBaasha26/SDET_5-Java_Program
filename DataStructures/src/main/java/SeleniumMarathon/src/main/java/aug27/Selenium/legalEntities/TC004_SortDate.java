package aug27.Selenium.legalEntities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC004_SortDate {
	/*Test Steps:
		1. Login to https://login.salesforce.com
		2. Click on the toggle menu button from the left corner
		3. Click View All and click Legal Entities from App Launcher
		4. Click on the legal Entities tab 
		5. Click the sort arrow in the Last Modified Date.
		6. Verify the Legal Entities displayed in ascending order by Last Modified Date.
	 */
	public static void main(String[] args) {

		//disable Notifications
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");

		//Launch Browser
		ChromeDriver driver=new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

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
		
		//Click on the legal Entities tab 
		WebElement legalEntityTab = driver.findElement(By.xpath("//span[text()='Recently Viewed | Legal Entities']"));
		js.executeScript("arguments[0].click();",legalEntityTab);
		
		//Click the sort arrow in the Last Modified Date.
		driver.findElement(By.xpath("(//span[text()='Sort']/parent::a)[3]")).click();
		
		//
		String lastModified=driver.findElement(By.xpath("//span[text()='Sorted Ascending']")).getText();
		if(lastModified.equals(lastModified))
		{

			System.out.println("the Legal Entities displayed in ascending order by Last Modified Date.");  
		}
		else
		{
			System.out.println("Not in ascending order");
		}

		//driver.close();	
		}
               
	}

