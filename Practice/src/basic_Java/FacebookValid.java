package basic_Java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookValid {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rahulrajbhar384@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Rahul");
		
		
	}

}
