package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ieLaunch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Dell\\Desktop\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://gmail.com");
		



	}

}
