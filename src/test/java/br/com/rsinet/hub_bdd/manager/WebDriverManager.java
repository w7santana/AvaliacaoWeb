package br.com.rsinet.hub_bdd.manager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import br.com.rsinet.hub_bdd.enums.DriverType;
import br.com.rsinet.hub_bdd.enums.EnvironmentType;

public class WebDriverManager {

	private WebDriver navegador;
	 private static DriverType driverType;
	 private static EnvironmentType environmentType;
	 private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.navegador";
	 
	 public WebDriverManager() {
	 driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
	 environmentType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
	 }
	 
	 public WebDriver getDriver() {
	 if(navegador == null) navegador = createDriver();
	 return navegador;
	 }
	 
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
	 
	 public void quitDriver() {
	 navegador.close();
	 navegador.quit();
	 }
	 
	
	
}
