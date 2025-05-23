/********************************************
*	AUTHOR:	Ethan Luong
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED:	4/8/25
********************************************/

public class Main 
{
  public static void main(String[] args)
  {
    int[] numbers = {42, 16, 84, 12, 77, 26, 53};

    ArrayMethods.reverse(numbers);
    System.out.println("reversed: " + ArrayMethods.arrayString(numbers));

    System.out.println("index of min (starting at 0): " + ArrayMethods.indexOfMin(numbers, 0));
    System.out.println("index of min (starting at 4): " + ArrayMethods.indexOfMin(numbers, 4));

    ArrayMethods.selectionSort(numbers);
    System.out.println("least to greatest: " + ArrayMethods.arrayString(numbers));
  }
}