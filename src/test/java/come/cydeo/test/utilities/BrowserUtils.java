package come.cydeo.test.utilities;

public class BrowserUtils {

    public static void  sleep(int second){

        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
