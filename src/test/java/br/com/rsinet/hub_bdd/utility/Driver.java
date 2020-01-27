package br.com.rsinet.hub_bdd.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_bdd.dataProvider.ConfigFileReader;
import br.com.rsinet.hub_bdd.manager.FileReaderManager;

public class Driver {
	private static WebDriver navegador;
	static ConfigFileReader configFileReader;
	
	public static WebDriver getDriver() {
		if (navegador == null) {
			createDriver();
		}
		return navegador;
	}
	
	public static WebDriver createDriver() {
		configFileReader = new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
		navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
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
