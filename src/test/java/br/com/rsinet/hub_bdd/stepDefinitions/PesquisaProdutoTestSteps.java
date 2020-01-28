package br.com.rsinet.hub_bdd.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.PageObjects.HomePage;
import br.com.rsinet.hub_bdd.dataProvider.ConfigFileReader;
import br.com.rsinet.hub_bdd.manager.FileReaderManager;
import br.com.rsinet.hub_bdd.manager.PageObjectManager;
import br.com.rsinet.hub_bdd.manager.WebDriverManager;
import br.com.rsinet.hub_bdd.utility.Print;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class PesquisaProdutoTestSteps {
	WebDriver navegador;
	HomePage homePage;
	PageObjectManager pageObjectManager;
	ConfigFileReader configFileReader;
	WebDriverManager webDriverManager;
	
	@Before("@BuscaPositiva, @BuscaNegativa")
	public void beforeFiltro() {
		System.out.println("@Before(\"@BuscaPositiva, @BuscaNegativa\")");
		webDriverManager = new WebDriverManager();
		navegador = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(navegador);
		homePage = pageObjectManager.getHomePage();
	}
	
	@After ("@BuscaPositiva, @BuscaNegativa")
	public void afterFiltro() {
		System.out.println("@After (\"@BuscaPositiva, @BuscaNegativa\")");
		Print.captureScreenShot(navegador);
		webDriverManager.quitDriver();
	}
	
	@Dado("^que estou na pagina inicial \"([^\"]*)\"$")
	public void que_estou_na_pagina_inicial(String arg1) throws Throwable {
		navegador.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	@Quando("^eu clicar no botão lupa$")
	public void eu_clicar_no_botão_lupa() throws Throwable {
		homePage.clicaBtnLupa();
	}

	@Quando("^preencher o campo pesquisa com o nome do \"([^\"]*)\" pressionando a tecla enter$")
	public void preencher_o_campo_pesquisa_com_o_nome_do_pressionando_a_tecla_enter(String arg1) throws Throwable {
		homePage.escreveNoCampoBusca(arg1);
	}

	@Quando("^clicar no \"([^\"]*)\"$")
	public void clicar_no(String produto) throws Throwable {
		homePage.clicaNoProdutoEncontrado(produto);
	}

	@Então("^será exibida a página de descrição do \"([^\"]*)\"$")
	public void será_exibida_a_página_de_descrição_do(String produto) throws Throwable {
	    Assert.assertEquals(produto, homePage.getDescProduto(produto));
	}

	@Então("^será apresentada uma mensagem informando que o produto buscado não existe$")
	public void será_apresentada_uma_mensagem_informando_que_o_produto_buscado_não_existe() throws Throwable {
		Assert.assertTrue(homePage.getLblProdutoInexistente());
	}
	
	


}
