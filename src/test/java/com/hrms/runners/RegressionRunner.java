package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features"
		,glue="com/hrms/steps"
		,dryRun=true
		,plugin= {"pretty","html:target/html/cucumber-default-report","json:target/cucumber.json"}
		,monochrome=true
		,tags ={"@regression"}
		
		)

public class RegressionRunner {

}