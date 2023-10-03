package herança.abstrato.entities;

public class Circle extends Shape {

	private Double Radius;
	
	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		Radius = radius;
	}

	public double getRadius() {
		return Radius;
	}

	public void setRadius(double radius) {
		Radius = radius;
	}
	
	public double area() {
		double area = Radius * Radius;
		return area;
	}
	
}
