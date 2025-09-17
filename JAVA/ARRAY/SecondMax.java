//11.	Find second max element from array.

import java.util.Scanner;
class SecondMax
{
  public static void main(String[] args)
  {
  	int i=0,secondmax=0;
	Scanner sc = new Scanner(System.in);

	int[] arr = new int[10];

	System.out.println("enter the array elements of arr: ");
	for(i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
 	}

  	int max = arr[0];

	for(i=0;i<arr.length;i++)
	{
	   if (arr[i] > max) 
	    {
                secondmax = max;   // update second
                max = arr[i];      // update max
            } 

	  else if (arr[i] > secondmax && arr[i] != max) 
  	    {
                secondmax = arr[i];
            }
 	}

      System.out.println("second max element from array: " +secondmax);
	
    }
}
	
	