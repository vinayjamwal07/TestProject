package com.general.intro;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class EnumTest3 {

	enum Days {
		MONDAY, TUESDAY, WEDNESDAY, THRUSDAY
	};

	public static void main(String[] args) {
		EnumMap<Days, String> days = new EnumMap<Days, String>(Days.class);

		days.put(Days.MONDAY, "1");
		days.put(Days.TUESDAY, "2");
		days.put(Days.WEDNESDAY, "3");
		days.put(Days.THRUSDAY, "4");

		for (Iterator<Entry<Days, String>> iterator = days.entrySet().iterator(); iterator.hasNext();) {
			Map.Entry m = iterator.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
