import Pages.RadioButton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CheckFirst1Test {

    private static WebDriver driver;

    @BeforeTest

    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
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
