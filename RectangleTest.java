package B07Lab5;

import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testPerimeter() {
        Point A = new Point(0, 0);
        Point B = new Point(2, 0);
        Point C = new Point(2, 1);
        Point D = new Point(0, 1);
        Rectangle rect = new Rectangle(A, B, C, D);
        assertEquals(6.0, rect.perimeter(), 0.0001);
    }

    @Test
    public void testIsCubeTrue() {
        Point A = new Point(0, 0);
        Point B = new Point(1, 0);
        Point C = new Point(1, 1);
        Point D = new Point(0, 1);
        Rectangle rect = new Rectangle(A, B, C, D);
        assertTrue(rect.isCube());
    }

    @Test
    public void testIsCubeFalse() {
        Point A = new Point(0, 0);
        Point B = new Point(3, 0);
        Point C = new Point(3, 1);
        Point D = new Point(0, 1);
        Rectangle rect = new Rectangle(A, B, C, D);
        assertFalse(rect.isCube());
    }
}

