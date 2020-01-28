/**
 * 
 */
package br.com.rsinet.hub_bdd.manager;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.PageObjects.FormCadastroPage;
import br.com.rsinet.hub_bdd.PageObjects.HomePage;
import br.com.rsinet.hub_bdd.PageObjects.LoginPage;

/**
 * Classe responsável por gerenciar a criação das PageFactories (Singleton Pattern).
 * @author willian.costa
 *
 */
public class PageObjectManager {
	private WebDriver navegador;
	private HomePage homePage;
	private LoginPage loginPage;
	private FormCadastroPage formCadastroPage;
	/**
	 * Método construtor da classe PageObjectManager.
	 * @param navegador
	 */
	public PageObjectManager(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	/**
	 * Cria uma instância da classe HomePage.
	 * @return Retorna uma instância da classe HomePage com o WebDriver em uso.
	 */
	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(navegador) : homePage;
	}

	/**
	 * Cria uma instância da classe LoginPage.
	 * @return Retorna uma instância da classe LoginPage com o WebDriver em uso.
	 */
	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage(navegador) : loginPage;
	}

	/**
	 * Cria uma instância da classe FormCadastroPage.
	 * @return Retorna uma instância da classe FormCadastroPage com o WebDriver em uso.
	 */
	public FormCadastroPage getFormCadastroPage() {
		return (formCadastroPage == null) ? formCadastroPage = new FormCadastroPage(navegador) : formCadastroPage;
	}

}
