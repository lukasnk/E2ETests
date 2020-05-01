package Environment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setUp {
    private static WebDriver driver;

    public setUp(){
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
    }

    public static void findelement(){
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[2]/a")).click();
    }

}