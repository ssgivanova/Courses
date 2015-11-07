package base;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
	
	private List<Vertex> vertices;
	
	protected Shape(){
		vertices = new ArrayList<Vertex>();		
	}
	
	
	public List<Vertex> getVertices(){
		return vertices;
	}
	
		
	public void addVertices(Vertex... points){
		for (Vertex vertex : points) {
			this.vertices.add(vertex);
		}
	}
	
	
	
	
}
