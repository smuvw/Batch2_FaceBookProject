package com.Facebook.CreateAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) {
		
	ChromeDriver driver= new ChromeDriver();
		System.out.println("hi");
driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		
	
 WebElement a=driver.findElementByXPath(".//*[@id='slider']/span");
		
 Actions action= new Actions(driver);
 action.dragAndDropBy(a, 400, 0).perform();
 
 
	}

}
