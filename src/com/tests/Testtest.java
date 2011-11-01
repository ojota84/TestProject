package com.tests;


public class Testtest {
	enum Test {TEST, TEST2};
	
	static void doStuff(int blq){

		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		doStuff(30);		
		Test[] result = Test.values();
		for (Test test : result) {
			
			System.out.println(test.toString());
		}
		Short test5 = 5;
		doStuff(test5);

	}

}
