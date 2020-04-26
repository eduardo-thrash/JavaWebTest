package LaboratoryTest;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AutomationJavaHelpers.CommonActions;

public class LabTest {
	
	CommonActions _commonActions = new CommonActions();
	
	ArrayList<String> tabs;
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetUp() {
		System.out.println(System.getProperty("os.name"));
		
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationEDThrash\\Java - Automation Selenium Web\\JavaWebTest\\Java_E_WebTest\\Drivers\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		
		chromeOptions.addArguments("--headless");
		
		driver = new ChromeDriver(chromeOptions);
	}
	
	@AfterMethod
	public void TearDown(ITestResult result) {
		System.out.println("--------------------------------------------------------------------------------\n");
		
		System.out.println("El test "+result.getMethod().getDescription()+" fue exitoso.");
		
		System.out.println("\n--------------------------------------------------------------------------------");
		
		driver.quit();
	}
	
	@Test(description =  "Scenario: Successful diligence of client")
	public void SuccessfullClienteCreate() throws Exception {
		
		driver.manage().window().setSize(new Dimension(800, 500));
		
		driver.manage().window().setPosition(new Point(400, 300));
		
		driver.manage().window().setPosition(new Point(100, 50));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);

        
		driver.get("https://eduardo-thrash.github.io/EasyManagment/index.html");
		
		JavascriptExecutor JavascriptExecutor = (JavascriptExecutor)driver;
				
		String googleWindow = "window.open('http://www.google.com')";
		JavascriptExecutor.executeScript(googleWindow);
		
		tabs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1)).navigate().to("http://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.switchTo().window(tabs.get(0)).manage().window().maximize();
		
		WebElement iconMenu = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='menu-toggle rounded']")));
		
		iconMenu.click();
		
		WebElement clientsMenu = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='Clients.html']")));
		
		clientsMenu.click();
		
		Thread.sleep(5000);
		
		_commonActions.Sendkeys(driver, By.xpath("//form//input[@name='name']"), "Eduardo Montenegro", 10, 3);
			
		// driver.findElement(By.xpath("//input[@name='lastname']")); #Forma 1
		
		/*
		boolean exist = true;
		try {
			driver.findElement(By.xpath("//input[@name='lastname']"));
		} catch (NoSuchElementException e) {
			exist = false;
		}
		Assert.assertTrue(exist, "El elemento de existe"); #Forma 2
		*/
		
		// boolean existe = driver.findElements(By.xpath("//input[@name='lastname']")).size() != 0; #Forma 3
		
		driver.switchTo().window(tabs.get(1)).close();
		
		driver.switchTo().window(tabs.get(0)).close();
	}

	@Test(description = "Without description temporally...")
	public void SuccessfullOtherTab() throws Exception {// Scenario: Successful diligence of client
		
		Thread.sleep(3000);
	
	}
	
}
