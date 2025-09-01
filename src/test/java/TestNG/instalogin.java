package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class instalogin  extends listeners {

    @Parameters({"username","password"})
    @Test
    public void data(String username,String password){
            String filepath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", filepath + "\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.instagram.com/");
            driver.manage().window().maximize();
            driver.navigate().refresh();
            System.out.println("Username:"+username);
            System.out.println("Password:"+password);
            driver.findElement(By.name("username")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.xpath("//div[text()='Log in']")).click();
        }
    }
