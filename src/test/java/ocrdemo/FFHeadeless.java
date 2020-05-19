package ocrdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FFHeadeless {

    public static void main(String[] args) throws InterruptedException {
        FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
        System.setProperty("webdriver.gecko.driver","/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java/com/drivers/geckodriver");

        FirefoxOptions fo = new FirefoxOptions();
        fo.setBinary(firefoxBinary);

        WebDriver driver = new FirefoxDriver(fo);

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
