package com.general.intro;

import java.util.EnumSet;

/*
 * public class EnumTest1 {
 * 
 * public static void main(String[]args) { messageOfDay(Day.Monday); }
 * 
 * private static void messageOfDay(Day day) {
 * 
 * switch(day) { case Monday: System.out.println("Day is monday"); break; case
 * Tuesday: System.out.println("Day is tuesday"); break; case Wednesday:
 * System.out.println("Day is wednesday"); break; case Thrusday:
 * System.out.println("Day is thrusday"); break; case Friday:
 * System.out.println("Day is friday"); break; case Saturday:
 * System.out.println("Day is saturday"); break; case Sunday:
 * System.out.println("Day is sunday"); break;
 * 
 * }
 * 
 * 
 * }
 * 
 * }
 */
/*
 * enum Color { RED, GREEN, BLUE; }
 * 
 * public class EnumTest1 { public static void main(String[] args) { // Calling
 * values() Color arr[] = Color.values();
 * 
 * // enum with loop for (Color col : arr) { // Calling ordinal() to find index
 * of color. System.out.println(col + " at index " + col.ordinal()); }
 * 
 * // Using valueOf(). Returns an object of Color with given constant.
 * System.out.println(Color.valueOf("RED"));
 * 
 * // Uncommenting second line causes exception IllegalArgumentException //
 * System.out.println(Color.valueOf("WHITE")); } }
 */

enum Page {
	A1, A2, A3, A4, A5, A6, A7, A8, A9, A10
}

enum HexColor {
	/*
	 * Java does not allow the name of enum to start with number like 100A, 25K. In
	 * that case, we can append the code with _ (underscore) or any allowed pattern
	 * and make check of it.
	 */
	_ff_00_00, _00_ff_00, _00_00_ff;
}

enum Color {
	RED, BLUE, GREEN;

	private HexColor hexcolor;

	public HexColor getHexcolor(Color color) {
		return hexcolor;
	}

	static {
		RED.hexcolor = HexColor._ff_00_00;
		GREEN.hexcolor = HexColor._00_ff_00;
		BLUE.hexcolor = HexColor._00_00_ff;

	}

}

public class EnumTest1 {

	public static void main(String[] args) {
		EnumSet<Page> range = EnumSet.range(Page.A1, Page.A5);

		if (range.contains(Page.A4)) {
			System.out.println("Range contains A4");
		}

		EnumSet<Page> of = EnumSet.of(Page.A1, Page.A5, Page.A3);

		if (of.contains(Page.A1)) {
			System.out.println("Of contains A1");
		}

		// To convert enum constant to String
		String S1 = Page.A1.name();
		System.out.println(S1);

		// or
		String s2 = Page.A2.toString();
		System.out.println(s2);

		// RED.hexcolor = HexColor._ff_00_00;

	}
}
