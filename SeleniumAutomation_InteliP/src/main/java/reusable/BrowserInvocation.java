package reusable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserInvocation {

        public static WebDriver driver;

        public  static Properties prop;

        public static void invokeBrowser() throws IOException {

            FileInputStream fis = new FileInputStream(new File("src/main/resources/utility/configuration.properties"));
            prop = new Properties();
            prop.load(fis);

            if(prop.getProperty("browser").equals("Chrome")){

                driver = new ChromeDriver();

            } else if (prop.getProperty("browser").equals("Edge")) {

                driver = new EdgeDriver();

            } else {

                throw new InvalidArgumentException("Enter Valid browser name");

            }

     /* or switch (prop.getProperty("browser")){

            case "Chrome":
                driver = new ChromeDriver();
                break;

            case "Edge":
                driver = new EdgeDriver();
                break;

            default:
                throw  new InvalidArgumentException("Enter valid browser name");
        }
        */

            driver.navigate().to(prop.getProperty("testenvironment"));
            driver.navigate().refresh();
            driver.manage().window().maximize();

            //driver = new ChromeDriver();
            //driver = new EdgeDriver();
            //driver.navigate().to("https://learnmoreplayground.blogspot.com/p/loginpage.html");
            //driver.navigate().to("https://book.spicejet.com/");
            //driver.navigate().to("https://www.amazon.in/");


        }

    }


