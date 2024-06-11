package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class TopListsPage extends BasePage {

    public TopListsPage(WebDriver driver) {
        super ( driver );

    }

    private List<WebElement> getColumnHeadingList() {
        return driver.findElements ( By.xpath ( "//table[@id='category']//th" ) );
    }

    public boolean verifyColumnHeading() {
        boolean result;
        String[] columnHeading = new String[]{"#", "Language", "Author", "Date", "Comments", "Rate"};
        List<String> expectHeadings = Arrays.asList ( columnHeading );

        if (getColumnHeadingList ( ).size ( ) != expectHeadings.size ( )) {
            return false;
        }
        for (int i = 0; i < expectHeadings.size ( ); i++) {
            result = false;
            System.out.println ( 1 );
            for (int j = 0; j < getColumnHeadingList ( ).size ( ); j++) {
                if (getColumnHeadingList ( ).get ( i ).getText ( ).equals ( expectHeadings.get ( j ) )) {
                    System.out.println ( 2 );
                    result = true;
                    System.out.println ( 3 );
                    break;
                }

            }
            System.out.println ( 4 );
            if (!result) {
                return false;
            }
            System.out.println ( 5 );
        }
        return true;
    }
}

