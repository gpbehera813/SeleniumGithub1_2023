package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BrowserInvocation;

public class TicketSpicejet extends BrowserInvocation {

    @Given("user select the oneway trip type")
    public void roundTrip() throws InterruptedException {

        //driver.findElement(By.xpath("//label[text()='Round Trip']")).click();
        driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay']")).click();
        Thread.sleep(2000);


    }


    @When("user select the boarding city and user select the destination city")
    public void boardingCityDestinationCity() throws InterruptedException {
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//a[normalize-space(text())='Bengaluru (BLR)']")).click();
        WebElement toDynamicDropdown = driver.findElement(By.xpath("//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']"));
        toDynamicDropdown.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='HYD']")).click();
        Thread.sleep(2000);
    }


    @And("user select the travelling date and return date")
    public void travellingDate() throws InterruptedException {

        //driver.findElement(By.xpath("//input[@id='custom_date_picker_id_1']")).click();
        // = as the date section appears automatically after clicking in To field
        driver.findElement(By.xpath("//td[@data-month='10']//a[@data-date='30']")).click();
        //driver.findElement(By.xpath("//input[@id='custom_date_picker_id_2']")).click();
        //driver.findElement(By.xpath("//td[@data-month='11']//a[@data-date='5']")).click();
        Thread.sleep(2000);


    }

    @And("user select the type of personnel")
    public void typeOfPersonnel() throws InterruptedException {

        driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Student']")).click();
        Thread.sleep(2000);
    }


    @And("user select the number of passenger")
    public void numberOfPassenger() throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='row1 mobile-select-passengers']")).click();
        Thread.sleep(2000);
        WebElement adultNumber = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
        Select adultPerson = new Select(adultNumber);
        adultPerson.selectByVisibleText("3");
        Thread.sleep(2000);
        adultPerson.selectByVisibleText("1");
        Thread.sleep(2000);

    }

    @And("user select the currency type")
    public void currencyType() throws InterruptedException {

        WebElement currencySelect = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        Select currencyName = new Select(currencySelect);
        currencyName.selectByVisibleText("CAD");
        Thread.sleep(2000);

    }



    @Then("user click on search button and look for available flights")
    public void searchButton() {

        driver.findElement(By.xpath("//input[@class='bookbtn']")).click();

    }

}
