package come.cydeo.test.shorts;

import come.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P13_RadioButtons {

    public static void main(String[] args) {

     WebDriver driver = WebDriverFactory.getDriver("chrome");
     driver.manage().window().maximize();
     driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
     driver.get("https://practice.cydeo.com/radio_buttons");

     WebElement blueButton = driver.findElement(By.xpath("//input[@id='blue']"));
        blueButton.click();
        blueButton.isSelected();
        blueButton.isEnabled();

     WebElement blackButton = driver.findElement(By.xpath("//input[@id='black']"));



        WebElement redButton = driver.findElement(By.xpath("//input[@id='red']"));
        redButton.click();
        redButton.isEnabled();
        redButton.isSelected();

        WebElement yellowButton = driver.findElement(By.xpath("//input[@id='yellow']"));
        yellowButton.click();
        System.out.println("yellowButton.isSelected() = " + yellowButton.isSelected());
        System.out.println("yellowButton.isEnabled() = " + yellowButton.isEnabled());

        WebElement greenButton = driver.findElement(By.xpath("//input[@id='green']"));
        greenButton.click();
        System.out.println("greenButton.isEnabled() = " + greenButton.isEnabled());
        System.out.println("greenButton.isSelected() = " + greenButton.isSelected());


    }


    }

