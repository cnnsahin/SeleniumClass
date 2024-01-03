package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
// find the WebElement input
         WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("abracadbra@gmail.com");
        //find the element password and send the password
      WebElement password=  driver.findElement(By.name("pass"));
        password.sendKeys("helooooo123");

        WebElement login=driver.findElement(By.name("login"));
       // login.click();
        // go to button create new
        // WebElement createAccount= driver.findElement(By.linkText("Create new account"));
         //createAccount.click();
        WebElement createAccount= driver.findElement(By.partialLinkText("new account"));
        createAccount.click();


    }
}
