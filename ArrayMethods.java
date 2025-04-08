/********************************************
*	AUTHOR:	Ethan Luong
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED: 4/8/25
********************************************/

/********************************************
*	ArrayMethods
*********************************************
*	PROGRAM DESCRIPTION:
*	Collection of useful methods for int arrays.
*********************************************
*	ALGORITHM:
*	TODO: Find min index and add it to startingIndex, repeat but increase startingIndex by one
*********************************************

/* UML CLASS DIAGRAM:
-----------------------------------------
ArrayMethods
-----------------------------------------
-----------------------------------------
+ arrayString(array : int[]) : String //static
+ swap(array : int[], a : int, b : int) : void //static
+ indexOfMin(array : int[], startIndex : int) : int //static
+ reverse(array : int[]) : void //static
+ selectionSort(array : int[]) : void //static
-----------------------------------------
*/

public class ArrayMethods
{
  /**DESCRIPTION: */
  public static String arrayString(int[] a)
  {
    String output = "{";
    for (int i = 0; i < a.length; i++) {
      output += a[i];
      if (i == a.length - 2) break;
      output += ", ";
    }
    return output + "}";
  }
  
  /**DESCRIPTION: */
  public static void swap(int[] array, int a, int b)
  {
    int aVal = array[a], bVal = array[b];
    array[a] = bVal;
    array[b] = aVal;
  }
	
	/**DESCRIPTION: */
  public static int indexOfMin(int[] array, int startIndex)
  {
    int min = Integer.MAX_VALUE, index = 0;
    for (int i = startIndex; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
        index = i;
      }
    }
    return index;
  }

	/**DESCRIPTION: */
  public static void reverse(int[] array)
  {
    int times = (int) array.length / 2;
    for (int i = 0; i < times; i++) {
      swap(array, i, array.length-i-1);
    }
  }

	/**DESCRIPTION: */
  public static void selectionSort(int[] array)
  {
    for (int i = 0; i < array.length; i++) {
      int min = indexOfMin(array, i);
      if (min == i) continue;
      swap(array, i, min);;
    }
  }

}