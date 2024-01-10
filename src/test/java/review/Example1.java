package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
// get the create new account
        WebElement createNewAccount=driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        //send the name
       // WebElement name=driver.findElement(By.name("firstname"));
       // name.sendKeys("john");
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("john");






    }
}
