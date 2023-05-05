package come.cydeo.test.shorts;


import come.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P12_FindElements {


    public static void main(String[] args) {

        WebDriver driver =  WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));


        System.out.println(allLinks.size());

        for (WebElement allLink : allLinks) {
            System.out.println(allLink.getText());
            System.out.println(allLink.getAttribute("href"));

        }
        driver.close();
    }


}
