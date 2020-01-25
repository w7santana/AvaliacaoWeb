package br.com.rsinet.hub_bdd.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
public LoginPage(WebDriver navegador) {
		super(navegador);
		PageFactory.initElements(navegador, this);
	}


	@FindBy(how = How.LINK_TEXT, using = "CREATE NEW ACCOUNT")
	private WebElement lnkCreateAccount;

	public void clicaLnkCreateAccount (){
		lnkCreateAccount.sendKeys(Keys.ENTER);
	}


}
