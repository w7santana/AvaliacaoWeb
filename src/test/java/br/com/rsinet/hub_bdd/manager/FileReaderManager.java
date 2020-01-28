package br.com.rsinet.hub_bdd.manager;

import br.com.rsinet.hub_bdd.dataProvider.ConfigFileReader;
/**
 * Classe respons�vel por controlar a cria��o de FileReaders (Singleton Pattern).
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
	 * @return Retorna uma inst�ncia do FileReaderManager.
	 */
	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}
	
	/**
	 * Verifica se j� h� uma isnt�ncia do ConfigFileReader.
	 * @return Caso n�o haja uma inst�ncia retornar� a cria��o de um ConfigFileReader.
	 * Caso j� exista um ConfigFileReader instanciado, retornar� ele mesmo.
	 */
	public ConfigFileReader getConfigReader() {
		return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	}

}
