package de.commsult.SmartHomeProject.src;

public class TvControl extends MediaElectronic {
	private int onDemandChannel;
	private int normalChannel;
	
	public int getOnDemandChannel() {
		return onDemandChannel;
	}
	
	public void setOnDemandChannel(int onDemandChannel) {
		this.onDemandChannel = onDemandChannel;
	}

	public int getNormalChannel() {
		return normalChannel;
	}

	public void setNormalChannel(int normalChannel) {
		this.normalChannel = normalChannel;
	}
}