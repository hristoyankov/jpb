package com.hristoyankov.java.javapuzzlersbook.expressive;

// Chapter 01 - Tweedledum (Puzzle 09)
public class Tweedledum {
	public static void main(String[] args) {
		int i = 12345;
		short x = 0;
		
		x += i;
//		x = x + i; // Compile time error
	}
}
