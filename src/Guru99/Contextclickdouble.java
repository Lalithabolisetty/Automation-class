package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclickdouble {

	public static void main(String[] args) throws InterruptedException {
	
		
		//Double click
		WebDriver driver = new ChromeDriver();
	     driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	     WebElement Double = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	   
	    		 Actions Act = new Actions(driver);
		Act.doubleClick(Double).perform();
		
		driver.switchTo().alert().accept();
		
		//RightClick
		
	     WebElement Right = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	     
			Act.contextClick(Right).perform();
			 Thread.sleep(3000);
			
			driver.switchTo().alert().accept();

	}

}
