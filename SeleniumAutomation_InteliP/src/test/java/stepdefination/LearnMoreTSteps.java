package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BrowserInvocation;

public class LearnMoreTSteps extends BrowserInvocation {

    /*
    @Given("user navigates to learn more login page")
    public void navigateURL(){

        driver.navigate().to("https://learnmoreplayground.blogspot.com/p/loginpage.html");
        driver.navigate().refresh();

    }
     */
    // As the navigate method for amazon, spicejet & LearnMore URL is declared Globally in BrowserInvocation Class.


    @When("user enter username {string} and password {string}")
    public void enterUsername(String username, String password) {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);


    }

    @And("user clicks on login button")
    public void loginButton() {
        driver.findElement(By.xpath("//button[@onclick='login()']")).click();


    }

    @Then("user validate the error message")
    public void validateErrorMessage() {
        String actualErrorMessage = driver.findElement(By.id("errorMessage")).getText();
        System.out.println(actualErrorMessage);
        String expectedErrorMessage = "Invalid Credentials.Please Check Once";


        /*
        if(actualErrorMessage.equals(expectedErrorMessage)){

            System.out.println("Pass");

        }
        else {

            System.out.println("Fail");
        }

       */

        // for validation purpose we use Assert Class in a single line

        // Assert.assertEquals(actualErrorMessage,expectedErrorMessage);

        // for validation purpose we use Assert Class along with if statement as well


        if(actualErrorMessage.equals(expectedErrorMessage)){

            Assert.assertTrue(true);  //it gives boolean result

        }
        else {

            Assert.assertTrue(false);
        }


    }

    @Then("user validate the title of login page")
    public void validateTitle() {
        //String actualTitle = driver.findElement(By.xpath("//h2[text() = 'Welcome To Learn More Login']")).getText();
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "LoginPage";
        if(actualTitle.equals(expectedTitle)){

            System.out.println("Pass");

        }
        else {

            System.out.println("Fail");
        }
    }

    @Then("user validate the whether navigates to home page")
    public void validateHomePage() {

        /* String actualHomePage = driver.findElement(By.id("month")).getText();
        System.out.println(actualHomePage);
        String expectedHomePage = "November 2023";
        if(actualHomePage.equals(expectedHomePage)) {
            System.out.println("Login Passed");
        }
        else{

            System.out.println("Log in Failed");
        }
        */

    }


    @Given("user select the checkbox option")
    public void checkbox() {
        driver.findElement(By.linkText("Checkbox")).click();

    }

    @When("user validate the checkbox")
    public void validateCheckbox() {
        //driver.findElement(By.xpath("//form[@id='checkboxes']/child::label[normalize-space(text())='Selenium Webdriver']")).click();
        driver.findElement(By.xpath("//label[normalize-space(text())='Manual']")).click();
        driver.findElement(By.xpath("//label[normalize-space(text())='Selenium Webdriver']")).click();

    }


    @Given("user select the radio button option")
    public void radioButton() {
        driver.findElement(By.linkText("Radio Button")).click();
    }


    @When("user validate the radio button")
    public void validateRadiobutton() {
        driver.findElement(By.xpath("//label[normalize-space(text())='More than 1 year']")).click();

    }


    @Given("user select the action class option")
    public void selectActionClass() {
        driver.findElement(By.linkText("Actions Class")).click();

    }


    @When("user perform the right click operation")
    public void rightClickOperation() {
        Actions action = new Actions(driver);
        WebElement rightClick = driver.findElement(By.xpath("//button[@id='Right Click']"));
        action.contextClick(rightClick).build().perform();

    }

    @Then("user validate the right click operation")
    public void validateRightClick() {
        String actualRightClickMsg = driver.findElement(By.xpath("//p[text()='I was Right Clicked']")).getText();
        String expectedRightClickMsg = "I was Right Clicked";
        if(actualRightClickMsg.equals(expectedRightClickMsg)){

            System.out.println("The Right Click operation is passed");

        }else {

            System.out.println("The Right Click operation is failed");

        }
    }


    @When("user perform the double click operation")
    public void doubleClickOperation() {

        Actions action = new Actions(driver);
        WebElement doubleClick = driver.findElement(By.xpath("//button[@id='Double Click']"));
        action.doubleClick(doubleClick).build().perform();

    }


    @Then("user validate the double click operation")
    public void validateDoubleClick() {

        String actualDoubleClickMsg = driver.findElement(By.xpath("//p[text()='I was Double Clicked']")).getText();
        String expectedDoubleClickMsg = "I was Double Clicked";
        if (actualDoubleClickMsg.equals(expectedDoubleClickMsg)) {

            System.out.println("The Right Click operation is passed");

        } else {

            System.out.println("The Right Click operation is failed");

        }

    }


    @When("user perform the drag and drop")
    public void DragDrop() {

        Actions dragAction = new Actions(driver);
        WebElement source = driver.findElement(By.id("drag1"));
        WebElement target = driver.findElement(By.id("Dropable"));
        dragAction.dragAndDrop(source, target).build().perform();

    }

    @Then("user validate the drag and drop action")
    public void validateDragDrop() {

        String actualMsg = driver.findElement(By.id("Dropable")).getText();
        String expectedMsg = "Dropped";
        if(actualMsg.equals(expectedMsg)){

            System.out.println("Test is passed");

        }else{

            System.out.println("Test is failed");
        }

    }

}
