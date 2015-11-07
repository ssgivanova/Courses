package space;

import java.util.List;

import base.Vertex3D;

public class Cuboid extends SpaceShape {
	
	//Cuboid – holds 1 vertex, width, height, depth
	private double width;
	private double height;
	private double depth;
	
	public Cuboid(Vertex3D v, double width,double height,double depth){
		super(v);
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getDepth() {
		return depth;
	}
	
	
	@Override
	public double getVolume() {
		//V = lwh
		return this.getWidth()*this.getHeight()*this.getDepth();
	}

	@Override
	public double getArea() {
		// TSA = 2 (lw + wh + hl) 
		return 2*(this.getDepth()*this.getWidth()+this.getWidth()*this.getHeight() + this.getHeight()*this.getDepth());
	}
	
	@Override
	public String toString() {
		return String.format("Cuboid - Width = %.2f, Height = %.2f, Depth = %.2f,Volume = %.2f, Area = %.2f, Vertices = %s", 
							this.getWidth(),
							this.getHeight(),
							this.getDepth(),
							this.getVolume(),
							this.getArea(),
							this.getVertices());
	}

}
