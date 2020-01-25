package br.com.rsinet.hub_bdd.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/"
 ,glue={"br.com.rsinet.hub_bdd.stepDefinitions"}
 ,plugin = {"pretty", "html:target/report-html", "json:target/report.json"}
 ,monochrome = true
 ,snippets = SnippetType.CAMELCASE
 ,dryRun = false
		
 )
public class TestRunner {

}
