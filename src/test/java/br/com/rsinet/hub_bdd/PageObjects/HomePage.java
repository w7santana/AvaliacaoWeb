package br.com.rsinet.hub_bdd.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Classe responsável pelos locators e ações da HomePage (PageFactory Pattern).
 * @author willian.costa
 *
 */
public class HomePage extends BasePage {
	
	/**
	 * Construtor da page factory HomePage.
	 * @param navegador
	 */
	public HomePage(WebDriver navegador) {
		super(navegador);
		PageFactory.initElements(navegador, this);
	}

	@FindBy(how = How.ID, using = "menuUser") @CacheLookup private WebElement btnUser;
	@FindBy(how = How.CLASS_NAME, using = "rowSection") @CacheLookup private WebElement categoriaProduto;
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
	
	/**
	 * Clica no botão USER.
	 */
	public void clicaBtnUser() {
		btnUser.click();
	}
	
	/**
	 * Clica na categoria passada como exemplo de parâmetro no cenário da feature.
	 * @param categoria passada como exemplo de parâmetro no cenário da feature.
	 * @throws Throwable
	 */
	public void selecionaCategoriaProduto(String categoria) throws Throwable {
	categoriaProduto = categoriaProduto.findElement(By.xpath("//*[. ='" + categoria + "']"));
	jseClick(categoriaProduto);
	}
	
	public void selecionaCategoriaMouse() {
		jseClick(categoriaMouse);
	}
	
	/**
	 * Clica no na list box de filtro por scroll da categoria mouse (MICE).
	 */
	public void filtraPorScroller() {
		filtraScroller.click();
	}
	
	/**
	 * Clica no botão de filtro de cor azul da categoria mouse (MICE).
	 */
	public void filtraPorCorAzul() {
		chkCorAzul.click();
	}
	
	/**
	 * Clica no botão de filtro por scroll do tipo touch scroll da categoria mouse (MICE).
	 */
	public void filtraPorTouchScroll() {
		chkTouchScroll.click();
	}
	
	/**
	 * Clica no botão de filtro por cor da categoria mouse (MICE).
	 */
	public void filtraPorCor() {
		filtraCor.click();
	}
	
	/**
	 * Clica no botão lupa.
	 * @throws Throwable
	 */
	public void clicaBtnLupa() throws Throwable {
		jseWait();
		btnLupa.click();
	}
	
	/**
	 * Escreve no campo busca e pressiona a tecla Enter.
	 * @param String buscarTxt passado como exemplo de parâmetro no cenário da feature.
	 */
	public void escreveNoCampoBusca(String buscarTxt) {
		campoBusca.sendKeys(buscarTxt, Keys.ENTER);
	}
	
	/**
	 * Captura o texto do label de descrição do produto em exibição.
	 * @param String buscarTxt passado como exemplo de parâmetro no cenário da feature.
	 * @return String que é o nome do produto sendo exibido no momento.
	 */
	public String getDescProduto(String buscarTxt) {
		return descProduto.getText();		
	}
	
	/**
	 * Aguarda um momento predefinido e clica no produto passado como exemplo de parâmetro no cenário da feature.
	 * @param String produto a ser clicado.
	 */
	public void clicaNoProdutoEncontrado(String produto) {
		jseWait();
		produtoEncontrado = navegador.findElement(By.xpath("//*[. ='" + produto + "']"));
		
		jseClick(produtoEncontrado);
	}
	
	/**
	 * Captura o texto do label do produto filtrado através da página inicial.
	 * @return String com o nome do produto sendo exibido no momento.
	 */
	public String getLblProduto() {
		return lblProduto.getText();		
	}
	
	/**
	 * Aguarda um momento predefinido e captura o texto do usuário que está logado.
	 * @return String com o nome do usuário logado no momento.
	 */
	public String getUsuarioLogado() {
		jseWait();
		return lblUsuarioLogado.getText();
	}
	
	/**
	 * Verifica se a mensagem de produto não encontrado pela busca na lupa é apresentada.
	 * @return boolean true ou false
	 */
	public boolean getLblProdutoInexistente() {
		return lblProdutoInexistente.isDisplayed();
	}
	
	/**
	 * Aguarda um momento predefinido e clica no produto encontrado usando o JavascriptExecutor através dos filtros da página home page.
	 * @param produto String passado como exemplo de parâmetro no cenário da feature. 
	 */
	public void clicaNoProduto(String produto) {
		jseWait();
		produtoEncontrado = navegador.findElement(By.xpath("//*[. ='" + produto + "']"));
		jseClick(produtoEncontrado);
	}
	
	/**
	 * Verifica se a mensagem de produto não encontrado pela home page é apresentada.
	 * @return boolean true ou false
	 */
	public boolean getlblProdutoNaoEncontrado() {
		return lblProdutoNaoEncontrado.isDisplayed();
	}
		
		

}
