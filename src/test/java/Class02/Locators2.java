package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class Locators2 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement name= driver.findElement(By.name("ctl00$MainContent$username"));
        name.sendKeys("Tester");
        // enter password
WebElement pass= driver.findElement(By.id("ctl00_MainContent_password"));
pass.sendKeys("test");

 WebElement loginBtn=driver.findElement(By.className("button"));
 loginBtn.click();
// confirm that you
        WebElement message= driver.findElement(By.className("login_info"));
       String text =message.getText();
        System.out.println(text);
        //confirming by using title
       String title=  driver.getTitle();
        System.out.println(title);
        if(title.equals("Web Orders")){
            System.out.println("you have logged in");
        }else {
            System.out.println("you have not logged in");
        }



    }
}
