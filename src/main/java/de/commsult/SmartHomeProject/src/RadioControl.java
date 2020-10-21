package de.commsult.SmartHomeProject.src;

public class RadioControl extends MediaElectronic {
	private double FmChannel;
	private double AmChannel;
	
	public double getFmChannel() {
		return FmChannel;
	}
	
	public void setFmChannel(double fmChannel) {
		FmChannel = fmChannel;
	}

	public double getAmChannel() {
		return AmChannel;
	}

	public void setAmChannel(double amChannel) {
		AmChannel = amChannel;
	}
}