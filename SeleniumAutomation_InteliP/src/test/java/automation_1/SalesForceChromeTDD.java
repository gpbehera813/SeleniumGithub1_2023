package automation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceChromeTDD {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/?locale=in");
        driver.findElement(By.xpath("// input[@id= 'username']")).sendKeys("ASD12345");
        driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("xyz@1234");
        driver.findElement(By.xpath("//input[@id='Login']")).click();



    }



}
