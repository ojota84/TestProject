package com.tests;

import java.util.Set;
import java.util.TreeSet;

public class Numbers {

	private Set<Integer> numbers = new TreeSet<Integer>();
	
	public Numbers(int... nums) {
		for (int i : nums) {
			numbers.add(i);
		}
	}
	
	public Numbers negative(){
		Numbers negative = new Numbers();
		for (int number : numbers) {
			negative.numbers.add(-number);
		}
		return negative;
	}
	
	public void show(){
		for (int i : numbers) {
			System.out.println(i+" ");
		}
	}
	public static void main(String[] args) {
		new Numbers(1,3,-5).negative().show();

	}

}
