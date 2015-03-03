import java.awt.*;
import javax.swing.*;

public class LabelDemo2
{
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("The Cormorants and Shags");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon brandts = new ImageIcon ("BrandtsCormorant.jpg");
		ImageIcon crested = new ImageIcon ("DoublecrestedCormorant.jpg");
		ImageIcon shag = new ImageIcon ("Shag.jpg");
		ImageIcon audubon = new ImageIcon ("Audubon.jpg");
		
		JLabel label1, label2, label3, label4;
		label1 = new JLabel ("<html>Brandt's Cormorant:<br>Found off of West Coast of North America</hmtl>", brandts, SwingConstants.CENTER);
		label1.setHorizontalTextPosition(SwingConstants.LEFT);
		label1.setVerticalTextPosition(SwingConstants.BOTTOM);
		label1.setForeground(Color.white);
		
		label2 = new JLabel ("<html>Double Crested Cormorant:<br>Found all across North America</html>", crested, SwingConstants.CENTER);
		label2.setHorizontalTextPosition(SwingConstants.RIGHT);
		label2.setVerticalTextPosition(SwingConstants.TOP);
		label2.setForeground(Color.white);
		
		label3 = new JLabel ("<html>Blue Eyed Shag:<br>Found in Antarctica</html>", shag, SwingConstants.CENTER);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setForeground(Color.white);
		
		label4 = new JLabel ("<html>Audubon's Cormorants:<br>A painting from Audubon's work</html>", audubon, SwingConstants.CENTER);
		label4.setHorizontalTextPosition(SwingConstants.CENTER);
		label4.setVerticalTextPosition(SwingConstants.BOTTOM);
		label4.setForeground(Color.white);
		
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