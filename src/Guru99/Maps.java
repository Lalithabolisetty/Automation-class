package Guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maps {

	private static final Object State = null;

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://petdiseasealerts.org/forescast-map");
		
		WebElement Frame = driver.findElement(By.xpath("//*[@id=\"map-instance-72670\"]"));
		 driver.switchTo().frame(Frame);
		 
		
		 driver.findElement(By.id(//*[@id="california"])).click();
		
		
				 String State = "california";
		
		List<WebElement> AllStates = driver.findElements(By.xpath("//*[@id=\"regions\"]"));
		
		for(WebElement St : AllStates)
		{
			if(St.getText().equals(State)) {
				St.click();
			}
		}
		
		
		

	}

}
