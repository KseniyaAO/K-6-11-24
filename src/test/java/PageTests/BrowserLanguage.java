package PageTests;

import PageObjects.BrowserLanguagePage;
import PageObjects.MainPage;
import PageTests.BaseTest;
import com.google.common.collect.Range;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserLanguage extends BaseTest {

    @Test
    public void testFirstItemZeroNine(){
        MainPage mainPage = new MainPage ( driver );
        mainPage.openBasePage ();
        BrowserLanguagePage browserLanguagePage = mainPage.navigateToBrowseLanguage();
        Assert.assertTrue(browserLanguagePage.verifyFirstMenuZeroNine());

    }
@Test
public void testFirstItem(){
    MainPage mainPage = new MainPage(driver);
    mainPage.openBasePage();
    BrowserLanguagePage browseLanguagesPage = mainPage.navigateToBrowseLanguage();
    Assert.assertTrue(browseLanguagesPage.verifyColumnName (1, "Language"));
    Assert.assertTrue(browseLanguagesPage.verifyColumnName (2,"Author"));
}

@Test
public void testFirstHeaderItem() {
    MainPage mainPage = new MainPage(driver);
    mainPage.openBasePage();
    BrowserLanguagePage browserLanguagePage = mainPage.navigateToBrowseLanguage();
    Assert.assertEquals(browserLanguagePage.getColumnNameListById ( 1 ),"Language");
}

@Test
public void testSecondHeaderItem() {
    MainPage mainPage = new MainPage(driver);
    mainPage.openBasePage ();
    BrowserLanguagePage browseLanguagesPage = mainPage.navigateToBrowseLanguage();
    Assert.assertEquals(browseLanguagesPage.getColumnNameListById (2), "Author");
}
}
