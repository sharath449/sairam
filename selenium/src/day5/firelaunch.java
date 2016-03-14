package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class firelaunch {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		//get()
		driver.get("http://facebook.com");
		//maximize the browser
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(10);
		//navigato to gmail
		driver.navigate().to("http://gmail.com");
		Sleeper.sleepTightInSeconds(10);
		
		driver.navigate().back();

	}

}
