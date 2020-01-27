package br.com.rsinet.hub_bdd.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.PageObjects.FormCadastroPage;
import br.com.rsinet.hub_bdd.PageObjects.HomePage;
import br.com.rsinet.hub_bdd.PageObjects.LoginPage;
import br.com.rsinet.hub_bdd.manager.FileReaderManager;
import br.com.rsinet.hub_bdd.manager.PageObjectManager;
import br.com.rsinet.hub_bdd.manager.WebDriverManager;
import br.com.rsinet.hub_bdd.utility.Print;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Ent�o;
import cucumber.api.java.pt.Quando;

public class CadastroDeUsuarioTestSteps {
	WebDriver navegador;
	HomePage homePage;
	LoginPage loginPage;
	FormCadastroPage formCadastroPage;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	String usuarioLogado;

	
	@Dado("^que estou navegando na p�gina inicial \"([^\"]*)\"$")
	public void que_estou_navegando_na_p�gina_inicial(String arg1) throws Throwable {
		webDriverManager = new WebDriverManager();
		navegador = webDriverManager.getDriver();
		
		pageObjectManager = new PageObjectManager(navegador);
		homePage = pageObjectManager.getHomePage();
		loginPage = pageObjectManager.getLoginPage();
		formCadastroPage = pageObjectManager.getFormCadastroPage();
		
		navegador.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	@Quando("^eu clicar no bot�o USER$")
	public void eu_clicar_no_bot�o_USER() throws Throwable {
		homePage.clicaBtnUser();
	}

	@Quando("^clicar no link CREATE NEW ACCOUNT$")
	public void clicar_no_link_CREATE_NEW_ACCOUNT() throws Throwable {
	    loginPage.clicaLnkCreateAccount();
	}

	@Quando("^digitar \"([^\"]*)\" no campo Username$")
	public void digitar_no_campo_Username(String usuario) throws Throwable {
	    formCadastroPage.digitaUserName(usuario);
	    usuarioLogado = usuario;
	}

	@Quando("^digitar \"([^\"]*)\" no campo Email$")
	public void digitar_no_campo_Email(String email) throws Throwable {
	    formCadastroPage.digitaEmail(email);
	}

	@Quando("^digitar \"([^\"]*)\" no campo Password$")
	public void digitar_no_campo_Password(String password) throws Throwable {
	    formCadastroPage.digitaPassword(password);
	}

	@Quando("^digitar \"([^\"]*)\" no campo Confirm password$")
	public void digitar_no_campo_Confirm_password(String confPassword) throws Throwable {
	    formCadastroPage.digitaConfirmPassword(confPassword);
	}

	@Quando("^digitar \"([^\"]*)\" no campo First Name$")
	public void digitar_no_campo_First_Name(String primeiroNome) throws Throwable {
	    formCadastroPage.digitaFirstName(primeiroNome);
	}

	@Quando("^digitar \"([^\"]*)\" no campo Last Name$")
	public void digitar_no_campo_Last_Name(String sobreNome) throws Throwable {
	    formCadastroPage.digitaLastName(sobreNome);
	}

	@Quando("^digitar \"([^\"]*)\" no campo Last Phone Number$")
	public void digitar_no_campo_Last_Phone_Number(String phone) throws Throwable {
	    formCadastroPage.digitaPhone(phone);
	}

	@Quando("^selecionar \"([^\"]*)\" no combo Country$")
	public void selecionar_no_combo_Country(String pais) throws Throwable {

	}

	@Quando("^digitar \"([^\"]*)\" no campo City$")
	public void digitar_no_campo_City(String cidade) throws Throwable {
	    formCadastroPage.digitaCity(cidade);
	}

	@Quando("^digitar \"([^\"]*)\" no campo Address$")
	public void digitar_no_campo_Address(String endereco) throws Throwable {
	    formCadastroPage.digitaAddress(endereco);
	}

	@Quando("^digitar \"([^\"]*)\" no campo State / Province / Region$")
	public void digitar_no_campo_State_Province_Region(String estado) throws Throwable {
	    formCadastroPage.digitaState(estado);
	}

	@Quando("^digitar \"([^\"]*)\" no campo Postal Code$")
	public void digitar_no_campo_Postal_Code(String cep) throws Throwable {
	    formCadastroPage.digitaPostalCode(cep);
	}

	@Quando("^clicar no bot�o para aceitar os termos de uso$")
	public void clicar_no_bot�o_para_aceitar_os_termos_de_uso() throws Throwable {
	    formCadastroPage.clicaChkIAgree();
	}

	@Quando("^clicar no bot�o REGISTER$")
	public void clicar_no_bot�o_REGISTER() throws Throwable {
	    formCadastroPage.clicaBtnRegister();
	}

	@Ent�o("^serei redirecionado para a p�gina inicial e o nome de meu usu�rio aparecer� pr�ximo ao bot�o USER$")
	public void serei_redirecionado_para_a_p�gina_inicial_e_o_nome_de_meu_usu�rio_aparecer�_pr�ximo_ao_bot�o_USER() throws Throwable {
		Assert.assertEquals(usuarioLogado, homePage.getUsuarioLogado());
		Print.captureScreenShot(navegador);
		webDriverManager.quitDriver();
	}
	
	@Ent�o("^ser� apresentada uma mensagem informando que o usu�rio j� existe$")
	public void ser�ApresentadaUmaMensagemInformandoQueOUsu�rioJ�Existe() throws Throwable {
		Assert.assertTrue(formCadastroPage.getLblUsuarioJaExiste());
		Print.captureScreenShot(navegador);
		webDriverManager.quitDriver();
	}

}
