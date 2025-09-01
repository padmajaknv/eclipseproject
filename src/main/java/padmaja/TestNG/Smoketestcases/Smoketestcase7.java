package padmaja.TestNG.Smoketestcases;
/*7)Click on each of the Orange HRM footer social media icons facebook,linkedin and
youtube. Verify that each redirects to the correct page*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Smoketestcase7 {
 @Test
 public void footericons() throws InterruptedException {
     commondriverclass cm = new commondriverclass();
     cm.openDriver("https://www.orangehrm.com/");
     ChromeDriver driver = cm.driver;
     driver.navigate().refresh();
     Actions actions = new Actions(driver);
     WebElement scrolldown = driver.findElement(By.xpath("//p[text()='OrangeHRM Inc. © 2025 All Rights Reserved.']"));
     actions.moveToElement(scrolldown).build().perform();
     WebElement facebook = driver.findElement(By.xpath("//img[@alt='facebook logo']"));
     facebook.click();
     /*String facebookurl = driver.getCurrentUrl();
     System.out.println(facebookurl);*/
     Thread.sleep(3000);
     WebElement linkedin = driver.findElement(By.xpath("//img[@alt='linkedin logo']"));
     linkedin.click();
     Thread.sleep(3000);
     WebElement youtube = driver.findElement(By.xpath("//img[@alt='youtube logo']"));
     youtube.click();
     Thread.sleep(2000);
     driver.quit();
  }
}
