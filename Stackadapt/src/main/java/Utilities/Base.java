package Utilities;

import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {


    public WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver() throws IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/Data Properties");

        prop.load(fis);
        String browserName = prop.getProperty("browser");
        System.out.println(browserName);
        // execute in chrome driver
        if (browserName.equals("chrome"))

        {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--window-size=1920,1080");
            chromeOptions.addArguments("--start-maximized");
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions); /// Chrome Headless

            chromeOptions.addArguments("--disable-dev-shm-usage");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--disable-gpu");


            // execute in firefox driver
        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();

            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--headless");
            desiredCapabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);

            driver = new FirefoxDriver(desiredCapabilities); // Warning to be removed
            //execute in edge driver
        }
        /* else if (browserName.equals("Edge")) {
            // Edge code
            WebDriverManager.edgedriver().setup();

   			EdgeOptions options= new EdgeOptions();
    			options.addArguments("headless");
    			options.addArguments("disable-gpu");
    			driver = new EdgeDriver(options);
    			Dimension dimension = new Dimension(1920, 1080);
    			driver.manage().window().setSize(dimension);

        }*/

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }

    public void getScreenshot(String result) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Test\\" + result + "screenshot.png"));

    }

    public static String generateRandomName(int length) {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String randomString = sb.toString();
        return randomString;
    }

    // -----------------------------------------------------------//

    public static String generateRandomNumber(int length) {
        char[] chars = "0123456789".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String randomString = sb.toString();
        return randomString;
    }

    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String timestamp = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
            String Date = new SimpleDateFormat("MM-dd").format(new Date());
            FileUtils.copyFile(source,
                    new File("./test-output/Snapshots/" + Date + "/" + screenshotName + "_" + timestamp + ".png"));
            System.out.println(
                    "Screenshot of failed test case is taken and stored at location .\\test-output\\Snapshots.");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot. " + e.getMessage());
        }
    }

}

