package com.academy.automation.selenide;

import com.academy.automation.selenide.page.HomePage;
import com.codeborne.selenide.Configuration;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;


public class LoginTests {

    @Description("Тест логин формы")

    @Issue("1234")
    @Issue("4532")


    @BeforeClass
    public void setUp() {
        Configuration.browser = "firefox";
        Configuration.baseUrl = "http://automationpractice.com/index.php";
        Configuration.startMaximized = true;
        Configuration.timeout = 10;

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
        );


    }




    @Test(dataProvider = "loginErrorProvider")
    public void testLoginError(String username, String password, String expectedMsg) {
       // open(Configuration.baseUrl);
        //$(By.linkText("Sign in")).click();
       // $(By.id("email")).sendKeys(username);
       // $(By.id("passwd")).sendKeys(password);
      //  $(By.xpath("//button[@id='SubmitLogin']/span")).click();
        //String actualMsg = $(By.xpath("//div[@id='center_column']/div/ol/li")).getText();

        //Assert.assertEquals(actualMsg, expectedMsg);

        String actualMsg =
                new HomePage()
                        .goToHome()
                        .clickSignIn()
                        .fillEmail(username)
                        .fillPassword(password)
                        .submit()
                        .getErrorMessage();

        Assert.assertEquals(actualMsg, expectedMsg);


    }


    @AfterClass
    public void tearDown() {
        closeWindow();
    }

    @DataProvider
    public Object[][] loginErrorProvider() {
        return new Object[][] {
                {"user","123","Invalid email address."}
        };
    }
}