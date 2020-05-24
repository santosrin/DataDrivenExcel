package com.morepractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxHeadless {

    public static void main(String[] args) {

        //Firefox
        FirefoxBinary fb = new FirefoxBinary();
        fb.addCommandLineOptions("--headless");
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions fo = new FirefoxOptions();
        fo.setBinary(fb);
        WebDriver driver = new FirefoxDriver(fo);
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());

        //Chrome
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver(options);
        driver1.get("http://www.google.com");
        System.out.println(driver.getTitle());

            //HTML unit driver
//        WebDriver driver2 = new HtmlUnitDriver();


    }
}
