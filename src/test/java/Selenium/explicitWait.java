package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class explicitWait {
    public static void main(String[] args) {
        commonMethods cm = new commonMethods();
        cm.openDriver(System.getProperty("user.dir")+"\\src\\test\\java\\Selenium\\test.html");
        ChromeDriver driver = cm.driver;
        driver.findElement(By.id("button")).click();
//        WebElement element = driver.findElement(By.id("result"));
        By element = By.id("result");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//        wait.until(ExpectedConditions.textToBe(element,"Hello World!!!"));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(element),"Hello World!!!"));
        System.out.println(driver.findElement(element).getText());
        driver.findElement(By.name("delay")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(@title,'languages')]")).click();
//        WebElement hindi = driver.findElement(By.xpath("//a[@lang='hi']"));
        By hindi = By.xpath("//a[@lang='hi']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(hindi));
        driver.findElement(hindi).click();
//        Wait w = new FluentWait(driver).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofSeconds(1))
//                .ignoring(Exception.class);
//        w.until(ExpectedConditions.visibilityOfElementLocated(hindi));
    }
}
