package stepdefs;

import org.openqa.selenium.By;

import com.google.inject.Inject;
import com.p360.ta.utils.UIActions;
import com.pega.TestEnvironment;
import com.pega.framework.AutoComplete;
import com.pega.framework.PegaWebDriver;
import com.pega.test.pega_sample_testframework.MyAppBrowser;
import com.pega.test.pega_sample_testframework.MyAppTestEnvironment;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class FillStudyInfo {

	TestEnvironment testEnv;
	MyAppBrowser browser;
	private PegaWebDriver pegaDriver = null;
	
	@Inject
	public FillStudyInfo(MyAppTestEnvironment testEnv) {
		this.testEnv = testEnv;
		pegaDriver = testEnv.getPegaDriver();
		browser = (MyAppBrowser) testEnv.getBrowser();

	}
	
	@Then ("fill the study info details")
	public void fill_the_study_info_details () throws InterruptedException{
		
		String StudyInfo ="//a[contains(@name, 'StudyInformation')]";
		pegaDriver.findElement(By.xpath(StudyInfo)).click();
		
		Thread.sleep(1000);
		
		String CheckboxforEngland = "//input[contains(@name,'InEngland') and @type='checkbox']";
		
		pegaDriver.findElement(By.xpath(CheckboxforEngland)).click();
		
		String CheckboxforScotland = "//input[contains(@name,'InScotland') and @type='checkbox']";
		
		pegaDriver.findElement(By.xpath(CheckboxforScotland)).click();
		
		UIActions.clickRadionButton(pegaDriver, "Single Centre", "fc105c6bSingle Centre");
		
		String ResearchPlace = "//input[contains(@name,'ResearchTakesPlace')]";
		
		pegaDriver.findElement(By.xpath(ResearchPlace)).sendKeys("Testing Research");
		
		
		UIActions.clickRadionButton(pegaDriver, "Yes", "df29f4caYes");
		
		String Sponserstatus = "//select[contains(@name,'SponsorStatus')]";
		
		pegaDriver.findElement(By.xpath(Sponserstatus)).click();
		
		//dropdown start
		
        // String Academic = "//select[contains(@name,'SponsorStatus')]//option[@value='Academic']";
		
        // AutoComplete ac = pegaDriver.findAutoComplete(By.xpath(Academic));
 		//ac.setValue("Academic");
		
		new Select(pegaDriver.findElement(By.xpath("//select[@id='ec03b462']"))).selectByVisibleText("Academic");
		
		
		//dropdown end
		
		String Contactonbehalf = "//input[@id='313eb85e']";
		pegaDriver.findElement(By.xpath(Contactonbehalf)).sendKeys("Study_Research");
		
		String Forename = "//input[@id='8186c7a9']";
		pegaDriver.findElement(By.xpath(Forename)).sendKeys("MI");
		
		String Surname = "//input[@id='de238101']";
		pegaDriver.findElement(By.xpath(Surname)).sendKeys("Akiff");
		
		
		
		String Department = "//input[contains(@name,'Department')]";
		pegaDriver.findElement(By.xpath(Department)).sendKeys("Build and Design");
		
		String Instution = "//input[@id='28a9540d']";
		pegaDriver.findElement(By.xpath(Instution)).sendKeys("P360");
		
		String Street = "//input[@id='c44f5885']";
		pegaDriver.findElement(By.xpath(Street)).sendKeys("Hi-tech City");
		
		String City = "//input[@id='d0f0dce5']";
		pegaDriver.findElement(By.xpath(City)).sendKeys("Hyderabad");
		
		String Country = "//input[@id='8187046d']";
		pegaDriver.findElement(By.xpath(Country)).sendKeys("India");
		
		String Pincode = "//input[@id='540b266a']";
		pegaDriver.findElement(By.xpath(Pincode)).sendKeys("500081");
		
		String Email ="//input[@id='16bb35e8']";
		pegaDriver.findElement(By.xpath(Email)).sendKeys("akiff.mi@processthreesixty.com");
		
		String Telephone ="//input[@id='432e4522']";
		pegaDriver.findElement(By.xpath(Telephone)).sendKeys("NA");
		
		String Mobile ="//input[@id='6ce2c573']";
		pegaDriver.findElement(By.xpath(Mobile)).sendKeys("8754879871");
		
		String OrchidID ="//input[contains(@name,'OrchidID')]";
		pegaDriver.findElement(By.xpath(OrchidID)).sendKeys("2904");
		
		UIActions.clickRadionButton(pegaDriver, "Wales", "0693de8bWales");
		
		UIActions.clickRadionButton(pegaDriver, "No", "2bc885eaNo");
		
		UIActions.clickRadionButton(pegaDriver, "Yes", "930341c1Yes");
		
		UIActions.clickRadionButton(pegaDriver, "No", "c4d708e1No");
		
		UIActions.clickRadionButton(pegaDriver, "Yes", "ac7ad0d3Yes");
		
		UIActions.clickRadionButton(pegaDriver, "No", "51dda2e6No");
		
		UIActions.clickRadionButton(pegaDriver, "No", "fef55ca6No");
		
		UIActions.clickRadionButton(pegaDriver, "No", "8627fe56No");
		
		String DesignCheckbox = "//input[contains(@name,'ActivelyInvolvedResearchDesign') and @value='true']";
		pegaDriver.findElement(By.xpath(DesignCheckbox)).click();
		
		String ActiveInvolvementDetails ="//textarea[contains(@name,'ActiveInvolvementDetails')]";
		pegaDriver.findElement(By.xpath(ActiveInvolvementDetails)).sendKeys("Absence of involvement");
		
		
		String CompanyStatistician = "//input[@id='09a8bd05']";
		pegaDriver.findElement(By.xpath(CompanyStatistician)).click();
		
		String Title ="//input[@id='29da07d3']";
		pegaDriver.findElement(By.xpath(Title)).sendKeys("HRA");
		
		String Initials ="//input[@id='ac51db74']";
		pegaDriver.findElement(By.xpath(Initials)).sendKeys("Basha");
		
		String Surname1 ="//input[@id='0bd0d1fe']";
		pegaDriver.findElement(By.xpath(Surname1)).sendKeys("Mehaboob");
		
		String Department1 ="//input[@id='4c3859d3']";
		pegaDriver.findElement(By.xpath(Department1)).sendKeys("Mehaboob");
		
		String Institution1 ="//input[@id='28a9540d']";
		pegaDriver.findElement(By.xpath(Institution1)).sendKeys("Pega_Testing");
		
		String Street1 ="//input[@id='6cc3cb4f']";
		pegaDriver.findElement(By.xpath(Street1)).sendKeys("Patrika_Nagar");
		
		String City1 ="//input[@id='9a54e818']";
		pegaDriver.findElement(By.xpath(City1)).sendKeys("Chennai");
		
		String Country1 ="//input[@id='560a70a2']";
		pegaDriver.findElement(By.xpath(Country1)).sendKeys("India");
		
		
		String PinCode1 ="//input[@id='5f07743f']";
		pegaDriver.findElement(By.xpath(PinCode1)).sendKeys("600042");
		
		String Email1 ="//input[@id='d5fd1f7d']";
		pegaDriver.findElement(By.xpath(Email1)).sendKeys("PegaAt@gmail.com");
		
		String Telephone1 ="//input[@id='5824ec0b']";
		pegaDriver.findElement(By.xpath(Telephone1)).sendKeys("NA");
		
		String Mobile1 ="//input[@id='87ae5ade']";
		pegaDriver.findElement(By.xpath(Mobile1)).sendKeys("9500090670");
		
		String StudySummary ="//textarea[contains(@name,'SummaryOfStudy')]";
		pegaDriver.findElement(By.xpath(StudySummary)).sendKeys("Health Research Authority (HRA) website");
		
		String StorageCheckbox = "//input[@id='f21ce3fd']";
		pegaDriver.findElement(By.xpath(StorageCheckbox)).click();
		
		String StorageCheckbox1 = "//input[@id='1bdfb3bb']";
		pegaDriver.findElement(By.xpath(StorageCheckbox1)).click();
		
		String FurtherInfoDetails ="//textarea[@id='a03e9738']";
		pegaDriver.findElement(By.xpath(FurtherInfoDetails)).sendKeys("Health Research Authority (HRA) website");
		
		
		UIActions.clickRadionButton(pegaDriver, "No", "38b98719No");
		
		String ProvisionIntervention ="//textarea[contains(@name,'ContinuedProvisionArrangements')]";
		pegaDriver.findElement(By.xpath(ProvisionIntervention)).sendKeys("continued provision of the intervention");
		
		UIActions.clickRadionButton(pegaDriver, "No", "161ba8b9No");
		
		String LanguageInfo ="//textarea[contains(@name,'LowUnderstandingArrangements')]";
		pegaDriver.findElement(By.xpath(LanguageInfo)).sendKeys("adequately understand verbal explanations or written information given in English");
		
		
		
		String SecurityArrangement ="//textarea[contains(@name,'PhysicalSecurityArrangements')]";
		pegaDriver.findElement(By.xpath(SecurityArrangement)).sendKeys("physical security arrangements for storage of personal data during the study.");
		
		
		
		UIActions.clickRadionButton(pegaDriver, "No", "0c455e05No");
		
		String UpdateQuestionSet = "//button[@class='Strong pzhc pzbutton'and contains(@name,'QuestionSetWrapper')]";
		pegaDriver.findElement(By.xpath(UpdateQuestionSet)).click();
		
		
	
	}

	
}
