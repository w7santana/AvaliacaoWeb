package br.com.rsinet.hub_bdd.manager;

import br.com.rsinet.hub_bdd.dataProvider.ConfigFileReader;
/**
 * Classe responsável por controlar a criação de FileReaders (Singleton Pattern).
 * @author willian.costa
 *
 */
public class FileReaderManager {
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;

	private FileReaderManager() {
	}
	
	/**
	 * 
	 * @return Retorna uma instância do FileReaderManager.
	 */
	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}
	
	/**
	 * Verifica se já há uma isntância do ConfigFileReader.
	 * @return Caso não haja uma instância retornará a criação de um ConfigFileReader.
	 * Caso já exista um ConfigFileReader instanciado, retornará ele mesmo.
	 */
	public ConfigFileReader getConfigReader() {
		return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	}

}
