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
public class FillCaseDetails {
	TestEnvironment testEnv;
	MyAppBrowser browser;
	private PegaWebDriver pegaDriver = null;
	
	@Inject
	public FillCaseDetails(MyAppTestEnvironment testEnv) {
		this.testEnv = testEnv;
		pegaDriver = testEnv.getPegaDriver();
		browser = (MyAppBrowser) testEnv.getBrowser();

	}

	@Given("User fills out the details")
	public void user_fills_out_the_details() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User fills out the details pending");
	}


}
