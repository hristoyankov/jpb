package com.hristoyankov.java.javapuzzlersbook.expressive;

// Chapter 01 - Tweedledum & Tweedledee (Puzzle 09 & 10)
public class Tweedle {
	public static void main(String[] args) {
		tweedledum();
		tweedledee();
	}

	private static void tweedledum() {
		int i = 12345;
		@SuppressWarnings("unused")
		short x = 0;
		
		x += i; // x = (typeof(x)) (x + i)
//		x = x + i; // Compile time error
	}

	private static void tweedledee() {
		Object x = "Buy ";
		String i = "Effective Java!";
		
		// TODO: Check what's the difference in JLS 1.5 -> 1.7.
		// Should have had compile time error.
		x += i;
		x = x + i; 
	
	}
}
