package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
}
	}
