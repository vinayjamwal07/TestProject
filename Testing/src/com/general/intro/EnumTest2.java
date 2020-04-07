package com.general.intro;

import java.util.EnumMap;

public class EnumTest2 {

	enum Test {
		CODE, CONTRIBUTE, QUIZ, MCQ;
	}

	public static void main(String[] args) {

		EnumMap<Test, String> test = new EnumMap<Test, String>(Test.class);

		test.put(Test.CODE, "Start coding");
		test.put(Test.CONTRIBUTE, "Everyone should contribute");
		test.put(Test.QUIZ, "Practice Quizes");
		test.put(Test.MCQ, "Mcq are important for understanding");

		System.out.println(test.size());
		System.out.println(test);
		System.out.println("Key :" + Test.CODE + " value :" + test.get(Test.CODE));
		System.out.println("Key :" + Test.CONTRIBUTE + "value :" + test.get(Test.CONTRIBUTE));
		System.out.println("Does Test has :" + Test.QUIZ + " : " + test.containsValue("Practice Quizes"));
		System.out.println("Does Test has :" + Test.QUIZ + " : " + test.containsValue("null"));

	}
}
