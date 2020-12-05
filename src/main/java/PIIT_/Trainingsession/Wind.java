package PIIT_.Trainingsession;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaik\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]/div[1]/span[1]")));
		action.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]"))).click().build().perform();
		
		//window handle= when ever the browser is opening there is a unique id associated with that browser session that ID in selenium is known as
		//window handle
		
		String parentWindowHandles=driver.getWindowHandle();
		System.out.println(parentWindowHandles);
		action.keyDown(driver.findElement(By.id("createAccountSubmit")), Keys.LEFT_SHIFT).click().build().perform();
		action.keyUp(Keys.LEFT_SHIFT).build().perform();
		Set<String> MultipleWindows=driver.getWindowHandles();
		for(String Window : MultipleWindows) {
			if(Window.equalsIgnoreCase(parentWindowHandles)) {
				System.out.println("This to switch");
			}else {
				driver.switchTo().window(Window);
			}
		}
		WebElement name=driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("name");
		driver.switchTo().window(parentWindowHandles);
		WebElement user6= driver.findElement(By.id("ap_customer_name"));
		user6.sendKeys("name");
		//*Parent Child Windows^^
	}

}
