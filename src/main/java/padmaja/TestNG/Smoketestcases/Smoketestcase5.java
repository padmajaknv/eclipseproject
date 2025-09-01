package padmaja.TestNG.Smoketestcases;

/*5)Enter email id in the email Id field. Click on "30-Day Free Trail" button
which is next to email id field. After click it should navigate to proper page.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Smoketestcase5 {

    @Test
    public void Button() throws InterruptedException {
        commondriverclass cm = new commondriverclass();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("sahasra123@gmail.com");
        WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();
        WebElement findtext = driver.findElement(By.xpath("//h4[text()='We Just Need a Few Details.']"));
        String text = findtext.getText();
        Thread.sleep(2000);
        Assert.assertTrue(text.equals("We Just Need a Few Details."));
        System.out.println("Test case pass");
        driver.quit();
    }
}

