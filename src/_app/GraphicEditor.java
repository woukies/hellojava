package _app;

import _base.Shape;
import _derived.Circle;

public class GraphicEditor {

	public static void main(String[] args) {
		Shape shape = new Shape();
		Circle circle = new Circle();
		shape.draw();
		circle.draw();
	}
}
