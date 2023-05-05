package come.cydeo.test.shorts;

import come.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class P28_DragDropPractice {

    @Test
    public void dragDropTest(){

        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions= new Actions(Driver.getDriver());
        //actions.dragAndDrop(smallCircle,bigCircle).perform();

        actions.moveToElement(smallCircle).pause(2000).clickAndHold().
                pause(2000).moveToElement(bigCircle).pause(2000).release().perform();
    }
}
