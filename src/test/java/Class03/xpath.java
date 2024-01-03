package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath.php");
        //finding the input box username
       WebElement username= driver.findElement(By.xpath("//input[@id='title']"));
       username.sendKeys(" abracadabra");
//finding the button
        WebElement button=  driver.findElement(By.xpath("//button[text()='Click Here']"));
        button.click();
        //find the security question
        WebElement q1=driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
        q1.sendKeys("what is your name?");
//find the text and print
        WebElement textMSG   = driver.findElement(By.xpath("//label [contains(text(), 'Lorem ipsum')]"));
        String text=textMSG.getText();
        System.out.println(text);
//send the api settings
        WebElement  apiSettings     = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSettings.sendKeys("123.145.567");
        //send the email to
        WebElement   email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
          email2.sendKeys("abc@gmail.com");
// send the field 2
       WebElement field2= driver.findElement(By.xpath("//input[@data-detail= 'two' and @name='customField']"));
         field2.sendKeys("abcdef");

    }
}
