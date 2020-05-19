package ocrdemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMan {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
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
