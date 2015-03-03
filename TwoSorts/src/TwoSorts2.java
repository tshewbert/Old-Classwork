import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TwoSorts2 extends Applet
{
	private final int APPLET_WIDTH = 600; //Applet size
	private final int APPLET_HEIGHT = 600;
	private int[] insertionArray; //Arrays
	private int[] selectionArray;
	private Random random;	//Random number
	private boolean[] numbers;	//Test boolean
	private Button sort;
	private Label label1;	// Selection Label
	private Label label2;	// Insertion Label
	private Label label3;	// Pushes label
	private int nxt;	// Helps with cycling through arrays
	private int insertIndex; // Indexes for arrays
	private int selectIndex; 
	private int count;	// Button pushes count to see how many time the sorting algorithms run
	
	public void init()
	{
		setBackground(Color.darkGray);
		setSize(APPLET_WIDTH, APPLET_HEIGHT);
		//Instantiate arrays and boolean test for values
		this.insertionArray = new int[30];
		this.selectionArray = new int [30];
		this.numbers = new boolean[30];
		this.random = new Random();
		
		//Fills the arrays with values
		for (int i = 0; i < 30; i++)
		{
			this.nxt = this.random.nextInt(30);	//Assigns a random number to nxt
			
			while (this.numbers[this.nxt] == true)
				this.nxt = this.random.nextInt(30);
				this.insertionArray[i] = (this.nxt + 1);
				this.selectionArray[i] = (this.nxt + 1);
				this.numbers[this.nxt] = true;
				
		}

		//creates a button to sort the data
		this.sort = new Button("Sort Data");
		this.sort.addActionListener(new ButtonListener());
		add(this.sort);
		
		//Creates a label for selection sorting
		this.label1 = new Label("Selection Sorting");
		this.label1.setForeground(Color.orange);
		add(this.label1);
		
		//Creates a label for insertion sorting
		this.label2 = new Label("Insertion Sorting");
		this.label2.setForeground(Color.GREEN);
		add(this.label2);
		
		//Creates a label for a push counter
		this.label3 = new Label("Pushes: " + count);
		this.label3.setForeground(Color.MAGENTA);
		add(this.label3);
		
		//Sets values for the indexes
		this.selectIndex = 0;
		this.insertIndex = 1;
		
	}
	
	// Graphics method
	public void paint(Graphics page)
	{
		/*An if-else conditional operator to test whether or not all of the data is in the proper order and displays the data
		*order. If the data within the arrays is not within the proper order it reorders it and repaints after each
		*push of the button until it is in the proper order. If it is in the proper order, the the page turns gray and
		*the labels turn say finished with the final button pushes count remaining.
		*/
		//Tests the locations of the indexes against the length of the arrays
		if ((this.insertIndex < this.insertionArray.length) || (this.selectIndex < this.selectionArray.length - 1))
		{
			page.setColor(Color.orange);	//draws bars for selection
			printSelection(page);
			
			page.setColor(Color.GREEN);		//draws bars for insertion
			printInsertion(page);
			
			//Insertion Sorting
			int key= this.insertionArray[this.insertIndex];
			int position = this.insertIndex;
			
				while ((position > 0) && (this.insertionArray[position - 1] > key))
				{
					this.insertionArray[position] = this.insertionArray[position - 1];
					position--;
				}
			
				this.insertionArray[position] = key;
			
			//Selection sorting
			int max = this.selectIndex;
			for (int scan = this.selectIndex + 1; scan < this.selectionArray.length; scan++)
				{
					if (this.selectionArray[scan] > this.selectionArray[max])
						{
						max = scan;
						}
				}
					int temp = this.selectionArray[max];
					this.selectionArray[max] = this.selectionArray[this.selectIndex];
					this.selectionArray[this.selectIndex] = temp;
					
			this.insertIndex += 1;
			this.selectIndex += 1;
					
				}
			//If everything is sorted already, this screen prints
			else
			{
					page.setColor(Color.GRAY);
					printInsertion(page);
					printSelection(page);
					
					this.label1.setForeground(Color.RED);
					this.label1.setText("Finished");
					this.label2.setText("");		
			}
		}
	
	//Displays the insertion bars
	private void printInsertion(Graphics page)
	{
		for (int i = 0; i < this.insertionArray.length; i++)
			page.fillRect(80 + i * 10 , 100, 30, 5 * this.insertionArray[i]);
	}

	//Displays the selection bars
	private void printSelection(Graphics page) 
	{
		for (int i = 0; i < this.selectionArray.length; i++)
			page.fillRect(80 + i * 10, 300, 30, 5* this.selectionArray[i]);
	}
	
	//Button listener for the button
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			count++;
			label3.setText("Pushes: " + count);
			repaint();
		}
	}
	
	
}