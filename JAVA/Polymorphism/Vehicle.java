class Vehicle {
    String brand;
    int speed;

    Vehicle() {
        this.brand = "Unknown";
        this.speed = 0;
    }

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void brake() {
        System.out.println("Brake applied !! ");
    }
}

class Car extends Vehicle {
    int seats;

    Car() {
        super();
        this.seats = 0;
    }

    Car(String brand, int speed, int seats) {
        super(brand, speed);
        this.seats = seats;
    }

    void brake() {
        super.brake();
        System.out.println("responding like car ! ");
    }
}

class Bike extends Vehicle {
    boolean isSports;

    Bike() {
        super();
        this.isSports = false;
    }

    Bike(String brand, int speed, boolean isSports) {
        super(brand, speed);
        this.isSports = isSports;
    }

    void brake() {
        super.brake();
        System.out.println("responding like Bike !");
    }
}

class TestVehicle {
    public static void main(String[] args) {
//        Vehicle v = new Vehicle("Generic", 60);
//        v.brake();
//        System.out.println("--------------");
//
//         v = new Car("Honda City", 180, 5);
//         v.brake();
//        System.out.println("--------------");
//
//        v = new Bike("Yamaha R15", 150, true);
//        v.brake();
        
    	
        Vehicle[] v = new Vehicle[3];//array of references not object
        v[0] = new Vehicle("Generic", 60);
        v[1] = new Car("Honda City", 180, 5);
        v[2] = new Bike("Yamaha R15", 150, true);
        
        for( int i=0;i<v.length;i++)
        {
        	v[i].brake();
        }
    }
}


