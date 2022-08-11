package definitions;


import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.action.ActionPage;
import util.SeleniumDriver;

public class login {
	
		
	ActionPage page=PageFactory.initElements(SeleniumDriver.getDriver(), ActionPage.class);
	
	
    @Given("User is on Home page")
    public void userOnHomePage() {
    	 SeleniumDriver.setUpDriver();
 SeleniumDriver.openPage("https://opensource-demo.orangehrmlive.com/");
    SeleniumDriver.waitForPageToLoad();
    }
 

    @When("User enters username as {string}")
    public void entersUsername(String userName) throws InterruptedException {
 
        System.out.println("Username Entered");
        page.inputEmail(userName);
   
        //driver.findElement);
 
    }
 
    @When("User enters password as {string}")
    public void entersPassword(String passWord) throws InterruptedException {
 
        System.out.println("Password Entered");
       // driver.findElement(By.name("txtPassword")).sendKeys(passWord);
        page.inputPassword(passWord);
       // driver.findElement(By.id("btnLogin")).submit();
        page.buttonClick();
    }
 
    @Then("User should be able to login successfully")
    public void successfulLogin() throws InterruptedException {
 
        String newPageText = SeleniumDriver.getDriver().findElement(By.id("welcome")).getText();
        System.out.println("newPageText :" + newPageText);
     //  assertThat(newPageText, containsString("Welcome"));
 
    }
 
  
    
    
    @When("^user enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void userEntersEmailAsAndPasswordAs(String email, String password)  {
       SeleniumDriver.getDriver().findElement(By.name("txtUsername")).sendKeys(email);
          SeleniumDriver.getDriver().findElement(By.name("txtPassword")).sendKeys(password);
    	

    }

    @When("I click login button")
    public void i_click_login_button() {
      // login.buttonClick();
    SeleniumDriver.getDriver().findElement(By.id("btnLogin")).click();
    	//page.buttonClick();

    }
    
    
    
    //mengakses halaman admin

@Given("I click admin menu")
public void i_click_admin_menu() {
  page.clicAdminMenu();
}
@When("I click Add button")
public void i_click_add_button() {
	page.clickAddButton();
}

@When("I enter the value")
public void i_enter_the_value() {
	SeleniumDriver.waitForPageToLoad();
    page.pilihlist();
    page.employeeName();
    page.enterUserName();
    page.Status();
    page.enterPassword();
    page.confirmPassword();
  
    
}

@Then("click save button")
public void click_save_button() {
	SeleniumDriver.waitForPageToLoad();
	page.buttonClick();
}

}
