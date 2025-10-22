package lab4;

public class Pentagon {
	Point A;
	Point B;
	Point C;
	Point D;
	Point E;
	
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(E) + E.distance(A);
	}
	
	public boolean isEquilateral() {
		double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dCD = C.distance(D);
		double dDE = D.distance(E);
		double dEA = E.distance(A);
		if(dAB==dBC && dBC==dCD && dCD==dDE && dDE==dEA && dEA==dAB)
			return true;
		else
			return false;
	}
}
