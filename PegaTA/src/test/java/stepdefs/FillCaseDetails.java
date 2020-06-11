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

import com.gargoylesoftware.htmlunit.html.xpath.XPathUtils;
import com.google.inject.Inject;
import com.p360.ta.utils.UIActions;
import com.pega.TestEnvironment;
import com.pega.framework.AutoComplete;
import com.pega.framework.PegaWebDriver;
import com.pega.framework.PegaWebElement;
import com.pega.test.pega_sample_testframework.MyAppBrowser;
import com.pega.test.pega_sample_testframework.MyAppTestEnvironment;
import com.pega.util.XPathUtil;

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

		//UIActions.closeAssignment(pegaDriver);
		
		String shortTitle = "//input[contains(@name,'pShortTitle')]";
		pegaDriver.findElement(By.xpath(shortTitle)).sendKeys("Short title of project");
		
		String projectFunder = "//input[contains(@name,'pFunder')]";
		pegaDriver.findElement(By.xpath(projectFunder)).sendKeys("Royal Marsden");
		
		String projectDeputy = "//input[contains(@name,'pProjectDeputy')]";
		
		AutoComplete ac = pegaDriver.findAutoComplete(By.xpath(projectDeputy));
		ac.setValue("Sahul.User");
		
		
		String sponsor = "//input[contains(@name,'pOrganisation')]";
		
		ac = pegaDriver.findAutoComplete(By.xpath(sponsor));
		
		ac.focus();
		ac.setValue("GSK");
		
		
		String eudraCTID = "//input[contains(@name,'pEudraCTID')]";
		pegaDriver.findElement(By.xpath(eudraCTID)).sendKeys("1212-121212-12");
		
		
		UIActions.clickRadionButton(pegaDriver, "Yes", "49648c4bYes");
		
		UIActions.clickRadionButton(pegaDriver, "No", "026cf773No");
	
		UIActions.clickRadionButton(pegaDriver, "No", "fa53f7dfNo");
		
		UIActions.clickRadionButton(pegaDriver, "No", "577285b2No");
		
		UIActions.clickRadionButton(pegaDriver, "No", "b7181259No");
		
		UIActions.clickRadionButton(pegaDriver, "No", "5a720e98No");
		
		boolean radioBtnClicked = UIActions.clickRadionButton(pegaDriver, "No", "7828ec26No");
		
		Assert.assertTrue(radioBtnClicked);

		
	}


}
