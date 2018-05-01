package com.firas.junit5;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class StringTest {

	
	@BeforeAll
	static void beforeAll() {
		System.out.println("connect to the DB");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("release the DB...");
	}
	
	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("Run before !" + info.getDisplayName() );
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("clear the data!");
	}
	
	
	@Test 
	void length_basics () {
	System.out.println("lenght_basics");
	int str_count = "ABCD".length();
	assertEquals(4,str_count);
	}
	
	// here, we are expected a null pointer exception to be run. 
	@Test
	@DisplayName ("when the method is null throw an exception!")
	void length_exception () {
	String str = null;
	assertThrows(NullPointerException.class, 
			() -> {
				str.length();
			}
			);
	}
	
	@ParameterizedTest
	@ValueSource(strings= { "ABCS","a","AB","D"})
	void lenght_grater_than_zero(String str) {
		assertTrue(str.length()>0);
	}
	
	
	@Test
	@RepeatedTest(10)
	void contains_basic() {
		System.out.println("contains_basics");
		String str = "ABCDEFGH";
		boolean result = str.contains("ijk");
//		assertEquals(false,result);
		assertFalse(result);
				
	}
	
	@ParameterizedTest
	@CsvSource(value= {"abcd, ABCD","abc , ABC","'',''","abcdefg,ABCDEFG"})
	void uppercase(String word, String capitalizedWord) {
		assertEquals(capitalizedWord,word.toUpperCase() );
	}
	
	@Test
	@Disabled
	void performanceTest() {
		assertTimeout(Duration.ofSeconds(5),
				() -> {
					for (int i =0; i<1000;i++) {
						int j =i;
						System.out.println(j);
					}
				}
				);
	}
	
	@ParameterizedTest(name = "{0} length is {1}")   // it will change the names to be more clear for the debug.
	@CsvSource(value= {"abcd, 4","abc , 3","'',0","abcdefg,7"})
	void test_length(String word, int str_len) {
		assertEquals(str_len,word.length());
	}

}
