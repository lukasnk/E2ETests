package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SliderPage {

    public static WebElement slider;

    public static void sliderAction(WebDriver driver){

        slider = driver.findElement(By.cssSelector(".range-slider"));

        Actions move = new Actions(driver);
        Action action = move.dragAndDropBy(slider, 30, 0).release().build();
        action.perform();

    }
}
