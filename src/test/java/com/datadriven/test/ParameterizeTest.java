package com.datadriven.test;

import com.utility.Xls_Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ParameterizeTest {

    public static void main(String[] args) {

        //webdriver code
        System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java" +
                "/com/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");

        // Get test data from xl
        Xls_Reader reader = new Xls_Reader("/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java/" +
                "com/testdata/HalfEbayTestData.xlsx");

        int rowCount = reader.getRowCount("RegTestData");

        reader.addColumn("RegTestData","Status");

        //paramertization is done by for loop
        for(int rowNum = 2 ; rowNum <= rowCount ; rowNum++) {

            System.out.println("============");
            String firstName = reader.getCellData("RegTestData","firstname",rowNum);
            System.out.println(firstName);

            String lastname = reader.getCellData("RegTestData","lastname",rowNum);
            System.out.println(lastname);

            String address1 = reader.getCellData("RegTestData","address1",rowNum);
            System.out.println(address1);

            String address2 = reader.getCellData("RegTestData","address2",rowNum);
            System.out.println(address2);

            String city = reader.getCellData("RegTestData","city",rowNum);
            System.out.println(city);

            String state = reader.getCellData("RegTestData","state",rowNum);
            System.out.println(state);

            String zipcode = reader.getCellData("RegTestData","zipcode",rowNum);
            System.out.println(zipcode.replace(".0",""));
            String zipcodeUpdated = zipcode.replace(".0","");

            String emailaddress = reader.getCellData("RegTestData","emailaddress",rowNum);
            System.out.println(emailaddress);


            //enter data in selenium
            driver.findElement(By.xpath("//input[@id='firstname']")).clear();
            driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstName);

            driver.findElement(By.xpath("//input[@id='lastname']")).clear();
            driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);

            driver.findElement(By.xpath("//input[@id='address1']")).clear();
            driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(address1);

            driver.findElement(By.xpath("//input[@id='address2']")).clear();
            driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(address2);

            driver.findElement(By.xpath("//input[@id='city']")).clear();
            driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

            Select select = new Select(driver.findElement(By.xpath("//select[@id='state']")));
            select.selectByVisibleText(state);

//        driver.findElement(By.xpath("//select[@id='state']")).clear();
//        driver.findElement(By.xpath("//select[@id='state']")).sendKeys(state);

            driver.findElement(By.xpath("//input[@id='zip']")).clear();
            driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(zipcodeUpdated);

            driver.findElement(By.xpath("//input[@id='email']")).clear();
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailaddress);

            driver.findElement(By.xpath("//input[@id='retype_email']")).clear();
            driver.findElement(By.xpath("//input[@id='retype_email']")).sendKeys(emailaddress);

            reader.setCellData("RegTestData","Status",rowNum,"Pass");

        }


    }
}
