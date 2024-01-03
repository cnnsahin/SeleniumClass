package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        //initiate the instance of WebDriver
        WebDriver driver= new ChromeDriver();
        // firstly maximize page
        driver.manage().window().maximize();
        // go to google com
        driver.get("https://www.google.com");

        // facebook.com
        driver.navigate().to(" https://www.fb.com");
        // go back google
        driver.navigate().back();
        // add time to how many seconds it will be open
        Thread.sleep(2000);
        //go to fb again
        driver.navigate().forward();
        // refresh page
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.close();// get page is loading navigate only open
        // get doesnt keep history , navigate keeps history



    }
}
