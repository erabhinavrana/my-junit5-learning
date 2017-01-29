/**
 * 
 */
package com.abhi.junit5.learning;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * @author Abhinav
 *
 */
@RunWith(JUnitPlatform.class)
@DisplayName("Assumptions in JUnit5")
public class AssumptionsBasic {

	@BeforeAll
	static void setUp(){
		System.setProperty("TestEnv", "JUnit5");
		System.setProperty("Environment", "Stage");
	}
	
	@Test
	void showAssumeTrue(){
		assumeTrue("Stage".equals(System.getProperty("Environment")), ()-> "Not on development environment");
	}
	
	@Test
	void showAssumptionBasic(){
		assumingThat("JUnit5".equals(System.getProperty("TestEnv")),
				()->{
					assertEquals(2, 2);
					System.out.println("Inside assumption");
				});
		
	}
}
