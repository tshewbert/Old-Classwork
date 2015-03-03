/*Tyler Shewbert
 * CS111B
 * Conner
 * The Skyline class that contains the main method that that creates and displays the frame for the programs
 */

import javax.swing.*;
import java.awt.*;

public class RandomSkyline
{
	public static void main (String [] args)
	{
		//Creates new frame to display Skyline
		JFrame frame = new JFrame ("Skyline");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new SkylinePanel());	//Instantiates a SkylinePanel object and adds it to the frame
		
		frame.pack();
		frame.setVisible(true);
		
	}
}
