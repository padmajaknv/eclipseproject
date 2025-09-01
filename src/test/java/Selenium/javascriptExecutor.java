package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {
    public static void main(String[] args) throws Exception {
        commonMethods cm = new commonMethods();
        cm.openDriver(System.getProperty("user.dir")+"\\src\\test\\java\\Selenium\\test.html");
        ChromeDriver driver = cm.driver;
        JavascriptExecutor jse = driver;
        //alternative for sendKeys()
        jse.executeScript("document.getElementById('text').value='Hello World!!!'");

        //alternative for click()
        jse.executeScript("document.getElementById('Female').click()");
        Thread.sleep(5000);
//        Object value= jse.executeScript("return document.getElementById('Female').getAttribute('checked')");
//        System.out.println(value.toString());

        //alternative for moveToElement()
        WebElement element = driver.findElement(By.id("text2"));
        jse.executeScript("arguments[0].scrollIntoView(true);",element);

        Thread.sleep(3000);
        jse.executeScript("window.open('','_blank')");

    }
}
