package automation;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



import pageObjects.LoginPage;
import pageObjects.Filters;



public class PageObjectModel {

	private static WebDriver driver = null;
		
	public static void main(String[] args) throws Exception{
		
		driver = new FirefoxDriver();
		driver.get("http://ec2-54-84-52-184.compute-1.amazonaws.com:8080/admin/");
		try {
		driver.findElement(By.id("users")).click();
		} catch (Exception e) {
			System.out.println("Users link click failure");
		}
		//Filters.btn_Filters(driver).submit();
		
		//driver.findElement(By.id("q[username_contains]")).click();
		
		
		WebElement element = driver.findElement(By.linkText("New User"));
		element.click();
		//Increment Username
		
			Random rand = new Random(); 
			int value = rand.nextInt(1000); 
			String userid = "sautomation" + value;
			
		//Increment Email Id for Uniqueness
			
			Random rand1 = new Random(); 
			int value1 = rand1.nextInt(1000); 
			String email = "test" + value1 + "@gmail.com";
			// email = email

			
		// Use page Object library now	
		
		LoginPage.txtbx_Username(driver).sendKeys(userid);
		LoginPage.txtbx_Password(driver).sendKeys("test1234");
		LoginPage.txtbx_Email(driver).sendKeys(email);
		LoginPage.btn_CreateUser(driver).click();
		

		 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		
		  System.out.println("Login Successfully");
		  
		  driver.findElement(By.id("users")).click();
		  
		// Use page Object library now 
		  Filters.txtbx_Username(driver).click();
		  Filters.txtbx_Username1(driver).sendKeys("sauto");
		  Filters.btn_Filter(driver).submit();
		/*
		 * WebElement listbox_webelement = driver.findElement(By.xpath(
		 * "/html/body/div/div[4]/div[2]/div[1]/div/form/div[1]/select/option[1]"));
		 * listbox_webelement.click();
		 * 
		 * 
		 * driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		 * 
		 * WebElement username = driver.findElement(By.id("q_username"));
		 * username.sendKeys("sauto"); WebElement Filter = driver.findElement(By.xpath(
		 * "/html/body/div/div[4]/div[2]/div[1]/div/form/div[4]/input[1]"));
		 * Filter.submit();
		 */
			

		        
		
		
		// TODO Auto-generated method stub

	} 

}
