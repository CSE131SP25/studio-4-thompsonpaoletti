package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next(); 
		
		int rValue = in.nextInt();
		int gValue = in.nextInt();
		int bValue = in.nextInt();
		StdDraw.setPenColor(rValue, gValue, bValue);//Set color
		if(shapeType.equals ("ellipse")) {
			boolean filled = in.nextBoolean();
			double x = in.nextDouble();
			double y = in.nextDouble();
			double xLength = in.nextDouble();
			double yLength = in.nextDouble();
			if(filled == true) { // Filled Shape
				
				StdDraw.filledEllipse(x, y, xLength, yLength);
			}
			else { // Hollow Shape
				StdDraw.ellipse(x, y, xLength, yLength);
			}
		}
		else if(shapeType.equals ("rectangle")) {
			if(filled == true) { // Filled Shape
				StdDraw.filledRectangle(x, y, xLength, yLength);
			}
			else { // Hollow Shape
				StdDraw.rectangle(x, y, xLength, yLength);
		}
	}
		else {
			if(filled == true) { // Filled Shape
				
			}
			else { // Hollow Shape
				
		}
	}
		}
}


