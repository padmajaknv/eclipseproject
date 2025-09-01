package padmaja.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
    public void drag() throws Exception
    {
        commonmetd cm=new commonmetd();
        cm.openDriver("https://practice.expandtesting.com/drag-and-drop-circles");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        Actions actions = new Actions(driver);
        /*driver.findElement(By.xpath("//a[contains(@href,'/drag-and-drop-circles')]")).click();
        driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);*/
        WebElement down =driver.findElement(By.xpath("//h4[text()='Practice Test Automation WebSite for Web UI and Rest API']"));
        actions.moveToElement(down).build().perform();
        WebElement red = driver.findElement(By.xpath("//div[@class='red']"));
        WebElement green = driver.findElement(By.xpath("//div[@class='green']"));
        WebElement blue = driver.findElement(By.xpath("//div[@class='blue']"));
        WebElement dest = driver.findElement(By.xpath("//div[@id='target']"));
        actions.dragAndDrop(red,dest).build().perform();
        Thread.sleep(2000);
        actions.dragAndDrop(green,dest).build().perform();
        Thread.sleep(2000);
        actions.dragAndDrop(blue,dest).build().perform();

    }
    public static void main(String[] args) throws Exception{
        Draganddrop dr = new Draganddrop();
        dr.drag();
    }
}
