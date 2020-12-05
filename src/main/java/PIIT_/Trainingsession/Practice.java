package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/* 1)Open Facebook
		 * 2)Enter email and password
		 * 3)Click login
		 * 4)Click Forgot Password
		 * 5)Come back to Log in Page
		 * 6)Click Create an account
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaik\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement Name=driver.findElement(By.name("email"));
		WebElement Psswd=driver.findElement(By.name("pass"));
		WebElement Sign=driver.findElement(By.name("login"));
		Name.sendKeys("beenii12@yahoo.com");
		Psswd.sendKeys("123456");
		Sign.click();
		driver.navigate().back();
		Thread.sleep(6000);
		

	}

}
