package ocrdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testtable {

    WebDriver driver;

    @Test
    public void scrollPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java" +
                "/com/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://ui.freecrm.com/");
        driver.findElement(By.name("email")).sendKeys("santosh310184@yahoo.co.in");
        driver.findElement(By.name("password")).sendKeys("Ragh_1234");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

        driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();

        String date1 = "15-May-2020";
        String dateArr[] = date1.split("-");
        String date = dateArr[0];
        String month = dateArr[1];
        String year = dateArr[2];



    }
}