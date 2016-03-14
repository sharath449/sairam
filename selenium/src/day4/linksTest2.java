package day4;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class linksTest2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://in.bookmyshow.com/hyderabad");
		
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		
//		WebElement block=driver.findElement(By.xpath("html/body/div[1]/footer/div[2]/div/div[2]/div[1]/div[2]/ul"));
		
		List<WebElement> links=driver.findElements(By.xpath("html/body/div[1]/footer/div[2]/div/div[2]/div[1]/div[2]/ul/li/a"));
		
		System.out.println(links.size());
		Sleeper.sleepTightInSeconds(10);
		for (int i = 1; i < links.size(); i++) 
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			Sleeper.sleepTightInSeconds(5);
			System.out.println(driver.getTitle());
			
			driver.navigate().back();
			
		}

	}

}
