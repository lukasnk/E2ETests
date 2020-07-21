package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Base64;

public class AutomationPracticeFormPage {

    private static String link;

    public static void DownloadLink(WebDriver driver){


        link = driver.findElement(By.id("downloadButton")).getAttribute("href");

        byte[] data = Base64.getMimeDecoder().decode(link);

        try (OutputStream stream = new FileOutputStream("./image.bmp")){
                stream.write(data);
        }
        catch (Exception e){
            System.err.println("Couldn't write to file...");
        }
    }
}
