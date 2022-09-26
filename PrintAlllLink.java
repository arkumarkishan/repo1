package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAlllLink 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mohs10.io/");
		driver.findElement(By.xpath("(//a[contains(text(),'About Us')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Our Team')])[1]")).click();
		List<WebElement> page=driver.findElements(By.xpath("//a"));
		System.out.println(page.size());
		for(int i=0;i<page.size();i++)
		{
			Thread.sleep(1000);
			System.out.println(page.get(i).getText());
		}
	}

	
}
