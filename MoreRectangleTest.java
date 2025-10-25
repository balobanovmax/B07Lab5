import org.junit.Test;
import static org.junit.Assert.*;


public class MoreRectangleTest {
    @Test
    public void testRectFTP() {
        Point A = new Point(0, 0);
        Point B = new Point(2, 3);
        Rectangle rect = Rectangle.fromTwoPoints(A, B);
        assertEquals(2.0, rect.D.x, 0.0001);
    }
    @Test
    public void testRectPerimeterFTP() {
        Point A = new Point(0, 0);
        Point B = new Point(2, 3);
        Rectangle rect = Rectangle.fromTwoPoints(A, B);
        assertEquals(10.0, rect.perimeter(), 0.0001);
    }

    @Test
    public void testRectIsCubeFTP() {
        Point A = new Point(0, 0);
        Point B = new Point(2, 2);
        Rectangle rect = Rectangle.fromTwoPoints(A, B);
        assertTrue(rect.isCube());
    }
}
