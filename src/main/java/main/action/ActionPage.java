package main.action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import page.locator.LocatorPage;
import util.SeleniumDriver;

public class ActionPage {
	
	LocatorPage locator=new LocatorPage();

	
    // WebDriver driver;
     
 	//@FindBy(how=How.XPATH,using="//input[@id='btnSave']")
   // public WebElement Savebutton;
	
	public ActionPage() {
		this.locator=new LocatorPage();
		  AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(SeleniumDriver.getDriver(),10);
	         PageFactory.initElements(factory,this.locator);
		//PageFactory.initElements(SeleniumDriver.getDriver(),loginPage);
		//this.driver=driver;
	}
	
	public void inputEmail(String email) {
	//	loginPage.txtUserName.sendKeys(email);
		locator.txtUserName.sendKeys(email);

	}

	public void inputPassword(String password){
		//loginPage.txtPassword.sendKeys(password);
	}
	
	public void buttonClick() {
		//Savebutton.click();
		locator.Savebutton.click();
	}
	
	public void clickSave() {
		//loginPage.Savebutton.click();
	}
	
	public void pilihlist() {
		Select list=new Select(locator.pilih);
		list.selectByIndex(1);
	}
	
	public void employeeName() {
		locator.employeeName.sendKeys(Keys.SPACE);
		locator.selectemployee.click();
		
	}
	
	public void enterUserName() {
		locator.enterUserName.sendKeys("halloo115");
	}
	public void enterPassword() {
		locator.enterPassword.sendKeys("hatikuhancur1!");
	}
	public void confirmPassword() {
		locator.enterPassword11.sendKeys("hatikuhancur1!");
	}
	
	
	public void Status() {
		Select list=new Select(locator.selectStatus);
		list.selectByIndex(1);
	}
	

	public void clickAddButton() {
		locator.clickAddButton.click();
	}
	
	public void clicAdminMenu() {
		locator.clickAdminMenu.click();
	}
	
	
	
}

