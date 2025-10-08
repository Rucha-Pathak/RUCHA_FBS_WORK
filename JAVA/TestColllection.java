import java.util.*;

class Student implements Comparable
{
	int roll;
	String name;
	double marks;
	
//	public int compareTo (Object o)//method override
//	{
//		Student s1 =(Student)o;
//		return this.roll-s1.roll;
//	}
	
//	public int compareTo (Object o)//method override
//	{
//		Student s1 =(Student)o;
//		return this.name.compareTo(s1.name);
//	}
//	
	public int compareTo (Object o)//method override
	{
		Student s1 =(Student)o;
		return Double.compare(this.marks, s1.marks);
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public Student() 
	{
		super();
		this.roll = 0;
		this.name = "not available";
		this.marks = 0;
		
	}
	public Student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "\n Student roll=" + roll + ", name=" + name + ", marks=" + marks ;
	}
	
	
	
}
public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t1 = new TreeSet();
		t1.add(new Student(102,"sachin",70));
		t1.add(new Student(103,"Rahul",50));
		t1.add(new Student(101,"Dhoni",100));
		t1.add(new Student(104,"saket",30));
		
		System.out.println(t1);
		

	}

}
