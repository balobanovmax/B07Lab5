public package lab4;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PentagonTest {

	@Test
	void test_perimeter() {
		Point x1 = new Point(1,0);
		Point x2 = new Point(-1,0);
		Point x3 = new Point(1, 1);
		Point x4 = new Point(-1, 1);
		Point x5 = new Point(0, 2);
		Pentagon p1 = new Pentagon(x1, x2, x3, x4, x5);
		assertEquals(p1.perimeter(), 4 + 2*Math.sqrt(2));
	}
	
	@Test
	void test_equilateral() {
		Point x1 = new Point(1.000000, 0.000000);
		Point x2 = new Point(0.309017, 0.951057);
		Point x3 = new Point(-0.809017, 0.587785);
		Point x4 = new Point(-0.809017, -0.587785);
		Point x5 = new Point(0.309017, -0.951057);
		Pentagon p1 = new Pentagon(x1,x2,x3,x4,x5);
		assertTrue(p1.isEquilateral());
	}
	
	@Test
	void test_is_not_equilateral(){
		Point x1 = new Point(1.000000, 0.500000);
		Point x2 = new Point(0.309017, 0.951057);
		Point x3 = new Point(-0.809017, 0.587785);
		Point x4 = new Point(-0.809017, -0.587785);
		Point x5 = new Point(0.309017, -0.951057);
		Pentagon p1 = new Pentagon(x1,x2,x3,x4,x5);
		assertFalse(p1.isEquilateral());
	}
}
 Main {
    
}
