import java.util.Scanner;

class SortM
{
  public static void main(String[] args)
  {

	int[] arr = new int[10];
	int n = arr.length,i=0,j=0,temp=0;
	Scanner sc = new Scanner(System.in);

	System.out.println("enter the array elements: ");
	for(i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
 	}

        
	for(i=0;i<n-1;i++)
	{
	  for(j=i+1;j<n;j++)
	  {
 	     if(arr[i]<arr[j])
		{
		   temp = arr[i];
		   arr[i]=arr[j];
		   arr[j]=temp;
  		}
 	  }
        }

	System.out.println("sorted array:");
	for(i=0;i<n;i++)
	{
	   System.out.println(arr[i]);
        }
	
   }
}