package selenium;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Robot 
{
	public WebDriver driver;	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suraj Sinha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}	 
	@Test
	public void mouse() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Robot robot = new Robot();
		robot.mouseWheel(8);
		Thread.sleep(3000);
		//robot.mouseWheel(-1);
		//Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void mouseMove() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Robot robot = new Robot();
		robot.mouseMove(300,400);
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void keyboard()
	{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S); 		
		robot.keyPress(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}		
}
