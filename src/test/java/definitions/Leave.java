package definitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.SeleniumDriver;

public class Leave {

	
	
	
	
	
	@Given("I click Leave menu")
	public void i_clicgetDriverk_leave_menu() {
		SeleniumDriver.setUpDriver();
	  SeleniumDriver.getDriver().findElement(By.xpath("//b[normalize-space()='Leave']")).click();
	 
	}

	@When("I click From date")
	public void i_click_from_date() {
		SeleniumDriver.getDriver().findElement( By.xpath("//input[@id='calFromDate']")).click();
	//	SeleniumDriver.getDriver().findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		

		  WebElement l =SeleniumDriver.getDriver().findElement (By.id("calFromDate"));
				 
		 List<WebElement> t =SeleniumDriver.getDriver().findElements(By.xpath("//table/tbody/tr/td"));
	      //list traversal
	      for (int k = 0; k<t.size(); k++) {
	         //check date
	         String dt = t.get(k).getText();
	         if (dt.equals("2")) {
	            t.get(k).click();
	            break;
	         }
	      }
	      //obtain selected date
	      String v = l.getAttribute("value");
	      System.out.print("Date selected by date picker: "+ v);
	      //close browser
	}

	@When("I Click To date")
	public void i_click_to_date() {
		SeleniumDriver.getDriver().findElement( By.xpath("//input[@id='calToDate']")).click();
		//	SeleniumDriver.getDriver().findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
			

			  WebElement l =SeleniumDriver.getDriver().findElement (By.id("calToDate"));
					 
			 List<WebElement> t =SeleniumDriver.getDriver().findElements(By.xpath("//table/tbody/tr/td"));
		      //list traversal
		      for (int k = 0; k<t.size(); k++) {
		         //check date
		         String dt = t.get(k).getText();
		         if (dt.equals("2")) {
		            t.get(k).click();
		            break;
		         }
		      }
		      //obtain selected date
		      String v = l.getAttribute("value");
		      System.out.print("Date selected by date picker: "+ v);
		      //close browser
		
	}

	@Then("click show leave with status")
	public void click_show_leave_with_status() {
		SeleniumDriver.getDriver().findElement( By.xpath("//input[@id='leaveList_chkSearchFilter_-1']")).click();
	}

	@Then("selected employee")
	public void selected_employee() {
		SeleniumDriver.getDriver().findElement( By.xpath("//input[@id='leaveList_txtEmployee_empName']")).sendKeys(Keys.SPACE);
		SeleniumDriver.getDriver().findElement( By.xpath("//li[@class='ac_even ac_over']")).click();
	}

	@Then("selected sub unit")
	public void selected_sub_unit() {
	
		Select list=new Select(SeleniumDriver.getDriver().findElement( By.xpath("//select[@id='leaveList_cmbSubunit']")));
		list.selectByIndex(4);
	}

	@Then("selected include past employess")
	public void selected_include_past_employess() {
		SeleniumDriver.getDriver().findElement( By.xpath("//input[@id='leaveList_cmbWithTerminated']")).click();
	}

	@Then("click search")
	public void click_search() {
		SeleniumDriver.getDriver().findElement( By.xpath("//input[@id='btnSearch']")).click();
	}

}
