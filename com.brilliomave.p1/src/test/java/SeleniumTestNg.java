import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestNg {
    // Saving the expected title of the Webpage
    String title = "ToolsQA";
    String key = "webdriver.chrome.driver";
    String value = "C:\\Users\\rogelio.aguilar\\chromedriver_win32\\chromedriver.exe";

    WebDriver driver;
    String baseUrl = "https://demoqa.com";
   
    @BeforeTest
    public void starting_point(){
    	System.out.println("This is the starting point of the test");
    	//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
    	System.setProperty(key, value);
    	driver = new ChromeDriver();
    	driver.get(baseUrl);
    }
    
    @AfterTest
    public void end_point() {
    	driver.close();
    	driver.quit();
    }
    
    @Test(groups = {"demo"} )
    public void checkTitle() {
    	System.setProperty(key, value);
    	driver = new ChromeDriver();
    	driver.get(baseUrl);
        String testTitle = "Free QA Automation Tools For Everyone";
    	String originalTitle = driver.getTitle();
    	Assert.assertEquals(title, originalTitle);
    }
    
    @Test(groups = {"function"})
    public void clickElement() {
    	System.setProperty(key, value);
    	driver = new ChromeDriver();
    	driver.get(baseUrl);
    	driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
        System.out.println("Home Page heading is displayed");	
    }
    
}
