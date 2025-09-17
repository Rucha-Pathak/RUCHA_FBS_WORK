//3.	Find sum of all numbers.
import java.util.Scanner;

class Sum
{
  public static void main(String[] args)
  {

	Scanner sc = new Scanner(System.in);
	int i=0,sum=0;
	int [] arr = new int[10];
	System.out.println("enter the array elements: ");
	for(i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
 	}
	for(i=0;i<arr.length;i++)
	{
	   sum +=arr[i];
 	}


	System.out.println("Sum of elements is : "+sum);
 
  }
}