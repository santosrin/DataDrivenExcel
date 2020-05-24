package ocrdemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenLinkTest {

    public static void main(String[] args) throws IOException {

//        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(true);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.freecrm.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("email")).sendKeys("santosh310184@yahoo.co.in");
        driver.findElement(By.name("password")).sendKeys("Ragh_1234");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        allLinks.addAll(driver.findElements(By.tagName("img")));
        System.out.println("All links : "+ allLinks.size());

        List<WebElement> activeLinks = new ArrayList<WebElement>();

        for(int i = 0;i<allLinks.size();i++) {
            if(allLinks.get(i).getAttribute("href")!= null) {
                activeLinks.add(allLinks.get(i));
            }
        }

        System.out.println("Active links size : -> "+ activeLinks.size());

        for(int j=0;j< activeLinks.size();j++) {

                HttpURLConnection httpURLConnection = (HttpURLConnection) new
                        URL(activeLinks.get(j).getAttribute("href")).openConnection();
                httpURLConnection.connect();
                String response = httpURLConnection.getResponseMessage();
                httpURLConnection.disconnect();
                System.out.println(activeLinks.get(j).getAttribute("href") + " ----> " + response);
        }
    }
}
