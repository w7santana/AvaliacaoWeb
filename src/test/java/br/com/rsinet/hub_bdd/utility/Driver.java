package br.com.rsinet.hub_bdd.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	private static WebDriver navegador;
	
	public static WebDriver getDriver() {
		if (navegador == null) {
			createDriver();
		}
		return navegador;
	}
	
	public static WebDriver createDriver() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		navegador.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		navegador.manage().window().maximize();
		return navegador;
	}
	
	public static void killDriver(WebDriver navegador) {
		if(navegador != null) {
			navegador.quit();
			navegador = null;
		}
	}

}
