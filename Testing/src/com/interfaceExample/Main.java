package com.interfaceExample;

public class Main {

	public static void main(String[] args) {

		Telephone vinayPhone;
		vinayPhone = new DeskPhone(451215);
		vinayPhone.powerOn();
		vinayPhone.callphone(12345);
		vinayPhone.answer();
		
		vinayPhone = new MobilePhone(4512);
		vinayPhone.powerOn();
		vinayPhone.callphone(4512);
		vinayPhone.answer();
		
	}

}
