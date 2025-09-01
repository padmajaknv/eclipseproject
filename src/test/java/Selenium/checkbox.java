package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox {
    public static void main(String[] args) {
        commonMethods cm = new commonMethods();
        cm.openDriver("https://tickets.paytm.com/bus/");
        ChromeDriver driver = cm.driver;
        WebElement checkbox = driver.findElement(By.xpath("//div[@role='checkbox']"));
        String checked = checkbox.getAttribute("aria-checked");
        if(checked.equals("true")){
            System.out.println("Checkbox is already checked");
        }
        else{
            System.out.println("Checkbox is not yet checked");
            checkbox.click();
            checked = checkbox.getAttribute("aria-checked");
            System.out.println(checked);
//            Assert.assertEquals();
//            Assert.assertNotEquals();
//            Assert.assertTrue();
//            Assert.assertFalse();
//            Assert.assertNull();
//            Assert.assertNotNull();
            Assert.assertTrue(checked.equals("true"));
            System.out.println("Test Case Pass");
        }
    }
}
