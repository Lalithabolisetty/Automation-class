package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import  java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Selenium")).click();
		driver.findElement(By.linkText("Selenium in biology")).click();
		Set<String> WindowID=driver.getWindowHandles();
		
		for(String WinID:WindowID)
		{
			String title=driver.switchTo().window(WinID).getTitle();
			if(title.equals("Selenium in biology - Wikipedia"))
			{
				driver.findElement(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a//*[@id=\"ca-talk\"]/a/span")).click();
			}
			Thread.sleep(3000);
			
			if(title.equals("Selenium - Wikipedia"))
			{
				driver.findElement(By.id("p-lang-btn-checkbox")).click();
				
				Thread.sleep(3000);
				
		//Select hindi Language		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul[1]/li[6]/a")).click();
			}
			
		}

	}

}
