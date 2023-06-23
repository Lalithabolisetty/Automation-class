package Guru99;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/");
		/*driver.findElement(By.name("uid")).sendKeys("mngr496538");
		driver.findElement(By.name("password")).sendKeys("azyhypU");
		//driver.findElement(By.name("btnLogin")).click();//*/
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("azyhypU");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		
	}
}
