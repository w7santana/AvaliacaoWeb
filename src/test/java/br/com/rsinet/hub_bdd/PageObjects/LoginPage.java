package br.com.rsinet.hub_bdd.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
/**
 * Classe responsável pelos locators e ações da LoginPage (PageFactory Pattern).
 * @author willian.costa
 *
 */
public class LoginPage extends BasePage {
	
	/**
	 * Construtor da page factory LoginPage.
	 * @param navegador
	 */
	public LoginPage(WebDriver navegador) {
		super(navegador);
		PageFactory.initElements(navegador, this);
	}


	@FindBy(how = How.LINK_TEXT, using = "CREATE NEW ACCOUNT")
	private WebElement lnkCreateAccount;
	
	/**
	 * Clica no link Create Account.
	 */
	public void clicaLnkCreateAccount (){
		lnkCreateAccount.sendKeys(Keys.ENTER);
	}


}
