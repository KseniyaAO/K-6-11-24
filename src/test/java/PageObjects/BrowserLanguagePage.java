package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;


public class BrowserLanguagePage  extends BasePage {
    public BrowserLanguagePage(WebDriver driver) {
        super ( driver );
    }

    private List<WebElement> getSubMenuList() {
        return driver.findElements ( By.xpath ( "//ul[@id='submenu']/li/a" ) );
    }

    public boolean verifyFirstMenuZeroNine() {
        return getSubMenuList ( ).get ( 0 ).getText ( ).equals ( "0-9" );

    }
//14
    public List<WebElement> getColumnNameList() {
        return driver.findElements ( By.xpath ("//table[@id='category']//tr/th"));
    }

    public boolean verifyColumnName(int headrId, String headerName) {
        if(headrId > 0 && headrId < getColumnNameList().size ()) {
            return getColumnNameList ( ).get ( headrId - 1 ).getText ( ).equals ( headerName );
        }
        return false;
        }
        public String getColumnNameListById(int headerId) {
        if (headerId > 0 && headerId < getColumnNameList ().size ()){
            return getColumnNameList ().get ( headerId - 1).getText ();
        }
        return null;
    }
}

