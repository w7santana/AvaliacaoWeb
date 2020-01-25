package br.com.rsinet.hub_bdd.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	protected WebDriver navegador;
	protected JavascriptExecutor jse;
	
	public BasePage(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	
	public void jseWait() {
		jse = (JavascriptExecutor) navegador;
		jse.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");
	}
	
	public void scrollDown() {
		jse = (JavascriptExecutor) navegador;
		jse.executeScript("scrollBy(0,200)", "");
	}
	
	public void jseClick(WebElement elemento) {
		jse.executeScript("arguments[0].click();", elemento);
	}
	
	
	
	
}
