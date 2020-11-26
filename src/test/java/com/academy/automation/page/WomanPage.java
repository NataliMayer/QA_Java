package com.academy.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomanPage extends BasePage{
     @FindBy(xpath = "//*[@id='center_column']/h1/span[1]")
     private WebElement womenHeader;

    public WomanPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPage clickSignIn() {
        return null;
    }

    public WomanPage goToWomen(){
        driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
        return this;
    }
    public String getWomenHeader(){
        return womenHeader.getText();
    }
}
