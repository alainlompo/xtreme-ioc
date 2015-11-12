package org.hypernovae.apis.beans.configurable;

public enum KeyboardType {
	AZERTY("Azerty"),
	QWERTY("Qwerty");
	
	private final String kbTypeCode;
	private  KeyboardType(String kbTypeCode) {
		this.kbTypeCode = kbTypeCode;
	}
	public String getKbTypeCode() {
		return kbTypeCode;
	}
	
	

}
