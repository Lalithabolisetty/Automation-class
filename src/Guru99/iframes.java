package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
	public static void main(String[] args){
		

	WebDriver driver=new ChromeDriver();
	
	driver.get("https://ui.vision/demo/webtest/frames/");
	
	WebElement Frame1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
	driver.switchTo().frame(Frame1);
	driver.findElement(By.name("mytext1")).sendKeys("Lalitha Bolisetty");
	driver.switchTo().defaultContent();
	
	WebElement Frame3=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
	driver.switchTo().frame(Frame3);
	driver.findElement(By.name("mytext3")).sendKeys("Chandrakanth");
	driver.switchTo().defaultContent();
}
}