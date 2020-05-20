package com.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import ocrdemo.NopCommerceTest;
import ocrdemo.NopCommerceTest1;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportsBase {

    WebDriver driver;

    //public ExtentHtmlReporter htmlReporter;
    public ExtentSparkReporter sparkReporter;
    public ExtentReports extentReports;
    public ExtentTest test;

    public ExtentReportsBase() {
        String path = System.getProperty("user.dir")+"/test-output/myReport.html";
        System.out.println("path: "+ path);
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("Functional Report");
        sparkReporter.config().setTheme(Theme.STANDARD);
        extentReports = new com.aventstack.extentreports.ExtentReports();
        //extentReports.attachReporter(htmlReporter); //attach
        extentReports.attachReporter(sparkReporter);
        extentReports.setSystemInfo("hostname","localhost");
        extentReports.setSystemInfo("OS","Windows");
        extentReports.setSystemInfo("Tester","Tom");
        extentReports.setSystemInfo("Browser","Chrome");
    }

    @AfterTest(alwaysRun = true)
    public void flushX() {
        extentReports.flush();
    }

//    @AfterMethod(alwaysRun = true)
//    public void tearDown(ITestResult iTestResult) throws IOException {
//
//        if(iTestResult.getStatus() == ITestResult.FAILURE) {
//            test.log(Status.FAIL, "TEST CASE FAIL "+ iTestResult.getName()); //add name in report
//            test.log(Status.FAIL, "TEST CASE FAIL "+ iTestResult.getThrowable()); //add error in report
//
//            String screenShotPath = NopCommerceTest1.getScreenshot(driver,iTestResult.getName());
//            test.addScreenCaptureFromPath(screenShotPath); //adding screen shot
//
//        } else if(iTestResult.getStatus() == ITestResult.SKIP) {
//            test.log(Status.SKIP,"TEST CASE SKIP " + iTestResult.getName());
//        } else if(iTestResult.getStatus() == ITestResult.SUCCESS) {
//            test.log(Status.SKIP,"TEST CASE SUCCESS " + iTestResult.getName());
//        }
//
//    }

//    public static String getScreenshot(WebDriver driver, String screenShotName) throws IOException {
//        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//
//        //after execution you can see a folder under src folder
//        String dest = System.getProperty("user.dir")+"/Screenshots/" + screenShotName + dateName + ".png";
//        File finalDest = new File(dest);
//        FileUtils.copyFile(source,finalDest);
//        return dest;
//    }
}
