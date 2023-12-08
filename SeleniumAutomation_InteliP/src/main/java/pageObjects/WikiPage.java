package pageObjects;

import org.openqa.selenium.By;
import reusable.BrowserInvocation;

public class WikiPage extends BrowserInvocation {

    public static String multiTableValue(int rowIndex, int columnIndex) {

        return driver.findElement(By.xpath("//table[@class='wikitable']//tr[" + rowIndex + "]/td[" + columnIndex + "]")).getText();

        /*
        we can write this way also
        String value = driver.findElement(By.xpath("//table[@class='wikitable']//tr["+rowIndex+"]/td["+columnIndex+"]")).getText();
        return;
         */
    }
        public static String getRowValue(String name){

            return driver.findElement(By.xpath("//table[@class='wikitable']//tr/td[normalize-space(text())='"+name+"']/following-sibling::td")).getText();
        }

    public static String getColumnValue(int columnIndex){

        return driver.findElement(By.xpath("//table[@class='wikitable']//tr/td["+columnIndex+"]")).getText();
    }



}


