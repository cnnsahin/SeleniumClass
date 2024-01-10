package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        // find the drop down
         WebElement dd=driver.findElement((By.xpath("//select[@id='select-demo']")));
         //
            Select  sel= new Select(dd);
            sel.selectByIndex(2);
            Thread.sleep(2000);
            sel.selectByValue("Sunday");
            Thread.sleep(2000);
            sel.selectByVisibleText("Saturday");

            //multiselect
        WebElement dropDown= driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select Sel1=new Select(dropDown);
        // whether the drop down is multi select or not
        System.out.println(" the drop dowm is multiselect " + Sel1.isMultiple());

        Sel1.selectByValue("New York");

        Sel1.selectByVisibleText("Florida");
        Thread.sleep(2000);
        Sel1.deselectByValue("New York");


    }
}
