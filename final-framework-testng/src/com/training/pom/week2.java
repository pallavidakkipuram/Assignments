package com.training.pom;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class week2 {
	private WebDriver driver; 
	
	public week2(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	

	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	
	//create_course

	@FindBy(linkText="Create a course")
	private WebElement Create_course;
	
	public void Create_course(){
		this.Create_course.click();
	}
	
	@FindBy(id="title")
	private WebElement title;
	
    public boolean title(){
    	return this.title.isEnabled();
    	
    }
    public void title(String title){
    	this.title.sendKeys(title);
    }
    
    @FindBy(id="advanced_params")
	private WebElement advanced;
	
    public void advanced(){
    	this.advanced.click();
    }
    @FindBy(id="add_course_category_code")
    private WebElement category;
    
    public void category(){
    	Select a = new Select(category);
    	a.selectByIndex(1);
    }
    @FindBy(id="add_course_wanted_code")
	private WebElement code;
	
 
    public void code(String code){
    	this.code.sendKeys(code);
    }
    
    
    @FindBy(id="add_course_course_language")
    private WebElement language;
    
    public void language(){
    	Select b = new Select(language);
    	b.selectByIndex(5);
    }
    
    @FindBy(id="add_course_submit")
	private WebElement create_submit;
	
    public void create_submit(){
    	this.create_submit.click();
    }
    @FindBy(xpath="//*[@id='course_tools']//a")
 	private WebElement button1;
 	
 	public void button1(){
 		this.button1.click();
 	}
 	 @FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
  	private WebElement body;
  	
  	public void body(String body){
  		this.body.sendKeys(body);
  	}
    @FindBy(id="introduction_text_intro_cmdUpdate")
  	private WebElement save_intro_text;
  	
      public void save_intro_text(){
      	this.save_intro_text.click();
      }
      @FindBy(xpath="//img[contains(@title,'Course description')]")
    	private WebElement course_des;
    	
        public void course_des(){
        	this.course_des.click();
       }
        
        @FindBy(xpath="//div[@id='toolbar']//child::a/img")
     	private WebElement description;
     	
     	public void description(){
     		this.description.click();
     }
     	@FindBy(id="course_description_title")
       	private WebElement course_des_title;
       	
         public void course_des_title(String title){
         this.course_des_title.sendKeys(title);
       }
           
       @FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
       private WebElement body1;
         	
       public void body1(String body1){
       this.body1.sendKeys(body1);
       }
       @FindBy(id="course_description_submit")
      	private WebElement course_des_submit;
      	
        public void course_des_submit(){
        this.course_des_submit.click();
      }
        @FindBy(xpath="//img[contains(@title,'Objectives')]")
    	private WebElement obj;
    	
        public void obj(){
        	this.obj.click();
       }
        @FindBy(id="course_description_title")
       	private WebElement course_des_title1;
       	
         public void course_des_title1(String title1){
         this.course_des_title1.sendKeys(title1);
       }
         @FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
         private WebElement obj_body;
           	
         public void obj_body(String body2){
         this.obj_body.sendKeys(body2);
         }
         @FindBy(id="course_description_submit")
       	private WebElement obj_course_des_submit;
       	
         public void obj_course_des_submit(){
         this.obj_course_des_submit.click();
         }
         
         
         
         //topics
         
         @FindBy(xpath="//img[contains(@title,'Topics')]")
     	private WebElement topics;
     	
         public void topics(){
         	this.topics.click();
        }
         @FindBy(id="course_description_title")
        	private WebElement topic_course_des_title;
        	
          public void topic_course_des_title(String title2){
          this.topic_course_des_title.sendKeys(title2);
        }
          @FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
          private WebElement topic_body;
            	
          public void topic_body(String body3){
          this.topic_body.sendKeys(body3);
          }
          @FindBy(id="course_description_submit")
        	private WebElement topic_course_des_submit;
        	
          public void topic_course_des_submit(){
          this.topic_course_des_submit.click();
          }
          
          
          //testcase 2
          
          @FindBy(xpath="//a[contains(@title,'My courses')]")
       	private WebElement My_course;
       	
           public void My_course(){
           	this.My_course.click();
          }
           
           
           @FindBy(xpath="//img[contains(@title,'Java selenium7')]")
          	private WebElement course_present;
          	
              public void course_present(){
              	this.course_present.click();
             }
              
              
              @FindBy(xpath="//img[contains(@title,'Tests')]")
            	private WebElement click_test;
            	
                public void click_test(){
                	this.click_test.click();
               }
                @FindBy(xpath="//img[contains(@title,'Create a new test')]")
              	private WebElement create_test;
              	
              	public void create_test(){
              		this.create_test.click();
              	}
              	 @FindBy(id="exercise_title")
             	private WebElement test_name;
             	
                 public void test_name(String name){
                 	this.test_name.sendKeys(name);
                 }
                 
                 @FindBy(id="advanced_params")
              	private WebElement advanced_settings;
              	
                  public void advanced_settings(){
                  	this.advanced_settings.click();
                  }
                  @FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
                  private WebElement test_body;
                    	
                  public void test_body(String body4){
                  this.test_body.sendKeys(body4);
                  }
                  
                  
                  @FindBy(name="activate_start_date_check")
                	private WebElement start_time;
                	
                    public void start_time(){
                    	this.start_time.click();
                    }
                    
                    @FindBy(id="pass_percentage")
                	private WebElement percen;
                	
                    public void percen(String per){
                    	this.percen.sendKeys(per);
                    }
                    
                    @FindBy(id="exercise_admin_submitExercise")
                  	private WebElement proceed;
                  	
                      public void proceed(){
                      	this.proceed.click();
                      }
                      
                      @FindBy(xpath="//img[contains(@title,'Multiple choice')]")
                  	private WebElement click_multiple_choice;
                  	
                      public void click_multiple_choice(){
                      	this.click_multiple_choice.click();
                     }
                      
                      @FindBy(id="question_admin_form_questionName")
                    	private WebElement ques_name;
                    	
                        public void ques_name(String name){
                        	this.ques_name.sendKeys(name);
                        }
                        
                        @FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
                        private WebElement answers1;
                          	
                        public void answers1(String body4){
                        this.answers1.sendKeys(body4);
                        }
                        
                        
                        @FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
                        private WebElement answers2;
                        
                        @FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
                        private WebElement answers3;
                        
                        @FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
                        private WebElement answers4;
                        
                          	
                        public void answers2(String body4){
                        this.answers2.sendKeys(body4);
                        }
                        
                        public void answers3(String body5){
                            this.answers3.sendKeys(body5);
                            }
                        
                        public void answers4(String body6){
                            this.answers4.sendKeys(body6);
                            }
                        
                        
                        @FindBy(id="submit-question")
                      	private WebElement submit_ques;
                      	
                          public void submit_quest(){
                          	this.submit_ques.click();
                          }
                          @FindBy(xpath="//img[contains(@title,'Preview')]")
                        	private WebElement click_preview;
                        	
                            public void click_preview(){
                            	this.click_preview.click();
                           }
                            
                            @FindBy(xpath="//a[@class='btn btn-success btn-large']")
                            private WebElement new_test;
                              	
                            public void new_test(){
                            this.new_test.click();
                            }
                            
                            
                            @FindBy(xpath="//p[text()='selenium']//parent::label/input")
                            private WebElement sel_ans;
                              	
                            public void sel_ans(){
                            this.sel_ans.click();
                            }
                            @FindBy(xpath="//button[@class='btn btn-warning question-validate-btn']")
                            private WebElement end_test;
                              	
                            public void end_test(){
                            this.end_test.click();
                            }
                            
                            
                            
                       //test case 3
                            
                            @FindBy(xpath="//img[contains(@title,'Assessments')]")
                          	private WebElement click_assessments;
                          	
                              public void click_assessments(){
                              	this.click_assessments.click();
                             }
                          
                              
                              @FindBy(xpath="//img[contains(@title,'Add online activity')]")
                            	private WebElement click_add_online_activity;
                            	
                                public void click_add_online_activity(){
                                	this.click_add_online_activity.click();
                               }
                                
                  
                                
                                
                                @FindBy(id="add_link_submit")
                                private WebElement add;
                                  	
                                public void add(){
                                this.add.click();
                                }
                                
                                @FindBy(xpath="//img[contains(@title,'Attach certificate')]")
                            	private WebElement attach_Cer;
                            	
                                public void attach_cer(){
                                	this.attach_Cer.click();
                               }
                            
                                @FindBy(xpath="//img[contains(@title,'Assignments')]")
                            	private WebElement click_Assignments;
                            	
                                public void click_Assignments(){
                                	this.click_Assignments.click();
                               }
                                
                                @FindBy(xpath="//img[contains(@title,'Create assignment')]")
                            	private WebElement create_Assignments;
                            	
                                public void create_Assignments(){
                                	this.create_Assignments.click();
                               }
                                
                                @FindBy(id="form1_new_dir")
                            	private WebElement ass_name;
                            	
                                public void ass_name(String name){
                                	this.ass_name.sendKeys(name);
                               }
                                @FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
                                private WebElement desc;
                                
                                  	
                                public void desc(String body4){
                                this.desc.sendKeys(body4);
                                }
                                @FindBy(id="advanced_params")
                            	private WebElement ad_se;
                            	
                                public void ad_se(){
                                	this.ad_se.click();
                               }
                                @FindBy(name="qualification")
                            	private WebElement qualification;
                            	
                                public void qualification(){
                                	this.qualification.click();
                               }
                                
                                
                                @FindBy(name="submit")
                            	private WebElement validate;
                            	
                                public void validate(){
                                	this.validate.click();
                               }
                                
                              
}

