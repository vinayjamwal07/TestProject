package com.interfaceExample;

public class MobilePhone implements Telephone {

	private int myNumber;
	private boolean isRinging;
	private boolean isOn;

	public MobilePhone(int myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		isOn = true;
		System.out.println("Mobile phone is powered up.");

	}

	@Override
	public void dial(int phoneNumber) {
		if(isOn) {
			System.out.println("Now ringing " + phoneNumber + " on deskphone");
		}else {
			System.out.println("Phone is switched off.");
		}
		
	}

	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Answering the mobile phone");
			isRinging = false;
		}

	}

	@Override
	public boolean callphone(int phoneNumber) {
		if (phoneNumber == myNumber && isOn) {
			isRinging = true;
			System.out.println("Melody phone");
		} else {
			isRinging = false;
			System.out.println("Mobile phone is not on or number is different");
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {

		return isRinging;
	}

}
