package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseclicks {

	//MouseHovers
	
	public static void main (String[] args){
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		WebElement Desktop = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));
		WebElement Mac = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a"));
		
		Actions Act = new Actions(driver);
		Act.moveToElement(Desktop).moveToElement(Mac).click().perform();
		
		
		//Drag and Drop
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		WebElement From = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement To = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Act.dragAndDrop(From, To).perform();

		
	}
}
