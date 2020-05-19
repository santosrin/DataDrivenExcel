package ocrdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java" +
                "/com/drivers/chromedriver");
        //headless
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("window-size=1400,800");
        chromeOptions.addArguments("headless");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        driver.get("https://ui.freecrm.com/");
        System.out.println(driver.getTitle());

        driver.findElement(By.name("email")).sendKeys("santosh310184@yahoo.co.in");
        driver.findElement(By.name("password")).sendKeys("Ragh_1234");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        Thread.sleep(4000);

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
