package com.training.sanity.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class week1 {

	private static WebDriver driver;
	private static String baseUrl;
	private static com.training.pom.week1 loginPOM;
	private static Properties properties;
	private static ScreenShot screenShot;
	private static ExtentReports extent;
	private static ExtentTest logger;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/pallavi.html",true);
	    extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new com.training.pom.week1(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	    logger = extent.startTest("registering, login, changing password");
	    logger.log(LogStatus.PASS,"http://elearning.upskills.in ,application opened");
	   
		 
	}

	
	@Test(priority=1)
	public void registration(){
		loginPOM.signup();
		loginPOM.sendfirstname("pallavi");
		logger.log(LogStatus.PASS,"populated firstname");
		loginPOM.sendlastname("dakkipuram");
		logger.log(LogStatus.PASS,"populated last name");
		loginPOM.sendemail("pallavid.777@gmail.com");
		logger.log(LogStatus.PASS,"populated email id");
		loginPOM.sendreg_username("pallavi12");
		logger.log(LogStatus.PASS,"populated password");
		loginPOM.sendpass1("Test@9");
		loginPOM.sendpass2("Test@9");
		loginPOM.sendreg_phone("4485394850");
		loginPOM.clickreg_button();
		screenShot.captureScreenShot("register1");
		 logger.log(LogStatus.PASS,"user is registered successfully");
		loginPOM.pall_da();
		loginPOM.logout_button();
	
		
	
		
	}
	@Test(priority=2)
	public void validLoginTest() {
		
		loginPOM.sendUserName("pallavi12");
		loginPOM.sendPassword("Test@9");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("login1");
		logger.log(LogStatus.PASS,"user is able to login successfully");
	
	}
	@Test(priority=3)
	public void change_pwd() {
		loginPOM.edit_profile();
		loginPOM.sendpr_pass("Test@9");
		loginPOM.sendpr_pass1("Login@123457");
		loginPOM.sendpr_pass2("Login@123457");
		loginPOM.apply_changes();
		logger.log(LogStatus.PASS,"user is able to change pwd");
		screenShot.captureScreenShot("pwd1");
		extent.endTest(logger);
		extent.flush();
		extent.close();
			
	}
}
