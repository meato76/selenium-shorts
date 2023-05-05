package come.cydeo.test.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_close_Quit_Page {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/open_new_tab");


        Thread.sleep(5000);

        //it will close currently open page
        driver.close();

        Thread.sleep(5000);


        //it will close all windows
        driver.quit();


    }
}
