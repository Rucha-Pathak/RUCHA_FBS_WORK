import java.util.Scanner;
class Date
{
   int date,month,year;
   void setDate(int d)
   {
      this.date = d;
   }
   void setMonth(int m)
   {
      this.month = m;
   }
   void setYear(int y)
   {
      this.year = y;
   }
   int getDate()
   {
    	return this.date;
   }
   int getMonth()
   {
      return this.month;
   }
   int getYear()
   {
      return this.year;
   }
  void display()
{
   System.out.println(this.date+"/"+this.month+"/"+this.year);
}

}




class Test
{
  public static void main(String[] args)
  {
     Date d1 = new Date();
     d1.setDate(10);
     d1.setMonth(9);
     d1.setYear(2025);
     d1.getDate();
     d1.getMonth();
     d1.getYear();
     d1.display();

     Scanner sc = new Scanner(System.in);
     Date d2 = new Date();
     System.out.println("Enter the date: ");
     int da = sc.nextInt();
     
     System.out.println("Enter the month: ");
     int mo = sc.nextInt();

     System.out.println("Enter the year: ");
     int ye = sc.nextInt();
	
     d2.setDate(da);
     d2.setMonth(mo);
     d2.setYear(ye);

     d2.getDate();
     d2.getMonth();
     d2.getYear();
 
     d2.display();


    


  }
}	

     
     