package padmaja.Framework.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class category {
    ChromeDriver driver;
   /* public category(ChromeDriver cd)
    {
        driver=cd;
    }*/

    public void categoryelements() {
        List<WebElement> diffcategories = driver.findElements(By.xpath("//img[@class='card-img-top img-fluid']"));
        System.out.println(diffcategories);
        System.out.println(diffcategories.size());
    }
}


