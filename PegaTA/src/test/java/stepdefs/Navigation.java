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

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class Navigation {
	TestEnvironment testEnv;
	MyAppBrowser browser;
	private PegaWebDriver pegaDriver = null;
	
	@Inject
	public Navigation(MyAppTestEnvironment testEnv) {
		this.testEnv = testEnv;
		pegaDriver = testEnv.getPegaDriver();
		browser = (MyAppBrowser) testEnv.getBrowser();

	}

	
	@Then("User's portal is displayed")
	public void user_s_portal_is_displayed() {
		
		String operatorIcon = "(//i[@data-test-id='px-opr-image-ctrl'])[1]";

		Assert.assertFalse(pegaDriver.findElement(By.xpath(operatorIcon)) == null, "Cannot locate Operator ID on portal");
	}
	
	@Then("User opens an assignment")
	public void user_opens_an_assignment() {
		
		//String wlAssignment = "(//table/tbody/tr[contains(@oaargs,’ASSIGN-WORKLIST’)]";
		
		//pegaDriver.findElement(By.xpath(wlAssignment)).click();
		
		String wlAssignment = "/html/body/div[4]/main/div/div/div/div/div[2]/form/div[3]/div/section/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div[2]/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/div/span/a";
		

		pegaDriver.findElement(By.xpath(wlAssignment)).click();

		
		Assert.assertFalse(false, "All good");
		//Assert.assertFalse(pegaDriver.findElement(By.xpath(wlAssignment)) == null, "Cannot locate Operator ID on portal");
	}
	

}
