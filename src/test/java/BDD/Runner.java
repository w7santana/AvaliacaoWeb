package BDD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
				 monochrome = true, //formata o nome do metodo para metodoExemplo
				 snippets = SnippetType.CAMELCASE,
				 dryRun = false, //valida se o mapeamento esta correto
				 strict = false //seta padrao do jUnit para falha ou passed
				 
				 )
public class Runner {

	
	
}
