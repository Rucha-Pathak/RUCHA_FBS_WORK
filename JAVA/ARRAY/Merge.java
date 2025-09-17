//8.	Merge two arrays
import java.util.Scanner;

class Merge
{ 
  public static void main(String[] args)
  {
  	int[] arr = new int[5];
	int[] brr = new int[5];
	int[] crr = new int[10];
	int i=0;
	Scanner sc = new Scanner(System.in);

 	System.out.println("enter array elemets of arr:");
 	for(i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
 	}

	System.out.println("enter the array elements of brr: ");
	for(i=0;i<brr.length;i++)
	{
	   brr[i]=sc.nextInt();
 	}
	
	for(i=0;i<arr.length;i++)
	{
	   crr[i]=arr[i];
	}

	for(i=0;i<brr.length;i++)
	{
	  crr[arr.length+i]=brr[i];
     	}

	System.out.println("Elements of merged array: ");
	for(i=0;i<crr.length;i++)
	{
	   System.out.println(crr[i]);
 	}
	

   }
}