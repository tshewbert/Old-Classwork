//********************************************************************
//  Magazine.java       Author: Lewis/Loftus
//	Edited by Tyler Shewbert
//
//  Represents a single magazine.
//********************************************************************

public class Magazine 
{
   private String title;

   //-----------------------------------------------------------------
   //  Sets up the new magazine with its title.
   //-----------------------------------------------------------------
   public Magazine (String newTitle)
   {    
      title = newTitle;
   }

   //-----------------------------------------------------------------
   //  Returns this magazine as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return title;
   }
//Begining editing by Tyler Shewbert 
//Overrides the equals so that the delete method works properly
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (!(obj instanceof Magazine)) {
		return false;
	}
	
	
	Magazine other = (Magazine) obj;
	if (title == null) {
		if (other.title != null) {
			return false;
		}
	} else if (!title.equals(other.title)) {
		return false;
	}
	return true;
}
   
}