package haraprasad.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class amazonDiscount {
    public void discount(String item){
        commonDriver cd=new commonDriver();
        cd.openDriver("https://www.amazon.in/");
        ChromeDriver driver=cd.driver;
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(item);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='sac-suggestion-row-1']")).click();
        driver.findElement(By.xpath("//h2[contains(@aria-label,'iPhone')][not(contains(@aria-label,'Sponsored'))]")).click();

        WebElement sprice=driver.findElement(By.xpath("//span[contains(@class,'reinventPricePriceToPayMargin priceToPay')]"));
        String price=sprice.getText().replace(",","").replace("₹","");
        System.out.println("Selling Price: "+price);
        WebElement mprice=driver.findElement(By.xpath("//span[contains(@class,'a-price a-text-price')]"));
        String mrp=mprice.getText().replace(",","").replace("₹","");
        System.out.println("MRP Price: "+mrp);
        float sp=Float.parseFloat(price);
        float mp=Float.parseFloat(mrp);
        float diff=((mp-sp)/mp)*100;
        int finalDis=Math.round(diff);
        WebElement actualDiscount=driver.findElement(By.xpath("//span[contains(@class,'reinventPriceSavingsPercentageMargin')]"));
        String adis=actualDiscount.getText().replace("-","").replace("%","");
        int actualDis=Integer.parseInt(adis);
        if(actualDis==finalDis) System.out.println("Discount is right.");
        else System.out.println("Discount is wrong.");
    }

    public static void main(String[] args) {
        amazonDiscount ad=new amazonDiscount();
        ad.discount("iPhone");
    }
}
