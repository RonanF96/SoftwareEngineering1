package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	@Test
	public void test() {
		String name="Ronan";
		int age= 21;
		String expected = name+age;
		Student student = new Student("Ronan","08/01/1996",21);
		String result = student.getUsername();
		assertEquals(expected,result);
	}

}
