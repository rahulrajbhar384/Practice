package basic_Java;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseStimulation1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Study\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement electronics= driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(electronics).build().perform();
		
		//keyboard operatioin
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		WebElement fash= driver.findElement(By.xpath("//*[text()='Fashion']"));
		act.sendKeys(fash,Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		act.contextClick().build().perform();
		
		
		
		
		
		

		
}
}