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
        this.fbs_id = 38;
	this.s_name = "rucha";
	this.distance_travelled = 8;
 	student_count++;
} 

Student(int fb, String str, double di)
{
        this.fbs_id = fb;
	this.s_name = str;
	this.distance_travelled = di;
	student_count++;
} 

void setFbsid(int f)
{
   this.fbs_id = f;
}
void setName(String n)
{
  this.s_name = n;
}
void setDistanceTravelled(double d)
{
    this.distance_travelled = d;
}
int getFbsid()
{
   return this.fbs_id ;
}
String getName()
{
  return this.s_name;
}
double getDistanceTravelled()
{
  return this.distance_travelled;
}
static int getCount()
{
   return student_count;
}

void display()
{
  System.out.println("fbs_id : "+ this.fbs_id + "  name : "+this.s_name+"  distance travelled : "+this.distance_travelled+
"  student count : "+ student_count);
}
}//class Student ends here

class Test 
{
 public static void main(String[] args)
  {
   Student s1 = new Student(1,"prerna",100);
   s1.display();
   Student s2 = new Student(2,"rohan",30);
   s2.display();

   Student.getCount();
  }
}

