package SampleTesting.selinium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.inject.Inject;
import com.pega.BrowserImpl;
import com.pega.Configuration;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import cucumber.runtime.java.guice.ScenarioScoped;
import init.MyAppTestEnvironment;
//Git changes
//Test 111
@ScenarioScoped
public class Login extends BrowserImpl {
	public Configuration configuration = null;

	@Inject
	public Login(MyAppTestEnvironment testEnv) {
		super(testEnv);
		this.testEnv = testEnv;
		configuration = testEnv.getConfiguration();
	}

	@Given("A User logs in with user credentials {string} and {string}")
	public void a_User_logs_in_with_user_credentials_and(String user, String pwd) throws InterruptedException {
		open();
		super.login(user, pwd);

	}

	@Given("click on menu")
	public void click_on_menu() {
		// Write code here that turns the phrase above into concrete actions

		String s = "//a[@data-test-id='20140927131516034349915']";
		driver.findElement(By.xpath(s)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// WebDriverWait wait=new WebDriverWait(pegaDriver, 10);

	}

	@Then("expand menu")
	public void expand_menu() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("Menu Clicked");
	}

	@And("^clik on casemanager$")
	public void clikOnCasemanager() throws Throwable {
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='menu-item-title']"));

		// set element=pagelist(3)
		// element =Webelement

		for (WebElement element : findElements) {
			if (element.getText().contains("Case Manager")) {
				element.click();
				break;
			}
		}

		Thread.sleep(1000);
		Set<String> windowHandles = pegaDriver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String childWid = null;
		String mainwind = pegaDriver.getWindowHandle();
		System.err.println("++++main+++" + mainwind);
		System.out.println("windows size" + windowHandles.size());

		while (iterator.hasNext()) {
			childWid = iterator.next();
		}
		System.err.println("+++child+++" + childWid);
		Thread.sleep(3000);
		pegaDriver.switchTo().window(childWid);
		Thread.sleep(3000);
	}

	@Then("open Myworklist")
	public void open_Myworklist() throws Exception {
		Actions actions = new Actions(driver);
		WebElement newItem = driver.findElement(By.xpath("(//span[@class='menu-item-image-wrapper'])[1]"));
		actions.moveToElement(newItem).perform();
		WebElement myWork = driver.findElement(By.xpath("//span[@class='menu-item-title' and text()='My Work']"));
		myWork.click();
         Thread.sleep(3000);
		WebElement workItem = driver.findElement(By.xpath("(//span[@class='case_description'])[1]"));
		workItem.click();

	}

	@Given("submit the form where Firstname is {string} and Lastname is {string} and Age is {string}")
	public void submit_the_form_where_Firstname_is_and_Lastname_is_and_Age_is(String firstname, String lastname,
			String age) {
		WebElement firstName = driver.findElement(By.xpath("//input[@name='$PpyWorkPage$pFirstName']"));
		firstName.sendKeys(firstname);
		WebElement lastName = driver.findElement(By.xpath("//input[@name='$PpyWorkPage$pLastName']"));
		lastName.sendKeys(lastname);
		WebElement Age = driver.findElement(By.xpath("//input[@name='$PpyWorkPage$pAge']"));
		Age.sendKeys(age);
		// WebElement country =
		// driver.findElement(By.xpath("//input[@name='$PpyWorkPage$pCountry']"));
		WebElement submitButton = driver.findElement(By.xpath("//Button[text()='Submit']"));
		submitButton.click();

		// input[@name='$PpyWorkPage$pFirstName'
		// input[@name='$PpyWorkPage$pLastName']
		// input[@name='$PpyWorkPage$pAge']
		// input[@name='$PpyWorkPage$pCountry']
		// Button[text()='Submit'

	}
}
