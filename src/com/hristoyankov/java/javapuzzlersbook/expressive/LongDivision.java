package com.hristoyankov.java.javapuzzlersbook.expressive;

// Chapter 01 - Long division (Puzzle 3)
public class LongDivision {
    public static void main(String[] args) {
		//	final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		//	final long MILIS_PER_DAY = 24 * 60 * 60 * 1000;
		final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
		final long MILIS_PER_DAY = 24L * 60 * 60 * 1000;
	
		System.out.println(MICROS_PER_DAY / MILIS_PER_DAY);
    }
}