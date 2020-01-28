package br.com.rsinet.hub_bdd.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Classe responsável pelos locators e ações da FormCadastroPage (PageFactory Pattern).
 * @author willian.costa
 *
 */
public class FormCadastroPage extends BasePage{
	
	/**
	 * Construtor da page factory FormCadastroPage.
	 * @param navegador
	 */
	public FormCadastroPage(WebDriver navegador) {
		super(navegador);
		PageFactory.initElements(navegador, this);
	}

	@FindBy(how = How.NAME, using = "usernameRegisterPage") @CacheLookup private WebElement fldUserName;
	@FindBy(how = How.NAME, using = "emailRegisterPage") @CacheLookup private WebElement fldEmail;
	@FindBy(how = How.NAME, using = "passwordRegisterPage") @CacheLookup private WebElement fldPassword;
	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage") @CacheLookup private WebElement fldPasswordConfirm;
	@FindBy(how = How.NAME, using = "first_nameRegisterPage") @CacheLookup private WebElement fldFirstName;
	@FindBy(how = How.NAME, using = "last_nameRegisterPage") @CacheLookup private WebElement fldLastName;
	@FindBy(how = How.NAME, using = "phone_numberRegisterPage") @CacheLookup private WebElement fldPhone;
	@FindBy(how = How.NAME, using = "countryListboxRegisterPage") @CacheLookup private WebElement cmbCountry;
	@FindBy(how = How.NAME, using = "cityRegisterPage") @CacheLookup private WebElement fldCity;
	@FindBy(how = How.NAME, using = "addressRegisterPage") @CacheLookup private WebElement fldAddress;
	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage") @CacheLookup private WebElement fldState;
	@FindBy(how = How.NAME, using = "postal_codeRegisterPage") @CacheLookup private WebElement fldPostalCode;
	@FindBy(how = How.NAME, using = "i_agree") @CacheLookup private WebElement chkIAgree;
	@FindBy(how = How.ID, using = "register_btnundefined") @CacheLookup private WebElement btnRegister;
	@FindBy(how = How.XPATH, using = "//*[@id=\"registerPage\"]/article/sec-form/div[2]/label[1]") @CacheLookup private WebElement lblUsuarioJaExiste;
	
	/**
	 * Digita no campo username.
	 * @param username
	 */
	public void digitaUserName(String username) {
		fldUserName.sendKeys(username);
	}
	
	/**
	 * Digita no campo email.
	 * @param email
	 */
	public void digitaEmail(String email) {
		fldEmail.sendKeys(email);
	}
	
	/**
	 * Digita no campo password.
	 * @param password
	 */
	public void digitaPassword(String password) {
		fldPassword.sendKeys(password);
	}
	
	/**
	 * Digita no campo confirmPassword.
	 * @param confirmPassword
	 */
	public void digitaConfirmPassword(String confirmPassword) {
		fldPasswordConfirm.sendKeys(confirmPassword);
	}
	
	/**
	 * Digita no campo firstName.
	 * @param firstName
	 */
	public void digitaFirstName(String firstName) {
		fldFirstName.sendKeys(firstName);
	}
	
	/**
	 * Digita no campo lastName.
	 * @param lastName
	 */
	public void digitaLastName(String lastName) {
		fldLastName.sendKeys(lastName);
	}
	
	/**
	 * Digita no campo phone.
	 * @param phone
	 */
	public void digitaPhone(String phone) {
		fldPhone.sendKeys(phone);
	}
	
	/**
	 * Seleciona o combo Country.
	 * @return Select selecionaPais
	 */
	public Select selecionaCmbCountry() {
		WebElement selecionaPais = navegador.findElement(By.name("countryListboxRegisterPage"));
		return new Select(selecionaPais);
	}
	
	/**
	 * Digita no campo city.
	 * @param city
	 */
	public void digitaCity(String city) {
		fldCity.sendKeys(city);
	}
	
	/**
	 * Digita no campo address.
	 * @param address
	 */
	public void digitaAddress(String address) {
		fldAddress.sendKeys(address);
	}
	
	/**
	 * Digita no campo state.
	 * @param state
	 */
	public void digitaState(String state) {
		fldState.sendKeys(state);
	}
	
	/**
	 * Digita no campo postalCode.
	 * @param postalCode
	 */
	public void digitaPostalCode(String postalCode) {
		fldPostalCode.sendKeys(postalCode);
	}
	
	/**
	 * Rola a página para baixo e clica no botão IAgree.
	 */
	public void clicaChkIAgree() {
		scrollDown();
		chkIAgree.click();
	}
	
	/**
	 * Clica no botão Register.
	 */
	public void clicaBtnRegister() {
		btnRegister.click();
	}
	
	/**
	 * Verifica se é apresentada a mensagem de usuário já existente.
	 * @return boolean true ou false.
	 */
	public boolean getLblUsuarioJaExiste() {
		jseWait();
		return lblUsuarioJaExiste.isDisplayed();
	}
	
	
	
	

	
	
	
	
}
