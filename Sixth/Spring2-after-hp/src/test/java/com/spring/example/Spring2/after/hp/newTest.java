package com.spring.example.Spring2.after.hp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.example.Spring2.after.hp.scope.BasicApplicationScope;

import property.SomeExternalService;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes=BasicApplicationScope.class)
class SomeBasicExample {

	@Autowired
	SomeExternalService some;
	
	@Test
	void test() {
		assertEquals(some.getClassName(), "Basic Appliction");
		
	}

}
