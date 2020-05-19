package ocrdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {


    WebDriver driver;
    @Test
    public void scrollPage() {
        System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java" +
                "/com/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://freecrm.co.in/");
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        WebElement element = driver.findElement(By.xpath("//a[@class='" +
                "btn btn-sm-3 btn-white btn-icon btn-icon-left btn-shadow btn-rect offset-top-32']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
