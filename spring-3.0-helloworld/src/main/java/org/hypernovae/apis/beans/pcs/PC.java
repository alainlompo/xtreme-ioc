package org.hypernovae.apis.beans.pcs;

public class PC {
	OS providedOS;
	
	PC(OS providedOS) {
		this.providedOS = providedOS;
	}
	
	public OS getProvidedOS() {
		return this.providedOS;
	}

}
