package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features\\loginpage.feature", glue = { "com.steps",
		"hooks" }, dryRun = false, plugin = "html:src\\test\\resources\\Report\\sample.html")

public class TestRunner extends AbstractTestNGCucumberTests {

}
