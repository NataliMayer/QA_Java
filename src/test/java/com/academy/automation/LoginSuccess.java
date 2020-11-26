package com.academy.automation;

import org.junit.Test;
import org.openqa.selenium.By;

public class LoginSuccess extends BaseTest {

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("vfvf");
        driver.findElement(By.xpath("//form[@id='login_form']/div")).click();
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("ffe");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("https://github.com/Oleg-Afanasiev/qa-ja-09/tree/master/src/test/java/com/academy/automation");
        driver.findElement(By.linkText("Contact us")).click();
        driver.findElement(By.linkText("Contact us")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("Lana123T");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("nataliia_tereschuk@ukr.net");
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
    }

}