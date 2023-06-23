package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LOGIN {
	
	 WebDriver driver;
	
	@Test
	void OpenApp() {
  
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/");
	}
 
	@Test
	void Login() {
		driver.findElement(By.name("uid")).sendKeys("mngr507287");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("AdYjEsa");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
	
		
	}
	
	@Test
	void CloseApp() {
		
		driver.close();
	}
}
