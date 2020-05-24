package ocrdemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleBootStrapDropBoxes {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://v4-alpha.getbootstrap.com/components/dropdowns/");
        //Thread.sleep(5000);

        driver.findElement(By.id("dropdownMenuButton")).click();

        List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'dropdown') and @aria-labelledby='dropdownMenuButton']//a"));
        System.out.println(list.size());

        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i).getText());
            if(list.get(i).getText().equals("Another action")) {
                list.get(i).click();
                break;
            }
        }
    }
}
