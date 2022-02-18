import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SignUpFlow {

	WebDriver driver;
	
	@BeforeClass
	public void testSetup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rogelio.aguilar\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
	}
	
	@BeforeMethod
	public void openBrowser()
	{
		driver.get("https://www.browserstack.com/");
		driver.findElement(By.id("signupModalButton")).click();
		System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
	}
	
	@Test(description="This method validates the sign up functionality")
	public void signUp()
	{
		driver.findElement(By.id("user_full_name")).sendKeys("Rogelio Aguilar");
		driver.findElement(By.id("user_email_login")).sendKeys("rogelio@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("BrowserStack123*");
		driver.findElement(By.xpath("//*[@id=\"tnc_checkbox\"]")).click();
		driver.findElement(By.id("user_submit")).click();
	
	}
	
	@AfterMethod
	public void postSignUp()
	{
		System.out.println(driver.getCurrentUrl());
	
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}

}