package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5,0.33,0.4, 0.1);
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.5,0.67,0.4, 0.1);
	}
}