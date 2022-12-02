/**
 * 
 */
package com.mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author HP
 *
 */
public class BaseClass {
	
	public static Properties prop;
	public static WebDriver driver;
	@BeforeTest
	public void loadConfig() {
		
		try {
			prop=new Properties();
			System.out.println("super constructor invoked");
			FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\Config.properties");
			prop.load(file);
			System.out.println("driver"+driver);
			
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void lunchBrowser() {
		WebDriverManager.chromedriver().setup();
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			driver=new InternetExplorerDriver();
		}
		
		action.
	}

}
