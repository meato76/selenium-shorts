package come.cydeo.test.shorts;

import come.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P17_SelectDropdown {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }

    @Test
    public void selectDropdownTest(){

        driver.get("https://practice.cydeo.com/dropdown");
        Select simpleSelect = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        simpleSelect.selectByVisibleText("Option 2");


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
