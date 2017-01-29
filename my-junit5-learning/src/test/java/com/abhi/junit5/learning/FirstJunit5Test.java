/**
 * 
 */
package com.abhi.junit5.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * @author Abhinav
 *
 */
@RunWith(JUnitPlatform.class)
class FirstJunit5Test {

	@Test
	void testCaseFirst(){
		assertEquals(2, 1+1);
	}
	
	@Test
	@CustomTag
    void failingTest() {
        fail("Failing for failing's sake.");
    }
}
