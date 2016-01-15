package com.test.csd.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/com/test/features", format={"pretty", "html:target/cucumber"}, tags="~@myFirstTag")


public class TestRun {

}
