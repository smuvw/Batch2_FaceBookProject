package com.Facebook.CreateAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test4 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.macys.com/");
		Thread.sleep(5000);
		WebElement a=driver.findElementByXPath(".//*[@id='flexid_5991']/a");

		Actions action = new Actions(driver);
		
		action.moveToElement(a).perform();
		
	}

}
