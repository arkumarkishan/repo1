package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> suggestion =driver.findElements(By.xpath("//span[contains(text(),'india')]"));
		System.out.println(suggestion.size());
		for(int i =0;i<suggestion.size();i++)
		{
			if(suggestion.get(i).getText().equalsIgnoreCase("india score"))
				suggestion.get(i).click();
		}
	}

}
