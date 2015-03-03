/*Tyler Shewbert
 * CS111B
 * Conner
 */

import java.awt.*;
import java.util.Random;

//The Building class used by SkylinePanel to create the skyline
public class Building
{
	private int width , height , x, y;
	private Color color;
	
	//Sets up the buildings with specified values
	public Building (int sizeh, int sizew, Color exterior, int upperX, int upperY) //The building method
	{
		width = sizew;
		height = sizeh;
		color = exterior;
		x = upperX;
		y = upperY;
		
	}
	
	//Draws the building, with windows
	public void draw (Graphics g) //The method that draws the buildings and windows
	{
	g.setColor(color);
	g.fillRect(x, y, width, height); //Draws a rectangle for the building

	
	
	
	g.setColor(Color.yellow); //draws a window
	g.fillRect(x + 10 , y + 10 , 10, 10);
	g.setColor(Color.yellow); //draws a window
	g.fillRect(x + 30, y +15 , 10, 10);
	g.setColor(Color.yellow); //draws a window
	g.fillRect(x +50 , y + 20 , 10, 10);
	g.setColor(Color.yellow); //draws a window
	g.fillRect(x +75 , y + 20 , 10, 10);
	g.setColor(Color.yellow); //draws a window
	g.fillRect(x + 10 , y + 30 , 10, 10);
	g.setColor(Color.yellow); //draws a window
	g.fillRect(x + 25, y +35 , 10, 10);
	g.setColor(Color.yellow); //draws a window
	g.fillRect(x +60 , y + 40 , 10, 10);
	g.setColor(Color.yellow); //draws a window
	g.fillRect(x +85 , y + 50 , 10, 10);
	g.setColor(Color.yellow); //draws a window
	g.fillRect(x + 15 , y + 80 , 10, 10);
	g.setColor(Color.yellow); //draws a window
	g.fillRect(x + 35, y +95 , 10, 10);
	g.setColor(Color.yellow); //draw a window
	g.fillRect(x +80 , y + 110 , 10, 10);
	g.setColor(Color.yellow); //draw a window
	g.fillRect(x +75 , y + 120 , 10, 10);
	
	
	}
	
	//Width mutator (changes a value)
	public void setWidth (int sizew)
	{
		width = sizew;
	}
	
	//Height mutator (changes a value)
	public void setHeight (int sizeh)
	{
		height = sizeh;
	}
	
	//Color mutator (changes a value)
	public void setColor (Color exterior)
	{
		color = exterior;
	}
	
	//X mutator (changes a value)
	public void setX (int upperX)
	{
		x = upperX;
	}
	
	//Y mutator (changes a value)
	public void setY (int upperY)
	{
		y = upperY;
	}
	
	//Height accessor (provides read-only)
	public int getHeight()
	{
		return height;
	}
	
	//Width accessor (provides read-only)
	public int getWidth()
	{
		return width;
		
	}
}