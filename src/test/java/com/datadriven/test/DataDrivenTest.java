//package com.datadriven.test;
//
//import com.utility.Xls_Reader;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class DataDrivenTest {
//
//    public static void main(String[] args) {
//
//
//        // Get test data from xl
//        Xls_Reader reader = new Xls_Reader("/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java/" +
//                "com/testdata/HalfEbayTestData.xlsx");
//
//        String firstname = reader.getCellData("RegTestData","firstname",2);
//        System.out.println(firstname);
//
//        String lastname = reader.getCellData("RegTestData","lastname",2);
//        System.out.println(lastname);
//
//        String address1 = reader.getCellData("RegTestData","address1",2);
//        System.out.println(address1);
//
//        String address2 = reader.getCellData("RegTestData","address2",2);
//        System.out.println(address2);
//
//        String city = reader.getCellData("RegTestData","city",2);
//        System.out.println(city);
//
//        String state = reader.getCellData("RegTestData","state",2);
//        System.out.println(state);
//
//        String zipcode = reader.getCellData("RegTestData","zipcode",2);
//        System.out.println(zipcode.replace(".0",""));
//        String zipcodeUpdated = zipcode.replace(".0","");
//
//        String emailaddress = reader.getCellData("RegTestData","emailaddress",2);
//        System.out.println(emailaddress);
//
//
//        //webdriver code
//        System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/DataDrivenExcel/src/main/java" +
//                "/com/drivers/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
//
//        //enter data
//        driver.findElement(By.xpath("//input[@id='firstname']")).clear();
//        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);
//
//        driver.findElement(By.xpath("//input[@id='lastname']")).clear();
//        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);
//
//        driver.findElement(By.xpath("//input[@id='address1']")).clear();
//        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(address1);
//
//        driver.findElement(By.xpath("//input[@id='address2']")).clear();
//        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(address2);
//
//        driver.findElement(By.xpath("//input[@id='city']")).clear();
//        driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
//
//        Select select = new Select(driver.findElement(By.xpath("//select[@id='state']")));
//        select.selectByVisibleText(state);
//
////        driver.findElement(By.xpath("//select[@id='state']")).clear();
////        driver.findElement(By.xpath("//select[@id='state']")).sendKeys(state);
//
//        driver.findElement(By.xpath("//input[@id='zip']")).clear();
//        driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(zipcodeUpdated);
//
//        driver.findElement(By.xpath("//input[@id='email']")).clear();
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailaddress);
//
//        driver.findElement(By.xpath("//input[@id='retype_email']")).clear();
//        driver.findElement(By.xpath("//input[@id='retype_email']")).sendKeys(emailaddress);
//
//
//
//
//
//    }
//}
