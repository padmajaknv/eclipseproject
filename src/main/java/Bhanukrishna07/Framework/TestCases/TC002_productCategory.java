package Bhanukrishna07.Framework.TestCases;

import Bhanukrishna07.Framework.Elements.homePage;
import Bhanukrishna07.Framework.Functions.ProductCatagoryMethod;
import Bhanukrishna07.Framework.Functions.commons;
import Bhanukrishna07.Framework.Variables.constants;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC002_productCategory {
    ChromeDriver driver;
    commons cm=new commons();
    @BeforeMethod
    public void pre_condition(){
        driver=cm.openDriver();
        cm.goToApp("https://demoblaze.com/");
    }
    @Test
    public  void TC002(){
        ProductCatagoryMethod pcm=new ProductCatagoryMethod(driver);
        pcm.productCatagory(constants.phone);
    }
    @Test
    public  void TC002A(){
        ProductCatagoryMethod pcm=new ProductCatagoryMethod(driver);
        pcm.productCatagory(constants.laptops);
    }
    @Test
    public  void TC002B(){
        ProductCatagoryMethod pcm=new ProductCatagoryMethod(driver);
        pcm.productCatagory(constants.monitors);
    }

    @AfterMethod
    public void post_condition(){
       // cm.quitDriver();
    }
}
