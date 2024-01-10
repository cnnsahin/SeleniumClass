package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php#");

        WebElement feedbackRaj= driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackRaj.sendKeys("Everything is great ");
        WebElement email= driver.findElement(By.cssSelector("input[name*='email']"));
        email.sendKeys("greatyears123@yahoo.com");


    }
}
