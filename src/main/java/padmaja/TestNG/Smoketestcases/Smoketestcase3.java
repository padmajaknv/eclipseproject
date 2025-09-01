package padmaja.TestNG.Smoketestcases;
/*3)Open the language dropdown then select a language.
check page is loaded as per the selected language.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Smoketestcase3 {
    @Test
   void language() throws InterruptedException {
        commondriverclass cm = new commondriverclass();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='locale']"));
        String text=dropdown.getText();
        Select langselect = new Select(dropdown);
        System.out.println(text);
        driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
        langselect.selectByVisibleText("Es");
        Thread.sleep(2000);
        String currenturl = driver.getCurrentUrl();
        if(currenturl.equals("https://www.orangehrm.com/")){
            System.out.println("Language selected is English..");
        }
        else{
           String esurl = driver.getCurrentUrl();
           System.out.println("Language selected is es..");
            System.out.println("Current Url is:"+esurl);
        }
        Assert.assertTrue(currenturl.equals("https://www.orangehrm.com/es"));
        System.out.println("Test Case Pass");
        driver.quit();
    }
}

