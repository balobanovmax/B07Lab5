
public class Rectangle {
	Point A;
	Point B;
	Point C;
	Point D;

    public static Rectangle fromTwoPoints(Point A, Point B) {
        double ax = A.x;
        double ay = A.y;
        double bx = B.x;
        double by = B.y;

        Point Bp = new Point(ax, by);
        Point Cp = new Point(bx, by);
        Point Dp = new Point(bx, ay);

        return new Rectangle(A, Bp, Cp, Dp);
    }
	
	public Rectangle(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}
	
	public boolean isCube() {
		double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dCD = C.distance(D);
		double dDA = D.distance(A);
        return dAB == dBC && dBC == dCD && dCD == dDA;
	}
}
