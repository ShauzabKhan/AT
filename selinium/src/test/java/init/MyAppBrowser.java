package init;

import org.openqa.selenium.By;

import com.google.inject.Inject;
import com.pega.BrowserImpl;
import com.pega.Configuration;

import com.pega.page.Portal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class MyAppBrowser extends BrowserImpl {

	private Configuration configuration;
	private MyAppTestEnvironment myAppTestEnv;

	private static final By OPERATOR_MENU = By.xpath(
			"//img[@alt='Show User Profile']|//i[@data-test-id='px-opr-image-ctrl']|//i[contains(@class, 'icons avatar name')]");
	private static final By LOG_OFF_BUTTON = By.xpath("//*[text()='Log off']");

	@Inject
	public MyAppBrowser(MyAppTestEnvironment testEnv) {
		super(testEnv);
		this.myAppTestEnv = testEnv;
		configuration = testEnv.getConfiguration();
	}

	public void logout() {
		super.logout();

	}

	@Given("^A User logs in with \"(.*?)\" and \"(.*?)\"$")
	public void login(String username, String password) {
		open();
		super.login(username, password);
	}

	@When("^User logs off from portal$")
	public void user_logs_off_from_portal() {
		super.logout();
	}

	@Given("^A User logs in with Administrator credentials$")
	public void a_User_logs_in_with_Administrator_credentials() {
		open();
		super.login(configuration.getCredential("ADMIN_USER_ID"), configuration.getCredential("ADMIN_PASSWORD"));
	}

}