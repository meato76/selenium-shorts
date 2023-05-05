package come.cydeo.test.shorts;

import come.cydeo.test.utilities.BrowserUtils;
import come.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P21_JSAlertPractice {


    WebDriver driver;

    @BeforeMethod

    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

    }
    @Test
    public void JSAlertTest() {
        driver.get("https://practice.cydeo.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Alert alert= driver.switchTo().alert();
        alert.accept();
        //Verify “You successfully clicked an alert” text is displayed.

        WebElement successMessage = driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println(successMessage.getText());
        System.out.println("successMessage.isDisplayed() = " + successMessage.isDisplayed());

        BrowserUtils.sleep(1);

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        alert.dismiss();
        WebElement okButton = driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println("okButton.isDisplayed() = " + okButton.isDisplayed());

        BrowserUtils.sleep(1);

        driver.findElement(By.xpath("//button[@class='btn btn-primary'][3]")).click();

        alert.accept();



    }

}
