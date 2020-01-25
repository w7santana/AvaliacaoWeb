package br.com.rsinet.hub_bdd.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver navegador) {
		super(navegador);
		PageFactory.initElements(navegador, this);
	}

	@FindBy(how = How.ID, using = "menuUser") @CacheLookup private WebElement btnUser;
	@FindBy(how = How.CLASS_NAME, using = "container ") @CacheLookup private WebElement categoriaProduto;
	@FindBy(how = How.XPATH, using = "//*[@id=\"31\"]")	@CacheLookup private WebElement categoriaMouse;
	@FindBy(how = How.ID, using = "accordionAttrib0") @CacheLookup private WebElement filtraScroller;
	@FindBy(how = How.ID, using = "accordionColor") @CacheLookup private WebElement filtraCor;
	@FindBy(how = How.ID, using = "scroller_type_4") @CacheLookup private WebElement chkTouchScroll;
	@FindBy(how = How.ID, using = "productsColors3683D1") @CacheLookup private WebElement chkCorAzul;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/nav/a[3]") @CacheLookup private WebElement lblProduto;
	@FindBy(how = How.CLASS_NAME, using = "top6Products") @CacheLookup private WebElement produtoEncontrado;
	@FindBy(how = How.ID, using = "menuSearch") @CacheLookup public WebElement btnLupa;
	@FindBy(how = How.ID, using = "autoComplete") @CacheLookup private WebElement campoBusca;
	@FindBy(how = How.XPATH, using = "//*[@id=\"Description\"]/h1")	@CacheLookup private WebElement descProduto;
	@FindBy(how = How.XPATH, using = "//*[@id=\"menuUserLink\"]/span") @CacheLookup private WebElement lblUsuarioLogado;
	@FindBy(how = How.XPATH, using = "//*[@id=\"searchPage\"]/div[3]/div/label") @CacheLookup private WebElement lblProdutoInexistente;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article/div[3]/div/div/div[3]/label/span") @CacheLookup private WebElement lblProdutoNaoEncontrado;
	
	public void clicaBtnUser() {
		btnUser.click();
	}
	
	public void selecionaCategoriaProduto(String categoria) {
	jseWait();
	navegador.findElement(By.xpath("//*[. ='" + categoria + "']")).click();
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
		jseWait();
		btnLupa.click();
	}
	
	public void escreveNoCampoBusca(String buscarTxt) {
		campoBusca.sendKeys(buscarTxt, Keys.ENTER);
	}
	
	public String getDescProduto(String buscarTxt) {
		return descProduto.getText();		
	}
	
	public void clicaNoProdutoEncontrado(String produto) {
		jseWait();
		produtoEncontrado = navegador.findElement(By.xpath("//*[. ='" + produto + "']"));
		jseClick(produtoEncontrado);
	}
	
	public String getLblProduto() {
		return lblProduto.getText();		
	}
	
	public String getUsuarioLogado() {
		jseWait();
		return lblUsuarioLogado.getText();
	}
	
	public boolean getLblProdutoInexistente() {
		return lblProdutoInexistente.isDisplayed();
	}
	
	public void clicaNoProduto(String produto) {
		jseWait();
		produtoEncontrado = navegador.findElement(By.xpath("//*[. ='" + produto + "']"));
		jseClick(produtoEncontrado);
	}
	
	public boolean getlblProdutoNaoEncontrado() {
		return lblProdutoNaoEncontrado.isDisplayed();
	}
		
		

}
