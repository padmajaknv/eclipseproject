package padmaja.TestNG.Smoketestcases;
//2)Check "Contact sales" button is working or not
// And redirecting to the correct page when clicked

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Smoketestcase2 {
    @Test
    void Contactsales(){
        commondriverclass cm=new commondriverclass();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();
        WebElement salestext = driver.findElement(By.xpath("//h4[text()='Unlock the Full Potential of OrangeHRM!']"));
        Assert.assertTrue(salestext.isDisplayed(), "Unlock the Full Potential text should be displayed");
        System.out.println("Test Case Pass");
        driver.quit();
    }
}
