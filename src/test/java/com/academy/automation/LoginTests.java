package com.academy.automation;

import com.academy.automation.page.HomePage;
import com.academy.automation.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LoginTests extends BaseTest {



    @Test(dataProvider = "loginErrorData")
    public void testLoginError(String username, String passw, String expectedMsg) throws Exception {
        driver.get("http://automationpractice.com/index.php");
        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        signInLink.click();

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys(passw);
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
        String actualMsg = driver.findElement(By.xpath("//div[@id='center_column']/div/ol/li")).getText();

        Assert.assertEquals(actualMsg, expectedMsg);
    }
    @Test(dataProvider = "loginErrorData")
    public void testLoginErrorPage(String username, String passw, String expectedMsg){
        driver.get("http://automationpractice.com/index.php");

        HomePage homePage = new HomePage(driver, "");
        homePage.goToHome();
        LoginPage loginPage = homePage.clickSignIn();
        loginPage.fillEmail(username);
        loginPage.fillPassword(passw);
        loginPage.submit();
        String actualMsg = loginPage.getErrorMessage();
        Assert.assertEquals(actualMsg, expectedMsg);


    }

    @Test(dataProvider = "loginErrorData")
    public void testLoginErrorUsingPage2(String username, String passw, String expectedMsg){
        String actualMsg = new HomePage(driver, "")
                .goToHome()
                .clickSignIn()
                .fillEmail(username)
                .fillPassword(passw)
                .submit()
                .getErrorMessage();

        Assert.assertEquals(actualMsg,expectedMsg);
    }

    @Test
    @Ignore
    public void testLoginSuccess() {
    }

    @DataProvider(name = "loginErrorData")
    public Object[] LoginErrorDataProvider() throws FileNotFoundException {
        String path = "/Users/nataliiatereshchuk/Desktop/Maven/testdata/logintests.csv";
        Scanner scanner = new Scanner(new FileInputStream(path), StandardCharsets.UTF_8);
        List<String> lines = new ArrayList<>();
        //
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            System.out.println(nextLine);
            lines.add(nextLine);
        }
        scanner.close();
        Object[][] data = new Object[lines.size()][3];
        for (int i = 0; i < lines.size(); i++) {
            String[] linePart = lines.get(i).split(",");

            //
            data[i][0] = linePart[0];
            data[i][1] = linePart[1];
            data[i][2] = linePart[2];
        }
        return data;
    }

}