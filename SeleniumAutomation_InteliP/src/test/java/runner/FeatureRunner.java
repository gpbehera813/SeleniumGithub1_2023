package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)

    @CucumberOptions(

            features = {"src/test/resources/featurefile"},
            glue = {"stepdefination"},
            tags = "@wikitable",
            plugin = {"pretty",
            "html:target/html-output/cucumber.html",
            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
            "json:target/json-output/cucumber.json",
            "junit:target/junit-output/cucumber.xml"}


    )

    public class FeatureRunner {


    }


