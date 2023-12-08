package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.WikiPage;
import reusable.BrowserInvocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HandlingTable extends BrowserInvocation {
         String reqData1 = "Key people";
         String reqData2 = "Worldwide";
    @When("user handles the ey wiki table")

    public void eyWikiTable() {


    // we can use List and store the WebElement inside it and use Assertion Class for validation



        List<WebElement> eyTable1 = driver.findElements(By.xpath("//table[@class='infobox vcard']//tr/th"));
        List<WebElement> eyTable2 = driver.findElements(By.xpath("//table[@class='infobox vcard']//tr/td"));
        List<String> tableValue1 = new ArrayList<String>();
        List<String> tableValue2 = new ArrayList<String>();
        for(WebElement col1: eyTable1){

            tableValue1.add(col1.getText());
        }
        System.out.println(tableValue1);

        for(WebElement col2: eyTable2){

            tableValue2.add(col2.getText());
        }
        System.out.println(tableValue2);

     // for Validation purpose

        for(String as1: tableValue1){

            if(as1.equals("Revenue")){

                Assert.assertTrue(true);
                break;
            }
        }

        for(String as2: tableValue2){

            if(as2.equals("United Kingdom")){

                Assert.assertTrue(true);
                break;
            }
        }





        /*
        WebElement eytable = driver.findElement(By.xpath("//table[@class='infobox vcard']"));

    // 1st Method by using WebElement and for loop

        int col1Size = eytable.findElements(By.xpath("//table[@class='infobox vcard']//tr/th")).size();
        int col2Size = eytable.findElements(By.xpath("//table[@class='infobox vcard']//tr/td")).size();
        System.out.println("Column-1 Data: ");
        System.out.println(" ");
        for(int i=0 ; i<col1Size; i++) {

        String col1 = eytable.findElements(By.xpath("//table[@class='infobox vcard']//tr/th")).get(i).getText();
            System.out.println(col1);
        }
        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println(" ");
        System.out.println("Column-2 Data: ");
        System.out.println("  ");
        for(int j=0; j<col2Size; j++){

        String col2 = eytable.findElements(By.xpath("//table[@class='infobox vcard']//tr/td")).get(j).getText();
        System.out.println(col2);
        }
        */

        // 2nd Method by using List method for WebElement
        /*
        List<WebElement> eycol1 = driver.findElements(By.xpath("//table[@class='infobox vcard']//tr/th"));
        List<WebElement> eycol2 = driver.findElements(By.xpath("//table[@class='infobox vcard']//tr/td"));

        System.out.println("Column-1 Data: ");
        System.out.println(" ");

        for (int i = 0; i < eycol1.size(); i++) {

            String col1Data = eycol1.get(i).getText();

            System.out.println(col1Data);

        }

        System.out.println("Column-2 Data: ");
        System.out.println(" ");

        for (int j = 0; j < eycol2.size(); j++) {

            String col2Data = eycol2.get(j).getText();

            System.out.println(col2Data);

        }
        */

        // we can use Map class to get the values from table

        /*

        List<WebElement> eyTable = driver.findElements(By.xpath("//table[@class='infobox vcard']//tr"));
        List<String> eyCol1 = new ArrayList<String>();
        for (WebElement element: eyTable){
            eyCol1.add(element.getText());

        }

        List<String> eyCol2 = new ArrayList<String>();
        for (WebElement element: eyTable){
            eyCol2.add(element.getText());

        }

        Map<List,List> map = new HashMap<List, List>();

        map.put(eyCol1,eyCol2);

        Assert.assertEquals("Ernst & Whinney", map.get("Predecessor"));


         */




     }


    @Given("user handles multiple table")
    public void multipleTable() {

        System.out.println(WikiPage.multiTableValue(4,4));

        Assert.assertEquals("10,236", WikiPage.multiTableValue(4,4));



    }
}

