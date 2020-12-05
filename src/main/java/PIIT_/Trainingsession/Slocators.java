package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaik\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	/*WebElement Search=driver.findElement(By.id("twotabsearchtextbox"));
	
	WebElement Searchbutton=driver.findElement(By.id("nav-search-submit-text"));
	Search.sendKeys("Chocolate");
	Searchbutton.click();*/
		WebElement Name=driver.findElement(By.name("email"));
		WebElement Psswd=driver.findElement(By.name("pass"));
		WebElement Sign=driver.findElement(By.name("login"));
		// WebElement Forgot=driver.findElement(By.partialLinkText("Forgot"));
		WebElement Forgot=driver.findElement(By.linkText("Forgot Password?"));
		WebElement Signbt=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/button"));
		Name.sendKeys("beenii12@yahoo.com");
		Psswd.sendKeys("123456");
		//Sign.click();
		Signbt.click();
		Forgot.click();
		//absolute xpath relative xpath
	}

}
