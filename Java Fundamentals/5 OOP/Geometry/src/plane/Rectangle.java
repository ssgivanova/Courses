package plane;

import java.util.List;
import base.Vertex2D;

public class Rectangle extends PlaneShape {
	
	//holds 1 vertex, width, height
	
	private double height;
	private double width;
	
	public Rectangle(Vertex2D v, double height, double width) {
		super(v);
		this.height = height;
		this.width = width;
	}
	
	public double getHeight(){
		return this.height;
	}
	
	public double getWidth(){
		return this.width;
	}
	
	@Override
	public double getPerimeter() {
		return 2*(this.getWidth() + this.getHeight());
	}

	@Override
	public double getArea() {
		return this.getWidth() * this.getHeight();
	}
	
	@Override
	public String toString() {
		return String.format("Rectangle - Width = %.2f, Height = %.2f,  Perimeter = %.2f, Area = %.2f, Vertices = %s", 
							this.getWidth(),
							this.getHeight(),
							this.getPerimeter(),
							this.getArea(),
							this.getVertices());
	}

}
