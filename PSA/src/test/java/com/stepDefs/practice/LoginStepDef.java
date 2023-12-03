package com.stepDefs.practice;

import io.cucumber.java.en.Given;
import utils.ConfigReader;


import commons.Base;
public class LoginStepDef {
	
	
	@Given("user launches retailstat application")
	public void i_want_to_write_a_step_def() {
		ConfigReader.readProperty("qaURL");
		System.out.println("=========="+"-------------");
	}

}
