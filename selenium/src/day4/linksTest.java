package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linksTest {

	public static void main(String[] args) 
	{
		int count=0;
		//clicking on the gmail link
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.linkText("Gmail")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
//		counting the number of links available in the page
		System.out.println(links.size());
		
//		printing the link names
		
		for (int i = 0; i < links.size(); i++) 
		{
			
			if (!links.get(i).getText().equals(""))
			{
				System.out.println(links.get(i).getText());
			}
			else
			{
				count=count+1;
			}
			
		}
		System.out.println(count);

	}

}
