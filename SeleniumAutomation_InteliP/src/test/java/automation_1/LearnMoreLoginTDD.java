package automation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMoreLoginTDD {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://learnmoreplayground.blogspot.com/p/loginpage.html");
        driver.navigate().refresh();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Learn123");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("learn@123");
        driver.findElement(By.xpath("//button[@onclick='login()']")).click();
        String actualErrorMessage = driver.findElement(By.id("errorMessage")).getText();
        System.out.println(actualErrorMessage);
        String expectedErrorMessage = "Invalid Credentials.Please Check Once";
        if(actualErrorMessage.equals(expectedErrorMessage)){

            System.out.println("Pass");

        }
        else {

            System.out.println("Fail");
        }


    }

}
