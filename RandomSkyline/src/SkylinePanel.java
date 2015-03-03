/*Tyler Shewbert

 * CS111B
 * Conner
 * This class holds the panel data for displaying the five buildings
 */

import javax.swing.*;

import java.awt.*;
import java.util.Random;

public class SkylinePanel extends JPanel
{
	
	private Random generator;
	private final int MAX_BUILDINGS = 8;
			
	public SkylinePanel()
	{
		generator = new Random();
		
		setPreferredSize (new Dimension(800 , 600));
		setBackground (Color.blue);		
	}
	
	
	//Draws the panel with the buildings
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		int x, y, width, height , xL;
		int buildings = generator.nextInt(MAX_BUILDINGS) + 1;
		int gap;
		
		for (int i = 0; i < buildings; i++)
		{
			
			width = generator.nextInt(100) + 100;
			height = generator.nextInt(1000) + 700;
			x = generator.nextInt(800);
			y = generator.nextInt(200) + 200;
			xL = x;
			
				
			Building build = new Building (height, width, Color.gray, x, y);

			build.draw(g);
			gap = (generator.nextInt(5) + 5);
			x = xL + width + gap;
			
		}
		
		g.drawString("Tyler's City", 110, 100); //Names the city
		
		//Draws buildings of the Building class
		
	}
	}