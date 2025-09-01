package Framework.Functions;


import Framework.Elements.homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class products {
    ChromeDriver driver;
    homePage hp=new homePage();

    public products(ChromeDriver driver){
        this.driver=driver;
    }

    public void productCategory(ChromeDriver driver,String Productname){
        commons cm=new commons();
        cm.categoriesMenu(driver, Productname);
        List<WebElement> productlist=driver.findElements(hp.numberofProducts);
        System.out.println("Number of products under the" +Productname+ "Catagory are:"+productlist );
    }
}
