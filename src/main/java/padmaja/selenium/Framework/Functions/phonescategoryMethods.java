package padmaja.selenium.Framework.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import padmaja.selenium.Framework.Elements.category;
import padmaja.selenium.Framework.Variables.constants;

import java.util.List;
import java.util.Objects;

public class phonescategoryMethods {
    ChromeDriver driver;

    public phonescategoryMethods(ChromeDriver cd)
    {
        driver = cd;
    }
    public void phoneclick(){
        commons cmm= new commons();
        //category cat = new category();
        List<WebElement> diffcategories = driver.findElements(By.xpath("//img[@class='card-img-top img-fluid']"));
        System.out.println(diffcategories);
        int totalcount=diffcategories.size();
        System.out.println("No.of Phones=" +totalcount);
        int pagephonecount = constants.phonescount;
        int pageaptopcount = constants.laptopscount;
        int pagemonitorcount = constants.monitorscount;
        String cat = constants.phones;
        if(cat.equals(constants.phones)){
        Assert.assertEquals(totalcount,pagephonecount);
        System.out.println("Test case passed");}

    }


}
