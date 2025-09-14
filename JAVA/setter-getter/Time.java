class Time {
    int hr, min, sec;

    // Default constructor
    Time() {
        this.hr = 1;
        this.min = 1;
        this.sec = 1;
    }

    // Parameterized constructor
    Time(int h, int m, int s) {
        this.hr = h;
        this.min = m;
        this.sec = s;
        normalize();
    }

    // Setters
    void setHour(int h) { this.hr = h; }
    void setMin(int m) { this.min = m; }
    void setSec(int s) { this.sec = s; }

    // Getters
    int getHour() { return this.hr; }
    int getMin() { return this.min; }
    int getSec() { return this.sec; }

    // Normalize time (convert 60 sec = 1 min, 60 min = 1 hr, wrap 24 hr)
    private void normalize() {
        if (sec >= 60) {
            min += sec / 60;
            sec = sec % 60;
        }
        if (min >= 60) {
            hr += min / 60;
            min = min % 60;
        }
        if (hr >= 24) {
            hr = hr % 24;
        }
    }

    // Display method
    void display() {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }

    // Add two Time objects
    void add(Time t1, Time t2) {
        int h = t1.getHour() + t2.getHour();
        int m = t1.getMin() + t2.getMin();
        int s = t1.getSec() + t2.getSec();
        Time result = new Time(h, m, s);
        System.out.print("Sum of two Time objects = ");
        result.display();
    }

    // Add Time object with extra hr, min, sec
    void add(Time t1, int hr, int min, int sec) {
        int h = t1.getHour() + hr;
        int m = t1.getMin() + min;
        int s = t1.getSec() + sec;
        Time result = new Time(h, m, s);
        System.out.print("Sum of Time + integers = ");
        result.display();
    }
}

class Test {
    public static void main(String[] args) {
        Time t1 = new Time(1, 30, 45);
        Time t2 = new Time(1, 45, 60);

        t1.display();
        t2.display();

        // Adding two Time objects
        t1.add(t1, t2);

        // Adding Time with extra values
        t1.add(t1, 2, 45, 10);
    }
}
