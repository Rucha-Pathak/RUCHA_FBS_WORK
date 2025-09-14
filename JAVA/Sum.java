//Find the sum of first N natural numbers.
public class Test
{
  public static void main(String[] args)
  {
     int N = 10,sum=0;
     for(int i=1;i<=N;i++)
     	sum+=i;
     System.out.println("sum of first n natural numbers: "+sum);
  }
}