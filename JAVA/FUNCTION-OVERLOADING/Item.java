class Item {
    int id;
    String name;
    double salary;
    double commission;

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setSalary(double s) {
        this.salary = s;
    }

    void setCommission(double c) {
        this.commission = c;
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

    double getCommission() {
        return this.commission;
    }

    void display() {
        System.out.println("ID: " + this.id + ", Name: " + this.name + 
                           ", Salary: " + this.salary + ", Commission: " + this.commission);
    }
}

class Test {
    public static void main(String[] args) {
        Item it = new Item();
        it.setId(301);
        it.setName("Sneha");
        it.setSalary(40000);
        it.setCommission(3000);
        it.display();
        System.out.println("ID: " + it.getId());
        System.out.println("Name: " + it.getName());
        System.out.println("Salary: " + it.getSalary());
        System.out.println("Commission: " + it.getCommission());
    }
}
