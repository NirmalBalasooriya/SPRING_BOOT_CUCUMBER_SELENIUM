package com.nirmal.springbootcucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue={"com.nirmal.springbootcucumber.StepDefinition"})
public class Runner
{

}