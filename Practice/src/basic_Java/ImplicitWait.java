package basic_Java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("how the stuff works");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		for(int i=0; i<list.size();i++) {
			String expReuslt= "how stuff works quiz";

			if(list.get(i).getText().equalsIgnoreCase(expReuslt)){
				
				list.get(i).click();
				break;
				
			}
		}
	}

}
