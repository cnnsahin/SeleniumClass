package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        WebElement createAccount= driver.findElement(By.linkText("Create new account"));
        createAccount.click();
        Thread.sleep(6000);
        WebElement fName= driver.findElement(By.name("firstname"));
                 fName.sendKeys("Jean Jacques");

        WebElement lName= driver.findElement(By.name("lastname"));
                  lName.sendKeys("Rousseau");

        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("rousseau123@gmail.com");

        WebElement reEnteremail=driver.findElement(By.name("reg_email_confirmation__"));
        reEnteremail.sendKeys("rousseau123@gmail.com");

        WebElement password=  driver.findElement(By.id("password_step_input"));
        password.sendKeys("France123");
        Thread.sleep(6000);
        driver.quit();

    }
}
