package come.cydeo.test.shorts;

import come.cydeo.test.utilities.BrowserUtils;
import come.cydeo.test.utilities.ConfigurationReader;
import come.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P31_JSExecutorScrolling {

    @Test
    public void jSExecutorScrollingTest(){

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        BrowserUtils.sleep(3);

        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);

        BrowserUtils.sleep(3);

        Driver.getDriver().close();
    }
}
