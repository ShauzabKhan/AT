package stepdefs;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.google.inject.Inject;
import com.pega.TestEnvironment;
import com.pega.framework.PegaWebDriver;
import com.pega.framework.PegaWebElement;
import com.pega.test.pega_sample_testframework.MyAppBrowser;
import com.pega.test.pega_sample_testframework.MyAppTestEnvironment;

import cucumber.api.java.en.Given;

public class ProjectSubmission {
	TestEnvironment testEnv;
	MyAppBrowser browser;
	private PegaWebDriver pegaDriver = null;
	
	@Inject
	public ProjectSubmission(MyAppTestEnvironment testEnv) {
		this.testEnv = testEnv;
		pegaDriver = testEnv.getPegaDriver();
		browser = (MyAppBrowser) testEnv.getBrowser();
}
	
	@Given("Submit the project")
	public void Submit_the_project(){
		
		String SubmitProject = "//button[text()='Submit project']";
		
		
		
		PegaWebElement ProjectSubmission = pegaDriver.findElement(By.xpath(SubmitProject));
		
		ProjectSubmission.click();
				
				Assert.assertNotNull(ProjectSubmission);
				
				//button[text()='Submit']
	}
}
