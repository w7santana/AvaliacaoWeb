package br.com.rsinet.hub_bdd.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {
	final WebDriver navegador;

	public HomePage(WebDriver navegador) {
		this.navegador = navegador;
		PageFactory.initElements(navegador, this);
	}
	
	@FindBy(how = How.ID, using = "menuUser") private WebElement btnUser;
	@FindBy(how = How.CLASS_NAME, using = "container ") private WebElement categoriaProduto;
	@FindBy(how = How.XPATH, using = "//*[@id=\"31\"]")	private WebElement categoriaMouse;
	@FindBy(how = How.ID, using = "accordionAttrib0") private WebElement filtraScroller;
	@FindBy(how = How.ID, using = "accordionColor") private WebElement filtraCor;
	@FindBy(how = How.ID, using = "scroller_type_4") private WebElement chkTouchScroll;
	@FindBy(how = How.ID, using = "productsColors3683D1") private WebElement chkCorAzul;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/nav/a[3]") private WebElement lblProduto;
	@FindBy(how = How.CLASS_NAME, using = "top6Products") private WebElement produtoEncontrado;
	@FindBy(how = How.ID, using = "menuSearch") public WebElement btnLupa;
	@FindBy(how = How.ID, using = "autoComplete") private WebElement campoBusca;
	@FindBy(how = How.XPATH, using = "//*[@id=\"Description\"]/h1")	private WebElement descProduto;
	@FindBy(how = How.XPATH, using = "//*[@id=\"menuUserLink\"]/span") private WebElement lblUsuarioLogado;
	
	public void clicaBtnUser() {
		btnUser.click();
	}
	
	public void selecionaCategoriaProduto(String categoria) {
		categoriaProduto.findElement(By.xpath("//*[. ='" + categoria + "']")).click();
	}
	
	public void selecionaCategoriaMouse() {
		categoriaMouse.click();
	}
	
	public void filtraPorScroller() {
		filtraScroller.click();
	}
	
	public void filtraPorCorAzul() {
		chkCorAzul.click();
	}
	
	public void filtraPorTouchScroll() {
		chkTouchScroll.click();
	}
	
	public void filtraPorCor() {
		filtraCor.click();
	}
	
	public void clicaBtnLupa() {
		WebDriverWait wait = new WebDriverWait(navegador, 10);
		wait.until(ExpectedConditions.visibilityOf(btnLupa));
		btnLupa.click();
	}
	
	public void escreveNoCampoBusca(String buscarTxt) {
		campoBusca.sendKeys(buscarTxt, Keys.ENTER);
	}
	
	public void selecionaDescProduto() {
		WebDriverWait wait = new WebDriverWait(navegador, 10);
		wait.until(ExpectedConditions.visibilityOf(lblProduto));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"Description\"]/h1")));
	}
	
	public String getDescProduto(String buscarTxt) {
		return descProduto.getText();		
	}
	
	public void clicaNoProdutoEncontrado(String categoria) {
		WebDriverWait wait = new WebDriverWait(navegador, 10);
		WebElement produtoBuscado = produtoEncontrado.findElement(By.xpath("//*[. ='" + categoria + "']"));
		wait.until(ExpectedConditions.visibilityOf(produtoBuscado));
		JavascriptExecutor ex = (JavascriptExecutor) navegador;
		ex.executeScript("arguments[0].click();", produtoBuscado);
	}
	
	public String getLblProduto() {
		return lblProduto.getText();		
	}
	
	public String getUsuarioLogado() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(navegador).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);

		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menuUserLink\"]/span"))).getText();		
	}
	
	
	

		
		

}
