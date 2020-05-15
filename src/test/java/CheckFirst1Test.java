import Pages.RadioButton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;


public class CheckFirst1Test {

    private static WebDriver driver;

    @BeforeTest
    public void setUp() {
        File pathToBinary = new File("/opt/firefox/firefox");
        FirefoxBinary options = new FirefoxBinary(pathToBinary);

        options.addCommandLineOptions("--headless");
        System.setProperty("webdriver.geco.driver","../geckodriver");

        FirefoxProfile ffProfile = new FirefoxProfile();
//        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        firefoxOptions.setBinary(options);
        driver = new FirefoxDriver(options);
        driver.get("https://demoqa.com/checkboxradio/");
    }

    @Test
    public void test(){
        RadioButton.locate(driver).click();
    }

    @AfterTest
    public void After(){
        driver.close();
    }
}
