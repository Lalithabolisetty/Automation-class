package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/insurance/v1/register.php");

		Select Title = new Select(driver.findElement(By.name("title")));
		
		Title.selectByValue("Mrs");
		driver.findElement(By.name("firstname")).sendKeys("Lalitha");
		driver.findElement(By.name("lastname")).sendKeys("Bolisetty");
		driver.findElement(By.name("phone")).sendKeys("7989116115");
		
		Select Year = new Select(driver.findElement(By.name("year")));
		Year.selectByValue("1993");
		
		Select Month = new Select(driver.findElement(By.xpath("//*[@id=\"user_dateofbirth_2i\"]")));
		Month.selectByValue("10");
		
		Select Date = new Select(driver.findElement(By.name("date")));
		Date.selectByValue("29");
		
		WebElement licencetype = driver.findElement(By.id("licencetype_f"));
		licencetype.click();
		
		Select licenceperiod = new Select(driver.findElement(By.id("user_licenceperiod")));
		licenceperiod.selectByValue("3");
		
		Select occupation = new Select(driver.findElement(By.id("user_occupation_id")));
		occupation.selectByValue("12");
		
		driver.findElement(By.name("street")).sendKeys("HSR Layout");
		driver.findElement(By.name("city")).sendKeys("Bangalore");
		driver.findElement(By.name("county")).sendKeys("India");
		driver.findElement(By.name("post_code")).sendKeys("5000000");
		driver.findElement(By.name("email")).sendKeys("lalithasfdc1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("lalitha2913");
		driver.findElement(By.name("c_password")).sendKeys("lalitha2913");
		
		WebElement submit= driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/input[2]"));
		submit.click();
		}
}
