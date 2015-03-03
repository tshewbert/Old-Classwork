//********************************************************************
//  MagazineList.java       Author: Lewis/Loftus
//
//  Represents a collection of magazines.
//Edited by Tyler Shewbert to add methods insert(), deleteAll(), and delete()
//*******************************************************************

public class MagazineList
{
   private MagazineNode list;

   //----------------------------------------------------------------
   //  Sets up an initially empty list of magazines.
   //----------------------------------------------------------------
   MagazineList()
   {
      list = null;
   }

   //----------------------------------------------------------------
   //  Creates a new MagazineNode object and adds it to the end of
   //  the linked list.
   //----------------------------------------------------------------
   public void add (Magazine mag)
   {

      MagazineNode node = new MagazineNode (mag);
      MagazineNode current;

      if (list == null)
         list = node;
      else
      {
         current = list;	//adds at end of list
         while (current.next != null)
            current = current.next;
         current.next = node;
      }
   }

   //----------------------------------------------------------------
   //  Returns this list of magazines as a string.
   //----------------------------------------------------------------
   public String toString ()
   {
      String result = "";

      MagazineNode current = list;

      while (current != null)
      {
         result += current.magazine + "\n";
         current = current.next;
      }

      return result;
   }

   //*****************************************************************
   //  An inner class that represents a node in the magazine list.
   //  The public variables are accessed by the MagazineList class.
   //*****************************************************************
   public class MagazineNode
   {
      public Magazine magazine;
      public MagazineNode next;

      //--------------------------------------------------------------
      //  Sets up the node
      //--------------------------------------------------------------
      public MagazineNode (Magazine mag)
      {
         magazine = mag;
         next = null;
      }
   }
   
//Begin edited code
   
   //Inserts the magazines into a list using the head insert that is called in MagazineView
   public void insert(Magazine magazine) 
	{
	  MagazineNode node = new MagazineNode (magazine); //adds a new node
	  node.next = list;	//adds the new node followed by the list
	  list = node;
	}
   
  //The delete all method
   	public void deleteAll() 
   	{
   		//If there is nothing in the list, do nothing. If there is something in the list,
   		//delete it all
   		{
   			if(list == null) 
   			{
   			}

   			else 
   			{
	        list = null;
   			}
   		}
	
  }

//The delete method
  public void delete(Magazine mag) 
	{
		{
	    MagazineNode current = this.list;
	    MagazineNode before;

	    //seeks and destroys
	    if (current.magazine.equals(mag)) //looks for the first magazine and checks if its there and deletes
	    {
	        this.list = current.next;
	        return;
	    }
	    
	    before = current;
	    
	    while ((current = current.next) != null) //goes through list to find magazine if its not in there first node
	    {
	        if (current.magazine.equals(mag)) 
	        {
	            before.next = current.next;
	            return;
	        }
	    
	    before = current;
	    }

	}
	
}
}