package br.com.rsinet.hub_bdd.stepDefinitions;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_TDD.utility.Driver;
import br.com.rsinet.hub_bdd.PageObjects.HomePage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;

public class PesquisaProdutoTestSteps {
	static WebDriver navegador;
	HomePage homePage;
	
	@Dado("^que estou na pagina inicial \"([^\"]*)\"$")
	public void que_estou_na_pagina_inicial(String arg1) throws Throwable {
		navegador = Driver.getDriver();
	}

	@Quando("^eu clicar no bot�o lupa$")
	public void eu_clicar_no_bot�o_lupa() throws Throwable {
		homePage = new HomePage(navegador);
		homePage.clicaBtnLupa();
	}

	@Quando("^preencher o campo pesquisa com o nome do \"([^\"]*)\" pressionando a tecla enter$")
	public void preencher_o_campo_pesquisa_com_o_nome_do_pressionando_a_tecla_enter(String arg1) throws Throwable {
		homePage.escreveNoCampoBusca(arg1);
	}

	@Quando("^clicar no \"([^\"]*)\"$")
	public void clicar_no(String arg1) throws Throwable {
		homePage.clicaNoProdutoEncontrado(arg1);
	}

	@Ent�o("^ser� exibida a p�gina de descri��o do produto$")
	public void ser�_exibida_a_p�gina_de_descri��o_do_produto() throws Throwable {
	}

	@Ent�o("^ser� apresentada uma mensagem informando que o produto buscado n�o existe$")
	public void ser�_apresentada_uma_mensagem_informando_que_o_produto_buscado_n�o_existe() throws Throwable {
	}
	
	


}
