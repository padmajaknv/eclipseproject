package Bhanukrishna07.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetText {
    @Test
    void getText() throws InterruptedException {
        OpenUrl ul=new OpenUrl();
        ul.url(System.getProperty("user.dir")+"\\src\\test\\java\\Selenium\\test.html");
        ChromeDriver driver=ul.driver;
        driver.findElement(By.xpath("//button[text()='Click the button']")).click();
            String text = "";
            while (text.length() == 0) {
                try {
                    WebElement txt = driver.findElement(By.xpath("//p[text()='Hello World!!!']"));
                    Thread.sleep(1000);
                    if (txt.getText().length() > 0) {
                        text = txt.getText();
                        break;
                    }
                } catch (NoSuchElementException e) {
                }
            }
        System.out.println(text);
        driver.quit();
    }
    }

