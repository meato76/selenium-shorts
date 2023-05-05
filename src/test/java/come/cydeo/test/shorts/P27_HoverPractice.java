package come.cydeo.test.shorts;

import come.cydeo.test.utilities.BrowserUtils;
import come.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class P27_HoverPractice {
    @Test
    public void hoverTest(){

        Driver.getDriver().get("https://practice.cydeo.com/hovers");
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(img1).perform();

        BrowserUtils.sleep(2);
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        actions.moveToElement(img2).perform();


    }
}
