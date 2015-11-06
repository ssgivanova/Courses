package plane;

import base.Vertex2D;

public class Triangle extends PlaneShape {
	
	//holds 3 vertices
	
	private double distanceP12;
	private double distanceP23;
	private double distanceP13;
	
	public Triangle(Vertex2D p1, Vertex2D p2, Vertex2D p3) {
		super(p1,p2,p3);
		distanceP12 = super.getDistance2Vertex2D(p1, p2);
		distanceP13 = super.getDistance2Vertex2D(p1, p3);
		distanceP23 = super.getDistance2Vertex2D(p2, p3);
	}
	
	public Vertex2D getPoint(Vertex2D p){
		return p;
	}
	
	@Override
	public double getPerimeter() {
		return distanceP12 + distanceP13 + distanceP23;
	}

	@Override
	public double getArea() {
		double semiperimmeter = this.getPerimeter()/2;
		double area = Math.sqrt((semiperimmeter)*(semiperimmeter - distanceP12)
								*(semiperimmeter - distanceP13)
								*(semiperimmeter - distanceP23) );
		
		return area;
	}
	
	@Override
	public String toString() {
		return String.format("Triangle - { a =%.2f, b=%.2f, c=%.2f }, Perimeter = %.2f, Area = %.2f, Vertices = %s", 
							distanceP12,
							distanceP13,
							distanceP23,
							this.getPerimeter(),
							this.getArea(),
							this.getVertices());
	}

}
