package Pages;

import org.openqa.selenium.*;

public class RadioButton{

    public static WebElement locate(WebDriver driver){

        return driver.findElement(By.cssSelector("div.custom-control:nth-child(2)"));
    }


}
