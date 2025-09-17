//6.	Accept array and print only prime numbers of array.

import java.util.Scanner;

class Prime
{
   public static void main(String[] args)
   {
	
	Scanner sc = new Scanner(System.in);
	int i=0,j=2;

	int[] arr = new int[10];

	System.out.println("enter the array elements: ");
	for(i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
 	}

	for(i=0;i<arr.length;i++)
	{
	  int flag=0;
		for(j=2;j<arr[i];j++)
		{
			if(arr[i]%j==0)
			{
				flag++;
				break;
 			}
		}
	  if(flag==0)
		System.out.println(arr[i]+" is prime");
	  else
		System.out.println(arr[i]+" is not prime");
  	}

	}
}

	