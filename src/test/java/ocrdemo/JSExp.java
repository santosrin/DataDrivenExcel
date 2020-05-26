package ocrdemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExp  {

    static WebDriver driver;

    public static void javaScriptClick(WebDriver driver, WebElement element) {
        JavascriptExecutor js =  ((JavascriptExecutor)driver);
        //js.executeScript("arguments[0].click()", element);
      // js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //js.executeScript("history.go(0)");
        js.executeScript("arguments[0].scrollIntoView(true)",element);


    }

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://freecrm.co.in/");
        Thread.sleep(5000);

        WebElement lgnBtm = driver.findElement
                (By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']"));
        WebElement element = driver.findElement(
                By.xpath("//h6[contains(text(),'Contact Us')]"));

        javaScriptClick(driver,element);
    }
}
