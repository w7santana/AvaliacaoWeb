package br.com.rsinet.hub_bdd.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.PageObjects.HomePage;
import br.com.rsinet.hub_bdd.utility.Driver;
import br.com.rsinet.hub_bdd.utility.Print;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
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

	@Quando("^eu clicar no bot�o lupa$")
	public void eu_clicar_no_bot�o_lupa() throws Throwable {
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

	@Ent�o("^ser� exibida a p�gina de descri��o do \"([^\"]*)\"$")
	public void ser�_exibida_a_p�gina_de_descri��o_do(String produto) throws Throwable {
	    Assert.assertEquals(produto, homePage.getDescProduto(produto));
		Print.captureScreenShot(navegador);
	    Driver.killDriver(navegador);
	}

	@Ent�o("^ser� apresentada uma mensagem informando que o produto buscado n�o existe$")
	public void ser�_apresentada_uma_mensagem_informando_que_o_produto_buscado_n�o_existe() throws Throwable {
		Assert.assertTrue(homePage.getLblProdutoInexistente());
		Print.captureScreenShot(navegador);
		Driver.killDriver(navegador);
	}
	
	


}
