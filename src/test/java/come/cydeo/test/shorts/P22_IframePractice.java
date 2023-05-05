package come.cydeo.test.shorts;

import come.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P22_IframePractice {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }

    @Test
    public void iframeTest(){

        driver.get("https://practice.cydeo.com/iframe");

        //using locating of iframe element
        driver.switchTo().frame("mce_0_ifr");

        WebElement textArea = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        Assert.assertTrue(textArea.isDisplayed());

        driver.switchTo().defaultContent();// it will take you to the directly to Main HTML
        driver.switchTo().parentFrame();// if you have nested iFrame which is iframe inside another iframe, it will take you to parent frame

        WebElement homeLink = driver.findElement(By.linkText("Home"));
        Assert.assertTrue(homeLink.isDisplayed());

        driver.quit();

    }

}
