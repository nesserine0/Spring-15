package com.example.demo;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import Class.Carre;
import Class.Cercle;
import Class.Cube;
import Class.Point;
import Class.Rectangle;
import Class.Sphere;
import Class.TriangleIsocele;

public class TextClass {

	Carre carre;
	Cube cube;
	Cercle cercle;
	Rectangle rectangle;
	Sphere sphere;
	TriangleIsocele triangleIsocele;
	Point point;
	
	@Before
	public void  Init () {
		
		point=new Point(2,10);
		carre=new Carre("CarreNess", point, 3);
		cube=new Cube("Cube ness", point, 4);
		rectangle=new Rectangle("Rectangle ness", point, 3, 7);
		sphere=new Sphere("Sphere ness", point, 2);
		cercle=new Cercle("Cercle ness", point, 11);
		triangleIsocele=new TriangleIsocele("TriangleIsocele", point, 10, 5);
		
	}
	
	
	@Test
	public void test() {
		assertEquals(9,00, carre.superficie());	
		assertEquals(96,00, cube.superficie());
		assertEquals(21,00, rectangle.superficie());
		assertEquals(12,57, cercle.superficie());
		assertEquals(50,27 , sphere.superficie());
		assertEquals(24,21, triangleIsocele.superficie());
	}

}
