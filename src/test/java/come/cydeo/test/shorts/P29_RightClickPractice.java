package come.cydeo.test.shorts;

import come.cydeo.test.utilities.ConfigurationReader;
import come.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class P29_RightClickPractice {

    @Test
    public void rightClickTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        WebElement abTstLink = Driver.getDriver().findElement(By.linkText("A/B Testing"));

        Actions actions = new Actions(Driver.getDriver());

        actions.contextClick(abTstLink).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN)
                .perform();

    }
}
