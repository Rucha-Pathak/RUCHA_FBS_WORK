class Place {
    String cname;
    double distance;
    String designation;

    void setCname(String c) {
        this.cname = c;
    }

    void setDistance(double d) {
        this.distance = d;
    }

    void setDesignation(String des) {
        this.designation = des;
    }

    String getCname() {
        return this.cname;
    }

    double getDistance() {
        return this.distance;
    }

    String getDesignation() {
        return this.designation;
    }

    void display() {
        System.out.println("City Name: " + this.cname + ", Distance: " + this.distance + " km, Designation: " + this.designation);
    }
}

class Test {
    public static void main(String[] args) {
        Place pl = new Place();
        pl.setCname("Pune");
        pl.setDistance(120.5);
        pl.setDesignation("Tourist Spot");
        pl.display();
        System.out.println("City: " + pl.getCname());
        System.out.println("Distance: " + pl.getDistance());
        System.out.println("Designation: " + pl.getDesignation());
    }
}
