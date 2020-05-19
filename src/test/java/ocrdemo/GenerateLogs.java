package ocrdemo;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class GenerateLogs {

    public static void main(String[] args) {

       Logger log =  Logger.getLogger(GenerateLogs.class);

       System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java/com/drivers/chromedriver");
       WebDriver driver = new ChromeDriver();

       log.info("launching browswer");


       driver.get("http://www.google.com");
       log.info("google url has been launched");
        String title = driver.getTitle();

        log.info("title:"+ title);

        if(title.equals("Google")) {
            System.out.println("correct");
            log.info("correct passed");
        } else {
            log.info("title wrong");
        }

    }

}
