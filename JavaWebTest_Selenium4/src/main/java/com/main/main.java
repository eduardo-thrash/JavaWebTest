package com.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class main {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        //Selenium 4
        System.setProperty("webdriver.chrome.driver", "D:\\AutomationProjectsGit\\JavaWebTest\\JavaWebTest_Selenium4\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.executeautomation.com/blog");

        Thread.sleep(4000);

        //New Tab
        WebDriver newTab1 = driver.switchTo().newWindow(WindowType.TAB);
        newTab1.get("http://thedemosite.co.uk/login.php");

        //New Tab
        WebDriver newTab2 = driver.switchTo().newWindow(WindowType.TAB);
        newTab2.get("http://www.executeautomation.com/demosite/Login.html");

        Thread.sleep(4000);

        //Login
        newTab2.findElement(By.name("UserName")).sendKeys("admin");
        newTab2.findElement(By.name("Password")).sendKeys("admin");
        newTab2.findElement(By.name("Login")).submit();

        Thread.sleep(4000);

        WebElement checkbox = driver.findElement(withTagName("input").below(By.name("Male")).toLeftOf(By.name("Hindi")));

        System.out.println(checkbox.getAttribute("name"));

        WebElement txtInitial = driver.findElement(withTagName("input")
        .below(By.id("TitleId"))
        .above(By.id("FirstName")));

        txtInitial.sendKeys("KK");

        driver.quit();

        System.out.println("Hi World");
    }
}
