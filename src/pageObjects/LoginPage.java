package pageObjects;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;


public class LoginPage {
	
	private static WebElement element = null;
	 
    public static WebElement txtbx_Username(WebDriver driver){
 
         element = driver.findElement(By.id("user_username"));
 
         return element;
 
         }
 
     public static WebElement txtbx_Password(WebDriver driver){
 
         element = driver.findElement(By.id("user_password"));
 
         return element;
 
         }
     
     public static WebElement txtbx_Email(WebDriver driver){
    	 
         element = driver.findElement(By.id("user_email"));
 
         return element;
         
     }
 
     public static WebElement btn_CreateUser(WebDriver driver){
 
         element = driver.findElement(By.name("commit"));
         return element;
 
         }

}
