package come.cydeo.test.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P04_FullScreenMode {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver1 = new FirefoxDriver();


       driver1.get("https://www.google.com");
       driver1.manage().window().maximize();

        driver1.close();


        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.close();
    }
}
