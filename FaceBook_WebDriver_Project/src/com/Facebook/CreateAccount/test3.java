package com.Facebook.CreateAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test3 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		WebElement a=driver.findElementByXPath("html/body/div[1]/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img");
		
		Actions action = new Actions(driver);
		
		action.contextClick(a).perform();

	}

}
