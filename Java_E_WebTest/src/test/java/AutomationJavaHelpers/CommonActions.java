package AutomationJavaHelpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonActions {
	
	public void Sendkeys(WebDriver driverSendKeys, By elementSendKeys, String text, int timeout , int tried) throws Exception {
		
		boolean statement = false;

        int triedCount = 0;
        
        do {
        	triedCount++;
        	
        	try {
        		WebDriverWait wait = new WebDriverWait(driverSendKeys, timeout);
        		
        		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementSendKeys));
        		
        		Assert.assertTrue(element.isEnabled());
        		
        		Assert.assertTrue(element.isDisplayed());
        		
        		element.sendKeys(text);
        		
        		statement = true;
        		
        	}catch (Exception fail) {
        		if (triedCount >= tried) throw new Exception("Exception message");
        		
        		Thread.sleep(1000);
			}
			
		} while (!statement);

	}
	
	public void waitForElementToLoad(By locator, long timeOutInSeconds) {
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
        new WebDriverWait(driver, timeOutInSeconds).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
	

}
