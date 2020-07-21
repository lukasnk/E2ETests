import Pages.SliderPage;
import Settings.SetUpForTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SliderTest {

    private static WebDriver driver;
    private String webPath = "https://demoqa.com/slider";

    @BeforeTest
    public void setUp() {
        driver = SetUpForTests.SetUp(webPath);
    }

    @Test
    public void CheckNewWindows(){
        SliderPage.sliderAction(driver);
    }

    @AfterTest
    public void After(){
        driver.quit();
    }
}
