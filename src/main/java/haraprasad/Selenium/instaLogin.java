package haraprasad.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class instaLogin {
    ChromeDriver driver;

    public void login(String username, String password) {
        commonDriver cd = new commonDriver();
        cd.openDriver("https://www.instagram.com/");
        driver = cd.driver;
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//div[text()='Log in']")).click();
    }

    public static void main(String[] args) {
        instaLogin il = new instaLogin();
        il.login("hapi@gmail.com", "hapi123");
    }
}
