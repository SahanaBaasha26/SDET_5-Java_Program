package aug30_Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC001_CreateTask {
	/*Test Steps:
		1) Launch the app
		2) Click Login
		3) Login with the credentials
		4) Click on Global Actions SVG icon
		5) Click view all
		6) Type task and select task
		7) Click New Task under dropdown icon
		6) Enter subject as "Bootcamp "                                               
		8) Select status as 'Waiting on someone else'
		9) Save and verify the 'Task created' message
	 */

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("sahanabaasha@tcs.com");
		driver.findElement(By.id("password")).sendKeys("Sahana@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		WebElement createTask= driver.findElement(By.xpath("//p[text()='Tasks']"));
		js.executeScript("arguments[0].click();",createTask);
		driver.findElement(By.xpath("//span[text()='Tasks List']/preceding-sibling::lightning-icon")).click();
		WebElement NewTask= driver.findElement(By.xpath("//span[text()='New Task']"));
		js.executeScript("arguments[0].click();",NewTask);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Bootcamp");
		driver.findElement(By.xpath("(//a[@class='select'])[1]")).click();
		driver.findElement(By.xpath("//a[@title='Waiting on someone else']")).click();
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		
		String sucess = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		if(sucess.indexOf("Task\"Bootcamp\"was created.")<0)
		{

			System.out.println("Task Bootcamp was Created ");  
		}
		else
		{
			System.out.println("Task Bootcamp not Created");
		}

		driver.close();	
		}
	
		
	}




