/**
 * 
 */
package br.com.rsinet.hub_bdd.manager;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.PageObjects.FormCadastroPage;
import br.com.rsinet.hub_bdd.PageObjects.HomePage;
import br.com.rsinet.hub_bdd.PageObjects.LoginPage;

public class PageObjectManager {
	private WebDriver navegador;
	private HomePage homePage;
	private LoginPage loginPage;
	private FormCadastroPage formCadastroPage;
	
	public PageObjectManager(WebDriver navegador) {
		 this.navegador = navegador;
		 }
		 
		 
		 public HomePage getHomePage(){
		 return (homePage == null) ? homePage = new HomePage(navegador) : homePage;
		 }
		 
		 
		 public LoginPage getLoginPage() {
		 return (loginPage == null) ? loginPage = new LoginPage(navegador) : loginPage;
		 }
		 
		 
		 public FormCadastroPage getFormCadastroPage() {
		 return (formCadastroPage == null) ? formCadastroPage = new FormCadastroPage(navegador) : formCadastroPage;
		 }
		 
	

}
