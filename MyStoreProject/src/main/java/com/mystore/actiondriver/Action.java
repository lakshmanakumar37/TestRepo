/**
 * 
 */
package com.mystore.actiondriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mystore.base.BaseClass;

/**
 * @author HP
 *
 */
public class Action extends BaseClass {
	
	public static void scrollByVisibilityofElement(WebDriver driver,WebElement ele) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	public static void click(WebDriver ldriver,WebElement locatorName) {
		Actions act=new Actions(ldriver);
		act.moveToElement(locatorName).click().build().perform();	
	}
	
	public static boolean findElement(WebDriver ldriver,WebElement ele) {
		boolean flag=false;
		try {
			ele.isDisplayed();
			flag=true;
		}
		catch(Exception e) {
			flag=false;
		}
		finally{
			if(flag) {
				System.out.println("Successfully found element at");
			}else {
				System.out.println("Unable to locate the element at");
			}
			
		}
		return flag;
	}
	 
	public static boolean isSelected(WebDriver ldriver, WebElement ele) {
		boolean flag=false;
		flag=findElement(ldriver,ele);
		if(flag) {
			flag=ele.isSelected();
			System.out.println("The element is selected");
		}else {
			System.out.println("The element is not selected");
		}
		else {
			System.out.println("Not selected");
		}
		return flag;
		
	}
}
