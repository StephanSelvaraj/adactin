package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Selvaraj\\eclipse-workspace\\Adactin\\src\\test\\resources\\test.feature",
glue="org.test")



public class TestRunnerClass {

}
