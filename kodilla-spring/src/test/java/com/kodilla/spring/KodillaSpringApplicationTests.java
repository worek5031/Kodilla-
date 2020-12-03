package com.kodilla.spring;

import com.kodilla.spring.shape.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class KodillaSpringApplicationTests {

	@Test
	void testCircleLoadedIntoContainer() {

		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("circle");

		//When

		String result = shape.getShapeName();

		//Then

		Assertions.assertEquals("THis is a circle", result);

	}
	@Test
	void testTriangleLoadedIntoContainer() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("triangle");

		//When
		String result = shape.getShapeName();

		//Then

		Assertions.assertEquals("This is a triangle", result);
	}
	@Test
	void testSquareLoadedINtoContainer() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

		//When
		Shape shape = (Shape)context.getBean("square");
		String result = shape.getShapeName();

		//Then
		Assertions.assertEquals("This is a square", result);
	}
	@Test
	void testShapeLoadedINtoContainer() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("chosenShape");

		//When
		String result = shape.getShapeName();

		//Then
		System.out.println("The chosen shape says: " + result);

	}
}
