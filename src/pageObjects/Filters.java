package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Filters {
	
	private static WebElement element = null;
	private static WebDriver driver = null;
	
	 
	 public static WebElement txtbx_Username(WebDriver driver) {
		 
	  WebElement listbox_webelement = driver.findElement(By.xpath( "/html/body/div/div[4]/div[2]/div[1]/div/form/div[1]/select/option[1]"));
	  //listbox_webelement.click();
	 return listbox_webelement;
	 
	 }
	 
	 public static WebElement txtbx_Username1(WebDriver driver) {
	  WebElement username = driver.findElement(By.id("q_username"));
	  return username;
	  //username.sendKeys("sauto");
			
	 }
	 public static WebElement btn_Filter(WebDriver driver) {
			WebElement Filter = driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/div[1]/div/form/div[4]/input[1]"));
			return Filter;
			
		
    

}
	
	
	
	
}
