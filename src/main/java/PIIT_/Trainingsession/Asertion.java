package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Asertion {
static WebDriver driver;
	public static void main(String[] args) {
		Driver("Firefox", "https://www.facebook.com");
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaik\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
		//driver=new ChromeDriver();
		//Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shaik\\eclipse-workspace\\Trainingsession\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		WebElement CreateNewAccounts= driver.findElement(By.linkText("Create New Account")); //*locating element
		boolean button= CreateNewAccounts.isDisplayed();
		System.out.println(button);
		WebElement ds=driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]"));
		String textheading=ds.getText();
		System.out.println("textheading");
	}
	public static void Driver(String browser, String URI) {
		if(browser.equalsIgnoreCase("Chrome")) {
			String dt= System.getProperty("user.dir");
			System.out.println("This of dt"+dt);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaik\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(URI);
			driver.manage().window().maximize();
			
		}else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaik\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
					driver=new FirefoxDriver();
					driver.get(URI);
					driver.manage().window().maximize();
		}
	}

}
