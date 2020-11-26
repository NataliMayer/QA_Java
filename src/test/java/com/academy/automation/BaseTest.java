package com.academy.automation;

import com.academy.automation.selenide.page.TestListener;
import io.qameta.allure.Attachment;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


import static org.testng.Assert.fail;


@Listeners(TestListener.class)
public class BaseTest {
    protected WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void setUp(@Optional("firefox") String browser) throws Exception {
        // System.setProperty("webdriver.chrome.driver", "/Users/nataliiatereshchuk/Desktop/Maven/driver/chromedriver");
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/nataliiatereshchuk/Desktop/Maven/driver/chromedriver");
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "/Users/nataliiatereshchuk/Desktop/Maven/driver2/geckodriver");

        }


        System.setProperty("webdriver.gecko.driver", "/Users/nataliiatereshchuk/Desktop/Maven/driver2/geckodriver");
        // driver = new ChromeDriver();
        driver = new FirefoxDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] makeScreenshot() {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

}






