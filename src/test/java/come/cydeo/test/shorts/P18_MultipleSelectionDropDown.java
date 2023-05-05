package come.cydeo.test.shorts;

import come.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P18_MultipleSelectionDropDown {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }

    @Test
    public void multipleSelectionDropdown(){

        driver.get("https://practice.cydeo.com/dropdown");

        Select multiSelect = new Select(driver.findElement(By.name("Languages")));

        System.out.println("multiSelect = " + multiSelect.isMultiple());
        multiSelect.selectByValue("java");
        multiSelect.selectByIndex(2);
        multiSelect.selectByVisibleText("Python");

        multiSelect.deselectAll();

    }
}
