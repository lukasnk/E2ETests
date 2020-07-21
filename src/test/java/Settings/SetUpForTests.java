package Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class SetUpForTests {

    public static WebDriver SetUp(String webPath){

        WebDriver driver;

        if(System.getProperty("os.name").equals("Windows 10")){
            System.setProperty("webdriver.gecko.driver", "../geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(webPath);
            return driver;
        }else {
            File pathToBinary = new File("/usr/bin/firefox");
            FirefoxBinary options = new FirefoxBinary(pathToBinary);
            System.setProperty("webdriver.gecko.driver", "../geckodriver");

            DesiredCapabilities desired = DesiredCapabilities.firefox();
            FirefoxOptions ffoptions = new FirefoxOptions();
            desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, ffoptions.setBinary(options));

            options.addCommandLineOptions("--headless");

            driver = new FirefoxDriver(ffoptions);
            driver.get("webPath");
            return driver;
        }
    }
}
