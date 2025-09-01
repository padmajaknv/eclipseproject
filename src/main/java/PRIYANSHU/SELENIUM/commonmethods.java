package PRIYANSHU.SELENIUM;

import org.openqa.selenium.chrome.ChromeDriver;

public class commonmethods
{
    public ChromeDriver driver;

    public void openDriver(String url)
    {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

}
