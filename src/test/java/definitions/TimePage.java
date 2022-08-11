package definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.SeleniumDriver;

public class TimePage {

	
	
	

@Given("I click time menu")
public void i_click_time_menu() {
	
	SeleniumDriver.getDriver().findElement(By.xpath("//b[normalize-space()='Time']")).click();
}

@When("I click click view button")
public void i_click_click_view_button() {
	SeleniumDriver.getDriver().findElement(By.xpath("//td[@class='9##27##2020-09-07']//a[@id='viewSubmitted']")).click();
}

@When("I Click edit button")
public void i_click_edit_button() {
	SeleniumDriver.getDriver().findElement(By.xpath("//input[@id='btnEdit']")).click();
}

@Then("I update some data")
public void i_update_some_data() {
	SeleniumDriver.getDriver().findElement(By.xpath("//input[@id='initialRows_0_projectName']")).clear();
	SeleniumDriver.getDriver().findElement(By.xpath("//input[@id='initialRows_0_projectName']")).sendKeys("Diganti mbak winda sek ayu dewe");
 Select activity=new Select(SeleniumDriver.getDriver().findElement(By.xpath("//select[@id='initialRows_0_projectActivityName']")));
 activity.selectByIndex(3);
 SeleniumDriver.getDriver().findElement(By.xpath("//input[@id='initialRows_0_0']")).sendKeys("20");
	SeleniumDriver.getDriver().findElement(By.xpath("initialRows_0_TimesheetItemId0")).click();
	SeleniumDriver.getDriver().findElement(By.xpath("//textarea[@id='timeComment']")).sendKeys("ada kalanya kita merasakan sebuah rasa sedih");
	SeleniumDriver.getDriver().findElement(By.xpath("#commentSave")).click();
	
}

}
