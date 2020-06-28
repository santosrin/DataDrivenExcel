package Java8_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumCheckBoxWithStream {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
        List<WebElement> checkBoxList = driver.findElements(By.cssSelector("td.select-checkbox"));
//        checkBoxList.stream().forEach(ele -> ele.click());
        checkBoxList.forEach(ele -> ele.click());


        driver.quit();
    }
}
