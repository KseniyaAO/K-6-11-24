package PageTests;

import PageObjects.MainPage;
import PageObjects.NewCommentsPage;
import PageObjects.TopListsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewCommentsTest extends BaseTest {


    @Test
    public void ColumnHeadingTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openBasePage();
        TopListsPage topListsPage = mainPage.navigateToTopLists();
        NewCommentsPage newCommentsPage = topListsPage.navigateToNewCommentsPage();

        Assert.assertEquals ( false, newCommentsPage.verifyComments ( ) );
    }
}
