package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkExistcheck {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		List<WebElement> links=driver.findElements(By.linkText("Rajnikanth"));
		
		if (links.size()>0) 
		{
			System.out.println("Rajnikanth link exist");
			
		}
		else
		{
			System.out.println("Rajnikanth link not exist");
		}
		

	}

}
