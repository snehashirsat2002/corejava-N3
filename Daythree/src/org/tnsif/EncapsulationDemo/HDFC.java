package org.tnsif.EncapsulationDemo;

public class HDFC {

	 //data members
	private int pin;
	void accept()
	{
		System.out.println("The atm pin is:"+pin);
		
	}
	//getters and setters
	public int getPin() {
		return pin;
		
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}
