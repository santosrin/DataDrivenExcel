package ocrdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VisibilityTest {

    WebDriver driver;

    @Test
    public void scrollPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java" +
                "/com/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://ui.freecrm.com/");

        boolean b1 = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).isDisplayed();
        System.out.println(b1);

        boolean b2 = driver.findElement(By.xpath
                ("//body/div[@id='ui']/div[@class='ui middle aligned center aligned grid']/div[@class='column']/div[1]")).isEnabled();
        System.out.println(b2);

        driver.navigate().to("https://api.cogmento.com/register/");
        driver.findElement(By.xpath("//input[@id='terms']")).click();
        boolean b3 = driver.findElement(By.xpath("//input[@id='terms']")).isSelected();
        System.out.println(b3);

    }
}
