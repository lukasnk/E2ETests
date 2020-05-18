package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PractiseSwitchWindows {

    public PractiseSwitchWindows() {
    }

    public static WebElement NewBrowserWindowButton(WebDriver driver){
        return driver.findElement(By.id("button1"));
    }
}
