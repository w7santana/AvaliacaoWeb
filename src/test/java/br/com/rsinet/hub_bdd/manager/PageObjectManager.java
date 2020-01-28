/**
 * 
 */
package br.com.rsinet.hub_bdd.manager;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.PageObjects.FormCadastroPage;
import br.com.rsinet.hub_bdd.PageObjects.HomePage;
import br.com.rsinet.hub_bdd.PageObjects.LoginPage;

/**
 * Classe respons�vel por gerenciar a cria��o das PageFactories (Singleton Pattern).
 * @author willian.costa
 *
 */
public class PageObjectManager {
	private WebDriver navegador;
	private HomePage homePage;
	private LoginPage loginPage;
	private FormCadastroPage formCadastroPage;
	/**
	 * M�todo construtor da classe PageObjectManager.
	 * @param navegador
	 */
	public PageObjectManager(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	/**
	 * Cria uma inst�ncia da classe HomePage.
	 * @return Retorna uma inst�ncia da classe HomePage com o WebDriver em uso.
	 */
	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(navegador) : homePage;
	}

	/**
	 * Cria uma inst�ncia da classe LoginPage.
	 * @return Retorna uma inst�ncia da classe LoginPage com o WebDriver em uso.
	 */
	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage(navegador) : loginPage;
	}

	/**
	 * Cria uma inst�ncia da classe FormCadastroPage.
	 * @return Retorna uma inst�ncia da classe FormCadastroPage com o WebDriver em uso.
	 */
	public FormCadastroPage getFormCadastroPage() {
		return (formCadastroPage == null) ? formCadastroPage = new FormCadastroPage(navegador) : formCadastroPage;
	}

}
