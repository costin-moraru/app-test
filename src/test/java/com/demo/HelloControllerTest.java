package com.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloControllerTest {
	
	@Autowired
	private HelloController helloController;
	
	@Test
	public void testHelloControllerExist() {
		assertThat(helloController).isNotNull();
		
	}
	
	@Test
	public void testSayHelloMethod() {
		assertEquals("Hello world!", helloController.sayHello());
	}

}
