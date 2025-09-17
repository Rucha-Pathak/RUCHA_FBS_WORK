//5.	Print alternate elements in array.

import java.util.Scanner;

class Alternate
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	int i=0;
	int[] arr = new int[10];

	System.out.println("enter the array elements: ");
	for(i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
 	}

	
	System.out.println("Array elements are: ");
	for(i=0;i<arr.length;i++)
	{
	   System.out.println(arr[i]);
 	}

	System.out.println("alernate Array elements are: ");
	for(i=0;i<arr.length;i+=2)
	{
	   System.out.println(arr[i]);
 	}

    }
}


