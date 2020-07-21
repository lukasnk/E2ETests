package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQAMainPage {

    public static WebElement CheckHomePage(WebDriver driver){
        return new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.id("sampleHeading")));
    }

    public static  String CheckTitle(WebDriver driver){
        return driver.getTitle();
    }
}
