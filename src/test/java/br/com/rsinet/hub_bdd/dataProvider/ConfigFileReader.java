package br.com.rsinet.hub_bdd.dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import br.com.rsinet.hub_bdd.enums.DriverType;
import br.com.rsinet.hub_bdd.enums.EnvironmentType;
/**
 * Classe responsável por ler o arquivo de propriedades: configs/configuration.properties.
 * @author willian.costa
 *
 */
public class ConfigFileReader {
	
	 private Properties properties;
	 private final String propertyFilePath= "configs//configuration.properties";
	 
	 /**
	  * Instancia e configura um novo fileReader para carregar e ler as propriedades do arquivo: configs/configuration.properties.
	  */
	 public ConfigFileReader(){
	 BufferedReader reader;
	 try {
	 reader = new BufferedReader(new FileReader(propertyFilePath));
	 properties = new Properties();
	 try {
	 properties.load(reader);
	 reader.close();
	 } catch (IOException e) {
	 e.printStackTrace();
	 }
	 } catch (FileNotFoundException e) {
	 e.printStackTrace();
	 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
	 } 
	 }
	 
	 /**
	  * 
	  * @return retorna o caminho onde se encontra o driver do navegador selecionado.
	  */
	 public String getDriverPath(){
	 String driverPath = properties.getProperty("driverPath");
	 if(driverPath!= null) return driverPath;
	 else throw new RuntimeException("driverPath not specified in the Configuration.properties file."); 
	 }
	 
	 /**
	  * 
	  * @return retorna a duração do timeout do ImplicitlyWait, definido no arquivo de propriedades: configs/configuration.properties.
	  */
	 public long getImplicitlyWait() { 
	 String implicitlyWait = properties.getProperty("implicitlyWait");
	 if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
	 else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file."); 
	 }
	 
	 /**
	  * 
	  * @return retorna a URL definida no arquivo de propriedades: configs/configuration.properties
	  */
	 public String getApplicationUrl() {
	 String url = properties.getProperty("url");
	 if(url != null) return url;
	 else throw new RuntimeException("url not specified in the Configuration.properties file.");
	 }
	 
	 /**
	  * 
	  * @return retorna o nome do navegador, definido no arquivo de propriedades: configs/configuration.properties
	  */
	 public DriverType getBrowser() {
		 String browserName = properties.getProperty("browser");
		 if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
		 else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		 else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
		 else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
		 }
		 
	 	/**
	 	 * 
	 	 * @return retorna o tipo de ambiente local ou remoto, definido no arquivo de propriedades: configs/configuration.properties
	 	 */
		 public EnvironmentType getEnvironment() {
		 String environmentName = properties.getProperty("environment");
		 if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
		 else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
		 else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
		 }
		 
		 /**
		  * Verifica se a propriedade windowMaximize está configurada no arquivo de propriedades: configs/configuration.properties
		  * @return retorna o valor da propriedade (verdadeiro ou falso).
		  */
		 public Boolean getBrowserWindowSize() {
		 String windowSize = properties.getProperty("windowMaximize");
		 if(windowSize != null) return Boolean.valueOf(windowSize);
		 return true;
		 }

}
