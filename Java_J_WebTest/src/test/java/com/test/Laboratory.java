package com.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Laboratory {

    @Test
    public void InitialTest(){
        System.out.println("Hola Mundo");
    }

    @Test
    public void EasyManagementClients() throws InterruptedException {// Scenario: Successful diligence of client

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "D:\\AutomationEDThrash\\Java - Automation Selenium Web\\JavaWebTest\\Java_J_WebTest\\Drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Given I have access to EasyManagement page
        driver.get("http://automationpractice.com/index.php");

        // When I select principal menu
        WebElement iconMenu = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='menu-toggle rounded']")));

        // And I access to Clients menu
        WebElement clientsMenu = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='Clients.html']")));

        clientsMenu.click();

        // And I diligence client name
        // And I diligence client identification
        // And I diligence client phone
        // And I diligence client birthday name
        // And I diligence client surname
        // And I diligence client email
        // And I diligence client address
        // And I select male client genre
        // And I click Save
        // Then It shows a message with Alert and message "Hello World"

        Thread.sleep(5000);

        driver.close();
    }

    @Test
    public void EasyManagementProviders(){
        // Scenario: Successful diligence of providers
        // Given I have access to EasyManagement page
        // When I select principal menu
        // And I access to Providers menu
        // And I diligence provider name
        // And I diligence provider identification
        // And I diligence provider contact
        // And I diligence provider contact identification
        // And I diligence provider contact phone
        // And I diligence provider contact email
        // And I click Save
        // Then It shows a message with Alert and message "Hello World"
    }
}
