package com.Facebook.CreateAccount;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test6 {

	public static void main(String[] args) {
ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Select s= new Select(driver.findElementById("month"));
		
		//s.selectByIndex(5);
		//s.selectByValue("11");
		s.selectByVisibleText("Aug");
	
		
	/*List<WebElement> options=s.getOptions();
	System.out.println(options.size());
	
	for(int i=0; i<options.size();i++){
		
		System.out.println(options.get(i).getText());
	}
	}*/
	}
}
