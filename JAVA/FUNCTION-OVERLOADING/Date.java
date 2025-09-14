class Date {
    int day, month, year;

    void setDay(int d) {
        this.day = d;
    }

    void setMonth(int m) {
        this.month = m;
    }

    void setYear(int y) {
        this.year = y;
    }

    int getDay() {
        return this.day;
    }

    int getMonth() {
        return this.month;
    }

    int getYear() {
        return this.year;
    }

    void display() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }
}

class Test {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.setDay(10);
        d1.setMonth(9);
        d1.setYear(2025);
        d1.display();
        System.out.println("Day: " + d1.getDay());
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Year: " + d1.getYear());
    }
}
