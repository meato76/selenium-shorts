package come.cydeo.test.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P06_FindElement_ByClassName {

    public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("Https://www.google.com");

        WebElement searchBox = driver.findElement(By.className("gLFyf"));

        searchBox.sendKeys("Apple"+ Keys.ENTER);
    }
}
