package com.spring.example.Spring2.after.hp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=Application.class)
class BinarySearchTest {

	@Autowired
	BinarySearchImpl binarySearch;
	
	@Test
	void test() {
		int result=binarySearch.search(new int[] {1,2}, 2);
		assertEquals(result, 3);
		
		
	}

}
