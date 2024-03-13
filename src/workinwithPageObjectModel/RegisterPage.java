package workinwithPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
//Create the constructor
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	@FindBy(id = "gender-male")
	private WebElement maleradobutton;
	@FindBy(id = "gender-female")
	private WebElement femaileradiobutton;
	@FindBy(id = "Email")
	private WebElement emaildtext;
	@FindBy(name = "FirstName")
	private WebElement Firstnametext;
	@FindBy(name = "LastName")
	private WebElement Lastnametext;
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	private WebElement confirmpaswordtext;
	@FindBy(xpath = "//input[@id='register-button']")
	private WebElement registerbutton;
	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	public WebElement getRegisterlink() {
		return registerlink;
	}
	public WebElement getMaleradobutton() {
		return maleradobutton;
	}
	public WebElement getFemaileradiobutton() {
		return femaileradiobutton;
	}
	public WebElement getEmaildtext() {
		return emaildtext;
	}
	public WebElement getFirstnametext() {
		return Firstnametext;
	}
	public WebElement getLastnametext() {
		return Lastnametext;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfirmpaswordtext() {
		return confirmpaswordtext;
	}
	
}
