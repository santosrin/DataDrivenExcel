package ocrdemo;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.extentreports.ExtentReportsBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.aventstack.extentreports.MediaEntityBuilder.createScreenCaptureFromPath;

public class NopCommerceTest1 extends ExtentReportsBase  {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java/com/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.nopcommerce.com");
    }

    @Test
    public void noCommerceTestTitle() {

        test = extentReports.createTest("noCommerceTestTitle");

        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"nopCommerce demo store1");
    }

//    @Test
//    public void logoTest() {
//        test = extentReports.createTest("logoTest");
//        Boolean status = driver.findElement(By.xpath("//div[@class='header-logo']//a//img")).isDisplayed();
//        Assert.assertTrue(status);
//    }
//
//    @Test
//    public void loginTest() {
//        test = extentReports.createTest("loginTest");
//        Assert.assertTrue(true);
//    }

//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult iTestResult) throws IOException {

        if(iTestResult.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, "TEST CASE FAIL "+ iTestResult.getName()); //add name in report
            test.log(Status.FAIL, "TEST CASE FAIL "+ iTestResult.getThrowable()); //add error in report

            String screenShotPath = getScreenshot(driver,iTestResult.getName());
           // test.log(Status.FAIL,"screenShot : ", MediaEntityBuilder.createScreenCaptureFromPath("/Users/santoshsrinivas/Documents/DataDrivenExcel/Screenshots/noCommerceTestTitle2020-05-20 01:09:05.png","Image").build());
            System.out.println("screenShotPath: "+ screenShotPath);
            //MediaEntityModelProvider screenshot = createScreenCaptureFromPath(screenShotPath).build();
            test.addScreenCaptureFromPath(screenShotPath); //adding screen shot

            driver.quit();

        } else if(iTestResult.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP,"TEST CASE SKIP " + iTestResult.getName());
        } else if(iTestResult.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.SKIP,"TEST CASE SUCCESS " + iTestResult.getName());
        }
        driver.quit();
    }

    public static String getScreenshot(WebDriver driver, String screenShotName) throws IOException {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        //after execution you can see a folder under src folder
        String dest = System.getProperty("user.dir")+"/Screenshots/" + screenShotName + dateName + ".png";
        File finalDest = new File(dest);
        FileUtils.copyFile(source,finalDest);
        return dest;
    }
}
