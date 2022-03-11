package Runners;

import java.io.File;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features",
glue="StepsDefenitions" ,
plugin = {"html:target/cucumber-html-repport" , 
		"json:target/cucumber-reports/cucumber.json", 		
         "junit:target/cucumber-reports/cucumber.xml",
         },
monochrome = true)

public class TestRunner {
	
	
}




