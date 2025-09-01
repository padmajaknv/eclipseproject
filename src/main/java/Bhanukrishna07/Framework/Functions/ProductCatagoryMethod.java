package Bhanukrishna07.Framework.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Bhanukrishna07.Framework.Elements.homePage;

import java.util.List;

public class ProductCatagoryMethod {
    ChromeDriver driver;
    homePage hp=new homePage();

    public ProductCatagoryMethod(ChromeDriver driver){
        this.driver=driver;
    }

    public void productCatagory(String Productname){
        commons cm=new commons();
        cm.categoriesMenu(Productname);
        List<WebElement> productlist=driver.findElements(hp.numberofProducts);
        System.out.println("Number of products under the" +Productname+ "Catagory are:"+productlist );
    }
}
