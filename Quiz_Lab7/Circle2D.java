
public class Circle2D {
	double x, y;
	double radius;
	
	public Circle2D() {
		x = 0;
		y = 0;
		radius = 1;
	}
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	double getX() {
		return x;
	}
	
	double getY() {
		return y;
	}
	
	double getRadius() {
		return radius;
	}
	
	double getArea() {
		return Math.PI * radius *radius;
	}
	
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	boolean contains(double x, double y) {
		double dx = this.getX() - x;
		double dy = this.getY() - y;
		double distance = Math.sqrt(dx * dx + dy * dy);
		return distance <= radius;
	}
	
	boolean contains(Circle2D circle) {
		double x2 = circle.getX();
		double y2 = circle.getY();
		if(this.contains(x2, y2)) {
			double dx = this.getX() - x2;
			double dy = this.getY() - y2;
			double distance = Math.sqrt(dx * dx + dy * dy);
			return (distance + circle.getRadius()) <= this.getRadius();
		}
		return false;
	}
	
	boolean overlaps(Circle2D circle) {
		if(!this.contains(circle)) {
			double dx = this.getX() - circle.getX();
			double dy = this.getY() - circle.getY();
			double distance = Math.sqrt(dx * dx + dy * dy);
			return distance < (this.getRadius() + circle.getRadius());
		}
		return false;
	}
}
