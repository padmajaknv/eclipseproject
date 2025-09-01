package smruti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class amazon {
    ChromeDriver driver;

    public void Amazonpage() {
        methodDriver md = new methodDriver();
        md.openDriver("https://www.amazon.in/");
        driver = md.driver;
        driver.navigate().refresh();
    }

    public void priceCompare(String searchItem) throws Exception {
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(searchItem);
        //     driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='sac-suggestion-row-1']")).click();
        List<WebElement> iphoneresults = driver.findElements(By.xpath("//h2[contains(@aria-label,'iPhone')][not(contains(@aria-label,'Sponsored'))]"));
        System.out.println("iPhone results : " + iphoneresults.size());
        driver.findElement(By.xpath("(//h2[contains(@aria-label,'iPhone')][not(contains(@aria-label,'Sponsored'))])[1]")).click();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        WebElement sellingP = driver.findElement(By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']"));
        String price = sellingP.getText().replaceAll(",", "").replace("₹", "");
        System.out.println("Selling PRICE: " + price);

        WebElement firstMRP = driver.findElement(By.xpath("//span[@class='a-price a-text-price']"));
        String price1 = firstMRP.getText().replace(",", "").replace("₹", "");
        System.out.println("MRP: " + price1);


        float SP = Float.parseFloat(price);
        float mrp = Float.parseFloat(price1);

        float diff = ((mrp - SP) / mrp)*100;
        System.out.println("discount is " + diff);
        int finaldiscount = Math.round(diff);
        System.out.println("final discount is :" + finaldiscount + "%");

        WebElement actualdiscount = driver.findElement(By.xpath("//span[contains(@class,'savingPriceOverride')]"));
        String dis = actualdiscount.getText().replace("%", "").replace("-", "");
        int Adiscount = Integer.parseInt(dis);
        System.out.println("Displayed discount: " + Adiscount + "%");

        if (finaldiscount == Adiscount) {
            System.out.println("discount is correct");
        } else {
            System.out.println("dicount is not matched");
        }
    }

    public static void main(String[] args) throws Exception {
        amazon obj = new amazon();
        obj.Amazonpage();
        obj.priceCompare("iphone 15");
    }
}



