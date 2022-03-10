package Basepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Testbase {
	public WebDriver driver;
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver97\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		//reresh the page
	}
	@AfterMethod
	public void close() {
		driver.quit();
		
	}
	

}
