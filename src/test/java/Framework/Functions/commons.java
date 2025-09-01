package Framework.Functions;

import Framework.Variables.constants;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class commons {
    public ChromeDriver driver;

    /**
     * Opens the Chrome Driver
     * @author: TheQAGuy
     * @return: No return value
     * @throws Exception
     */
    public ChromeDriver openDriver() throws Exception{
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        log().info("===== Opened ChromeDriver successfully =====");
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

    public WebDriverWait explicitWait(ChromeDriver driver, Duration seconds){
        WebDriverWait wait = new WebDriverWait(driver,seconds);
        return wait;
    }

    public void categoriesMenu(ChromeDriver driver, String product){
        String xpath="//a[contains(text(),'"+product+"')]";
        driver.findElement(By.xpath(xpath)).click();
    }

    public String readAPropertyFile(String fileName, String property) throws Exception{
        String filePath = System.getProperty("user.dir");
        filePath = filePath+"\\src\\test\\java\\Framework\\TestData\\"+fileName+".properties";

        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);
        Properties pro = new Properties();
        pro.load(fis);
        return pro.getProperty(property);
    }

    public static Logger log() throws Exception{
        Properties props = new Properties();
        props.load(new FileInputStream("src/log4j.properties"));
        PropertyConfigurator.configure(props);
        BasicConfigurator.configure();
        return Logger.getLogger(commons.class.getName());
    }

    public void quitDriver(){
        driver.quit();
        System.out.println("===== Quit the ChromeDriver =====");
    }

}
