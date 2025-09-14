//Calculate factorial of a number using loop.

public class Test
{
  public static void main(String[] args)
  { 
    int a=5,fact = 1;
    for(int i=1;i<=a;i++)
    	fact = fact*i;
   
    System.out.println("factorial of "+a+" is "+fact);
  }
}