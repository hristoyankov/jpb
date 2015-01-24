package com.hristoyankov.java.javapuzzlersbook.expressive;

// Chapter 01 - The joy of hex (Puzzle 5) 
public class HexAreFun {
    public static void main(String[] args) {
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
    }
}