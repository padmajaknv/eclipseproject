package samrat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\IdeaProjects\\paramesh\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.navigate().refresh();
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.name("username"));
        email.sendKeys("paramesh");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("0123456789");
        driver.findElement(By.xpath("//div[text()='Log in']")).click();

    }
}
