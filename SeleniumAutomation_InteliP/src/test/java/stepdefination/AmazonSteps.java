package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pageObjects.HomePage;
import reusable.BrowserInvocation;
import reusable.HandleExcel;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class AmazonSteps extends BrowserInvocation {



    @When("user selects the value from amazon homepage dropdown")
    public void SelectsValueAmazonDropdown() {

        WebElement amazonValue = driver.findElement(By.xpath("//select[@title = 'Search in']"));
        Select amazonElement = new Select(amazonValue);
        amazonElement.selectByIndex(5);
        amazonElement.selectByVisibleText("Amazon Fashion");
        amazonElement.selectByValue("search-alias=amazon-devices");
        driver.findElements(By.id("searchDropdownDescription"));

        int amazonSize = amazonValue.findElements(By.tagName("option")).size();

        for (int j=0; j<amazonSize; j++ ){

            String amazonListName = amazonValue.findElements(By.tagName("option")).get(j).getText();
            System.out.println(amazonListName);


        }


    }


    @Given("user handles {string} the mouse action {string}")
    public void userHandlesTheMouseAction(String s,String prod) throws IOException {

     HomePage.enterProductName(HandleExcel.readExcel("Login",0,0));
        HomePage.clickSearchIcon();

    Actions action = new Actions(driver);

    WebElement accountElement = driver.findElement(By.id("nav-link-accountList"));
        action.clickAndHold(accountElement).build().perform();

    String key = Keys.chord(Keys.CONTROL,Keys.ENTER);
        driver.findElement(By.linkText("Baby Wishlist")).sendKeys(key);

    Set<String> handle= driver.getWindowHandles();


       for(String a:handle){
        driver.switchTo().window(a);


    }
        System.out.println("Title of the page is- "+driver.getTitle());
        driver.findElement(By.id("nameOrEmailField")).sendKeys("jfduiu");
      driver.switchTo().defaultContent();
        System.out.println("Title of the page is- "+driver.getTitle());


  }





}
