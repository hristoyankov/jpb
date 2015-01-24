package com.hristoyankov.java.javapuzzlersbook.expressive;

import java.math.BigDecimal;

// Chapter 01 - Time for a change (Puzzle 2)
public class Change {
    public static void main(String[] args) {
		//System.out.println(2.00 - 1.10); // float and double issue
		//System.out.println(new BigDecimal(2.00).subtract(new BigDecimal(1.10))); // BigDecimal(double) doesn't do the trick!
		// Check out MathContext 
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
    }
}