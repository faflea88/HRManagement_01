package page.locator;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LocatorPage {
	

	@FindBy(how= How.NAME,using="txtUsername")
    public WebElement txtUserName;
	
	@FindBy(how= How.NAME,using="txtPassword")
    public WebElement txtPassword;
	
	@FindBy(how= How.ID,using="btnLogin")
    public WebElement btnLogin;
	
	@FindBy(how= How.ID,using="welcome")
    public WebElement Welcome;
	
	@FindBy(how=How.XPATH,using="//input[@id='btnSave']")
    public WebElement Savebutton;
	

	@FindBy(how=How.XPATH,using="//select[@id='systemUser_userType']")
    public WebElement pilih;
	
	
	
	@FindBy(how=How.XPATH,using="//input[@id='systemUser_employeeName_empName']")
    public WebElement employeeName;
	
	
	@FindBy(how=How.XPATH,using="//li[@class='ac_even ac_over']")
    public WebElement selectemployee;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='systemUser_userName']")
    public WebElement enterUserName;
	
	
	@FindBy(how=How.XPATH,using="//select[@id='systemUser_status']")
    public WebElement selectStatus;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='systemUser_password']")
    public WebElement enterPassword;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='systemUser_confirmPassword']")
    public WebElement enterPassword11;
	
	
	@FindBy(how=How.XPATH,using="//b[normalize-space()='Admin']")
    public WebElement clickAdminMenu;
	
	@FindBy(how=How.XPATH,using="//input[@id='btnAdd']")
    public WebElement clickAddButton;
	

	
	
	
	
}
