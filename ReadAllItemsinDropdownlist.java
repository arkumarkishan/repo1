package Practice;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadAllItemsinDropdownlist 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		WebElement drop=driver.findElement(By.xpath("//select[@title='Month']"));
		Select sel = new Select(drop);
		List<WebElement> options=sel.getOptions();
		System.out.println(options.size());
		
		ArrayList<String> items = new ArrayList<>();
		for(int i=0;i<options.size();i++)
		{
			String temp = options.get(i).getText();
			items.add(temp);
		}
		System.out.println("All items in dropdownlist " + items);
	}

}
