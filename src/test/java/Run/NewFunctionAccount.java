package Run;

import org.testng.annotations.Test;

import Pages.Facebook.Home;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewFunctionAccount {
	//Third executed annotation
	public static WebDriver driver;
  @Test
  public void f() {
	  System.out.println("Annotation is test");
	  Home ob=new Home(driver);
	  ob.emailField();
	  ob.passwordField();
	  ob.loginButton();
  }
  
  
  
  
  
  
//First executed annotation
  @BeforeClass
  public void beforeClass() {
	  Driver("Chrome", "https://www.facebook.com");
	  
  }
//Fifth executed annotation
  @AfterClass

public  void Driver(String browser,String URI) {
  if(browser.equalsIgnoreCase("Chrome")) {
  String director= System.getProperty("user.dir");
  
   //System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Coding\\Trainingsession\\Drivers\\chromedriver.exe");
  System.setProperty("webdriver.chrome.driver", director+"\\Drivers\\chromedriver.exe");

  driver=new ChromeDriver();
   driver.get(URI);
   driver.manage().window().maximize();
   
  }else if (browser.equalsIgnoreCase("Firefox")) {
   String director= System.getProperty("user.dir");
   System.setProperty("webdriver.gecko.driver", director+"\\Drivers\\geckodriver.exe");
   driver=new FirefoxDriver();
   
   driver.get(URI);
   driver.manage().window().maximize();
  }
  }
}
  
 
  
