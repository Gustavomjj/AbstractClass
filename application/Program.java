package herança.abstrato.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import herança.abstrato.entities.Circle;
import herança.abstrato.entities.Color;
import herança.abstrato.entities.Rectangle;
import herança.abstrato.entities.Shape;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Shape> listshape = new ArrayList<>();
		
		System.out.println("Enter the number of shapes: ");
		int shapes = sc.nextInt();
		
		for (int i = 1; i < shapes+1; i++) {
			System.out.printf("Shape #%d data: %n", i);
			System.out.print("Rectangle or Circle (r/c)? ");
			String rc = sc.next();
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (rc.equals("r")) {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				listshape.add(new Rectangle(color, width, height));
			} else { 
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				listshape.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape shape : listshape) {
			System.out.println(shape);
		}
		
		
		sc.close();
	}

}
