import java.util.Scanner;

class Student {
    String comp_name;
    String designation;
    double distance;

    void setComp(String c) {
        this.comp_name = c;
    }

    void setDesign(String d) {
        this.designation = d;
    }

    void setDistance(double di) {
        this.distance = di;
    }

    String getComp() {
        return this.comp_name;
    }

    String getDesign() {
        return this.designation;
    }

    double getDistance() {
        return this.distance;
    }

    void display() {
        System.out.println("company-name: " + this.comp_name + ", Designation: " + this.designation + ", Distance: " + this.distance);
    }
}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setComp("TCS");
        s1.setDesign("Software Developer");
        s1.setDistance(92.5);
        s1.display();

        Scanner sc = new Scanner(System.in);

	Student s2 = new Student();

	System.out.println("Enter company name: ");
	String c = sc.nextLine();
	

	System.out.println("Enter Designation: ");
	String d = sc.nextLine();

	System.out.println("Enter Distance: ");
	double di = sc.nextDouble();
	
	s2.setComp(c);
        s2.setDesign(d);
        s2.setDistance(di);
	s2.getComp();
	s2.getDesign();
	s2.getDistance();
        s2.display();



    }
}
