package com.training.pom;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class week1 {
	private WebDriver driver; 
	
	public week1(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="registration_submit")
	private WebElement reg_button; 
	
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(linkText="Sign up!")
	private WebElement signup;
	
	@FindBy(id="registration_firstname")
	private WebElement firstname;
	
	
	@FindBy(id="registration_lastname")
	private WebElement lastname;
	
	@FindBy(id="registration_email")
	private WebElement email;
	
	@FindBy(id="username")
	private WebElement reg_username;
	
	
	@FindBy(id="pass1")
	private WebElement pass1;
	
	@FindBy(id="pass2")
	private WebElement pass2;
	
	@FindBy(id="registration_phone")
	private WebElement reg_phone;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendfirstname(String firstname) {
           this.firstname.sendKeys(firstname);
	}
	
	public void sendreg_username(String reg_username) {
        this.reg_username.sendKeys(reg_username);
	}
	
	
	public void sendreg_phone(String reg_phone) {
        this.reg_phone.sendKeys(reg_phone);
	}
	public void sendemail(String email) {
        this.email.sendKeys(email);
	}
	
	public void sendlastname(String lastname) {
        this.lastname.sendKeys(lastname);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	
	public void sendpass1(String pass1) {
		this.pass1.sendKeys(pass1); 
	}
	
	public void sendpass2(String pass2) {
		this.pass2.sendKeys(pass2); 
	}
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	
	public void clickreg_button() {
		this.reg_button.click(); 
	}
	public void signup(){
		this.signup.click();
	}
	
	
	//for test case 3
	
	@FindBy(linkText="Edit profile")
	private WebElement edit_profile;
	
	public void edit_profile(){
		this.edit_profile.click();
	}
	@FindBy(id="profile_password0")
	private WebElement pro_pass;

   public void sendpr_pass(String pro_pass) {
	this.pro_pass.sendKeys(pro_pass); 
    }
   @FindBy(id="password1")
	private WebElement pro_pass1;

  public void sendpr_pass1(String pro_pass1) {
	this.pro_pass1.sendKeys(pro_pass1); 
   }
  @FindBy(id="profile_password2")
 	private WebElement pro_pass2;

   public void sendpr_pass2(String pro_pass2) {
 	this.pro_pass2.sendKeys(pro_pass2); 
    }
   @FindBy(id="profile_apply_change")
	private WebElement apply_changes;
   
   public void apply_changes(){
		this.apply_changes.click();
	}
    
   @FindBy(id="logout_button")
  	private WebElement logout_button;
     
     public void logout_button(){
  		this.logout_button.click();
  	}
     @FindBy(css="a.dropdown-toggle")
 	private WebElement pall_da;
 	
 	public void pall_da(){
 		this.pall_da.click();
 	}
}
