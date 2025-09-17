//9.	Reverse the given array.

import java.util.Scanner;
class Reverse
{
  public static void main(String[] args)
  {
	int [] arr = new int[10];
	int [] crr = new int[10];

	int i=0;
	int n=arr.length;
	Scanner sc = new Scanner(System.in);

	System.out.println("enter the array elements of arr: ");
	for(i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
 	}

	
	for(i=0;i<arr.length;i++)
	{
	   crr[i]=arr[n-1-i];
        }

	System.out.println("Elements of reversed array:");
	for(i=0;i<crr.length;i++)
	{
	   System.out.println(crr[i]);
 	}


   }
}