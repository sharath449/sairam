package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class linkTesting3 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://pvrcinemas.com");
		Sleeper.sleepTightInSeconds(5);
		WebElement general=driver.findElement(By.xpath("html/body/div[6]/div[1]/div[2]"));
		
		List<WebElement> links=general.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) 
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			Sleeper.sleepTight(5000);
			general=driver.findElement(By.xpath("html/body/div[6]/div[1]/div[2]"));
			links=general.findElements(By.tagName("a"));
			
		}
		

	}

}
