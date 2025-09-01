package Bhanukrishna07.Framework.Functions;

import Bhanukrishna07.Framework.Variables.constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class commons {
    public ChromeDriver driver;

    public ChromeDriver openDriver(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("===== Opened ChromeDriver successfully =====");
        return driver;
    }

    public void goToApp(String url){
        driver.get(url);
        waitForPageLoad();
        System.out.println("===== Navigated to : "+url+" =====");
    }

    public void waitForPageLoad(){
        System.out.println("===== Waiting for Page Load =====");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    public void waitForPageLoad(long seconds){
        driver.manage().timeouts().pageLoadTimeout(seconds,TimeUnit.SECONDS);
    }

    public void navigateTopMenu(String menu){
        String xpath = "//a[contains(text(),'"+menu+"')]";
        driver.findElement(By.xpath(xpath)).click();
    }
    public void categoriesMenu(String product){
        String xpath="//a[contains(text(),'"+product+"')]";
        driver.findElement(By.xpath(xpath)).click();
    }
    public WebDriverWait explicitWait(ChromeDriver driver, Duration seconds){
        WebDriverWait wait = new WebDriverWait(driver,seconds);
        return wait;
    }

    public void quitDriver(){
        driver.quit();
        System.out.println("===== Quit the ChromeDriver =====");
    }

}
