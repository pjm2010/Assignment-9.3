package com.HDTV;




import java.util.*;       //importing all classes from java's util library.. Because it has Collection Class needed for this Assignment.

/*
 * This assignment helped me to master the concepts of ArrayList and sorting of objects based on particular property using Comparable interface.
 */

public class Test     //Class declaration containing main function. 
{
	public static void main(String[] args)        //main function declaration. and because it is static, program execution starts from main function.
	{
		ArrayList<HDTV> objectsList = new ArrayList<HDTV>();    //Creating ArrayList to store the objects of HDTV class.
		
		//Adding object elements to the ArrayList.
		objectsList.add( new HDTV("ONIDA",58) );
		objectsList.add( new HDTV("Dish TV",42) );
		objectsList.add( new HDTV("SONY",46) );
		
		//Sorting objects in the ArrayList based on the size using Comparable interface.
		Collections.sort( objectsList );
		
		Iterator readList = objectsList.iterator();     //Creating Iterator of ArrayList to read the list.
		
		while(readList.hasNext())     //While loop to print the elements.
		{
			HDTV currentObj = (HDTV) readList.next();      //fetching the current object in the iteration.
			
			System.out.println("The BrandName of HDTV is "+currentObj.brandName+" and Size is "+currentObj.size);
			                             //printing details of object.
		}
		
	}    //End of main function.

}     //End of class.




