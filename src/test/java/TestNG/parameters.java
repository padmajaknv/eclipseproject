package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {

    @Parameters({"username","password","browser"})
    @Test
    public void a(String username, String password,String browser){
        WebDriver driver = null;
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else{
            System.out.println("Incorrect browser details");
        }
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
    }
}
