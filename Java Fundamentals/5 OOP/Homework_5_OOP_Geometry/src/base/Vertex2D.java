package base;

public class Vertex2D extends Vertex{
	
	private double y;
	
	public Vertex2D(double x, double y){
		super(x);
		this.y = y;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public double getY(){
		return y;
	}
	
	@Override
	public String toString() {
		return String.format("{%.2f,%.2f}", this.getX(),this.getY());
	}
	
	
}
