package VarshithaUppalapati;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class instalogin {
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
        instalogin il = new instalogin();
        il.login("varshitha@gmail.com", "123");
    }
}
