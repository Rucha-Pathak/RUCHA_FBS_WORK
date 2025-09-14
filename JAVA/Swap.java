//Swap two numbers without using a third variable.

public class Swap
{
 public static void main(String[] args)
 {
  int a=10,b=20;
  System.out.println("before swappying : " +a+"  "+b);
  a = a+b;
  b = a-b;
  a = a-b;
  System.out.println("after swappying : " +a+"  "+b);
 }
}

/*
with using 3rd variable

int a = 10,b=20;
int temp = a;
a = b;
b = temp;

*/