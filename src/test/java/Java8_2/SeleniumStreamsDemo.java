package Java8_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.stream.Collectors;

public class SeleniumStreamsDemo {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.in/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
//        for(WebElement element : links) {
//            System.out.println(element.getText());
//        }
        //1
//        links.forEach(ele -> System.out.println(ele.getText()));

        //2
//        List<String> links1 =  links.stream().filter(ele -> !ele.getText().equals("")).map(ele -> ele.getText()).collect(Collectors.toList());
//        links1.forEach(ele -> System.out.println(ele));

        //3
//        String firstText = links.stream().filter(ele -> !ele.getText().equals("")).findFirst().get().getText();
//        System.out.println(firstText);

        //4
//        String anyText = links.stream().filter(ele -> !ele.getText().equals("")).findAny().get().getText();
//        System.out.println(anyText);

        //5 exclude blank texts and which starts with Amazon
//       List<String> amazonText = links.stream().filter(ele -> !ele.getText().equals("") && ele.getText().contains("Amazon")).
//                map(ele -> ele.getText()).collect(Collectors.toList());
//       amazonText.forEach(ele -> System.out.println(ele));

        //6
        List<String> newText = links.stream().filter(ele -> !ele.getText().isEmpty()).
                filter(ele -> !ele.getText().startsWith(" ")).map(ele -> ele.getText().trim()).collect(Collectors.toList());
        newText.forEach(ele -> System.out.println(ele));


        driver.quit();
    }
}
