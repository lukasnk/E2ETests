package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class AutomationPracticeFormPage {

    static String link = "a[href'http://toolsqa.com/wp-content/uploads/2016/09/Test-File-to-Download.xlsx']";
    static StringBuilder wgetCommand = new StringBuilder().append("wget ").append(link);


    public static void DownloadLink(WebDriver driver){

        try {
            Process exec = Runtime.getRuntime().exec(String.valueOf(wgetCommand));
            int exitVal = exec.waitFor();
            System.out.println("Exit value: " + exitVal);
        } catch (InterruptedException | IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
