package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownlistAscorDec {

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
		
		ArrayList<String> actual =new ArrayList<>();
		for(int i=0;i<options.size();i++)
		{
			String test= options.get(i).getText();
			actual.add(test);
		}
		ArrayList<String> temp= new ArrayList<>();
		temp.addAll(actual);
		System.out.println("Temporary Array List Is" + temp);
		
		Collections.sort(temp);
		System.out.println("ascending order"+ temp);
		
		Collections.sort(temp, Collections.reverseOrder());
		System.out.println(temp);
		System.out.println(temp==actual);
	}
		
}
