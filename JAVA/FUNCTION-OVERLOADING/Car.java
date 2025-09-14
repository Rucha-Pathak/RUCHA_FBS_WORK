class Car {
    String model;
    int year;
    double price;
    String brand;

    void setModel(String m) {
        this.model = m;
    }

    void setYear(int y) {
        this.year = y;
    }

    void setPrice(double p) {
        this.price = p;
    }

    void setBrand(String b) {
        this.brand = b;
    }

    String getModel() {
        return this.model;
    }

    int getYear() {
        return this.year;
    }

    double getPrice() {
        return this.price;
    }

    String getBrand() {
        return this.brand;
    }

    void display() {
        System.out.println("Model: " + this.model + ", Year: " + this.year +
                           ", Price: " + this.price + ", Brand: " + this.brand);
    }
}

class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Swift");
        car1.setYear(2023);
        car1.setPrice(800000);
        car1.setBrand("Maruti Suzuki");
        car1.display();
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Brand: " + car1.getBrand());
    }
}
