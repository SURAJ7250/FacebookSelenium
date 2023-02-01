package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLogin
{
public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj Sinha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void FacebookLogintext() 
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number'][@id='email']")).sendKeys("Suraj Sinha");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	@Test
	public void FacebookLogincontains()
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number'][@id='email']")).sendKeys("Suraj Sinha");
		driver.findElement(By.xpath("//button[contains(text),'Log in']")).click();
	}
}
