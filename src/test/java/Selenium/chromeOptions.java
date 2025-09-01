package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeOptions {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--headless=new");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.jetbrains.com/idea/download/?section=windows");
        System.out.println(driver.getTitle());
    }
}
