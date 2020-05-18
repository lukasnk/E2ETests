import Pages.RadioButton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;


public class CheckRadioButtonTest {

    private static WebDriver driver;

    @BeforeTest
    public void setUp() {

        if(System.getProperty("os.name").equals("Windows 10")){
            System.setProperty("webdriver.gecko.driver", "../geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get("https://demoqa.com/checkboxradio/");
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
    public void ClickRadioButton(){
        RadioButton.locate(driver).click();
    }

    @AfterTest
    public void After(){
        driver.close();
    }
}