package br.com.rsinet.hub_bdd.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormCadastroPage extends BasePage{
	
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
	
	public void digitaUserName(String username) {
		fldUserName.sendKeys(username);
	}
	
	public void digitaEmail(String email) {
		fldEmail.sendKeys(email);
	}
	
	public void digitaPassword(String password) {
		fldPassword.sendKeys(password);
	}
	
	public void digitaConfirmPassword(String confirmPassword) {
		fldPasswordConfirm.sendKeys(confirmPassword);
	}
	
	public void digitaFirstName(String firstName) {
		fldFirstName.sendKeys(firstName);
	}
	
	public void digitaLastName(String lastName) {
		fldLastName.sendKeys(lastName);
	}
	
	public void digitaPhone(String phone) {
		fldPhone.sendKeys(phone);
	}
	
	public Select selecionaCmbCountry() {
		WebElement selecionaPais = navegador.findElement(By.name("countryListboxRegisterPage"));
		return new Select(selecionaPais);
	}
	
	public void digitaCity(String city) {
		fldCity.sendKeys(city);
	}
	
	public void digitaAddress(String address) {
		fldAddress.sendKeys(address);
	}
	
	public void digitaState(String state) {
		fldState.sendKeys(state);
	}
	
	public void digitaPostalCode(String postalCode) {
		fldPostalCode.sendKeys(postalCode);
	}
	
	public void clicaChkIAgree() {
		scrollDown();
		chkIAgree.click();
	}

	public void clicaBtnRegister() {
		btnRegister.click();
	}
	
	public boolean getLblUsuarioJaExiste() {
		jseWait();
		return lblUsuarioJaExiste.isDisplayed();
	}
	
	
	
	

	
	
	
	
}
