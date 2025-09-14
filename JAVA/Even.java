//Print all even numbers from 1 to N.

import java.util.Scanner;
public class Test
{
public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   System.out.println("enter N:");
   int N = sc.nextInt();

	System.out.println("Even numbers from 1 to "+N);

   for(int i=1;i<=N;i++)
   {
       if(i%2==0)
		System.out.println(i);
   }
}
}	