package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class radiobuttons 
{

	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Uday");
		WebDriver driver=new FirefoxDriver(fp);
		
		driver.get("http://cleartrip.com");
		
		WebElement radio=driver.findElement(By.xpath(".//*[@id='SearchForm']/nav"));
		
		List<WebElement> list=radio.findElements(By.tagName("li"));
		
//		list.get(1).click();
//		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++)
		{
			String radioname=list.get(i).getText();
			System.out.println(radioname);
			if (radioname.equalsIgnoreCase("multi-city")) 
			{
				list.get(i).click();
				break;
			}
		}
		

	}

}
