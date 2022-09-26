package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openCartRegister {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
	}

}
