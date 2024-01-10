package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        // click on the radio button male
        // check if it is selected
        WebElement radioBtnMale = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio' ]"));
//        click on it
        radioBtnMale.click();
        //verify if it is selected
        if(radioBtnMale.isSelected()){
            System.out.println("male radio button has been clicked");
        }
        else {
            System.out.println("male radio button has not been clicked");
        }
//select the age
        List<WebElement> radioBtns= driver.findElements(By.xpath("//input[@name='ageGroup']"));
         for(WebElement radio:radioBtns){
             String option=radio.getAttribute("value");
          if(option.equals("5 - 15")){
            radio.click();
            break;

    }
}

    }
}
