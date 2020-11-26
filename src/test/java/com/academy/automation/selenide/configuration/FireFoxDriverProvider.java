package com.academy.automation.selenide.configuration;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class FireFoxDriverProvider implements WebDriverProvider {

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        System.setProperty("webdriver.gecko.driver", "/Users/nataliiatereshchuk/Desktop/Maven/driver2/geckodriver");
        System.out.println("**************");


        return new FirefoxDriver();
    }

}