class Student {
    int rollNo;
    String name;
    double marks;

    void setRollNo(int r) {
        this.rollNo = r;
    }

    void setName(String n) {
        this.name = n;
    }

    void setMarks(double m) {
        this.marks = m;
    }

    int getRollNo() {
        return this.rollNo;
    }

    String getName() {
        return this.name;
    }

    double getMarks() {
        return this.marks;
    }

    void display() {
        System.out.println("Roll No: " + this.rollNo + ", Name: " + this.name + ", Marks: " + this.marks);
    }
}

class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(101);
        s1.setName("Rucha");
        s1.setMarks(92.5);
        s1.display();
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Name: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
    }
}
