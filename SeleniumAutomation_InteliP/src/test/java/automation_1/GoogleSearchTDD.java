package automation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTDD {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/search?q=google");

        driver.findElement(By.xpath("//div[@class='M2vV3 vOY7J']")).click();

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Who is the Father of Boeing 747");

        driver.findElement(By.xpath("//button[@jsname='Tg7LZd']")).click();



    }


}
