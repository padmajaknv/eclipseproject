package PRIYANSHU.SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin
{
    public void driverr(String ss ,String fb)
    {
        System.out.println(ss);
        ChromeDriver driver = new ChromeDriver();
        driver.get(fb);
        driver.manage().window().maximize();
        driver.navigate().refresh();
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("priyanshutaria@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("9630258741");
        driver.findElement(By.name("login")).click();
    }
    public static void main(String[] args)
    {
        String s ="C:\\Users\\Hp\\IdeaProjects\\QT-930AM-Jul2025\\chromedriver.exe";
        String url ="https://www.facebook.com/";
        Fblogin ni = new Fblogin();
        ni.driverr(s,url);
    }

}

/*

{
        System.out.println(ss);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("priyanshutaria@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("9630258741");
        driver.findElement(By.name("login")).click();
    }
    public static void main(String[] args)
    {
        String s ="C:\\Users\\Hp\\IdeaProjects\\QT-930AM-Jul2025\\chromedriver.exe";
        Fblogin ni = new Fblogin();
        ni.driverr(s);
    }


 */