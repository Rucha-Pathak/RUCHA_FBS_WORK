class Student 
{  
   int fbs_id;
   String s_name;
   double distance_travelled;
   static int student_count;
  
   static 
   {
      student_count = 0;
   }
   
   Student()
   {
   	this.fbs_id = 101;
	this.s_name = "john";
	this.distance_travelled = 2;
	student_count++;
   }
   Student(int f, String s, double d)
   {
  	this.fbs_id = f;
 	this.s_name = s;
	this.distance_travelled = d;
	student_count++;
   }

   void setFbsid(int f)
   {
 	this.fbs_id = f;
   }
   void setFbsid(String s)
   {
 	this.s_name = s;
   }

   void setFbsid(double d)
   {
 	this.distance_travelled = d;
   }

   int getFbsid()
   {
 	return this.fbs_id ;
   }
   String getSname()
   {
 	return this.s_name;
   }

   double getDistance()
   {
 	return this.distance_travelled;
   }
   static int getStudentcount()
  {
        return student_count;
  }

   void display()
  {
     System.out.println("fbs - id : "+this.fbs_id);
     System.out.println("student name  : "+this.s_name);
     System.out.println("distance travelled : "+this.distance_travelled);
     System.out.println("student count : "+student_count);
  }
}//class Student ends here

class PlacedStudent extends Student
{
	String company_name;
	String desg;
	
	PlacedStudent()
 	{
 	   super();
	   this.company_name="kuthe tari ghya";
	   this.desg  = "not available";
	}

	PlacedStudent(

}


class Test
{
  public static void main(String[] args)
  {
     Student s1 = new Student(1,"rohan",200);
	s1.display();
     Student s2 = new Student(2,"payal",30);
	 s2.display();
     Student s3 = new Student(3,"megha",80);
	s3.display();
       Student.getStudentcount();
  }
}