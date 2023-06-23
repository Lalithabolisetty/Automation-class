package Guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
 
	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
		
     driver.get("https://itera-qa.azurewebsites.net/home/automation");
     
     List<WebElement> Chkbox = driver.findElements(By.xpath("//*[@class ='form-check-input'and @type ='checkbox']"));
     System.out.println(Chkbox.size());
     
     /*for(int i=3; i<Chkbox.size(); i++) {
    	 Chkbox.get(i).click();*/
    	   	 
    	 for(int i=0; i<3; i++) {
    		 Chkbox.get(i).click();
    	 }
     }
	}

