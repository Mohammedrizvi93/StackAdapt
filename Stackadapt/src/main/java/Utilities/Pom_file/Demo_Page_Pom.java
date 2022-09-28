package Utilities.Pom_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Demo_Page_Pom {
    public WebDriver driver;

    //------------------------------Demo Page Elements----------------------------------------------//
    //Demo page
    By Demo_page_first_name = By.xpath("//*[@name='first_name']");
    By Demo_page_last_name = By.xpath("//*[@name='last_name']");
    By Demo_page_business_email = By.xpath("//*[@name='email']");
    By Demo_page_phone_number = By.xpath("//*[@name='phone']");
    By Demo_page_company_name = By.xpath("//*[@name='company_name']");
    By Demo_page_job_title = By.xpath("//*[@name='job_title']");
    By Demo_page_company_type = By.xpath("//*[@name='company_type']");
    By Demo_page_company_type_Brand = By.xpath("//*[@value='Brand']");
    By Demo_page_company_type_Publisher = By.xpath("//*[@value='Publisher']");
    By Demo_page_company_type_Affiliate = By.xpath("//*[@value='Affiliate]");
    By Demo_page_company_type_Other = By.xpath("");
    By Demo_page_company_size = By.xpath("//*[@name='company_size']");
    By Demo_page_country = By.xpath("//*[@name='country']");
    By Demo_page_country_United_States = By.xpath("//*[@value='United States']");
    By Demo_page_country_Canada = By.xpath("//*[@value='Canada']");
    By Demo_page_country_Other = By.xpath("//*[@name='company_size']/following::option[@value='Other']");
    By Demo_page_annual_programmatic_budget = By.xpath("//*[@name='budget']");
    By Demo_page_how_are_looking_to_working_with_us = By.xpath("//*[@name='intention']");
    By Demo_page_I_consent_to_my_data_being_collected_and_stored = By.xpath("//*[@class='form-check-label']");
    By Demo_page_submit_button = By.xpath("//*[@type='submit']");


    public Demo_Page_Pom(WebDriver driver) {
        // TODO Auto-generated constructor stub
        this.driver = driver;

    }
    //----------------------------------Defining Demo Page WebElement below-----------------------------//
    //Demo page
    // Demo page first name
    public WebElement getDemo_page_first_name() {
        return driver.findElement(Demo_page_first_name);
    }
    // Demo page last name
    public WebElement getDemo_page_last_name() {
        return driver.findElement(Demo_page_last_name);
    }
    // Demo page business email
    public WebElement getDemo_page_business_email() {
        return driver.findElement(Demo_page_business_email);
    }
    // Demo page phone number
    public WebElement getDemo_page_phone_number() {
        return driver.findElement(Demo_page_phone_number);
    }
    // Demo page company name
    public WebElement getDemo_page_company_name() {
        return driver.findElement(Demo_page_company_name);
    }
    // Demo page job title
    public WebElement getDemo_page_job_title() {
        return driver.findElement(Demo_page_job_title);
    }
    // Demo page company type
    public WebElement getDemo_page_company_type() {
        return driver.findElement(Demo_page_company_type);
    }
    // Demo page company type Brand
    public WebElement getDemo_page_company_type_Brand() {
        return driver.findElement(Demo_page_company_type_Brand);
    }
    // Demo page company type Publisher
    public WebElement getDemo_page_company_type_Publisher() {
        return driver.findElement(Demo_page_company_type_Publisher);
    }
    // Demo page company type Affiliate
    public WebElement getDemo_page_company_type_Affiliate() {
        return driver.findElement(Demo_page_company_type_Affiliate);
    }
    // Demo page company type Other
    public WebElement getDemo_page_company_type_Other() {
        return driver.findElement(Demo_page_company_type_Other);
    }
    // Demo page company size
    public WebElement getDemo_page_company_size() {
        return driver.findElement(Demo_page_company_size);
    }
    // Demo page country
    public WebElement getDemo_page_country() {
        return driver.findElement(Demo_page_country);
    }
    // Demo page country United States
    public WebElement getDemo_page_country_United_Statesy() {
        return driver.findElement(Demo_page_country_United_States);
    }
    // Demo page country Canada
    public WebElement getDemo_page_country_Canada() {
        return driver.findElement(Demo_page_country_Canada);
    }
    // Demo_page_country_Other
    public WebElement getDemo_page_country_Other() {
        return driver.findElement(Demo_page_country_Other);
    }
    // Demo page annual programmatic budget
    public WebElement getDemo_page_annual_programmatic_budget() {
        return driver.findElement(Demo_page_annual_programmatic_budget);
    }
    // Demo page how are looking to working with us
    public WebElement getDemo_page_how_are_looking_to_working_with_us() {
        return driver.findElement(Demo_page_how_are_looking_to_working_with_us);
    }
    // By Demo page I consent to my data being collected and stored
    public WebElement getDemo_page_I_consent_to_my_data_being_collected_and_stored() {
        return driver.findElement(Demo_page_I_consent_to_my_data_being_collected_and_stored);
    }
    //Demo page submit button
    public WebElement getDemo_page_submit_button() {
        return driver.findElement(Demo_page_submit_button);
    }







}
