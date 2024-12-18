import java.awt.Color;

/**
 * Demonstrates the scaling (resizing) operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, and two integers that specify the width and the
 * height of the scaled, output image. For example, to scale/resize ironman.ppm to a width
 * of 100 pixels and a height of 900 pixels, use: java Editor2 ironman.ppm 100 900
 */
public class Editor2 {

	public static void main (String[] args){
		//// Replace this comment with your code.
		//// This function is similar to the main function of Editor1.java	
		
		String fileName = args[0];
		int width = Integer.parseInt(args[1]);
		int height = Integer.parseInt(args[1]);
		
		Color[][] imageIn = Runigram.read(fileName);	
		Color[][] imageOut = null;	
		Runigram.setCanvas(imageIn);
		imageOut = Runigram.scaled(imageIn, width, height);
		Runigram.setCanvas(imageOut);
		Runigram.display(imageOut);


        // Enables drawing graphics in memory and showing it on the screen only when
		// the StdDraw.show function is called.
		
	}
}
