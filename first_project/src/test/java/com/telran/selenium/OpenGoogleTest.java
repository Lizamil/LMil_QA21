package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class OpenGoogleTest extends TestBase{

    @Test
    public void searchJavaTest() throws InterruptedException {
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("java"+ Keys.ENTER);
        Thread.sleep(8000);
    }

   /* @Test
    public void ImLucky() throws InterruptedException {
       new Actions(driver).
               moveToElement(driver.findElement(By.name("btnI"))).click().perform();
        Thread.sleep(8000);
    }*/

}