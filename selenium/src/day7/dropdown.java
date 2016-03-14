package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Dell/Desktop/cars.html");
		
		Select car=new Select(driver.findElement(By.xpath("html/body/select")));
		
		List<WebElement> carlist=car.getOptions();
		System.out.println(carlist.size());
		car.selectByIndex(2);
		Sleeper.sleepTightInSeconds(5);
		car.selectByValue("audi");
		Sleeper.sleepTightInSeconds(5);
		car.selectByVisibleText("Volvo");
		
		

	}

}
