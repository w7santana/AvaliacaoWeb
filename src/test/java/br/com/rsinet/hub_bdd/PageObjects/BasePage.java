package br.com.rsinet.hub_bdd.PageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Classe Mãe das PageFactories.
 * @author willian.costa
 *
 */
public class BasePage {

	protected WebDriver navegador;
	protected JavascriptExecutor jse;
	protected WebDriverWait wait;
	protected Actions action;
	
	/**
	 * Construtor da classe BasePage.
	 * @param WebDriver navegador
	 */
	public BasePage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	/**
	 * Aguarda um tempo predefinido antes de executar uma ação.
	 * Futuramente será substituído por um Smart Wait.
	 */
	public void jseWait() {
		jse = (JavascriptExecutor) navegador;
		jse.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 4000);");
	}
	
	/**
	 * Rola a página para baixo utilizando o JavascriptExecutor.
	 */
	public void scrollDown() {
		jse = (JavascriptExecutor) navegador;
		jse.executeScript("scrollBy(0,200)", "");
	}
	
	/**
	 * Clica no elemento passado como parâmetro.
	 * @param WebElement elemento
	 */
	public void jseClick(WebElement elemento) {
		jse = (JavascriptExecutor) navegador;
		jse.executeScript("arguments[0].click();", elemento);
	}
	
	/**
	 * Cria um FluentWait com timeout de 10 segundos e tentativas a cada 1 segundo ignorando as exceções NoSuchElementException e StaleElementReferenceException. 
	 * @param WebElement pelo qual deve ser aguardada sua visibilidade.
	 * @return o elemento uma vez que já esteja visível.
	 */
	public WebElement wait(WebElement elemento)
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(navegador).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);
		return wait.until(ExpectedConditions.visibilityOf(elemento));
	}
	
	
	public void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	/**
	 * Simula ação da tecla Page Down do teclado rolando a tela para baixo.
	 */
	public void pageDown() {
		action = new Actions(navegador);
		action.sendKeys(Keys.PAGE_DOWN).perform();
	}
	
	
}
