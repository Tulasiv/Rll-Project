package com.cms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.cms.model.Library;


@DisplayName("LibraryController ")
public class LibraryTest {

	@BeforeEach
	@Test
	public void test3() {
		System.out.print("\nBeforeSetup");
	}
	
	@Test
	@Order(1)
	public void test() {
		System.out.print("\nTest case 1 passed" +" " );
	}
	@Test
	@Order(2) 
	public void test1() {
		Library library = new Library();
		library.setLusername("Bikki");
		String lb= library.getLusername();
		
		assertEquals("Bikki",lb);
		System.out.print("\nTest case 2 passed");

	}
	
	@Test
	@Order(3)
	public void savepass() {
		Library lb= new Library();
		lb.setLpassword("Bikki");
		
		String library = lb.getLpassword();
		assertNotEquals("Bikki",lb);
		
		System.out.print("\nTest case 4 passed");

	}
	
	@AfterEach
	@Test
	public void test4() {
		System.out.print("\nAfter Setup");
	}
}