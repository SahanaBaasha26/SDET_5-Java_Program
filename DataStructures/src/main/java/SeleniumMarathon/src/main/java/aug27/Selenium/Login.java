package aug27.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
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
	}
}	





