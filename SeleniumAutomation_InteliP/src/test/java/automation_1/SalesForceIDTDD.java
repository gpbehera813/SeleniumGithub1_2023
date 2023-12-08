package automation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceIDTDD {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/?locale=in");
        driver.findElement(By.id("username")).sendKeys("ASD@12345");
        driver.findElement(By.id("password")).sendKeys("xyz@123");
        driver.findElement(By.id("Login")).click();



    }


}
