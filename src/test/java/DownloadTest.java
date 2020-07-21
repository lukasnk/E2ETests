import Pages.AutomationPracticeFormPage;
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
import java.io.IOException;

import static java.nio.file.Files.exists;

public class DownloadTest {
    private static WebDriver driver;
    private String webPath = "https://demoqa.com/upload-download";

    @BeforeTest
    public void SetUp(){

        driver = SetUpForTests.SetUp(webPath);
    }

    @Test

    public void CheckNewWindows() {
        AutomationPracticeFormPage.DownloadLink(driver);
        assert true : new File("../image.bmp").isFile();

    }

    @AfterTest

    public void After(){
        new File("../image.bmp").delete();
        driver.quit();
    }
}
