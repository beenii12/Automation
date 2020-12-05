package PIIT_.Trainingsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.manage.().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaik\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement sb=driver.findElement(By.name("submit"));
		sb.click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}

}
//wait times=Implicit wait, Explicit wait

