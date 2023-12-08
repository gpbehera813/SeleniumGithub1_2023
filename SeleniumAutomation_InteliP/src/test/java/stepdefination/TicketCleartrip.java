package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reusable.BrowserInvocation;

public class TicketCleartrip extends BrowserInvocation {

    String boardingName = "Bhu";


    @Given("user select the oneway trip type in cleartrip")
    public void oneway() throws InterruptedException {

        driver.findElement(By.xpath("//div[@style='min-width: 136px;']//div[@class='p-relative']")).click();
        //river.findElement(By.xpath("//div[@style='min-width: 136px;']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='flex flex-middle']//span[text()='Round trip']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@style='min-width: 136px;']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='flex flex-middle']//span[text()='One way']")).click();
        Thread.sleep(2000);

    }

    @When("user select number of person and class type")
    public void personAndClassType() throws InterruptedException {
        driver.findElement(By.xpath("//span[text()='1 Adult, Economy']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='flex-inline']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Business class']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Economy']")).click();
        Thread.sleep(2000);

    }

    @And("user select the type of discount in cleartrip")
    public void discountType() throws InterruptedException {

        driver.findElement(By.xpath("//div[text()='Student fare']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Regular fare']")).click();
        Thread.sleep(2000);

    }


    @And("user select the boarding city and user select the destination city in clear trip")
    public void City() throws InterruptedException {

        //driver.findElement(By.xpath("//div[contains(normalize-space(@class),'field-2')]")).click();
/*
        driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("Bhubaneswar");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[normalize-space(text())='Bhubaneswar, IN - Biju Patnaik (BBI)']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("Bangalore");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[normalize-space(text())='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
        Thread.sleep(2000);
*/

        driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys(boardingName);
        WebElement cityFrom = driver.findElement(By.xpath("//ul[@class='airportList']"));
        int cityIndex = cityFrom.findElements(By.xpath("//ul[@class='airportList']")).size();

        for (int i=0; i<cityIndex; i++){


        }

    }



    @And("user select the travelling date and return date in cleartrip")
    public void travelDate() throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']/child::button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@aria-label='Sat Dec 02 2023']")).click();

    }

    @Then("user click on search button and look for available flights in cleartrip")
    public void searchFlights() {

        driver.findElement(By.xpath("//span[text()='Search flights']")).click();

    }


}
