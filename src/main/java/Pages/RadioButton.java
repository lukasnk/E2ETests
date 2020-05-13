package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton{


    public static WebElement locate(WebDriver driver){
           return driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div/fieldset[1]/label[1]/span[1]"));
    }
}
