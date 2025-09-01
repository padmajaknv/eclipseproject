package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        commonMethods cm = new commonMethods();
        ChromeDriver driver  = cm.openDriver("https://www.facebook.com/");
        fb_commonMethods fbc = new fb_commonMethods(driver);

//        ChromeDriver driver = new ChromeDriver();
        fbc.typeEmailInFB("Hi");
    }
}
