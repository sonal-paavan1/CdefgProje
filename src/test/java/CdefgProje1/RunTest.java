package CdefgProje1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = ".",tags = "@register",format = {"pretty","html:target/cucumber-reports"})
//@CucumberOptions(features = ".",tags = "@currency",format = {"pretty","html:target/cucumber-reports"})

public class RunTest
{

}
