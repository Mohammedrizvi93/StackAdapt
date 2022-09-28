package Utilities.Pom_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_page_pom {

    public WebDriver driver;

    //------------------------------Home Page Elements----------------------------------------------//
    //Home page Header
    By Home_page_header_StackAdapt = By.xpath("//*[@class='sa-logo']");
    By Home_page_header_Product = By.xpath("//*[@class='sa-link-product sa-link']");
    By Home_page_header_industries = By.xpath("//*[@class='sa-link-industries sa-link']");
    By Home_page_header_whyStackAdapt = By.xpath("//*[@class='sa-link-why sa-link']");
    By Home_page_header_resources = By.xpath("//*[@class='sa-link-resources sa-link']");
    By Home_page_header_login = By.xpath("//*[@class='sa-link px-2']");
    By Home_page_header_requestDemo = By.xpath("//*[@href='/get-started'][1]");


    public Home_page_pom(WebDriver driver) {
        // TODO Auto-generated constructor stub
        this.driver = driver;

    }

//----------------------------------Defining Home Page WebElement below-----------------------------//
    //  Homepage header StackAdapt
    public WebElement getHome_page_header_StackAdapt() {
        return driver.findElement(Home_page_header_StackAdapt);
    }
    // Home page header Product
    public WebElement getHome_page_header_Product() {
        return driver.findElement(Home_page_header_Product);
    }
    //Home page header industries
    public WebElement getHome_page_header_industries() {
        return driver.findElement(Home_page_header_industries);
    }
    //Home page header whyStackAdapt
    public WebElement getHome_page_header_whyStackAdapt() {
        return driver.findElement(Home_page_header_whyStackAdapt);
    }
    // Home page header resources
    public WebElement getHome_page_header_resources() {
        return driver.findElement(Home_page_header_resources);
    }
    // Home page header login
    public WebElement getHome_page_header_login() {
        return driver.findElement(Home_page_header_login);
    }
    // Home page header requestDemo
    public WebElement getHome_page_header_requestDemo() {
        return driver.findElement(Home_page_header_requestDemo);
    }








}
