package org.hypernovae.apis.beans.configurable;

public class MountedPC {
	private int screenSize;  // using inches
	private String keyboardType; // Qwerty or Azerty
	private int memoryAmount; // In Go
	private int hardDriveSize; // in Go
	public int getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	public String getKeyboardType() {
		return keyboardType;
	}
	public void setKeyboardType(String keyboardType) {
		this.keyboardType = keyboardType;
	}
	public int getMemoryAmount() {
		return memoryAmount;
	}
	public void setMemoryAmount(int memoryAmount) {
		this.memoryAmount = memoryAmount;
	}
	public int getHardDriveSize() {
		return hardDriveSize;
	}
	public void setHardDriveSize(int hardDriveSize) {
		this.hardDriveSize = hardDriveSize;
	}
	
	public String toString() {
		return "Screen size: " + screenSize + ", keyboard type: " + keyboardType + ", memory amount: " + memoryAmount + ", hard drive size: " + hardDriveSize;
	}

}
