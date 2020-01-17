package br.com.rsi.hub_bdd.cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "Feature"
 ,glue={".\\src\\test\\java\\br.com.rsi.hub_bdd.cucumberTest"}
 )
public class TestRunner {

}
