package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;

public class datapicker{

	public static void main(String[] args) {
     	WebDriver driver =new ChromeDriver();	
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		
		String year="2020";
		String Month="October";
		String date="29";
		
		//Moth & Year
while(true)
		{
	String Mon= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
	String Yr=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
			
			if(Mon.equals(Month) && Yr.equals(year) )
			{
				break;
			}
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
		}
		
	List<WebElement>Alldates=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table//td"));
	for(WebElement dt:Alldates)
	{	if(dt.getText().equals(date))
		{
			dt.click();

		}
	}
	}
}


		
	


