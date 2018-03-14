
public class Test {
	
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		
		System.out.println("Area: " + c1.getArea());
		System.out.println("Perimeter: " + c1.getPerimeter());
		System.out.println("Contains (point (3, 3)): " + c1.contains(3, 3));
		System.out.println("Contains (circle with center at (4, 5), radius = 10.5): " + c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("Overlaps (circle with center at (3, 5), radius = 2.3): " + c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}
