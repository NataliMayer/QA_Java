package com.academy.automation.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    private WebDriver driver;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passw")
    private WebElement passwordField;

    @FindBy(id = "submitButton")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@id='center_column']/div/ol/li")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver){
       super(driver);
    }

    @Override
    public LoginPage clickSignIn() {
        return null;
    }

    public LoginPage fillEmail(String email){
        emailField.clear();
        emailField.sendKeys(email);
        fillTextField(emailField, email);
        return this;

    }
    public LoginPage fillPassword(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
        fillTextField(passwordField, password);
        return this;
    }

    public LoginPage submit(){
        submitButton.click();
        return this;
    }
    public String getErrorMessage(){
        return errorMessage.getText();

    }
}
