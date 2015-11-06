import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import plane.Circle;
import plane.PlaneShape;
import plane.Triangle;
import space.Cuboid;
import space.SpaceShape;
import space.Sphere;
import space.SquarePyramid;
import base.Vertex2D;
import base.Vertex3D;
import interfaces.VolumeMeasurable;
import base.Shape;

public class ShapesDemo {

	public static void main(String [] args){
		
		Vertex2D a = new Vertex2D(11,3);
        Vertex2D b = new Vertex2D(-3,4);
        Vertex2D c = new Vertex2D(40,13);
        Vertex3D v1 = new Vertex3D(-3,-2,1);
        Vertex3D v2 = new Vertex3D(13,-12,13);
        Vertex3D v3 = new Vertex3D(1,1,1);
		
		Shape [] shapes = new Shape[] {
			new Circle(a, 5.5),
			new plane.Rectangle(v3, 30, 25),
			new Triangle(a, b, c),
			new Cuboid(v1,20,30,15),
			new SquarePyramid(v2, 34, 50),
			new Sphere(v1,15)
			};
		
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
		
		System.out.println("\nFiletered by Volume - whose volume is over 40.00");
		System.out.println("------------------------------------------");
		
		for (Shape shape : shapes) {
			if(shape instanceof space.SpaceShape){
				SpaceShape sShape = (SpaceShape) shape;
				if(sShape.getVolume() > 40.00){
					System.out.println(sShape);
				}
			}
		}
		
//      lambda expressions
//		System.out.println(volumeMeasurable.stream()
//							.filter(e->e instanceof SpaceShape)
//							.map(e ->(SpaceShape)e)
//							.filter(e->e.getVolume > 40.00)
//							.forEach(e->System.out.println(e))							
//							);
//		
//		
		
		System.out.println("\nFiletered by Plane shapes and sort them by their perimeter in ascending order");
		System.out.println("------------------------------------------");
		
		List<PlaneShape> pShapes = new ArrayList<PlaneShape>();
		for (Shape shape : shapes) {
			if(shape instanceof plane.PlaneShape){
				pShapes.add((PlaneShape) shape);
			}
		}
		
		Collections.sort(pShapes);
		for (PlaneShape planeShape : pShapes) {
			System.out.println(planeShape);
		}
		
		//lambda expressions
//		List<Shape> listShapes = Arrays.asList(shapes);
//		System.out.println(shapes.stream()
//						   .filter(e->e instanceof PlaneShape)
//						   .map(e->(PlaneShape)e)
//						   .sort((e1,e2)->e1.compareTo(e2))
//						   .forEach(e->System.out.println(e))							
//							);
	}
	
}
