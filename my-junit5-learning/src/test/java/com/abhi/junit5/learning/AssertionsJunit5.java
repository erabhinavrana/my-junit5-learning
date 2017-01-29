/**
 * 
 */
package com.abhi.junit5.learning;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Abhinav
 *
 */
@RunWith(JUnitPlatform.class)
@DisplayName("Assertions in JUnit5")
public class AssertionsJunit5 {

	@Test
	@DisplayName("Test case to show standard assertion methods.")
	void basicAssertions(){
		assertEquals("Abhi", "Abhi");
		assertNotEquals(4, 2, ()->"Assertion not equals message.");
		assertTrue(3>2, ()->"Assertion messages can be lazily evaluated to avoid constructing complex messages unnecessarily.");
	}
	
	@Test
	@DisplayName("Test case to show Grouped assertion methods.")
	void newAssertion(){
		assertAll("Group Assertions",
				()->assertEquals("Abhi", "Abhi"),
				()->assertNotEquals(4, 3, ()->"Assertion not equals message."),
				()->assertTrue(3>2, ()->"Assertion messages can be lazily evaluated to avoid constructing complex messages unnecessarily.")
				);
	}
	
	@Test
	@DisplayName("Test case to show exception handle through assertion methods.")
	void exceptionAssertion(){
		Throwable exception = expectThrows(NullPointerException.class, ()->{ throw new NullPointerException("Got exception message");
		});
		
		assertEquals("Got exception message", exception.getMessage());
	}
}
