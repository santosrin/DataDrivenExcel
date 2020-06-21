//package ocrdemo;
//
//import org.apache.poi.ss.formula.functions.T;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;
//
//import java.util.concurrent.TimeUnit;
//
//public class SikuliDemo {
//
//    public static void main(String[] args) throws FindFailed {
//
//        System.setProperty("webdriver.chrome.driver", "/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java" +
//                "/com/drivers/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        driver.get("https://www.youtube.com/watch?v=xkKcdK1u95s");
//
//        //create the object of screen class which is coming from sikuli
//        Screen s = new Screen();
//
//        Pattern pauseImage = new Pattern("/Users/santoshsrinivas/Documents/DataDrivenExcel/src/test/java/ocrdemo/pause.png");
//        s.wait(pauseImage,2000);
//        s.click();
//        s.click();
//
//    }
//}
