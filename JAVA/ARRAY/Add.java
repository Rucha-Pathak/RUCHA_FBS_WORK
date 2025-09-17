/*7.	Take two array and add sum in third array
Example-
arr[5]= {1,2, 3, 4,5}
brr[5]={10,20,30, 40, 50}
crr[5]={11,22,33,44,55}
*/


import java.util.Scanner;

class Add
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
  	int i=0;
	
	int[] arr = new int[10];
	int[] brr = new int[10];
	int[] crr = new int[10];
	

	System.out.println("enter the array elements of arr: ");
	for(i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
 	}

	System.out.println("enter the array elements of brr: ");
	for(i=0;i<arr.length;i++)
	{
	   brr[i]=sc.nextInt();
 	}

	//System.out.println("sum of two arrays: ");
	for(i=0;i<arr.length;i++)
	{
	   crr[i]=arr[i]+brr[i];
 	}

	System.out.println("Sum of two arrays: ");
	for(i=0;i<arr.length;i++)
	{
	   System.out.println(crr[i]);
 	}

    


  }
}