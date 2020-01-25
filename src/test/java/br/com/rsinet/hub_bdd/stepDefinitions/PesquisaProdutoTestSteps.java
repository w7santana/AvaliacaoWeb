package br.com.rsinet.hub_bdd.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.PageObjects.HomePage;
import br.com.rsinet.hub_bdd.utility.Driver;
import br.com.rsinet.hub_bdd.utility.Print;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class PesquisaProdutoTestSteps {
	private WebDriver navegador;
	HomePage homePage;
	
	
	@Dado("^que estou na pagina inicial \"([^\"]*)\"$")
	public void que_estou_na_pagina_inicial(String arg1) throws Throwable {
		navegador = Driver.getDriver();
		homePage = new HomePage(navegador);
		navegador.get("http://advantageonlineshopping.com/");
	
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
		Print.captureScreenShot(navegador);
	    Driver.killDriver(navegador);
	}

	@Então("^será apresentada uma mensagem informando que o produto buscado não existe$")
	public void será_apresentada_uma_mensagem_informando_que_o_produto_buscado_não_existe() throws Throwable {
		Assert.assertTrue(homePage.getLblProdutoInexistente());
		Print.captureScreenShot(navegador);
		Driver.killDriver(navegador);
	}
	
	


}
