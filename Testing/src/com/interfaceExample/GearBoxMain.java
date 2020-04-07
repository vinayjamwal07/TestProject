package com.interfaceExample;

import java.util.Scanner;

public class GearBoxMain {

	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");

	public static void main(String[] args) {

//		GearBox mcLaren = new GearBox(6);
//
//		mcLaren.operateClutch(true);
//		mcLaren.changeGear(1);
//		mcLaren.operateClutch(false);
//		System.out.println(mcLaren.wheeelSpeed(1000));
//		mcLaren.changeGear(2);
//		System.out.println(mcLaren.wheeelSpeed(3000));
//		mcLaren.operateClutch(true);
//		mcLaren.changeGear(3);
//		mcLaren.operateClutch(false);
//		System.out.println(mcLaren.wheeelSpeed(6000));

//		class ClickListener implements Button.OnClickListener {
//
//			public ClickListener() {
//				System.out.println("i have been attached");
//			}
//
//			@Override
//			public void onClick(String title) {
//				System.out.println(title + "was clicked.");
//			}
//
//		}
//
//		btnPrint.setonClickListener(new ClickListener());
		
		btnPrint.setonClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(String title) {
				System.out.print(title =" was clicked");
			}
		});

		listen();

	}

	private static void listen() {

		boolean quit = false;
		while (!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:

				quit = true;

				break;

			case 1:

				btnPrint.onCllick();

				break;

			}

		}

	}

}
