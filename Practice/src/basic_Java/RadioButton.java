package basic_Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Study\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0')]")).click();
		Thread.sleep(2000);
		//first way
		List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Number of radio button : " + radio.size());
		System.out.println(radio.get(0).isEnabled());
		System.out.println(radio.get(1).isDisplayed());
		System.out.println(radio.get(2).isSelected());
		
		radio.get(1).click();
		Thread.sleep(2000);
		
		//second way
		
		List<WebElement> radio1=driver.findElements(By.xpath("//label[contains(@class,'_58')]"));
		System.out.println("Number of radio Button using Text : "+ radio1.size());
		String expResult = "Female";
		for(int i=0; i < radio1.size();i++ ) {
			if(radio1.get(i).getText().equalsIgnoreCase(expResult))
					{
				radio1.get(i).click();
			}
		}
		
		
		
	}

}
