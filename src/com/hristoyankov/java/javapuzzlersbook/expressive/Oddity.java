package com.hristoyankov.java.javapuzzlersbook.expressive;

// Chapter 01 - Oddity (Puzzle 1)
public class Oddity {
    public static void main(String[] args) {
		System.out.println("Is 4 odd? -> " + isOdd(4));
		System.out.println("Is 5 odd? -> " + isOdd(5));
		System.out.println("Is 0 odd? -> " + isOdd(0));
		System.out.println("Is -4 odd? -> " + isOdd(-4));
		System.out.println("Is -5 odd? -> " + isOdd(-5));
    }

    public static boolean isOdd(int i) {
		//return i % 2 == 1; // In Java % is defined as (a / b) * b + (a % b) * b = a
		return i % 2 != 0;
    }
}