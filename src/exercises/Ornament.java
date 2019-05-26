package exercises;

import java.util.ArrayList;
import java.util.Random;

/* 
 * Create a class called Decorator that contains an ArrayList called boxOfDecorations.
 *   1. In the Decorator class, hang all the ornaments in the box.
 *   2. Add a color to the Ornament class so that your program prints Hanging a red ornament, etc.
 */

public class Ornament {

	private String color;

	public Ornament() {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("black");
		colors.add("white");
		colors.add("yellow");
		colors.add("orange");
		colors.add("green");
		colors.add("violet");
		int random = new Random().nextInt(colors.size());
		this.color = colors.get(random);
	}

	public void hang() {
		System.out.println("Hanging a " + this.color + " ornament.");
	}

}
