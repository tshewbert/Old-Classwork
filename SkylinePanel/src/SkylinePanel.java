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
	private Building build1, build2, build3, build4, build5;
	
	//Creates five Building objects, holds the instance data for the Building objects
	public SkylinePanel()
	{
		build1 = new Building(500 , 130, Color.gray, 0, 300);
		build2 = new Building(250 , 160 , Color.lightGray, 130, 650);
		build3 = new Building(350 , 150 , Color.black , 220 , 550);
		build4 = new Building(470 , 200 , Color.darkGray , 370 , 330);
		build5 = new Building(560 , 170 , Color.green , 570 , 240 );

		setPreferredSize (new Dimension(800 , 800));
		setBackground (Color.blue);		
	}
	
	//Draws the panel with the buildings
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		g.drawString("Tyler's City", 110, 100); //Names the city
		
		//Draws buildings of the Building class
		build1.draw(g);
		build2.draw(g);
		build3.draw(g);
		build4.draw(g);
		build5.draw(g);
	}
}
