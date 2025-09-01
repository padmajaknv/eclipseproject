package padmaja.TestNG.Smoketestcases;
//4)Check Menu bar items are clickable or not. check subnames are clickable or not.

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Smoketestcase4{
    @Test
    public void Menubarclick() throws InterruptedException{
        commondriverclass cm = new commondriverclass();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        List<WebElement> menuitems = driver.findElements(By.xpath("//a[@class='nav-link-hed']"));
        System.out.println(menuitems);
        for(WebElement items:menuitems){
          items.click();
         // System.out.println("Clicked on "+items.getText());
          Thread.sleep(1000);
          /*List<WebElement> subitems = driver.findElements(By.xpath("//li[contains(@class,'sub-menu-title')]"));
            System.out.println("Size of subitems:"+subitems.size());
            for(WebElement submenu:subitems){
                submenu.click();
            }*/
        }
        driver.quit();
    }
}
