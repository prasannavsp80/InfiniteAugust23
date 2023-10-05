package com.java.jsf;

import javax.faces.event.ValueChangeEvent;

public class RadioBean {

	private String radioValue;
	private String radioText;
	private String gen;
	
	public String getRadioValue() {
		return radioValue;
	}
	public void setRadioValue(String radioValue) {
		this.radioValue = radioValue;
	}
	public String getRadioText() {
		return radioText;
	}
	public void setRadioText(String radioText) {
		this.radioText = radioText;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	
	public Gender[] getGender() {
		return Gender.values();
	}

	public void radioChanged(ValueChangeEvent e){
		//assign new value to localeCode
		this.gen = e.getNewValue().toString();
	}	
}
