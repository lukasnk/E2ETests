import Pages.PractiseSwitchWindows;
import Pages.ToolsQAMainPage;
import Settings.SetUpForTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class NewWindowTest {

    private static WebDriver driver;
    private String webPath = "https://demoqa.com/browser-windows";
    @BeforeTest

    public void setUp() {
        driver = SetUpForTests.SetUp(webPath);
    }

    @Test
    public void CheckNewWindows(){

        String CurrentWindowHandler = driver.getWindowHandle();
        PractiseSwitchWindows.NewBrowserWindowButton(driver).click();

        for(String WindowHandler: driver.getWindowHandles()){
            driver.switchTo().window(WindowHandler);
        }

        ToolsQAMainPage.CheckHomePage(driver).equals("This is a sample page");

        driver.close();
        driver.switchTo().window(CurrentWindowHandler);
    }

    @AfterTest
    public void After(){

        driver.quit();
    }
}
