package basic_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownhandling {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Study\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		Thread.sleep(2000);
		
		List<WebElement> month=driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Number of Months: " + month.size());
		month.get(4).click();
		Thread.sleep(2000);	
		
		//2nd way
		WebElement wb=driver.findElement(By.xpath("//select[@id='month']"));
		Select months=new Select(wb); 
		months.selectByIndex(6);
		Thread.sleep(2000);
		months.selectByValue("5");
		Thread.sleep(2000);
		months.selectByVisibleText("Dec");
		
		
		//3rd way
		List<WebElement> monthx=months.getOptions();
		for(int i=0; i< monthx.size(); i++) {
			if(monthx.get(i).getText().equalsIgnoreCase("Sep")) {
				monthx.get(i).click();
			}
		}
		
	}

}
