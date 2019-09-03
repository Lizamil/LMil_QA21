package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EbaySignin extends TestBase {
    @Test
    public void loginTest() {
        openSite("https://www.ebay.com");
        initLogin();
        fillLoginForm("lizamil@ggmail.com", "lizamil1111");
        clickConfirm();
    }

}

