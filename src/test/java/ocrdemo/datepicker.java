package ocrdemo;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class datepicker {

    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java" +
                "/com/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.spicejet.com/");

        WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
        String dateVal = "25-05-2020";
        scrollPage(driver,date,dateVal);

    }
    public static void scrollPage(WebDriver driver, WebElement element, String dateVal) {

        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
    }
}