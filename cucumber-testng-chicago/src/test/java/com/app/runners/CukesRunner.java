package com.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"html:target/cucumber",
				"json:target/cucumber.json"},
		features="src/test/resources/com/app/features/",
		glue="com/app/step_definitions/",
		tags = {"@all"},
		dryRun=false
)
public class CukesRunner extends AbstractTestNGCucumberTests {
	
}
