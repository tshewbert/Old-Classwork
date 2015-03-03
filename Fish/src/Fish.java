import javax.swing.JApplet;
import java.awt.*;

public class Fish extends JApplet
{
	/*Tyler Shewbert
	 * CS 111B
	 * Professor Conner
	*/
	public void paint (Graphics page)
	{
		page.setColor(Color.blue);
		page.fillRect (0 , 0 , 500 ,500);
		page.setColor(Color.black);
		page.drawString("Tyler Shewbert", 25, 25);
		
		
		//Body Outline
		page.setColor(Color.orange);
		page.drawArc(100, 75, 200, 80, 20, 140);
		page.drawArc(100, 75, 200, 80, -20, -140);
		
		
		//Tail Fins
		page.drawLine(75, 85, 75, 145);
		page.drawLine(75, 85, 105, 102);
		page.drawLine(75, 145, 105, 129);
		
		//Mouth
		page.setColor(Color.red);
		page.drawLine(275, 115, 293, 102);
		page.drawLine(275, 115, 293, 128);

		//Eyes
		page.setColor(Color.green);
		page.fillOval(240, 95, 20, 10); //Eye
		page.setColor(Color.yellow);
		page.fillOval(245, 95, 7, 7);
		
		//Gills
		page.setColor(Color.green);
		page.drawLine(230, 105, 228, 135);
		page.drawLine(233, 107, 231, 135);
		page.drawLine(236, 110, 234, 135);
		
		//Top Fins
		page.setColor(Color.CYAN);
		page.drawArc(195, 40, 15, 75, 0, 110);
		page.drawArc(190, 40, 15, 75, 0, 110);
		page.drawArc(200, 40, 15, 75, 0, 110);
		page.drawLine(195, 43, 195, 75);
		
		//Side Fins
		page.drawLine(185, 100, 220, 120);
		page.drawLine(185, 135, 220, 120);
		page.drawLine(185, 100, 185, 135);
		
	
		
		

		
		

		
	}
}
