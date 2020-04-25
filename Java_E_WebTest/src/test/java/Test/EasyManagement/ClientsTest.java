package Test.EasyManagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import AutomationJavaHelpers.CommonActions;

public class ClientsTest {
	
	CommonActions _commonActions = new CommonActions();
	
	@Test
	public void SuccessfullClienteCreate() throws Exception {// Scenario: Successful diligence of client
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationEDThrash\\Java - Automation Selenium Web\\JavaWebTest\\Java_E_WebTest\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().window().setSize(new Dimension(800, 500));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);

        // Given I have access to EasyManagement page
		driver.get("https://eduardo-thrash.github.io/EasyManagment/index.html");
		
        // When I select principal menu
		WebElement iconMenu = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='menu-toggle rounded']")));
		
		iconMenu.click();
		
        // And I access to Clients menu
		WebElement clientsMenu = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='Clients.html']")));
		
		clientsMenu.click();
		
        // And I diligence client name
		Thread.sleep(5000);
		
		_commonActions.Sendkeys(driver, By.xpath("//form//input[@name='name']"), "Eduardo Montenegro", 10, 3);
		
		
        // And I diligence client identification
		
		
        // And I diligence client phone
		
		
        // And I diligence client birthday name
		
		
        // And I diligence client surname
		
		
        // And I diligence client email
		
		
        // And I diligence client address
		
		
        // And I select male client genre
		
		
        // And I click Save
		
		
        // Then It shows a message with Alert and message "Hello World"

		
		//driver.findElement(By.xpath("//form//input[@name='name']")).sendKeys("sssddd");
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
