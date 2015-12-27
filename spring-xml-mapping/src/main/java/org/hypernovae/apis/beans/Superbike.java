package org.hypernovae.apis.beans;

public class Superbike {
	
	private int numberOfGears;
	private boolean assistedDirection;
	// TODO: in km/hour
	private int maximumSpeed;

	public String toString() {
		return "best bike ever: (" + numberOfGears +", assistedDirection? " + assistedDirection +", maximumSpeed=" + maximumSpeed + " km/h )";
	}

	public int getNumberOfGears() {
		return numberOfGears;
	}

	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}

	public boolean isAssistedDirection() {
		return assistedDirection;
	}

	public void setAssistedDirection(boolean assistedDirection) {
		this.assistedDirection = assistedDirection;
	}

	public int getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}
	
	
}
