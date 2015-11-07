package base;

public abstract class Vertex {

	private double x;
	
	protected Vertex(double x){
		this.x = x;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public double getX(){
		return x;
	}
	
	@Override
	public String toString() {
		return String.format("{%.2f}", this.getX());
	}
}
