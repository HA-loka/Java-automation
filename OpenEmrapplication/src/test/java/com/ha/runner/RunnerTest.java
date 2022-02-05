package com.ha.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/feature" }
						, glue = { "com.ha.stepdefination" }
						,publish= true
						,monochrome = true
						,dryRun=false
						,tags="@patient")
@RunWith(Cucumber.class)
public class RunnerTest {

}
