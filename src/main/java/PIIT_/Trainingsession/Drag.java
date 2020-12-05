package PIIT_.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaik\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions it=new Actions(driver);
		Thread.sleep(6000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		//executeAsyncScript(); executeScript()
		driver.switchTo().frame(0);
		WebElement sr=driver.findElement(By.id("draggable"));
		WebElement dr=driver.findElement(By.id("droppable"));
		it.dragAndDrop(sr,dr).build().perform();
		driver.switchTo().frame(0);
		
		//what is iframe?
		
		
	}

}
