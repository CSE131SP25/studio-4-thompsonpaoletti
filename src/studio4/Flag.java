package studio4;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(1500,1000);
		StdDraw.setXscale(0,1500);
		StdDraw.setYscale(0,1000);
		StdDraw.setPenColor(92,140,88);
		StdDraw.filledRectangle(750,500,750,500);
		StdDraw.setPenColor(150,75,0);
		double[] x = {1200.0, 750.0, 300.0, 750.0};
		double[] y = {500.0, 950.0, 500.0, 50.0};
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(750,500,250);
		Font font = new Font("Arial", Font.BOLD, 60);
		StdDraw.setFont(font);
		StdDraw.text(150, 900, "Sports");
		StdDraw.text(1350, 900, "Ball");
	}
}