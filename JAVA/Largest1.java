//Find the largest of three numbers.

public class Test
{
  public static void main(String[]  args)
  {
    int a = 10,b=20,c = 5;
    if(a>b)
    {
      if(a>c)
      {
           System.out.println(a+" is largest");
      }
      else
      {
           System.out.println(c+" is largest");
      }
     }
    else
    {
      if(b>c)
      {
           System.out.println(b+" is largest");
      }
      else
      {
           System.out.println(c+" is largest");
      }
     }
   }
}
  