package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import reusable.BrowserInvocation;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Hooks extends BrowserInvocation {


    @Before()
    public void startup() throws IOException {

        System.out.println("Start");

        BrowserInvocation.invokeBrowser();

    }
    @After()
    public void teardown(){

        System.out.println("End");

        //driver.close();     // The window will be close after execution of given Scenario (current instance of browser)
        driver.quit();        // it will close all instance of browser (parent child window)

    }


    @AfterStep()
    public void takeScreenShot(Scenario scene){

       byte[] byt = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

       scene.attach(byt,"image/png","screenshot");

    }


}
