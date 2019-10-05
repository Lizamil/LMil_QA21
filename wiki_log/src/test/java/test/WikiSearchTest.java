package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WikiSearchTest extends TestBase {
    WebDriver driver;

    @Test
    public void wikiSearchTest() {
        String search = "gaGARinA";
        app.getSearchHelper().searchInWiki(search);
        Assert.assertTrue(app.getSearchHelper().firstHeadingContainsSearchWord(search));
            }
}

