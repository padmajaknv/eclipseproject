package VarshithaUppalapati;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
    ChromeDriver driver;
    public void filling()throws Exception{
        methodDriver md = new methodDriver();
        md.openDriver("https://practice.expandtesting.com/drag-and-drop-circles");
        driver = md.driver;
        WebElement down = driver.findElement(By.xpath("//h4[text()='Practice Test Automation WebSite for Web UI and Rest API']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(down).build().perform();
        WebElement red = driver.findElement(By.xpath("//div[@class='red']"));
        WebElement green = driver.findElement(By.xpath("//div[@class='green']"));
        WebElement blue = driver.findElement(By.xpath("//div[@class='blue']"));
        WebElement container = driver.findElement(By.xpath("//div[@id='target']"));
        actions.dragAndDrop(red,container).build().perform();
        Thread.sleep(1000);
        actions.dragAndDrop(green,container).build().perform();
        Thread.sleep(1000);
        actions.dragAndDrop(blue,container).build().perform();
        Thread.sleep(1000);

    }

    public static void main(String[] args)  throws Exception {
        draganddrop f= new draganddrop();
        f.filling();
    }
}
