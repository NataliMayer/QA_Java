package com.academy.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    protected void fillTextField(WebElement field, String value) {
        field.clear();
        field.sendKeys(value);
    }

    public abstract LoginPage clickSignIn();
}
