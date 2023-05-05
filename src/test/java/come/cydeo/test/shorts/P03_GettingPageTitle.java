package come.cydeo.test.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class P03_GettingPageTitle {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://cydeo.com");

        System.out.println("driver.getTitle() = " + driver.getTitle());


        //Test if title of the page is Cydeo
        if (driver.getTitle().equals("Cydeo")){
            System.out.println("Title verification is pass!");
        }else {
            System.out.println("Title verification Failed!");


        }
    }
}
