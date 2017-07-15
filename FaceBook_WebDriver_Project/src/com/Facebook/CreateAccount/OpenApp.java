package com.Facebook.CreateAccount;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenApp {

	public static void main(String[] args) {
		
		//FirefoxDriver driver= new FirefoxDriver();
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElementById("u_0_2").sendKeys("srini");
		//driver.findElementByName("lastname").sendKeys("Muvva");
        
		driver.findElementByXPath(".//*[@id='u_0_4']").sendKeys("Muvva");
		driver.findElementById("u_0_m").click();
        driver.quit();

	}

}
