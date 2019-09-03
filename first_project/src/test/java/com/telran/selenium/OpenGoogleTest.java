package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class OpenGoogleTest extends TestBase{

    @Test
    public void searchJavaTest() throws InterruptedException {
        openSite("https://www.google.com");
        // or  driver.navigate().to(); it's the same
        type(By.name("q"),"java"+ Keys.ENTER);
        Thread.sleep(8000);
    }

   /* @Test
    public void ImLucky() throws InterruptedException {
       new Actions(driver).
               moveToElement(driver.findElement(By.name("btnI"))).click().perform();
        Thread.sleep(8000);
    }*/

}