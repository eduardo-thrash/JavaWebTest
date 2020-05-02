package Steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClientsSteps {
	WebDriver driver;
	
	@Given("I have access to EasyManagment page")
	public void IHaveAccessToEasyManagmentPage() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\AutomationProjectsGit\\JavaWebTest\\JavaWebTest_ETestNG\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("https://eduardo-thrash.github.io/EasyManagment/");
	}
	
	@When("I select principal menu")
	public void WhenISelectPrincipalMenu() {	
		driver.findElement(By.xpath("//*[@id=\"page-top\"]/a[1]")).click();	
	}
	
	@When("I access to Clients menu")
	public void IAccessToClientsMenu() {
		driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a")).click();;
	}
	
	@When("I diligence client name")
	public void Idiligenceclientname() {
		driver.findElement(By.xpath("//*[@id=\"fh5co-work-section\"]/form/div/div/div[1]/input[1]")).sendKeys("Eduardo");
	}
	
	@When("I diligence client identification")
	public void Idiligenceclientidentification() {
		driver.findElement(By.xpath("//*[@id=\"fh5co-work-section\"]/form/div/div/div[1]/input[2]")).sendKeys("1018468542");
	}
	
	@When("I diligence client phone")
	public void Idiligenceclientphone() {
		driver.findElement(By.xpath("//*[@id=\"fh5co-work-section\"]/form/div/div/div[1]/input[3]")).sendKeys("30084365890");
	}
	
	@When("I diligence client birthday name")
	public void Idiligenceclientbirthdayname() {
		driver.findElement(By.xpath("//*[@id=\"fh5co-work-section\"]/form/div/div/div[1]/input[4]")).sendKeys("02/05/1990");
	}
	
	@When("I diligence client surname")
	public void Idiligenceclientsurname() {
		driver.findElement(By.xpath("//*[@id=\"fh5co-work-section\"]/form/div/div/div[2]/input[1]")).sendKeys("Montenegro");
	}
	
	@When("I diligence client email")
	public void Idiligenceclientemail() {
		driver.findElement(By.xpath("//*[@id=\"fh5co-work-section\"]/form/div/div/div[2]/input[2]")).sendKeys("eduardo-thrdash@mailer.com");
	}
	
	@When("I diligence client address")
	public void Idiligenceclientaddress() {
		driver.findElement(By.xpath("//*[@id=\"fh5co-work-section\"]/form/div/div/div[2]/input[3]")).sendKeys("calle 678 # 456-df");
	}
	
	@When("I select male client genre")
	public void Iselectmaleclientgenre() {
		driver.findElement(By.xpath("//*[@id=\"fh5co-work-section\"]/form/div/div/div[2]/div[1]/input")).click();
	}

	@When("I click Save")
	public void IclickSave() {
		driver.findElement(By.xpath("//*[@id=\"Save\"]")).click();
	}
	
	@Then("It shows a message with Alert and message Hello World")
	public void ItshowsamessagewithAlertmessage() throws InterruptedException {	
		String response = driver.switchTo().alert().getText();
		
		assertEquals("Hello World!", response);
		
		driver.switchTo().alert().accept();
		
		driver.close();
	}
}
