package Bhanukrishna07.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class OpenUrl {
    public ChromeDriver driver;
    public Properties prop;

    public String url(String url){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.navigate().refresh();
        String curl=driver.getCurrentUrl();
        System.out.println(curl);
        return url;
    }
    public String readproperty(String filename, String key)throws Exception{
       String path=System.getProperty("user.dir")+("\\src\\main\\java\\Bhanukrishna07\\Selenium\\"+filename+".properties");
       File f=new File(path);
       FileInputStream fis=new FileInputStream(f);
       prop= new Properties();
       prop.load(fis);
       String product=prop.getProperty(key);
       System.out.println(product);
        return product;
    }

    public void readpropertyfile(String filename)throws Exception {
        String path = System.getProperty("user.dir") + ("\\src\\main\\java\\Bhanukrishna07\\Selenium\\" + filename + ".properties");
        File f = new File(path);
        FileInputStream fis = new FileInputStream(f);
        prop = new Properties();
        prop.load(fis);
    }
    public static void main(String[] args) throws Exception {
        OpenUrl open=new OpenUrl();
        open.url("https://www.facebook.com/");
        open.readpropertyfile("Testdata");

    }
}
