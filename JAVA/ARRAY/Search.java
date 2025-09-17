/2.	Search the given number in array.

import java.util.Scanner;

class Search
{
  public static void main(String[] args)
  {
         Scanner sc = new Scanner(System.in);
  	 int i=0,flag=0;
	System.out.println("enter the number to search: ");

	int num = sc.nextInt();
	System.out.println("given number is: "+num);

	int[] arr = new int[10];
 
	System.out.println("enter the array elements: ");
	for(i=0;i<arr.length;i++)
	{
	   arr[i]=sc.nextInt();
 	}
	
	System.out.println("lets search number:  ");

	for(i=0;i<arr.length;i++)
	{
	   if(arr[i]==num)
 		{
		System.out.println(num+ " found at "+ i +" index");	
		flag++;
 		}	
 	}
	if(flag==0)
		System.out.println("not found!!");
       
}

}
