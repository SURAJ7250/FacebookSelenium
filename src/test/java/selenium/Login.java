package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login 
{
	public WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj Sinha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test
	public void login_page() throws InterruptedException
	{
		//display login page of facebook
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.getTitle();
		//title
		String title=driver.getTitle();
		System.out.println(title);
		//page source
		String source=driver.getPageSource();
		System.out.println(source);
		//url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.quit();
		
		//driver.close();
	}
	@Test
	public void navigate() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
	}
	@Test
	public void login() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("email"));
		element.sendKeys("Suraj");
		Thread.sleep(3000);
		element.clear();
		Thread.sleep(3000);
		element.sendKeys("surajnsinha@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Suraj");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
	}
	
	@Test
	public void linktext()
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		WebElement element =driver.findElement(By.cssSelector("input[id='email'][class='inputtext _55r1 _6luy']"));
		element.sendKeys("Suraj");
	}
	@Test
	public void partiallinktext()
	{		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Forgotten")).click();
	}
}
