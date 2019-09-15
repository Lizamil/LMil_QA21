package telran.hw.lesson04;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WikiLoginTest extends TestBase {

    @Test
    public void LodInTest(){
        app.wikiLogin();
        Assert.assertTrue(app.isElementPresent(By.id("pt-notifications-notice")));
        //this element exists if only you are log in
            }
}
