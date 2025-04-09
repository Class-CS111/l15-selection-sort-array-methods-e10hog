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
  /**
   * Output a String of an array as a horizontal list, separated by commas and enclosed with curly brackets
   * @param a input array
   * @return formatted string of array content
  */
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
  
  /**
   * Swap two elements in an int array given the indexes where the swap should occur
   * @param array input array
   * @param a index of element to swap to index b
   * @param b index of element to swap to index a
  */
  public static void swap(int[] array, int a, int b)
  {
    int aVal = array[a], bVal = array[b];
    array[a] = bVal;
    array[b] = aVal;
  }
	
	/**
   * Finds the index of the minimum element in the array, starting from a specific index
   * @param array input array
   * @param startIndex starting index of the search
   * @return index of the minimum element in the array
  */
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

	/**
   * Reverses the order of a given array
   * @param array input array
  */
  public static void reverse(int[] array)
  {
    int times = (int) array.length / 2;
    for (int i = 0; i < times; i++) {
      swap(array, i, array.length-i-1);
    }
  }

	/**
   * Sorts a given array into ascending order
   * @param array input array
  */
  public static void selectionSort(int[] array)
  {
    for (int i = 0; i < array.length; i++) {
      int min = indexOfMin(array, i);
      if (min == i) continue;
      swap(array, i, min);;
    }
  }

}