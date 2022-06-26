package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/feature",
        glue ={"stepdefinition","hooks"},
		monochrome = true,
		plugin = {"pretty"}
		//dryRun = true
		//tags={"@adding_profiles_test","@editing_profiles_test","@deleting_profile_test","@copy_profile_test "}  //And condition
		//tags={"@adding_profiles_test,@editing_profiles_test"}  //OR condition
		//tags={"~@adding_profiles_test"}  //skipping tag
		//plugin = {"pretty","html:Reports","json:Reports/jsonreport.json","junit:Reports/xmlreport.xml" }
        )
public class runner {

}
