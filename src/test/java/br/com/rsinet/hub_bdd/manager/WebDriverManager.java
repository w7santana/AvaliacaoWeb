package br.com.rsinet.hub_bdd.manager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import br.com.rsinet.hub_bdd.enums.DriverType;
import br.com.rsinet.hub_bdd.enums.EnvironmentType;

/**
 * Classe respons�vel por gerenciar a cria��o, configura��o e destrui��o do WebDriver (Singleton Pattern).
 * @author willian.costa
 *
 */
public class WebDriverManager {

	private WebDriver navegador;
	 private static DriverType driverType;
	 private static EnvironmentType environmentType;
	 private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.navegador";
	 
	 /**
	  * Constr�i uma inst�ncia do WebDriverManager, setando o tipo do driver (CHROME, FIREFOX, IE, etc..) e o ambiente (LOCAL ou REMOTO).
	  */
	 public WebDriverManager() {
	 driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
	 environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
	 }
	 
	 /**
	  * Verifica se j� existe uma inst�ncia do WebDriver
	  * @return Se n�o existir, cria uma isnt�ncia do WebDriver e a retorna.
	  * Se j� houver uma inst�ncia do WebDriver, ela ser� o retorno desse m�todo.
	  */
	 public WebDriver getDriver() {
	 if(navegador == null) navegador = createDriver();
	 return navegador;
	 }
	 
	 /**
	  * Cria um WebDriver setando o tipo de ambiente como LOCAL ou REMOTE.
	  * @return Retorna uma inst�ncia do WebDriver.
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
	 throw new RuntimeException("RemoteWebDriver ainda n�o foi implementado");
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
	  * Fecha a janela do navegador e destr�i a inst�ncia do WebDriver.
	  */
	 public void quitDriver() {
	 navegador.close();
	 navegador.quit();
	 }
	 
	
	
}
