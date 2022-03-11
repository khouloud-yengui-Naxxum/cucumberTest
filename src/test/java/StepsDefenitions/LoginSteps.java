package StepsDefenitions;


import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class LoginSteps {
	
  WebDriver driver;
	//final WebDriver driver = null;
	@Given("when user open the website and go to login page")
	public void when_user_open_the_website_and_go_to_login_page() {
	   
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver(); 
		//final WebDriver driver = new ChromeDriver();
			
			driver.get("https://classic.crmpro.com/index.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}

//login with example
@When("user fill email as {string} and password as {string}  and click login")
public void user_fill_email_as_and_password_as_and_click_login(String username,String password) {
  
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	
}
@Then("Error massage should appear")
public void error_massage_should_appear() {
  //WebElement wait = new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Login']")));
Assert.assertTrue(driver.findElement(By.xpath("//input[@value='Login']")).isDisplayed());
		System.out.println("false credentials");	
	
	
		
}
	
	

		@Then("user shloud navigate to home page")
			
			public void user_shloud_navigate_to_home_page() {
				
			WebElement wait = new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class='logo_text']")));
			Assert.assertTrue(driver.findElement(By.xpath("//td[@class='logo_text']")).isDisplayed());
			System.out.println("valid Credentials");
		
		}
		




	@And("click on contact button")
	public void click_on_contact_button() {
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//*[@title=\"Contacts\"]")).click();
	}
	
	@Then("email test field should be visible")
	public void email_test_field_should_be_visible() {
		
		System.out.println("then step");
	Assert.assertTrue(driver.findElement(By.xpath("//input[@name=\"cs_email\"]")).isDisplayed());
}
	
	@And("click on new contact button")
	public void click_on_new_contact_button() {
		 //driver.switchTo().frame("mainpanel");
		WebElement button=  driver.findElement(By.xpath("//input[@value='New Contact']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", button);
		////input[@value='New Contact']"
	}

	@And("fill the firstname and lastname")
	public void fill_first_name_and_las_name() {
		
		//driver.switchTo().frame("mainpanel");
	driver.findElement(By.xpath("//input[@id=\"first_name\"]")).sendKeys("ahmed");
	driver.findElement(By.xpath("//*[@id=\"surname\"]")).sendKeys("BEJAOUI");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}
	
	@And("fill the firstname and lastname ")
	public void new_contact_shloud_added() {
		
		Assert.assertTrue(driver.findElement(By.xpath("new contacts shloud be added")).isDisplayed());
		
	}
	


@Then("new contacts shloud be added")
public void new_contacts_shloud_be_added() {
System.out.println("new contact added with succed");
}

@Then("browser should be closed")
	
public void browser_should_be_closed() {
	
	driver.close();
}

}




