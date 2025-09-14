class Employee {
    int id;
    String name;
    double salary;

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getSalary() {
        return this.salary;
    }

    void display() {
        System.out.println("ID: " + this.id + ", Name: " + this.name + ", Salary: " + this.salary);
    }
}

class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Amit");
        e1.setSalary(50000);
        e1.display();
        System.out.println("ID: " + e1.getId());
        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());
    }
}
