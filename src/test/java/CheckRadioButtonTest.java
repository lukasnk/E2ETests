import Pages.RadioButton;
import Settings.SetUpForTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckRadioButtonTest {

    private static WebDriver driver;
    private String webPath = "https://demoqa.com/radio-button";

    @BeforeTest
    public void setUp() {
        driver = SetUpForTests.SetUp(webPath);
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
