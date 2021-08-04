package com.emilyread.Phone;

public class Galaxy extends Phone implements Ringable{

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		return "Galaxy " + this.getVersionNumber() + " says " + this.getRingTone();
	}

	@Override
	public String unlock() {
		return "Galaxy unlocked via fingerprint";
	}

	@Override
	public void displayInfo() {
		System.out.println("Galaxy " + this.getVersionNumber() + " from " + this.getCarrier());
		
	}

}
