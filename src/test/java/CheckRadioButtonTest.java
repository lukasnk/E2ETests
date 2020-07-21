import Pages.RadioButton;
import Settings.SetUpForTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
        assert true : driver.findElement(By.cssSelector(".mt-3"));
    }


    @AfterTest
    public void After(){
        driver.close();
    }
}
