package PIIT_.Trainingsession;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Popups2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaik\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qatarairways.com/en-us/homepage.html");
		driver.manage().window().maximize();
		/*WebElement sb=driver.findElement(By.name("submit"));
		sb.click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();*/
		
		Thread.sleep(6000);
		driver.findElement(By.id("cookie-close")).click();
		WebElement dts=driver.findElement(By.id("T7-departure_1"));
		dts.click();
		
		Picture("cookies");
		
		//driver.findElement(By.xpath("(//*[text()='26'])[2]")).click();
		//driver.findElement(By.xpath("(//*[text()='28'])[2]")).click();
		
		Thread.sleep(6000);
		Picture("Dates");
		
		//File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(shots,new File("C:\\Users\\shaik\\eclipse-workspace\\Trainingsession\\Pictures\\Airlines.png"));
		
	}
	
	private static void Picture(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void Pictures() throws IOException {
		//capture the system date or time
		//convert to string format
		//use with picture name
		Date dt=new Date();
		System.out.println(dt);
		String si=dt.toString().replace("","_").replace(":", "_");
		System.out.println(si);
		File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String pic = null;
		FileHandler.copy(shots,new File("/Users/shaik/Downloads/"+si+pic+".png"));
	
	}		
}
