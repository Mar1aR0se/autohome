package de.commsult.SmartHomeProject.src;

import java.util.*;

class SmartHomeController {
	//buat nanti baca sensors and what action should each things would do
	TvControl tvCtrl = new TvControl();
	RadioControl radCtrl = new RadioControl(0);
	CurtainControl cCtrl = new CurtainControl();
	Sensors sensors = new Sensors();
	
	double weight = 0;
	double temperature = 0;
	boolean bright = true;
	boolean voiceCommandTv = true;
	boolean voiceCommandRad = true;
	
	public void brightCtrl(boolean b) {
		if(bright = b) {
			sensors.setLightSensor(true);
			System.out.println("brightness = " + sensors.getLightSensor());
		} else {
			sensors.setLightSensor(false);
			System.out.println("brightness = " + sensors.getLightSensor());
		}
	}
	
	public void weightCtrl() {
		for(double y = 0; y <= weight; y++) { //do
			weight += 0.01;
			System.out.println("Weight detected");
		}
		
//		System.out.println("Nothing in the Package received box");
	}
	
	public void tempCtrl() {
		if(temperature >= 23) {
			System.out.println("The temperature is hot, activating AC..");
			//ac.setOn
		} else if(temperature < 23 ) {
			System.out.println("The temperature is cold, turning off the AC to reduce electricity uses..");
			//ac.setOff
		}
	}
	
	public void voiceCtrl() {
		if(voiceCommandTv == true && voiceCommandRad == false) {
			tvCtrl.setTvPower(true);
			radCtrl.setRadPower(false);
		}
	}
}