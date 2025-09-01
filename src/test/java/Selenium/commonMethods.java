package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class commonMethods {
    public ChromeDriver driver;

    public ChromeDriver openDriver(String url){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }


}
