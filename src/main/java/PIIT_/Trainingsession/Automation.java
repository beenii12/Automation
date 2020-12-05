package PIIT_.Trainingsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how to open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaik\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
		//locators in selenium
		//1)ID
		//2)linktext
		//3)PartialLinkText
		//4)Xpath
		//5)Name
		//6)Tagname
		//7)CSS Selector
		//8)Classname
	}

}
