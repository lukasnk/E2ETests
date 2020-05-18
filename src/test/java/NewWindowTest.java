import Pages.PractiseSwitchWindows;
import Pages.ToolsQAMainPage;
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

    @BeforeTest
    public void SetUp(){
        if(System.getProperty("os.name").equals("Windows 10")){
            System.setProperty("webdriver.gecko.driver", "../geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
        }else {
            File pathToBinary = new File("/usr/bin/firefox");
            FirefoxBinary options = new FirefoxBinary(pathToBinary);
            System.setProperty("webdriver.gecko.driver", "../geckodriver");

            DesiredCapabilities desired = DesiredCapabilities.firefox();
            FirefoxOptions ffoptions = new FirefoxOptions();
            desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, ffoptions.setBinary(options));

            options.addCommandLineOptions("--headless");

            driver = new FirefoxDriver(ffoptions);
            driver.get("https://demoqa.com/checkboxradio/");
        }
    }

    @Test
    public void CheckNewWindows(){

        String CurrentWindowHandler = driver.getWindowHandle();
        PractiseSwitchWindows.NewBrowserWindowButton(driver).click();

        for(String WindowHandler: driver.getWindowHandles()){
            driver.switchTo().window(WindowHandler);
            driver.manage().window().fullscreen();
        }

        ToolsQAMainPage.CheckHomePage(driver).click();
        ToolsQAMainPage.CheckHomePage(driver).equals("Free QA Automation Tools Tutorial for Beginners with Examples");

        driver.close();
        driver.switchTo().window(CurrentWindowHandler);
    }

    @AfterTest
    public void After(){
        driver.quit();
    }
}
