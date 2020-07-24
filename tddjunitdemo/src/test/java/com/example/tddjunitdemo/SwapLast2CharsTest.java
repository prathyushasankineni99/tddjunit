package com.example.tddjunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwapLast2CharsTest {
	
	/* Write a to-do list i.e different situations /scenarios of inputs possible 
	 * Mark each of them as success whenever testing is completed*/
	
	SwapLast2Chars swapLast2Chars;
	@BeforeEach
	void setUp()
	{
	 swapLast2Chars = new SwapLast2Chars();
	}

	@Test
	void test2Chars() {
		assertEquals("BA",swapLast2Chars.swap("AB"));
	}
	
	@Test
	void test4Chars() {
		
		assertEquals("ABDC",swapLast2Chars.swap("ABCD"));
	}
	@Test
	void testNChars() {
		
		assertEquals("ABCDEFGHIJLK",swapLast2Chars.swap("ABCDEFGHIJKL"));
	}
	@Test
	void test1Chars() {
		assertEquals("A",swapLast2Chars.swap("A"));
	}
	@Test
	void test0Chars() {
		assertEquals("",swapLast2Chars.swap(""));
	}
}
