package stepdefs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.inject.Inject;
import com.p360.ta.utils.UIActions;
import com.pega.TestEnvironment;
import com.pega.framework.PegaWebDriver;
import com.pega.framework.PegaWebElement;
import com.pega.test.pega_sample_testframework.MyAppBrowser;
import com.pega.test.pega_sample_testframework.MyAppTestEnvironment;

import cucumber.api.java.en.Given;

public class UploadDocument {
	TestEnvironment testEnv;
	MyAppBrowser browser;
	private PegaWebDriver pegaDriver = null;
	
	@Inject
	public UploadDocument(MyAppTestEnvironment testEnv) {
		this.testEnv = testEnv;
		pegaDriver = testEnv.getPegaDriver();
		browser = (MyAppBrowser) testEnv.getBrowser();

}
	
	@Given("User attach document")
	public void user_attach_document() throws IOException {
		
String ExpandProject = "//h2[text()='Project documents']";
		
		pegaDriver.findElement(By.xpath(ExpandProject)).click();
		
		
		String NavigatetoAttachSection = "//a[@name='AttachNewDocumentButton_pyWorkPage_1']";
		
		pegaDriver.findElement(By.xpath(NavigatetoAttachSection)).click();
		
		/*
		 * FileInputStream file = new FileInputStream
		 * ("C:\\Users\\User\\git\\AT1\\PegaTA\\data\\global-settings.properties");
		 * 
		 * Properties prop = new Properties ();
		 * 
		 * prop.load(file);
		 * 
		 * String path = prop.getProperty("path")+"C:\\Test_Upload\\111.JPG";
		 */
		
		
		  String currentDir = System.getProperty("user.dir");
		  System.out.println("Current dir using System:" +currentDir);
		 

		
		pegaDriver.findElement(By.xpath("//input[@id='$PpyAttachmentPage$ppxAttachName']")).sendKeys(currentDir+"\\Test_Upload\\111.JPG");
		
		//*[@id="$PpyAttachmentPage$ppxAttachName"]
		
		String Attachmenttitle = "//input[@id='e946cec7']";
		
		pegaDriver.findElement(By.xpath(Attachmenttitle)).sendKeys("Syntax_for_Xpath");
		
		new Select(pegaDriver.findElement(By.xpath("//select[@id='2b975c95']"))).selectByVisibleText("Cover letter");
		
String Version = "//input[@id='9facf4ef']";
		
		pegaDriver.findElement(By.xpath(Version)).sendKeys("01.01");
		
		pegaDriver.findElement(By.xpath("//span[@name='$PdragDropFileUpload$ppxResults$l1$pDocumentDate']")).click();
		
		pegaDriver.findElement(By.xpath("//td[@class='calcell today selected']")).click();
		
		String AttachmentsubmitButton = "//button[text()='  Attach ']";
		
	//	pegaDriver.findElement(By.xpath(AttachmentsubmitButton)).click();
		
PegaWebElement Element = pegaDriver.findElement(By.xpath(AttachmentsubmitButton));
		
Element.click();
		
		Assert.assertNotNull(Element);
				
		
	}
}
