package utils;


import commons.Base;
public class EnvironmentDeclration extends Base {

	/*
	 * public String appURL(String env) { env = ConfigReader.readProperty(env);
	 * if(env.equalsIgnoreCase("test")) { String testURL
	 * =ConfigReader.readProperty("test"); driver.get(testURL); } else
	 * if(env.equalsIgnoreCase("stage")) { String stageURL
	 * =ConfigReader.readProperty("stage"); driver.get(stageURL); } return env; }
	 * 
	 * 
	 * 
	 */
	
	
	
	private String URL;


	public EnvironmentDeclration(String env) {

		if(env.equalsIgnoreCase("test")) {
			String URL =ConfigReader.readProperty("test");
			driver.get(URL);
		}
		else if(env.equalsIgnoreCase("stage")) {
			String URL =ConfigReader.readProperty("stage");
			driver.get(URL);	
		}
		else {
			throw new IllegalArgumentException("You Have Entered a Wrong URL: " + URL);
		}
	}

	public String getURL() {
		return URL;
	}
	
	
}

