package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaik\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement CreateAnAccount=driver.findElement(By.linkText("Create New Account"));
		CreateAnAccount.click();
		Thread.sleep(6000);
		WebElement birth=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(birth);
		ob.selectByValue("6");
		WebElement birthY=driver.findElement(By.name("birthday_day"));
		Select di=new Select(birthY);
		di.selectByVisibleText("26");
		WebElement gender=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[1]/input[1]"));
		gender.click();
		
		
		

	}

}
