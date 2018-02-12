package learn1;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class first {
	public static WebDriver driver;
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
//		 int a;
//	      float b;
//	      String s;
//	      /*Scanner in = new Scanner(System.in);//
//	      System.out.println("Enter a string");
//	      s = in.nextLine();
//	      System.out.println("You entered string "+s);
//
//	      System.out.println("Enter an integer");
//	      a = in.nextInt();
//	      System.out.println("You entered integer "+a);
//
//	      System.out.println("Enter a float");
//	      b = in.nextFloat();
//	      System.out.println("You entered float "+b); */
		
		
	System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "Galaxy S5");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		WebDriver driver = new ChromeDriver(chromeOptions);
	

		driver.navigate().to("https://www.amazon.in/");
		
	//	driver.findElement(By.xpath("//img[@src='https://images-eu.ssl-images-amazon.com/images/G/31/Gateway/Mobile/COM._SX290_CB273074709_.png']")).click();
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("test");
//		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ENTER);
	
			
	}
	
	



}
