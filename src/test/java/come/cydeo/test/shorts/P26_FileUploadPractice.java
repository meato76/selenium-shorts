package come.cydeo.test.shorts;

import come.cydeo.test.utilities.BrowserUtils;
import come.cydeo.test.utilities.ConfigurationReader;
import come.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.lang.module.Configuration;

public class P26_FileUploadPractice {

    @Test
    public void fileUploadTest(){

        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
        WebElement choseFileBtn = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        choseFileBtn.sendKeys("C:\\Users\\Admin\\Desktop\\HTM Class\\myFirstPage.html");
        BrowserUtils.sleep(3);
        WebElement uploadBtn = Driver.getDriver().findElement(By.id("file-submit"));
        uploadBtn.click();
    }
}
