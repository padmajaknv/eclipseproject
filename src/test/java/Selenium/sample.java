package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class sample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\IdeaProjects\\QT-930AM-Jul2025\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver","");
        ChromeDriver driver = new ChromeDriver();
//        FirefoxDriver driver2 = new FirefoxDriver();
//        OperaDriver driver3 = new OperaDriver();
//        SafariDriver driver4 = new SafariDriver();
//        EdgeDriver driver5 = new EdgeDriver();
//        InternetExplorerDriver driver6 = new InternetExplorerDriver();
        driver.get("https://www.facebook.com/");
        driver.navigate().refresh();
        driver.manage().window().maximize();
//        driver.close();
//        driver.quit();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        String url = driver.getCurrentUrl();
        String title  =driver.getTitle();
        System.out.println(url);
        System.out.println(title);
    }
}
