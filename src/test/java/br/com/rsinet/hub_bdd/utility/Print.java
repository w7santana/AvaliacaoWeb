package br.com.rsinet.hub_bdd.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * Classe responsável por criar prints de tela. 
 * @author willian.costa
 *
 */
public class Print {
	/**
	 * Captura, nomeia e armazena print de tela no local especificado.
	 * @param driver
	 */
	public static void captureScreenShot(WebDriver driver) {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(".\\EvidenciasBDD\\"
					+ System.currentTimeMillis() + ".png"));
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
