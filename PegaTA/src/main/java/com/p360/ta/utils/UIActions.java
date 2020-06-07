package com.p360.ta.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UIActions {
	
	public static boolean clickRadionButton(WebDriver driver, String label, String labelFor) {
		
		String xpath = "//label[@for='" + labelFor + "'][contains(.,'" + label + "')]"; 
		
		WebElement we = driver.findElement(By.xpath(xpath));
		
		we.click();
		
		return true;
	}

	public static boolean submitFlowAction(WebDriver driver, String buttonTitle) {
		
		if(buttonTitle == null || buttonTitle.trim().contentEquals("")){
			
			buttonTitle = "Complete this assignment";
		}
		
		String xpath = "//button[contains(@title,'" + buttonTitle + "')]";
		
		WebElement we = driver.findElement(By.xpath(xpath));
		
		we.click();
		
		return true;
	}
	
	
	public static boolean closeAssignment(WebDriver driver) {
		
		String xpath = "//button[contains(.,'Close')]";
		
		WebElement we = driver.findElement(By.xpath(xpath));
		
		we.click();
		
		return true;
	}
	
	
}
