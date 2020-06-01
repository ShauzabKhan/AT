package sebase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeURL {
	

	
	WebDriver driver;
	
	JavascriptExecutor jse;
	
	
	public void invokeBrowser() {
		
//		System.setProperty("webdriver.chrome.driver", "/Users/shauzab/Documents/eclipse-workspace/chromedriver");
		
//		driver = new ChromeDriver();
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/shauzab/Documents/eclipse-workspace/geckodriver");
		driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://hra-iras2-dt1.pegacloud.net/prweb");
		
		
	}
	
	
	public void searchElement() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtUserID")).sendKeys("research.user1");

		Thread.sleep(1000);
		
		driver.findElement(By.id("txtPassword")).sendKeys("hrarules");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("sub")).click();
		
		Thread.sleep(2000);
		
		String wlAssignment = "/html/body/div[4]/main/div/div/div/div/div[2]/form/div[3]/div/section/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div[2]/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td[2]/div/span/a";
		
		driver.findElement(By.xpath(wlAssignment)).click();
		
		String operatorIcon = "(//i[@data-test-id='px-opr-image-ctrl'])[1]";
				
				//"/html/body/div[4]/header/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div/div[2]/i"; 
		
		driver.findElement(By.xpath(operatorIcon)).click();
		
		Thread.sleep(2000);
		
		String logOffMenuItem = "//span[@class='menu-item-title-wrap'][contains(.,'Log off')]"; 
		
		//String logOffMenuItem = "[contains(., 'pyNavigation1587653513565']";
		
		driver.findElement(By.xpath(logOffMenuItem)).click();
		
		//String logOffMenuItemID = "ID1294358612678000";
		
		//driver.findElement(By.id(logOffMenuItemID)).click();
		
		
		
		
		
		
		//driver.
		
		//jse = (JavascriptExecutor) driver;
		
		//jse.executeScript("scroll(0,400)");
		
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	
	public static void main(String args[]) throws InterruptedException {
		
		InvokeURL iu = new InvokeURL();
		iu.invokeBrowser();
		
		iu.searchElement();
	}
	

}
