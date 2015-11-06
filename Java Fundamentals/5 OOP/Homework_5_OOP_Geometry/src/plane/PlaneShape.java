package plane;

import java.util.Comparator;
import java.util.List;

import base.Shape;
import base.Vertex2D;
import interfaces.AreaMeasurable;
import interfaces.PerimeterMeasurable;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable, Comparable <PlaneShape> {
	
	private List<Vertex2D> vertices2D;
	
	protected PlaneShape(Vertex2D... vertices2D){
		super.addVertices(vertices2D);		
	}
	
	protected PlaneShape(){
		super();		
	}
	
	public double getDistance2Vertex2D(Vertex2D p1, Vertex2D p2){
		double distance = Math.sqrt((p1.getX() - p2.getX())*(p1.getX() - p2.getX())+
				(p1.getY() - p2.getY())*(p1.getY() - p2.getY()));
		return distance;
		
	}
	
	public abstract double getPerimeter();
	public abstract double getArea();
	
//	public int compareTo(Fruit compareFruit) {
//		
//		int compareQuantity = ((Fruit) compareFruit).getQuantity(); 
//	public int compare(PlaneShape ps1, PlaneShape ps2) {
//		return Double.compare(ps1.getPerimeter(), ps1.getPerimeter());
//	}
	
	@Override
	public int compareTo(PlaneShape other) {
		double perimeter= ((PlaneShape) other).getPerimeter(); 
		
		//ascending order
		return (int)(this.getPerimeter() - perimeter);
		
	}

}
