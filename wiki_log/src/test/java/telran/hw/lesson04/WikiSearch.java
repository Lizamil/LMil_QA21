package telran.hw.lesson04;

import org.testng.annotations.Test;

public class WikiSearch extends TestBase {

    @Test
    public void wikiSearchTest() {
      app.searchInWiki("Gagarin");
      }

    }

