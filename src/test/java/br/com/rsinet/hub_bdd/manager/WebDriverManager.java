package br.com.rsinet.hub_bdd.manager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import br.com.rsinet.hub_bdd.enums.DriverType;
import br.com.rsinet.hub_bdd.enums.EnvironmentType;

/**
 * Classe responsável por gerenciar a criação, configuração e destruição do WebDriver (Singleton Pattern).
 * @author willian.costa
 *
 */
public class WebDriverManager {

	private WebDriver navegador;
	 private static DriverType driverType;
	 private static EnvironmentType environmentType;
	 private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.navegador";
	 
	 /**
	  * Constrói uma instância do WebDriverManager, setando o tipo do driver (CHROME, FIREFOX, IE, etc..) e o ambiente (LOCAL ou REMOTO).
	  */
	 public WebDriverManager() {
	 driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
	 environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
	 }
	 
	 /**
	  * Verifica se já existe uma instância do WebDriver
	  * @return Se não existir, cria uma isntância do WebDriver e a retorna.
	  * Se já houver uma instância do WebDriver, ela será o retorno desse método.
	  */
	 public WebDriver getDriver() {
	 if(navegador == null) navegador = createDriver();
	 return navegador;
	 }
	 
	 /**
	  * Cria um WebDriver setando o tipo de ambiente como LOCAL ou REMOTE.
	  * @return Retorna uma instância do WebDriver.
	  */
	 private WebDriver createDriver() {
	    switch (environmentType) {     
	         case LOCAL : navegador = createLocalDriver();
	          break;
	         case REMOTE : navegador = createRemoteDriver();
	          break;
	    }
	    return navegador;
	 }
	 
	 private WebDriver createRemoteDriver() {
	 throw new RuntimeException("RemoteWebDriver ainda não foi implementado");
	 }
	 
	 private WebDriver createLocalDriver() {
	        switch (driverType) {     
	        case FIREFOX : navegador = new FirefoxDriver();
	      break;
	        case CHROME : 
	         System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
	         navegador = new ChromeDriver();
	     break;
	        case INTERNETEXPLORER : navegador = new InternetExplorerDriver();
	     break;
	        }
	 
	        if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) navegador.manage().window().maximize();
	        navegador.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
	 return navegador;
	 } 
	 
	 /**
	  * Fecha a janela do navegador e destrói a instância do WebDriver.
	  */
	 public void quitDriver() {
	 navegador.close();
	 navegador.quit();
	 }
	 
	
	
}
