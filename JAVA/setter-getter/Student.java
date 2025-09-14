class Student {
    int rollno;
    String name;
    double percentage;

    Student(int rollno, String name, double percentage) {
        this.rollno = rollno;
        this.name = name;
        this.percentage = percentage;
    }
}

class Employee {
    int id;
    String name;
    double annualSalary;

    Employee(int id, String name, double annualSalary) {
        this.id = id;
        this.name = name;
        this.annualSalary = annualSalary;
    }
}

class Bank {
    // Loan for Student
    void approveLoan(Student s) {
        double loan = 0;
        if (s.percentage > 80) loan = 200000;
        else if (s.percentage >= 60) loan = 100000;
        else if (s.percentage >= 40) loan = 50000;
        else loan = 0;

        if (loan > 0)
            System.out.println("Student " + s.name + " approved loan: ₹" + loan);
        else
            System.out.println("Student " + s.name + " not eligible for loan.");
    }

    // Loan for Employee
    void approveLoan(Employee e) {
        double loan = 0;
        if (e.annualSalary > 1200000) loan = 700000;
        else if (e.annualSalary >= 1000000) loan = 600000;
        else if (e.annualSalary >= 600000) loan = 500000;
        else if (e.annualSalary >= 400000) loan = 400000;
        else loan = 0;

        if (loan > 0)
            System.out.println("Employee " + e.name + " approved loan: ₹" + loan);
        else
            System.out.println("Employee " + e.name + " not eligible for loan.");
    }
}

class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Student s1 = new Student(101, "Rucha", 85);
        Student s2 = new Student(102, "Amit", 55);

        Employee e1 = new Employee(201, "Sneha", 1300000);
        Employee e2 = new Employee(202, "Rahul", 350000);

        bank.approveLoan(s1);
        bank.approveLoan(s2);
        bank.approveLoan(e1);
        bank.approveLoan(e2);
    }
}
