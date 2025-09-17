//1.	Find minimum and maximum number in array.
import java.util.Scanner;
class MinMax
{
  public static void main(String[] args)
  {
    int[]  arr = new int[10];
    Scanner sc = new Scanner(System.in);
    int i = 0;

	System.out.println("enter array elements: ");
 	for(i=0;i<arr.length;i++)
        {
	   arr[i] = sc.nextInt();
        }

    int max = arr[0];

    for( i=0;i<arr.length;i++)
    {
       if(arr[i]>max)
       		max = arr[i];
    }

	System.out.println("maximum from array is: "+max);
int min = arr[0];

    for( i=0;i<arr.length;i++)
    {
       if(arr[i]<min)
       		min = arr[i];
    }

	System.out.println("minimum from array is: "+min);

   }
}