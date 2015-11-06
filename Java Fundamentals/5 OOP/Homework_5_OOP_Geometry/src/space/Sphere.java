package space;

import java.util.List;

import base.Vertex3D;

public class Sphere extends SpaceShape {
	
	//Sphere - holds 1 vertex and radius
	
	private double radius;
	private static final double PI = 2.14;
	
	public Sphere(Vertex3D v,double radius){
		super(v);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double getVolume() {
		//volume = 4pir^3/3
		return (4*PI*Math.pow(this.getRadius(), 3))/3;
	}

	@Override
	public double getArea() {
		//area = 4pir² 
		return 4*PI*this.getRadius()*this.getRadius();
	}
	
	@Override
	public String toString() {
		return String.format("Sphere - Radius = %.2f, Volume = %.2f, Area = %.2f, Vertices = %s", 
							this.getRadius(),
							this.getVolume(),
							this.getArea(),
							this.getVertices());
	}

}
