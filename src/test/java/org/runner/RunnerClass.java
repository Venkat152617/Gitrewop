package org.runner;



import org.junit.runner.RunWith;
import org.report.Reports;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.test", dryRun=true , snippets = SnippetType.CAMELCASE, 
plugin={"json:src\\test\\resources\\report\\rp.json"})

public class RunnerClass {

	@After
	public static void reports() {
	Reports.cucumberReport("json:src\\test\\resources\\report\\rp.json");	

	}
	
	
	
}
