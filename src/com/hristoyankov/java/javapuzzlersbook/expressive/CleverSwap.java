package com.hristoyankov.java.javapuzzlersbook.expressive;

// Chapter 01 - Swap meat (Puzzle 7)
public class CleverSwap {
	public static void main(String[] args) {
		int x = 1984;
		int y = 2001;
		
//		x = x ^ y;
//		y = y ^ x;
//		x = x ^ y;
		
		x ^= y ^= x ^= y;
		
		System.out.println("x = " + x + " y = " + y);
	}
}
