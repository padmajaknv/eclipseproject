package PRIYANSHU.SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop
{
    public void DragAndDrop(String s)
    {
        commonmethods cm = new commonmethods();
        cm.openDriver(s);
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement RedBall =  driver.findElement(By.xpath("//div[@class='red']"));
        WebElement GreenBall =  driver.findElement(By.xpath("//div[@class='green']"));
        WebElement BlueBall =  driver.findElement(By.xpath("//div[@class='blue']"));

        WebElement Box = driver.findElement(By.xpath("//div[@id='target']"));
        Actions action = new Actions(driver);
        action.dragAndDrop(RedBall , Box ).build().perform();
        action.dragAndDrop(GreenBall , Box ).build().perform();
        action.dragAndDrop(BlueBall , Box ).build().perform();

    }
    public static void main(String[] args)
    {
        //create object of main class
        DragDrop DD = new DragDrop();
        String url ="https://practice.expandtesting.com/drag-and-drop-circles";
        DD.DragAndDrop(url);
    }

}
