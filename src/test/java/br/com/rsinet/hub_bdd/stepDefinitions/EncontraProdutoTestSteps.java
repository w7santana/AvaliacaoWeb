package br.com.rsinet.hub_bdd.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.PageObjects.HomePage;
import br.com.rsinet.hub_bdd.dataProvider.ConfigFileReader;
import br.com.rsinet.hub_bdd.manager.FileReaderManager;
import br.com.rsinet.hub_bdd.manager.PageObjectManager;
import br.com.rsinet.hub_bdd.manager.WebDriverManager;
import br.com.rsinet.hub_bdd.utility.Print;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class EncontraProdutoTestSteps {
	WebDriver navegador;
	HomePage homePage;
	PageObjectManager pageObjectManager;
	ConfigFileReader configFileReader;
	WebDriverManager webDriverManager;
	

	@Dado("^que estou na página inicial \"([^\"]*)\"$")
	public void que_estou_na_página_inicial(String arg1) throws Throwable {
		webDriverManager = new WebDriverManager();
		navegador = webDriverManager.getDriver();
		
		pageObjectManager = new PageObjectManager(navegador);
		homePage = pageObjectManager.getHomePage();
		
		navegador.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	@Quando("^eu clicar em uma \"([^\"]*)\"$")
	public void eu_clicar_em_uma(String categoria) throws Throwable {
		homePage.selecionaCategoriaProduto(categoria);
	}
	
	@Quando("^eu escolher a categoria \"([^\"]*)\"$")
	public void eu_escolher_a_categoria(String categoria) throws Throwable {
		homePage.selecionaCategoriaMouse();
	}

	@Quando("^clicar em \"([^\"]*)\"$")
	public void clicar_em(String produto) throws Throwable {
		homePage.clicaNoProduto(produto);
	}

	@Quando("^clicar no filtro por Scroller$")
	public void clicar_no_filtro_por_Scroller() throws Throwable {
	    homePage.filtraPorScroller();
	}

	@Quando("^clicar na opção TouchScroll$")
	public void clicar_na_opção_TouchScroll() throws Throwable {
	    homePage.filtraPorTouchScroll();
	}

	@Quando("^clicar no filtro por Cor$")
	public void clicar_no_filtro_por_Cor() throws Throwable {
	    homePage.filtraPorCor();
	}

	@Quando("^clicar na Cor Azul$")
	public void clicar_na_Cor_Azul() throws Throwable {
	    homePage.filtraPorCorAzul();
	}
	
	@Então("^será exibida uma página de descrição do \"([^\"]*)\"$")
	public void será_exibida_uma_página_de_descrição_do(String produto) throws Throwable {
		Assert.assertEquals(produto.toUpperCase(), homePage.getLblProduto());
		Print.captureScreenShot(navegador);
		webDriverManager.quitDriver();
	}
	
	@Então("^será apresentada uma mensagem na tela informando que o produto buscado não existe$")
	public void será_apresentada_uma_mensagem_na_tela_informando_que_o_produto_buscado_não_existe() throws Throwable {
	    Assert.assertTrue(homePage.getlblProdutoNaoEncontrado());
		Print.captureScreenShot(navegador);
		webDriverManager.quitDriver();
	}
	

}
