import java.awt.*;
import javax.swing.*;
/*Tyler Shewbert
*CS 111B
*Professor Conner
*Online Section
*Lesson 3: Programming Assignment
*LabelDemo
*In this program, we are asked to use GUI containers and components and create a standalone graphic Java Program.
*This program specifically shows four different types of birds and labels them, and also related there normal
*geographic location.
*/
public class LabelDemo2
{
	public static void main (String[] args)
	{
		//Sets up the frame
		JFrame frame = new JFrame ("The Cormorants and Shags");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Sets up the images to be used for the labels
		ImageIcon brandts = new ImageIcon ("BrandtsCormorant.jpg"); //Accesses the images from the local folder
		ImageIcon crested = new ImageIcon ("DoublecrestedCormorant.jpg");
		ImageIcon shag = new ImageIcon ("Shag.jpg");
		ImageIcon audubon = new ImageIcon ("Audubon.jpg");
		
		
		JLabel label1, label2, label3, label4;
		
		//The first label, a Brandt' Cormorant
		label1 = new JLabel ("<html>Brandt's Cormorant:<br>Found off of West Coast of North America</hmtl>", brandts, SwingConstants.CENTER); //C
		label1.setHorizontalTextPosition(SwingConstants.LEFT); //Aligns the text of the label horizontally
		label1.setVerticalTextPosition(SwingConstants.BOTTOM); //Aligns the text of the label vertically
		label1.setForeground(Color.white); //Sets the color of the text
		
		//The Second label, a Double Crested-Cormorant
		label2 = new JLabel ("<html>Double Crested-Cormorant:<br>Found all across North America</html>", crested, SwingConstants.CENTER);
		label2.setHorizontalTextPosition(SwingConstants.RIGHT);
		label2.setVerticalTextPosition(SwingConstants.TOP);
		label2.setForeground(Color.white); //Sets the color of the text
		
		//The third label, a Blue-Eyed Shag
		label3 = new JLabel ("<html>Blue-Eyed Shag:<br>Found in Antarctica</html>", shag, SwingConstants.CENTER);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setForeground(Color.white); //Sets the color of the text
		
		//The fourth label, a painting of cormorants.
		label4 = new JLabel ("<html>Audubon's Cormorants:<br>A painting from Audubon's work</html>", audubon, SwingConstants.CENTER);
		label4.setHorizontalTextPosition(SwingConstants.CENTER); 
		label4.setVerticalTextPosition(SwingConstants.BOTTOM);
		label4.setForeground(Color.white); //Sets the color of the text
		
		//Creates a panel to display the for labels in
		JPanel panel1 = new JPanel();
		panel1.setBackground (Color.DARK_GRAY);
		panel1.setPreferredSize (new Dimension (1300, 800));
		panel1.add (label1);
		panel1.add (label2);
		panel1.add (label3);
		panel1.add (label4);
		frame.getContentPane().add(panel1);
		frame.pack();
		frame.setVisible(true);
		
		
		
		
	}
}