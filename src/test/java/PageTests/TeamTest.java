package PageTests;

import PageObjects.MainPage;
import PageObjects.TeamPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamTest extends BaseTest {
    @Test
    public void testCreators() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openBasePage();
        mainPage.navigateToSubMenuStar("Team");
        mainPage.verifyCreatorsNamesList();
        Assert.assertTrue(mainPage.verifyCreatorsNamesList());

    }
}
