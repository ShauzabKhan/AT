/*
 * $Id$
 *
 * Copyright (c) 2020  Process360 Ltd.
 * All rights reserved.
 *
 * This  software  has  been  provided pursuant  to  a  License
 * Agreement  containing  restrictions on  its  use.   The  software
 * contains  valuable  trade secrets and proprietary information  of
 * Process360 Ltd and is protected by the UK copyright law.  It
 * may  not be copied,  modified,  translated or distributed in  any
 * form or medium,  disclosed to third parties or used in any manner
 * not provided for in  said  License Agreement except with  written
 * authorisation from Process360 Ltd.
*/

package stepdefs;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.google.inject.Inject;
import com.pega.TestEnvironment;
import com.pega.framework.PegaWebDriver;
import com.pega.test.pega_sample_testframework.MyAppBrowser;
import com.pega.test.pega_sample_testframework.MyAppTestEnvironment;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class CreateCase {
	TestEnvironment testEnv;
	MyAppBrowser browser;
	private PegaWebDriver pegaDriver = null;
	
	@Inject
	public CreateCase(MyAppTestEnvironment testEnv) {
		this.testEnv = testEnv;
		pegaDriver = testEnv.getPegaDriver();
		browser = (MyAppBrowser) testEnv.getBrowser();

	}

	
	@Given("User creates a case")
	public void user_creates_a_case() {
	
		String newCase = "//span[@class='menu-item-title'][contains(.,'New project')]";
		
		pegaDriver.findElement(By.xpath(newCase)).click();
		
		String CI = "/html[1]/body[1]/div[3]/main[1]/div[1]/div[1]/form[1]/div[3]/div[1]/section[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]";
				//"//input[@type='radio'][contains(@id,'Chief Investigator')]";
		
		pegaDriver.findElement(By.xpath(CI)).click();
		
		String createCaseBtn = "//button[@title='Create this item']";
		
		pegaDriver.findElement(By.xpath(createCaseBtn)).click();
	   
	
	
	}

	

}
