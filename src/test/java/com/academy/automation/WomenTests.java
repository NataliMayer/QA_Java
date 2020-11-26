package com.academy.automation;

import com.academy.automation.page.WomanPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTests extends BaseTest {
    @Test
    public void testWomanPage(){
        WomanPage womanPage = new WomanPage(driver);
        womanPage.goToWomen();
        Assert.assertEquals(womanPage.getWomenHeader().trim(),"WOMEN");
    }
}
