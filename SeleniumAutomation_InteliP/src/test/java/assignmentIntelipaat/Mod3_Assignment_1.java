package assignmentIntelipaat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Mod3_Assignment_1 {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        String reqdays = "15";
        driver.findElement(By.partialLinkText("Create new account")).click();
        List<WebElement> days = driver.findElements(By.xpath("//select[@aria-label='Day']/option"));
        //List<WebElement> months = driver.findElements(By.id("month"));
        //List<WebElement> years = driver.findElements(By.id("year"));
        for(int i=0;i< days.size();i++){

            if (days.equals(reqdays)){

                days.get(i).click();

            }


        }


    }

}
