package ocrdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DatePicker2 {

    public static void main(String[] args) {
        WebDriver driver;

        String expectedDate = "10-October-2020";
        String eDate  = expectedDate.split("-")[0];
        String eMonth  = expectedDate.split("-")[1];
        String eYear  = expectedDate.split("-")[2];

        System.out.println(eDate);
        System.out.println(eMonth);
        System.out.println(eYear);

        System.setProperty("webdriver.chrome.driver", "/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java" +
                "/com/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

        driver.get("https://www.spicejet.com/");

        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement dateBtn = wait.until(ExpectedConditions.elementToBeClickable(By.className("ui-datepicker-trigger")));
        dateBtn.click();

        String cmonth = driver.findElement(By.className("ui-datepicker-month")).getText().trim();
        String cyear = driver.findElement(By.className("ui-datepicker-year")).getText().trim();

        System.out.println(cmonth);
        System.out.println(cyear);

        while((!cmonth.equals(eMonth)) ) {
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            cmonth = driver.findElement(By.className("ui-datepicker-month")).getText().trim();
        }

        System.out.println(cmonth);
        System.out.println(cyear);

        List<WebElement> dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
        for(WebElement e : dates) {
                if(e.getText().trim().equals(eDate)) {
                    e.click();
                    break;
                }
        }
    }
}
