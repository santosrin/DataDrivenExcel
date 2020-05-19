package ocrdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java/com/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://mrbool.com/");

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[@class='menulink']"))).build().perform();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//ul[@class='submenu']//a[contains(text(),'Articles')]")).click();

    }
}
