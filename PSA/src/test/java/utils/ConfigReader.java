package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * This is for reading the config.properties file.
 * It will read the properties file at one go.
 * We are providing the dynamic path for a config file using File.separator so that it will become OS independent
 */


public class ConfigReader {

	private static Properties allProperties;

	public static void getConfigReader() {

		allProperties = new Properties();
		try (FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + File.separator + "src"
				+ File.separator + "test" + File.separator + "resources" + File.separator + "config.properties")) {
			allProperties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String readProperty(String key) {
		if (allProperties == null) {
			System.out.println("Reading properties first time");
			getConfigReader();
		}

		return allProperties.getProperty(key);
	}

}
