package StackAdapt_Assigment;

import Utilities.Base;
import Utilities.Pom_file.Demo_Page_Pom;
import Utilities.Pom_file.Home_page_pom;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Timeout;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Demo_Page extends Base{
    WebDriver driver;
    public static Logger log = LogManager.getLogger(Base.class.getName());

    @Parameters("browser")
    @BeforeTest
    public void initialize() throws Exception {
        //calling the initializerDriver from Base file
         driver = initializeDriver();
         driver.get(prop.getProperty("HomepageURL"));
         driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS );
    }


    @Test(enabled = true)
    public void Demo_sign_up() throws InterruptedException {
        try {
            Home_page_pom Hp = new Home_page_pom(driver);
            Demo_Page_Pom Dp = new Demo_Page_Pom(driver);

            Thread.sleep(1000);
            // Click on Request Demo using mouse action
            Actions mouseAction = new Actions(driver);
            WebElement element = Hp.getHome_page_header_requestDemo();
            mouseAction.moveToElement(element).perform();


            Thread.sleep(5000);

            //Click and enter the Firstname in input field
            Dp.getDemo_page_first_name().click();
            Dp.getDemo_page_first_name().sendKeys(prop.getProperty("Firstname"));
            Thread.sleep(3000);

            //Click and enter the Lastname in input field
            Dp.getDemo_page_last_name().click();
            Dp.getDemo_page_last_name().sendKeys(prop.getProperty("Lastname"));
            Thread.sleep(3000);



            //Click and enter the business email in input field
            Dp.getDemo_page_business_email().click();
            Dp.getDemo_page_business_email().sendKeys(prop.getProperty("BusinessEmail"));
            Thread.sleep(3000);


            //Click and enter the Phone Number in input field
            Dp.getDemo_page_phone_number().click();
            Dp.getDemo_page_phone_number().sendKeys(prop.getProperty("Phonenumber"));
            Thread.sleep(3000);


            //Click and enter the Company Name in input field
            Dp.getDemo_page_company_name().click();
            Dp.getDemo_page_company_name().sendKeys(prop.getProperty("Companyname"));
            Thread.sleep(3000);


            //Click and enter the job title in input field
            Dp.getDemo_page_job_title().click();
            Dp.getDemo_page_job_title().sendKeys(prop.getProperty("Jobtitle"));
            Thread.sleep(3000);


            //Click on company type and select Publisher
            Dp.getDemo_page_company_type().click();
            Thread.sleep(1000);
            Dp.getDemo_page_company_type_Publisher().click();
            Thread.sleep(3000);


            //Click on country and select other
            Dp.getDemo_page_country().click();
            Thread.sleep(1000);
            Dp.getDemo_page_country_Other().click();
            Thread.sleep(3000);


            //deselect "I consent to my data being collected and stored"
            Dp.getDemo_page_I_consent_to_my_data_being_collected_and_stored().click();
            Thread.sleep(3000);


            //Click on the submit button
             Dp.getDemo_page_submit_button().click();


        } catch (Exception e) {
            e.printStackTrace();
            //Take a screen when the script fails
            Base.captureScreenshot(driver, "Demo_sign_up");
            Assert.fail();
            log.error("Demo_page");
            log.error(e.getMessage());
            Thread.sleep(3000);

        }

    }
    @AfterTest
    public void CloseBrowser() throws InterruptedException{
        driver.close();
        driver = null;
    }




}
