package Java8_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWindowHandles {

    public static void main(String[] args)  {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://popuptest.com/goodpopups.html");
        driver.findElement(By.linkText("Good PopUp #3")).click();
        try{
            String title = switchToWindowtest(driver,"PopupTest Saturday");
            System.out.println(title);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    public static String switchToWindowtest(WebDriver driver, String title) {
        return driver.getWindowHandles().
                stream().
                map(handler -> driver.switchTo().
                        window(handler).
                        getTitle()).
                filter(ele -> ele.contains(title)).
                findFirst().orElse("No such element");
    }
}
