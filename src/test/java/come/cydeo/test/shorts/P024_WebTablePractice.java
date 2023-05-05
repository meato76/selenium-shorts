package come.cydeo.test.shorts;

import come.cydeo.test.base.TestBase;
import come.cydeo.test.utilities.ConfigurationReader;
import come.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P024_WebTablePractice extends TestBase {
//
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setup(){
//
//        //driver = WebDriverFactory.getDriver("chrome");
//        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
//        driver.manage().window().maximize();
//        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
//
//    }


    @Test
    public void webTableTest(){

        driver.get(ConfigurationReader.getProperty("env1"));

        WebElement johnCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='John']"));

        System.out.println("johnCell = " + johnCell.getText());

        List<WebElement> JohnRow = driver.findElements(By.xpath("//table[@id='table1']//tr[3]"));

        for (WebElement eachCell : JohnRow) {
            System.out.println("eachCell.getText() = " + eachCell.getText());
        }
    }

}
