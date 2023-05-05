package come.cydeo.test.shorts;

import come.cydeo.test.utilities.Driver;
import come.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class P23_WindowHandling {
//
//    WebDriver driver;
//    @BeforeMethod
//    public void setupMethod(){
//
//        driver= WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
//
//    }

    @Test
    public void windowHandlingTest(){
        Driver.getDriver().get("https://practice.cydeo.com/windows");
        String currentWindowHandle = Driver.getDriver().getWindowHandle();
        System.out.println("currentWindowHandle = " + currentWindowHandle);

        Driver.getDriver().findElement(By.linkText("Click Here")).click();

        System.out.println("currentWindowHandle = " + currentWindowHandle);

        Set<String> allWindows = Driver.getDriver().getWindowHandles();

        System.out.println("allWindows = " + allWindows);

        for (String eachWindow : allWindows) {
            Driver.getDriver().switchTo().window(eachWindow);
            System.out.println(Driver.getDriver().getWindowHandle());
            System.out.println("driver.getTitle() = " + Driver.getDriver().getTitle());
        }

    }
}