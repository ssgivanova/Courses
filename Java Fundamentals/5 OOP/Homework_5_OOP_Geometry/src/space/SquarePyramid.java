package space;

import java.util.List;

import base.Vertex3D;

public class SquarePyramid extends SpaceShape {
	
	//hold 1 vertex(base center), base width, pyramid height
	private double baseWidth;
	private double height;

	public SquarePyramid(Vertex3D baseCenter, double basewidth, double height){
		super(baseCenter);
		this.baseWidth = baseWidth;
		this.height = height;
	}
	
	
	public double getBaseWidth() {
		return baseWidth;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double getVolume() {
		//volume = b²h/3
		return this.getBaseWidth()*this.getBaseWidth()*this.getHeight()/3;
	}

	@Override
	public double getArea() {
		//area = s² +  2sl 
		double s = getSlantHeight();
		return 2*s*this.getBaseWidth() + this.getBaseWidth()*this.getBaseWidth();
	}
	
	public double getSlantHeight(){
		//s² = h² + (b/2)² 
		return this.getHeight()+this.getHeight() + (this.getBaseWidth())*(this.getBaseWidth())/4;
	}
	
	@Override
	public String toString() {
		return String.format("Square Pyramid - Base Width = %.2f, Height = %.2f, Volume = %.2f, Area = %.2f, Vertices = %s", 
							this.getBaseWidth(),
							this.getHeight(),
							this.getVolume(),
							this.getArea(),
							this.getVertices());
	}

}
