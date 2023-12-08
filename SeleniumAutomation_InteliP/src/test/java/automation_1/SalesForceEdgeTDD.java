package automation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SalesForceEdgeTDD {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys("ASD12345");
        driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 password']")).sendKeys("XYZ@123");
        driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).click();



    }


}
