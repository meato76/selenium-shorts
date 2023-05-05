package come.cydeo.test.base;

import come.cydeo.test.utilities.ConfigurationReader;
import come.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {


    protected WebDriver driver;

    @BeforeMethod
    public void setup(){

        //driver = WebDriverFactory.getDriver("chrome");
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod(){

        driver.quit();

    }
}
