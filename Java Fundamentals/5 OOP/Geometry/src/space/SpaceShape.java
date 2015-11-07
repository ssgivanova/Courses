package space;

import java.util.ArrayList;
import java.util.List;
import base.Shape;
import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;
import base.Vertex3D;

public abstract class SpaceShape extends Shape implements AreaMeasurable,VolumeMeasurable {

	protected SpaceShape(Vertex3D...vertices3D){
		super.addVertices(vertices3D);
	}
	
	public abstract double getVolume();
	public abstract double getArea();

}
