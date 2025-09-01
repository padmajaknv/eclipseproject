package padmaja.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm extends commonmetd{

    public void navigate(String subname) {
        driver.findElement(By.linkText("Company")).click();
        WebElement element = driver.findElement(By.xpath("//a[text()= '" + subname + "']"));
        element.click();
       /* switch (subname) {
            case "About Us":
                element.click();
                break;
            case "Executive Profiles":
                element.click();
                break;
            case "Press Releases":
                element.click();
                System.out.println(subname);
                break;
            case "News Articles":
                element.click();
                break;
            case "Careers":
                element.click();
                break;
            default:
                System.out.println("unknown text");
        }*/
    }
    public static void main(String[] args) {
        orangehrm cm=new orangehrm();
        cm.openDriver("https://www.orangehrm.com/");
        ChromeDriver driver = cm.driver;
        cm.navigate("Press Releases");
        cm.navigate("News Articles");
        }
 }






