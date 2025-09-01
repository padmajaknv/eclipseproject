package PRIYANSHU.SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDiscountValidation
{
    public static void main(String[] args)
    {
        int count = 0;
        commonmethods cm = new commonmethods();
        cm.openDriver("https://www.amazon.in/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();
        driver.navigate().refresh();

        driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("iphone 16");

        try {Thread.sleep(1500);}
        catch (Exception e) {}

        driver.findElement(By.xpath("//div[@id='sac-suggestion-row-1']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'iPhone 16')][not(contains(@aria-label,'Sponsored'))]")).click();


        ///                 -------ACTUAL PRICE-------
        //span[@class='a-price-whole'] --> it will not work
        // --> invalid xpath (Always take the main class xpath)     WebElement SellingPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
        WebElement ActualPrice = driver.findElement(By.xpath("//span[@class='a-price a-text-price']"));
        String OriginalPrice = ActualPrice.getText().replaceAll(",", "").replace("₹", "");
        System.out.println("Actual Price is : " + OriginalPrice);

        ///                 -------DISCOUNT PRICE-------
        WebElement  MRPPrice = driver.findElement(By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']"));
        String DiscountPrice = MRPPrice.getText().replaceAll(",", "").replace("₹", "");
        System.out.println("MRP Price is : " + DiscountPrice);

        ///                 ------- % of DISCOUNT -------
        WebElement percentage = driver.findElement(By.xpath("//span[@class='a-size-large a-color-price savingPriceOverride aok-align-center reinventPriceSavingsPercentageMargin savingsPercentage']"));
        String Discount = percentage.getText().replaceAll("-", "").replace("%", "");
        System.out.println("Discount % is : " + Discount + "%");

        int OP = Integer.parseInt(OriginalPrice);
        int DP = Integer.parseInt(DiscountPrice);
        float Dis = Float.parseFloat(Discount);

        //comment section will be here

        float Offer = OP - DP;
        float f = (Offer * 100)/OP;
        System.out.println("Offer % is : " + f + "%");
        //OfferPercentage

        int RoundOff = Math.round(f);
        System.out.println("Round Off % is : " + RoundOff);
        //  if (Discount % == Round Off %)  -----> Valid Discount

        if(Dis==RoundOff)
        {
            System.out.println("Given % Of Discount is Valid.");
        }
        else
        {
            System.out.println("Given % Of Discount is InValid.");
        }

    }

}
 /*
                                 //comment section Concept

        Actual Price is : 144900    --> OP
        MRP Price is : 135900       --> DP
        Discount % is : 6

        Offer = Actual Price - MRP Price
        Offer =    OP - DP
        float OfferPercentage =  (OP - DP)   *  100;
                                  --------
                                     OP
               Round Off : -
                float f = 6.8f;
                int i = math.round(f);
                sout(i);

         */