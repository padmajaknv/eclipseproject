package smruti;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {
    ChromeDriver driver;

    public void login(String username, String password) {
        methodDriver md = new methodDriver();
        md.openDriver("https://www.instagram.com/");
        driver = md.driver;
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//div[text()='Log in']")).click();
    }

    public static void main(String[] args) {
        InstaLogin il = new InstaLogin();
        il.login("smruti123@gmail.com", "hi-Instagram123");
    }
}
