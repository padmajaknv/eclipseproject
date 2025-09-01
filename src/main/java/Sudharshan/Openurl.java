package Sudharshan;

import org.openqa.selenium.chrome.ChromeDriver;

public class Openurl {
    void url(String url){
    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.close();
    }

    public static void main(String[] args) {
        Openurl ul=new Openurl();
        ul.url("https://www.facebook.com/");

    }
}
