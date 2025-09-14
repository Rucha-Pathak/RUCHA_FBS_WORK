class Course {
    int courseId;
    String cname;
    int duration; 
    double fees;

    void setCourseId(int id) {
        this.courseId = id;
    }

    void setCname(String c) {
        this.cname = c;
    }

    void setDuration(int d) {
        this.duration = d;
    }

    void setFees(double f) {
        this.fees = f;
    }

    int getCourseId() {
        return this.courseId;
    }

    String getCname() {
        return this.cname;
    }

    int getDuration() {
        return this.duration;
    }

    double getFees() {
        return this.fees;
    }

    void display() {
        System.out.println("Course ID: " + this.courseId + ", Name: " + this.cname +
                           ", Duration: " + this.duration + " months, Fees: " + this.fees);
    }
}

class Test {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.setCourseId(101);
        c1.setCname("Computer Science");
        c1.setDuration(36);
        c1.setFees(250000);
        c1.display();
        System.out.println("Course ID: " + c1.getCourseId());
        System.out.println("Course Name: " + c1.getCname());
        System.out.println("Duration: " + c1.getDuration());
        System.out.println("Fees: " + c1.getFees());
    }
}
