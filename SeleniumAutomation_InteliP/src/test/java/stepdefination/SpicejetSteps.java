package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BrowserInvocation;

import java.util.ArrayList;
import java.util.List;

public class SpicejetSteps extends BrowserInvocation {

    @Given("user selects the value from currency dropdown")
    public void SelectsCurrencyValue() {


        WebElement currencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        Select currencyDrop = new Select(currencyElement);
        currencyDrop.selectByIndex(5);
        currencyDrop.selectByVisibleText("MYR");
        currencyDrop.selectByValue("INR");


        /*
        int currencySize = currencyElement.findElements(By.tagName("option")).size();
        for (int i=0; i<currencySize; i++) {

            String currencyName = currencyElement.findElements(By.tagName("option")).get(i).getText();
            System.out.println(currencyName);

        }
        */

  // using List interface to get all the values


        List<String> currencyValues = new ArrayList<String>();
        int currencySize = currencyElement.findElements(By.tagName("option")).size();
        for (int i = 0; i < currencySize; i++){

            currencyValues.add(currencyElement.findElements(By.tagName("option")).get(i).getText());

        }
        System.out.println(currencyValues.get(2));

  // for validation purpose we use Assert Class in a single line and inside this class we use methods

        Assert.assertEquals("CAD",currencyValues.get(2));

  // using for each loop we can iterate all the values individually rather than storing in list

        for(String actM : currencyValues){

            if(actM.equals("CAD")) {

                Assert.assertTrue(true);
                break;
            }
        }



    }


    @Given("user selects the checkbox and radio button")
    public void checkboxRadioSpicejet() {

        driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Student']")).click();
        //driver.findElement(By.xpath("//label[text()='Round Trip']")).click();
        driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip']")).click();

    }


    @Given("user selects the dropdown value in From and To in dynamic dropdown")
    public void dynamicDropdownValue() {
        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        //driver.findElement(By.xpath("//a[normalize-space(text())='Bengaluru (BLR)']")).click();
        WebElement toDynamicDropdown = driver.findElement(By.xpath("//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']"));
        toDynamicDropdown.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='HYD']")).click();


    }



}
