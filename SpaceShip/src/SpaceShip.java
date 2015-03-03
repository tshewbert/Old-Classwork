/*Tyler Shewbert
 * 4/11/14
*CS 111B Online Section
*email: tshewbert@smiocs.com
*Workload: Five hours
*
*Thoughts: This was an interesting one. It took me several rewrites to get the
*firing of the laser to work properly. Sometimes it would stick, other times it would just change colors randomly
*That was probably the most difficult part. The reset button will reset the counter,
*but for some reason it wont show zero until the mouse is moved a little.
*
*/

/*
 * High level algorithm:
 * 1. Create an applet to run inside a browser window.
 * 2. Draw a spaceship.
 * 3. Draw a laser to be fire upon mouse being pressed and rotate colors
 * 4. Set up mouse actions
 * 5. Create a counter for shots fired and a reset button for counter
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SpaceShip extends Applet 
{
   private final int APPLET_WIDTH = 700;
   private final int APPLET_HEIGHT = 700;
   
   private Point laser1 = null;
   private Point spaceship = null;
   private Point fire = null;
   private int fireCount;
   private boolean pressed;

		   
  //Create a button to reset counter
   public void init()
   {
      addMouseListener (new MouseHandler());
      addMouseMotionListener (new MouseMotionHandler());
   // Construct the button
      Button reset = new Button("Reset Counter");

      // add the button to the layout
      this.add(reset);

      // specify that action events sent by this
      // button should be handled by a new ResetAction object
      reset.addActionListener(new ResetAction());
      
      

      setBackground (Color.black);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   public class ResetAction
   implements ActionListener {

   public void actionPerformed(ActionEvent e) 
   {
	// Set fireCount to zero when button is pushed   
	fireCount = 0;
   }
}

   //Draw the laser and ship
   public void paint (Graphics page)
   {
	   // Create random numbers for laser to fire to
	   Random random = new Random();
	   int laser2x = random.nextInt(800);
	   int laser2y = random.nextInt(800);
	   
	   // The Ship
	   page.setColor(Color.GRAY);
	   page.fillOval(spaceship.x -20, spaceship.y - 30, 40, 60);
	   page.fillRect(spaceship.x - 2, spaceship.y , 6, 70);
	   page.fillRect(spaceship.x - 15, spaceship.y + 65, 32, 10);
	   page.fillRect(spaceship.x - 25, spaceship.y + 55, 10, 30);
	   page.fillRect(spaceship.x + 17, spaceship.y + 55, 10, 30);
	   
	   // Choose a different number each time the laser is fired
	   if (fireCount > 0)
	   {
		   int randomColor = random.nextInt(6);
		   {
			   if (randomColor == 0)
			   {
				   page.setColor(Color.blue);
			   }
			   if (randomColor == 1)
			   {
				   page.setColor(Color.red);
			   }
			   if (randomColor == 2)
			   {
				   page.setColor(Color.yellow);
			   }
			   if (randomColor == 3)
			   {
				   page.setColor(Color.cyan);
			   }
			   if (randomColor == 4)
			   {
				   page.setColor(Color.green);
			   }
			   if (randomColor == 5)
			   {
				   page.setColor(Color.MAGENTA);
			   }
			   if (randomColor == 6)
			   {
				   page.setColor(Color.ORANGE);
			   }
		   }
	   }
	   
	   // Test to see if the button is pressed and fire the lasr
	   if (pressed == true)
	   {
		   page.drawLine(fire.x, fire.y, laser2x, laser2y);
	   }

	   // Draw the counter
	   page.setColor(Color.white);
	   page.drawString("Shots Fired: " + fireCount , 20, 20);
   }
   		
	 	public void setPoint (Point laser1)
	 	{
		   fire = laser1;
	 	}
	  
	 // Count the shots fired
	  public int getClickCount()
	  {
		  fireCount++;
		  return fireCount;
	  }
 
	  //Create a private MouseHandler class to perform specific actions
	private class MouseHandler implements MouseListener 
	{
		public void mousePressed(MouseEvent e) 
		{Point laser1 = e.getPoint();
		getClickCount();
		setPoint(laser1);	//set ther point of the first coordinates of the laser
		pressed = true; //test to see when mouse is pressed
		repaint(); //redraw
		}
		public void mouseClicked(MouseEvent e) 
		{
		}
		public void mouseReleased(MouseEvent e) 
		{
		pressed = false; //test to see when mouse is released
		repaint();
		}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		}
   
	//Creates a private MouseMotionHandler class
	private class MouseMotionHandler implements MouseMotionListener
		{
  
		public void mouseMoved (MouseEvent e) {
		spaceship = e.getPoint();
		repaint();  //Redraws the ship where ever the mouse is
		}
		public void mouseDragged(MouseEvent e)
		{
		}
   }
}