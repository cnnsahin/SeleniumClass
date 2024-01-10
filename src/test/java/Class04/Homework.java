package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");
        //find the first favorite book
        WebElement fBook1= driver.findElement(By.xpath("//input[@id='favourite-book']"));
        fBook1.sendKeys("The House of Spirits");
        //find the second favorite book (following sibling)
        WebElement fBook2= driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        fBook2.sendKeys("Crime and Punishment");
        //find the third favorite book (following sibling)
        WebElement fBook3= driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        fBook3.sendKeys("War and Peace");

        //Preeceeding siblings
         //find first least book
        WebElement lBook1= driver.findElement(By.xpath("//input[@id='least-favorite']"));
        lBook1.sendKeys("The House of Spirits");
        //find second least book
        WebElement lBook2= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        lBook2.sendKeys("Crime and Punishment");
        //find third least book
        WebElement lBook3= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        lBook3.sendKeys("War and Peace");

        //Parent child relationship
        WebElement grandparent= driver.findElement(By.xpath("//div[@id='familyTree']//child::input[1]"));
        grandparent.sendKeys("Grandparent");
        WebElement parent= driver.findElement(By.xpath("//div[@id='familyTree']//child::input[2]"));
        parent.sendKeys("Parent");
        WebElement child= driver.findElement(By.xpath("//div[@id='familyTree']//child::input[3]"));
        child.sendKeys("Child");




    }
}
