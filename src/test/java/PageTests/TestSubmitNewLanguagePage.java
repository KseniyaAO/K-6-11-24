package PageTests;

import PageObjects.MainPage;
import PageObjects.SubmitNewLanguagePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSubmitNewLanguagePage extends BaseTest {


    @Test

    public void testFirstSubmenuItem() {

        MainPage mainPage = new MainPage ( driver );
        mainPage.openBasePage ( );

        SubmitNewLanguagePage submitNewLanguagePage = mainPage.navigateToSubmitLanguagePage ( );
        Assert.assertTrue ( submitNewLanguagePage.verifySubMenuItem ( ) );

    }

    @Test

    public void testVerifyError() {

        MainPage mainPage = new MainPage ( driver );
        mainPage.openBasePage ( );

        SubmitNewLanguagePage submitNewLanguagePage = mainPage.navigateToSubmitLanguagePage ( );

        boolean actualResult = submitNewLanguagePage.verifyErrorMessage ( );
        Assert.assertEquals ( false, actualResult );

    }
   @Test
    public void testSymbolMessage() throws InterruptedException {
        MainPage mainPage = new MainPage ( driver );
        mainPage.openBasePage ( );
        SubmitNewLanguagePage submitNewLanguagePage = mainPage.navigateToSubmitLanguagePage();

        Assert.assertEquals ( true, submitNewLanguagePage.verifyErrorPFIIList());
    }

    //task 11-13
    @Test

    public void testImportantMessage(){
        MainPage mainPage = new MainPage (driver);
        mainPage.openBasePage ();
        SubmitNewLanguagePage submitNewLanguagePage = mainPage.navigateToSubmitLanguagePage ();

        Assert.assertEquals (true, submitNewLanguagePage.verifyImportantMessage());

    }

    //task 11-21
    @Test
    public void testImportantMessageColor() throws InterruptedException {

    }
}
