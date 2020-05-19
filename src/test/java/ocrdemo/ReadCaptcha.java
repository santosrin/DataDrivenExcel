package ocrdemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ReadCaptcha {

    public static void main(String[] args) throws InterruptedException, IOException, TesseractException {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/java/com/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.onlinesbi.com/retail/login.htm");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.className("login_button")).click();
        Thread.sleep(4000);
        File src = driver.findElement(By.id("refreshImgCaptcha")).getScreenshotAs(OutputType.FILE);
        String dest = "/Users/santoshsrinivas/Documents/DataDrivenExcel/src/test/java/ocrdemo/captcha.png";
        FileHandler.copy(src, new File(dest));

        ITesseract iTesseract = new Tesseract();
        String imageText = iTesseract.doOCR(new File(dest));
        System.out.println("image :"+ imageText);

       // imageText.split("");

    }
}
