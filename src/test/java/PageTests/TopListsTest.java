package PageTests;

import PageObjects.MainPage;
import PageObjects.TopListsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TopListsTest extends BaseTest {
    @Test
    public void ColumnHeadingTest(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openBasePage();
        TopListsPage topListsPage = mainPage.navigateToTopLists ();
        Assert.assertEquals(true, topListsPage.verifyColumnHeading());
    }
}
