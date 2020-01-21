package br.com.rsinet.hub_bdd.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;

public class FormCadastroPage {
	WebDriver navegador;

	public FormCadastroPage(WebDriver navegador) {
//			this.navegador = navegador;
			PageFactory.initElements(navegador, this);
	}

	@FindBy(how = How.NAME, using = "usernameRegisterPage") private WebElement fldUserName;
	public void digitaUserName(String username) {
		fldUserName.sendKeys(username);
	}
	
	@FindBy(how = How.NAME, using = "emailRegisterPage") private WebElement fldEmail;
	public void digitaEmail(String email) {
		fldUserName.sendKeys(email);
	}
	
	@FindBy(how = How.NAME, using = "passwordRegisterPage") private WebElement fldPassword;
	public void digitaPassword(String password) {
		fldUserName.sendKeys(password);
	}
	
	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage") private WebElement fldPasswordConfirm;
	public void digitaConfirmPassword(String confirmPassword) {
		fldUserName.sendKeys(confirmPassword);
	}
	
	@FindBy(how = How.NAME, using = "first_nameRegisterPage") private WebElement fldFirstName;
	public void digitaFirstName(String firstName) {
		fldUserName.sendKeys(firstName);
	}
	
	@FindBy(how = How.NAME, using = "last_nameRegisterPage") private WebElement fldLastName;
	public void digitaLastName(String lastName) {
		fldUserName.sendKeys(lastName);
	}
	
	@FindBy(how = How.NAME, using = "phone_numberRegisterPage") private WebElement fldPhone;
	public void digitaPhone(String phone) {
		fldUserName.sendKeys(phone);
	}
	
	@FindBy(how = How.NAME, using = "countryListboxRegisterPage") private WebElement cmbCountry;
	public Select SelecionaCmbCountry() {
		WebElement selecionaPais = navegador.findElement(By.name("countryListboxRegisterPage"));
		return new Select(selecionaPais);
	}
	
	@FindBy(how = How.NAME, using = "cityRegisterPage") private WebElement fldCity;
	public void digitaCity(String city) {
		fldUserName.sendKeys(city);
	}
	
	@FindBy(how = How.NAME, using = "addressRegisterPage") private WebElement fldAddress;
	public void digitaAddress(String address) {
		fldUserName.sendKeys(address);
	}
	
	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage") private WebElement fldState;
	public void digitaState(String state) {
		fldUserName.sendKeys(state);
	}
	
	@FindBy(how = How.NAME, using = "postal_codeRegisterPage") private WebElement fldPostalCode;
	public void digitaPostalCode(String postalCode) {
		fldUserName.sendKeys(postalCode);
	}
	
	@FindBy(how = How.NAME, using = "i_agree") private WebElement chkIAgree;
	public void clicaChkIAgree() {
		JavascriptExecutor jse = (JavascriptExecutor)navegador;
        jse.executeScript("scrollBy(0,200)", "");
		chkIAgree.click();
	}

	@FindBy(how = How.ID, using = "register_btnundefined") private WebElement btnRegister;
	public void clicaBtnRegister() {
		JavascriptExecutor jse = (JavascriptExecutor)navegador;
		jse.executeScript("scrollBy(0,200)", "");
		chkIAgree.click();
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"registerPage\"]/article/sec-form/div[2]/label[1]") private WebElement lblUsuarioJaExiste;
	public String getLblUsuarioJaExiste() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(navegador).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);

		return wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"registerPage\"]/article/sec-form/div[2]/label[1]"))).getText();

	}
	
	
	
	

	
	
	
	
}
