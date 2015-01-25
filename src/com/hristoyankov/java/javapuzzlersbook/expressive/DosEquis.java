package com.hristoyankov.java.javapuzzlersbook.expressive;

// Chapter 01 - Dos equis (Puzzle 8)
public class DosEquis {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		char x = 'X';
		int i = 0;
		
		System.out.println(true ? x : 0); // -> 'X'
		System.out.println(false ? i : x); // -> int representation of 'X' JLS 15.25
	}

}
