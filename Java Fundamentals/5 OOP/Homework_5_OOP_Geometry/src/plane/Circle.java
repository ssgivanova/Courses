package plane;

import java.util.List;

import base.Vertex2D;

public class Circle extends PlaneShape {
	
	//holds 1 vertex and radius
	private Vertex2D center;
	private double radius;
	private static final double PI = 2.14;
	
	public Circle(Vertex2D center, double radius){
		super(center);
		this.radius = radius;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public Vertex2D getVertex(){
		return this.center;
	}
	

	@Override
	public double getPerimeter() {
		return 2*PI*this.getRadius();
	}

	@Override
	public double getArea() {
		return PI*this.getRadius()*this.getRadius();
	}
	
	@Override
	public String toString() {
		return String.format("Circle - Radius = %.2f,  Perimeter = %.2f, Area = %.2f, Vertices = %s", 
							this.getRadius(),
							this.getPerimeter(),
							this.getArea(),
							this.getVertices());
	}

	
}
