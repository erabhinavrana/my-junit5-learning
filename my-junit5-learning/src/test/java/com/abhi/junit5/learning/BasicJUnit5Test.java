/**
 * 
 */
package com.abhi.junit5.learning;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * @author Abhinav
 *
 */
@RunWith(JUnitPlatform.class)
@DisplayName("Sample test class for showcasing the annotations")
class BasicJUnit5Test {

	@BeforeAll
	static void beforeALL(){
		System.out.println("It will execute once before executing all the Test case");
	}
	
	@BeforeEach
	void beforeEach(){
		System.out.println("It will execute each time before executing the Test case");		
	}
	
	@Test
	void passedTestCase(){
		System.out.println("Success Test case");				
	}
	
	@Test
	void failedTestCase(){
		System.out.println("Failed Test case");						
	}
	
	@Test
	@Disabled("For demo purpose")
	void disabledTestCase(){
		System.out.println("Ignored Test case");						
	}
	
	@AfterEach
	void afterEach(){
		System.out.println("It will execute each time after executing any Test case");				
	}
	
	@AfterAll
	static void afterAll(){
		System.out.println("It will execute once After executing all Test case");
	}
}
