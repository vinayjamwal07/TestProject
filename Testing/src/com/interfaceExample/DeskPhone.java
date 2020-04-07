package com.interfaceExample;

public class DeskPhone implements Telephone {

	private int myNumber;
	private boolean isRinging;

	public DeskPhone(int myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("No actio taken, desk phone does not have power button.");

	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on deskphone");

	}

	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Answer the deskphone");
			isRinging = false;
		}

	}

	@Override
	public boolean callphone(int phoneNumber) {
		if (phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("Ring ring");
		} else {
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {

		return isRinging;
	}

}
