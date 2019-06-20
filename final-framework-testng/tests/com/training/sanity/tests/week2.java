package com.training.sanity.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
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

public class week2 {

	private static WebDriver driver;
	private static String baseUrl;
	private static com.training.pom.week2 week2;
	private static Properties properties;
	private static ScreenShot screenShot;
	private static ExtentReports extent;
	private static ExtentTest logger;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/pallavi1.html",true);
	    extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		week2 = new com.training.pom.week2(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	    logger = extent.startTest("registering, login, changing password");
	    logger.log(LogStatus.PASS,"http://elearning.upskills.in ,application opened");
	   
		 
	}

	//logging as teacher
	@Test(priority=1)
	public void login_as_teacher(){
		week2.sendUserName("pallavikalle");
		week2.sendPassword("pallavikalle");
		week2.clickLoginBtn();
		logger.log(LogStatus.PASS,"user is able to login successfully as a teacher");
	}
	
	//test case 1 : To verify whether application allows teacher  to create a course, add description, objective & Topics
	@Test(priority=2)
	public void create_course() throws InterruptedException{
	    week2.Create_course();
	    logger.log(LogStatus.PASS,"Add a new course page is displayed");
	    if(week2.title()){
	    	week2.title("Java selenium Webdriver");
	    	logger.log(LogStatus.PASS,"course name is selenium");
	    }
	    else
	    {
	    	System.out.println("field is not editable");
	    }
	    week2.advanced();
	    week2.category();
	    week2.code("java selenium webdriver");
	    week2.language();
	    week2.create_submit();
	    week2.button1();
	    Thread.sleep(7000);
	    WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, intro_content')]"));
        driver.switchTo().frame(iframe);
        Thread.sleep(7000);
	    week2.body("It is a selenium introduction course");
	    driver.switchTo().parentFrame();
	    Thread.sleep(4000);
	    week2.save_intro_text();
	    Thread.sleep(3000);
	    week2.course_des();
	    Thread.sleep(7000);
	    week2.description();
	    week2.course_des_title("Selenium course for beginners");
	    Thread.sleep(5000);
	    WebElement iframe1 = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, contentDescription')]"));
        driver.switchTo().frame(iframe1);
        Thread.sleep(7000);
        week2.body1("selenium course for begineers");
        driver.switchTo().parentFrame();
        week2.course_des_submit();
        week2.obj();
        week2.course_des_title1("selenium course for beginners");
        WebElement iframe2 = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, contentDescription')]"));
        driver.switchTo().frame(iframe2);
        Thread.sleep(3000);
        week2.obj_body("selenium course for begineers");
        driver.switchTo().parentFrame();
        week2.obj_course_des_submit();
        week2.topics();
        week2.topic_course_des_title("selenium course for begineers");
        Thread.sleep(5000);
	    WebElement iframe3 = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, contentDescription')]"));
        driver.switchTo().frame(iframe3);
        Thread.sleep(7000);
        week2.obj_body("selenium course for begineers");
        driver.switchTo().parentFrame();
        week2.obj_course_des_submit();
	}      
        
        //test case 2 : To verify whether application allows teacher to create a Test
        @Test(priority=3)
    	public void create_Test() throws InterruptedException{
    	week2.My_course();
    	week2.course_present();
    	week2.click_test();
    	week2.create_test();
    	week2.test_name("creating new test");
    	week2.advanced_settings();
    	WebElement iframe4 = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, exerciseDescription')]"));
        driver.switchTo().frame(iframe4);
        Thread.sleep(3000);
        week2.test_body("quiz");
        driver.switchTo().parentFrame();
        week2.start_time();
        week2.percen("90");
        week2.proceed();
        week2.click_multiple_choice();
        week2.ques_name("Java based selenium web driver");
        WebElement iframe5 = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, answer[1]')]"));
        driver.switchTo().frame(iframe5);
        Thread.sleep(3000);
        week2.answers1("selenium");
        driver.switchTo().parentFrame();
        Thread.sleep(3000);
        WebElement iframe6 = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, answer[2]')]"));
        driver.switchTo().frame(iframe6);
        Thread.sleep(3000);
        week2.answers2("c");
        driver.switchTo().parentFrame();
        Thread.sleep(3000);
        WebElement iframe7 = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, answer[3]')]"));
        driver.switchTo().frame(iframe7);
        Thread.sleep(3000);
        week2.answers3("python");
        driver.switchTo().parentFrame();
        Thread.sleep(3000);
        WebElement iframe8 = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, answer[4]')]"));
        driver.switchTo().frame(iframe8);
        Thread.sleep(3000);
        week2.answers4("ruby");
        driver.switchTo().parentFrame();
        week2.submit_quest();
        week2.click_preview();
        week2.new_test();
        week2.sel_ans();
        week2.end_test();
    	
    	    
	}
        
        //test case 3: O verify whether application allows teacher to add assessment as online activity & Attach certificate
        
        @Test(priority=4)
    	public void attach_certificate() throws InterruptedException{
    	week2.My_course();
    	week2.course_present();
    	week2.click_assessments();
    	week2.click_add_online_activity();
    	driver.findElement(By.xpath("//div[@class='filter-option-inner']")).click();
    	Thread.sleep(5000); 
    	Actions act = new Actions(driver); 
    	act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
    	week2.add();
    	week2.attach_cer();
        }
        
        
        //test case 4 : To Verify whether application allows teacher to add assignments & change default settings
        @Test(priority=4)
    	public void change_settings() throws InterruptedException{
    	week2.My_course();
    	week2.course_present();
    	week2.click_Assignments();
    	week2.create_Assignments();
    	week2.ass_name("selenium");
    	Thread.sleep(3000);
        WebElement iframe9 = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, description')]"));
        driver.switchTo().frame(iframe9);
        week2.desc("test");
        driver.switchTo().parentFrame();
        week2.ad_se();
        week2.qualification();
        week2.validate();
        }

}
