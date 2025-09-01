package PRIYANSHU.SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EMICalculator
{
    public static void main(String[] args)
    {
        commonmethods cm = new commonmethods();
        cm.openDriver("https://emicalculator.net/");
        ChromeDriver driver = cm.driver;
        driver.navigate().refresh();

        WebElement slider = driver.findElement(By.xpath("//div[@id='loanamountslider']"));

        int xOffset = 150;

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider, xOffset, 0).build().perform();

        WebElement loanAmountField = driver.findElement(By.id("loanamount"));
        String Amount = loanAmountField.getAttribute("value");

        String value =Amount.replaceAll("[^0-9]", "");

        int LoanAmount = (int)( (0.31056) * xOffset ) + 100;
        System.out.println("Loan Amount is : " + LoanAmount + "Lakh");

    }
}
/*

		2.Emi calculator
			1st go to begining point .

			then move forword(like move on x-axis [(x,y)-->(100,0)])
					y always be 0(Zero) bcz wee are moving on x-axis
       actions.dragAndDropBy(slider , 0 ,0).build().perform(); ----> 1cr
       actions.dragAndDropBy(slider , 5 ,0).build().perform(); ----> 1cr 1lakh
       actions.dragAndDropBy(slider , 10 ,0).build().perform(); ----> 1cr 3lakh
       actions.dragAndDropBy(slider , 15 ,0).build().perform(); ----> 1cr 5lakh
       actions.dragAndDropBy(slider , 20 ,0).build().perform(); ----> 1cr 6lakh
       actions.dragAndDropBy(slider , 300 ,0).build().perform(); ----> 1cr 93lakh
       actions.dragAndDropBy(slider , 320 ,0).build().perform(); ----> 1cr 99lakh
       actions.dragAndDropBy(slider , 322 ,0).build().perform(); ----> 2cr
       actions.dragAndDropBy(slider , 325 ,0).build().perform(); ----> 2cr

 Now move Backword(like move on x-axis [(x,y)-->(100,0)])
					y always be 0(Zero) bcz wee are moving on x-axis
       actions.dragAndDropBy(slider , 0 ,0).build().perform(); ----> 1cr
       actions.dragAndDropBy(slider , -5 ,0).build().perform(); ----> 98lakh
       actions.dragAndDropBy(slider , -10 ,0).build().perform(); ----> 97lakh
       actions.dragAndDropBy(slider , -320 ,0).build().perform(); ----> 1lakh
       actions.dragAndDropBy(slider , -322 ,0).build().perform(); ----> 0lakh
       actions.dragAndDropBy(slider , -322 ,0).build().perform(); ----> 0lakh



 */
