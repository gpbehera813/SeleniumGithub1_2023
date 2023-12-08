package automation_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSignInTDD {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("giet13me066@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Guru@12345");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();


    }

}

