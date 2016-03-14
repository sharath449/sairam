package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class gmailLogin {

	public static void main(String[] args) 
	{
		 WebDriver driver=new FirefoxDriver();
		 driver.get("http://gmail.com");
		 
		 driver.manage().window().maximize();
		 
		 //findelement(), sendkeys() 
		 //locator id
		 driver.findElement(By.id("Email")).sendKeys("gandesharath");
		 //locator name()
		 
		driver.findElement(By.name("signIn")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("Passwd")).sendKeys("123456789");
		driver.findElement(By.id("signIn")).click();
	}

}
